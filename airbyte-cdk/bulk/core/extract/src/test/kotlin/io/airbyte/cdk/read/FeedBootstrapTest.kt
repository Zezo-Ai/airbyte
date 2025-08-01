/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.cdk.read

import io.airbyte.cdk.ClockFactory
import io.airbyte.cdk.StreamIdentifier
import io.airbyte.cdk.command.OpaqueStateValue
import io.airbyte.cdk.data.IntCodec
import io.airbyte.cdk.data.LocalDateTimeCodec
import io.airbyte.cdk.data.NullCodec
import io.airbyte.cdk.data.TextCodec
import io.airbyte.cdk.discover.CommonMetaField
import io.airbyte.cdk.discover.Field
import io.airbyte.cdk.discover.IntFieldType
import io.airbyte.cdk.discover.StringFieldType
import io.airbyte.cdk.discover.TestMetaFieldDecorator
import io.airbyte.cdk.discover.TestMetaFieldDecorator.GlobalCursor
import io.airbyte.cdk.output.BufferingOutputConsumer
import io.airbyte.cdk.output.DataChannelFormat
import io.airbyte.cdk.output.DataChannelMedium
import io.airbyte.cdk.output.sockets.FieldValueEncoder
import io.airbyte.cdk.output.sockets.NativeRecordPayload
import io.airbyte.cdk.util.Jsons
import io.airbyte.protocol.models.v0.StreamDescriptor
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import java.time.LocalDateTime
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@MicronautTest(rebuildContext = true)
class FeedBootstrapTest {

    @Inject lateinit var outputConsumer: BufferingOutputConsumer

    @Inject lateinit var metaFieldDecorator: TestMetaFieldDecorator

    val k = Field("k", IntFieldType)
    val v = Field("v", StringFieldType)
    val stream: Stream =
        Stream(
            id = StreamIdentifier.from(StreamDescriptor().withName("tbl").withNamespace("ns")),
            schema =
                setOf(
                    k,
                    v,
                    GlobalCursor,
                    CommonMetaField.CDC_UPDATED_AT,
                    CommonMetaField.CDC_DELETED_AT
                ),
            configuredSyncMode = ConfiguredSyncMode.INCREMENTAL,
            configuredPrimaryKey = listOf(k),
            configuredCursor = GlobalCursor,
        )

    val global = Global(listOf(stream))

    fun stateManager(
        globalStateValue: OpaqueStateValue? = null,
        streamStateValue: OpaqueStateValue? = null
    ): StateManager = StateManager(global, globalStateValue, mapOf(stream to streamStateValue))

    val dcm = DataChannelMedium.STDIO
    val dcf = DataChannelFormat.JSONL
    val bufferSize = 8192
    val clock = ClockFactory().fixed()
    fun Feed.bootstrap(stateManager: StateManager): FeedBootstrap<*> =
        FeedBootstrap.create(
            outputConsumer,
            metaFieldDecorator,
            stateManager,
            this,
            dcf,
            dcm,
            bufferSize,
            clock
        )

    fun expected(vararg data: String): List<String> {
        val ts = outputConsumer.recordEmittedAt.toEpochMilli()
        return data.map { """{"namespace":"ns","stream":"tbl","data":$it,"emitted_at":$ts}""" }
    }

    @Test
    fun testGlobalColdStart() {
        val globalBootstrap: FeedBootstrap<*> = global.bootstrap(stateManager())
        Assertions.assertNull(globalBootstrap.currentState)
        Assertions.assertEquals(1, globalBootstrap.streamRecordConsumers().size)
        val (actualStreamID, consumer) = globalBootstrap.streamRecordConsumers().toList().first()
        Assertions.assertEquals(stream.id, actualStreamID)
        consumer.accept(GLOBAL_RECORD_DATA, changes = null)
        Assertions.assertEquals(
            expected(GLOBAL_RECORD_DATA_JSON),
            outputConsumer.records().map(Jsons::writeValueAsString)
        )
    }

    @Test
    fun testGlobalWarmStart() {
        val globalBootstrap: FeedBootstrap<*> =
            global.bootstrap(stateManager(globalStateValue = Jsons.objectNode()))
        Assertions.assertEquals(Jsons.objectNode(), globalBootstrap.currentState)
        Assertions.assertEquals(1, globalBootstrap.streamRecordConsumers().size)
        val (actualStreamID, consumer) = globalBootstrap.streamRecordConsumers().toList().first()
        Assertions.assertEquals(stream.id, actualStreamID)
        consumer.accept(GLOBAL_RECORD_DATA, changes = null)
        Assertions.assertEquals(
            expected(GLOBAL_RECORD_DATA_JSON),
            outputConsumer.records().map(Jsons::writeValueAsString)
        )
    }

    @Test
    fun testGlobalReset() {
        val stateManager: StateManager =
            stateManager(
                streamStateValue = Jsons.objectNode(),
                globalStateValue = Jsons.objectNode()
            )
        val globalBootstrap: FeedBootstrap<*> = global.bootstrap(stateManager)
        Assertions.assertEquals(Jsons.objectNode(), globalBootstrap.currentState)
        Assertions.assertEquals(Jsons.objectNode(), globalBootstrap.currentState(stream))
        // Reset.
        globalBootstrap.resetAll()
        Assertions.assertNull(globalBootstrap.currentState)
        Assertions.assertNull(globalBootstrap.currentState(stream))
        // Set new global state and checkpoint
        stateManager.scoped(global).set(Jsons.arrayNode(), 0L, null, null)
        stateManager.checkpoint().forEach { outputConsumer.accept(it) }
        // Check that everything is as it should be.
        Assertions.assertEquals(Jsons.arrayNode(), globalBootstrap.currentState)
        Assertions.assertNull(globalBootstrap.currentState(stream))
        Assertions.assertEquals(
            listOf(RESET_STATE),
            outputConsumer.states().map(Jsons::writeValueAsString)
        )
    }

    @Test
    fun testStreamColdStart() {
        val streamBootstrap: FeedBootstrap<*> =
            stream.bootstrap(stateManager(globalStateValue = Jsons.objectNode()))
        Assertions.assertNull(streamBootstrap.currentState)
        Assertions.assertEquals(1, streamBootstrap.streamRecordConsumers().size)
        val (actualStreamID, consumer) = streamBootstrap.streamRecordConsumers().toList().first()
        Assertions.assertEquals(stream.id, actualStreamID)
        consumer.accept(STREAM_RECORD_INPUT_DATA, changes = null)
        Assertions.assertEquals(
            expected(STREAM_RECORD_OUTPUT_DATA),
            outputConsumer.records().map(Jsons::writeValueAsString)
        )
    }

    @Test
    fun testStreamWarmStart() {
        val streamBootstrap: FeedBootstrap<*> =
            stream.bootstrap(
                stateManager(
                    globalStateValue = Jsons.objectNode(),
                    streamStateValue = Jsons.arrayNode(),
                )
            )
        Assertions.assertEquals(Jsons.arrayNode(), streamBootstrap.currentState)
        Assertions.assertEquals(1, streamBootstrap.streamRecordConsumers().size)
        val (actualStreamID, consumer) = streamBootstrap.streamRecordConsumers().toList().first()
        Assertions.assertEquals(stream.id, actualStreamID)
        consumer.accept(STREAM_RECORD_INPUT_DATA, changes = null)
        Assertions.assertEquals(
            expected(STREAM_RECORD_OUTPUT_DATA),
            outputConsumer.records().map(Jsons::writeValueAsString)
        )
    }

    @Test
    fun testChanges() {
        val stateManager = StateManager(initialStreamStates = mapOf(stream to null))
        val streamBootstrap = stream.bootstrap(stateManager) as StreamFeedBootstrap
        val consumer: StreamRecordConsumer =
            streamBootstrap.streamRecordConsumers().toList().first().second
        val changes =
            mapOf(
                k to FieldValueChange.RECORD_SIZE_LIMITATION_TRUNCATION,
                v to FieldValueChange.RETRIEVAL_FAILURE_TOTAL,
            )
        val msg: NativeRecordPayload = mutableMapOf("k" to FieldValueEncoder(1, IntCodec))
        consumer.accept(msg, changes)
        Assertions.assertEquals(
            listOf(
                Jsons.writeValueAsString(
                    Jsons.readTree(
                        """{
                |"namespace":"ns",
                |"stream":"tbl",
                |"data":{
                |"k":1,"v":null,
                |"_ab_cdc_lsn":null,"_ab_cdc_updated_at":null,"_ab_cdc_deleted_at":null},
                |"emitted_at":3133641600000,
                |"meta":{"changes":[
                |{"field":"k","change":"TRUNCATED","reason":"SOURCE_RECORD_SIZE_LIMITATION"},
                |{"field":"v","change":"NULLED","reason":"SOURCE_RETRIEVAL_ERROR"}
                |]}}""".trimMargin()
                    )
                )
            ),
            outputConsumer.records().map(Jsons::writeValueAsString)
        )
    }

    @Test
    fun testTriggerBasedCdcMetadataDecoration() {
        // Create a stream without the global cursor in its schema to simulate trigger-based CDC
        val triggerBasedStream =
            Stream(
                id = StreamIdentifier.from(StreamDescriptor().withName("tbl").withNamespace("ns")),
                schema =
                    setOf(
                        k,
                        v,
                    ),
                configuredSyncMode = ConfiguredSyncMode.INCREMENTAL,
                configuredPrimaryKey = listOf(k),
                configuredCursor =
                    GlobalCursor, // For trigger based CDC the cursor is uniquely defined, we just
                // use this object for test case
                )

        // Create state manager and bootstrap without a global feed
        val stateManager =
            StateManager(initialStreamStates = mapOf(triggerBasedStream to Jsons.arrayNode()))
        val bootstrap = triggerBasedStream.bootstrap(stateManager)
        val consumer = bootstrap.streamRecordConsumers().toList().first().second

        // Test that a record gets CDC metadata decoration even without a global feed
        val msg: NativeRecordPayload =
            mutableMapOf(
                "k" to FieldValueEncoder(3, IntCodec),
                "v" to FieldValueEncoder("trigger", TextCodec)
            )
        consumer.accept(msg, changes = null)

        val recordOutput = outputConsumer.records().map(Jsons::writeValueAsString).first()
        val recordJson = Jsons.readTree(recordOutput)
        val data = recordJson.get("data")

        // Verify CDC metadata fields are present and properly decorated
        Assertions.assertNotNull(data.get("_ab_cdc_lsn"))
        Assertions.assertNotNull(data.get("_ab_cdc_updated_at"))
        Assertions.assertNotNull(data.get("_ab_cdc_deleted_at"))

        // The _ab_cdc_lsn should be decorated with the transaction timestamp
        Assertions.assertTrue(data.get("_ab_cdc_lsn").isTextual)

        // _ab_cdc_updated_at should be a timestamp string
        Assertions.assertTrue(data.get("_ab_cdc_updated_at").isTextual)

        // _ab_cdc_deleted_at should be null for non-deleted records
        Assertions.assertTrue(data.get("_ab_cdc_deleted_at").isNull)
    }

    companion object {
        const val GLOBAL_RECORD_DATA_JSON =
            """{"k":1,"v":"foo","_ab_cdc_lsn":123,"_ab_cdc_updated_at":"2024-03-01T01:02:03.456789","_ab_cdc_deleted_at":null}"""
        val GLOBAL_RECORD_DATA: NativeRecordPayload =
            mutableMapOf(
                "k" to FieldValueEncoder(1, IntCodec),
                "v" to FieldValueEncoder("foo", TextCodec),
                "_ab_cdc_lsn" to FieldValueEncoder(123, IntCodec),
                "_ab_cdc_updated_at" to
                    FieldValueEncoder(
                        LocalDateTime.parse("2024-03-01T01:02:03.456789"),
                        LocalDateTimeCodec
                    ),
                "_ab_cdc_deleted_at" to FieldValueEncoder(null, NullCodec)
            )
        val STREAM_RECORD_INPUT_DATA: NativeRecordPayload =
            mutableMapOf(
                "k" to FieldValueEncoder(2, IntCodec),
                "v" to FieldValueEncoder("bar", TextCodec)
            )
        const val STREAM_RECORD_OUTPUT_DATA =
            """{"k":2,"v":"bar","_ab_cdc_lsn":{},"_ab_cdc_updated_at":"2069-04-20T00:00:00.000000Z","_ab_cdc_deleted_at":null}"""
        const val RESET_STATE =
            """{"type":"GLOBAL","global":{"shared_state":[],"stream_states":[{"stream_descriptor":{"name":"tbl","namespace":"ns"},"stream_state":{}}]},"sourceStats":{"recordCount":0.0}}"""
    }
}
