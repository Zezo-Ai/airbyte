# Mux
This directory contains the manifest-only connector for [`source-mux`](https://www.mux.com/).

## Documentation reference:
Visit `https://docs.mux.com/api-reference` for API documentation

## Authentication setup
`Mux` uses Http basic authentication, Visit `https://docs.mux.com/core/make-api-requests#http-basic-auth` for getting your API keys.
## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `username` | `string` | Username.  |  |
| `password` | `string` | Password.  |  |
| `start_date` | `string` | Start date.  |  |
| `playback_id` | `string` | Playback ID. The playback id for your video asset shown in website details |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| video_assets | id | DefaultPaginator | ✅ |  ✅  |
| video_live-streams | id | DefaultPaginator | ✅ |  ✅  |
| video_playbacks | id | DefaultPaginator | ✅ |  ❌  |
| system_signin-keys | id | DefaultPaginator | ✅ |  ✅  |
| video_playback-restrictions | id | DefaultPaginator | ✅ |  ✅  |
| video_transcription-vocabularies | id | DefaultPaginator | ✅ |  ✅  |
| video_uploads | id | DefaultPaginator | ✅ |  ❌  |
| video_signing-keys | id | DefaultPaginator | ✅ |  ✅  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date | Pull Request | Subject |
| ------------------ | ------------ | --- | ---------------- |
| 0.0.34 | 2025-08-02 | [64239](https://github.com/airbytehq/airbyte/pull/64239) | Update dependencies |
| 0.0.33 | 2025-07-26 | [63922](https://github.com/airbytehq/airbyte/pull/63922) | Update dependencies |
| 0.0.32 | 2025-07-19 | [63424](https://github.com/airbytehq/airbyte/pull/63424) | Update dependencies |
| 0.0.31 | 2025-07-12 | [63250](https://github.com/airbytehq/airbyte/pull/63250) | Update dependencies |
| 0.0.30 | 2025-07-05 | [62623](https://github.com/airbytehq/airbyte/pull/62623) | Update dependencies |
| 0.0.29 | 2025-06-28 | [62344](https://github.com/airbytehq/airbyte/pull/62344) | Update dependencies |
| 0.0.28 | 2025-06-21 | [61907](https://github.com/airbytehq/airbyte/pull/61907) | Update dependencies |
| 0.0.27 | 2025-06-14 | [61049](https://github.com/airbytehq/airbyte/pull/61049) | Update dependencies |
| 0.0.26 | 2025-05-24 | [60433](https://github.com/airbytehq/airbyte/pull/60433) | Update dependencies |
| 0.0.25 | 2025-05-11 | [60203](https://github.com/airbytehq/airbyte/pull/60203) | Update dependencies |
| 0.0.24 | 2025-05-03 | [59493](https://github.com/airbytehq/airbyte/pull/59493) | Update dependencies |
| 0.0.23 | 2025-04-27 | [58510](https://github.com/airbytehq/airbyte/pull/58510) | Update dependencies |
| 0.0.22 | 2025-04-12 | [57852](https://github.com/airbytehq/airbyte/pull/57852) | Update dependencies |
| 0.0.21 | 2025-04-05 | [57364](https://github.com/airbytehq/airbyte/pull/57364) | Update dependencies |
| 0.0.20 | 2025-03-29 | [56642](https://github.com/airbytehq/airbyte/pull/56642) | Update dependencies |
| 0.0.19 | 2025-03-22 | [56068](https://github.com/airbytehq/airbyte/pull/56068) | Update dependencies |
| 0.0.18 | 2025-03-08 | [55480](https://github.com/airbytehq/airbyte/pull/55480) | Update dependencies |
| 0.0.17 | 2025-03-01 | [54807](https://github.com/airbytehq/airbyte/pull/54807) | Update dependencies |
| 0.0.16 | 2025-02-22 | [54349](https://github.com/airbytehq/airbyte/pull/54349) | Update dependencies |
| 0.0.15 | 2025-02-15 | [53851](https://github.com/airbytehq/airbyte/pull/53851) | Update dependencies |
| 0.0.14 | 2025-02-08 | [53248](https://github.com/airbytehq/airbyte/pull/53248) | Update dependencies |
| 0.0.13 | 2025-02-01 | [52760](https://github.com/airbytehq/airbyte/pull/52760) | Update dependencies |
| 0.0.12 | 2025-01-25 | [52280](https://github.com/airbytehq/airbyte/pull/52280) | Update dependencies |
| 0.0.11 | 2025-01-18 | [51818](https://github.com/airbytehq/airbyte/pull/51818) | Update dependencies |
| 0.0.10 | 2025-01-11 | [51175](https://github.com/airbytehq/airbyte/pull/51175) | Update dependencies |
| 0.0.9 | 2024-12-28 | [50651](https://github.com/airbytehq/airbyte/pull/50651) | Update dependencies |
| 0.0.8 | 2024-12-21 | [50127](https://github.com/airbytehq/airbyte/pull/50127) | Update dependencies |
| 0.0.7 | 2024-12-14 | [49632](https://github.com/airbytehq/airbyte/pull/49632) | Update dependencies |
| 0.0.6 | 2024-12-12 | [49241](https://github.com/airbytehq/airbyte/pull/49241) | Update dependencies |
| 0.0.5 | 2024-12-11 | [48912](https://github.com/airbytehq/airbyte/pull/48912) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.4 | 2024-11-04 | [48231](https://github.com/airbytehq/airbyte/pull/48231) | Update dependencies |
| 0.0.3 | 2024-10-29 | [47880](https://github.com/airbytehq/airbyte/pull/47880) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47492](https://github.com/airbytehq/airbyte/pull/47492) | Update dependencies |
| 0.0.1 | 2024-09-27 | [45921](https://github.com/airbytehq/airbyte/pull/45921) | Initial release by [@btkcodedev](https://github.com/btkcodedev) via Connector Builder |

</details>
