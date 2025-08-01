# Hibob

This page contains the setup guide and reference information for the Hibob source connector.

## Prerequisites

- A [HiBob account](https://www.hibob.com) at least
<!-- env:oss -->
- A HiBob Token generated [here](https://apidocs.hibob.com/reference/getting-started-with-bob-api#test-endpoints)
  <!-- /env:oss -->

## Setup guide

<!-- env:oss -->

### Step 1: (For Airbyte Open Source) Setup a HiBob Account

Setup and account in [HiBob](https://www.hibob.com/). 


### Step 2: (For Airbyte Open Source) Obtain an api key

A simple api key is all that is needed to access the HiBob API. This token is generated [here](https://apidocs.hibob.com/docs/api-service-users#step-1-create-a-new-api-service-user).


#### For Airbyte Cloud:

To set up HiBob as a source in Airbyte Cloud:

1. [Log in to your Airbyte Cloud](https://cloud.airbyte.com/workspaces) account.
2. In the left navigation bar, click **Sources**. In the top-right corner, click **+ New source**.
3. Find and select **HiBob** from the list of available sources.
4. Enter a **Source name** of your choosing.
5. Enter the **api key** you obtained from HiBob.
6. Click **Set up source** and wait for the tests to complete.

<!-- /env:cloud -->

<!-- env:oss -->

#### For Airbyte Open Source:

To set up HiBob as a source in Airbyte Open Source:

1. Log in to your Airbyte Open Source account.
2. In the left navigation bar, click **Sources**. In the top-right corner, click **+ New source**.
3. Find and select **HiBob** from the list of available sources.
4. Enter a **Source name** of your choosing.
5. Enter the **api key** you obtained from HiBob.
6. Click **Set up source** and wait for the tests to complete.

<!-- /env:oss -->

## Supported Sync Modes

The HiBob source connector supports the following [sync modes](https://docs.airbyte.com/cloud/core-concepts#connection-sync-modes):

- [Full Refresh - Overwrite](https://docs.airbyte.com/understanding-airbyte/connections/full-refresh-overwrite/)
- [Full Refresh - Append](https://docs.airbyte.com/understanding-airbyte/connections/full-refresh-append)

Incremental modes are not supported for the HiBob connector at the time of this writing.

## Supported Streams

The HiBob source connector can sync the following streams.

### Main Tables

Link to HiBob API documentation [here](https://apidocs.hibob.com/docs/).

- [Profiles](https://apidocs.hibob.com/reference/get_profiles)

- [Payroll](https://apidocs.hibob.com/reference/get_payroll-history)


## Changelog

<details>
  <summary>Expand to review</summary>

| Version  | Date       | Pull Request                                             | Subject                                                                                                                              |
|:---------|:-----------|:---------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------|
| 0.2.28 | 2025-08-02 | [64219](https://github.com/airbytehq/airbyte/pull/64219) | Update dependencies |
| 0.2.27 | 2025-07-26 | [63816](https://github.com/airbytehq/airbyte/pull/63816) | Update dependencies |
| 0.2.26 | 2025-07-19 | [63526](https://github.com/airbytehq/airbyte/pull/63526) | Update dependencies |
| 0.2.25 | 2025-07-12 | [60699](https://github.com/airbytehq/airbyte/pull/60699) | Update dependencies |
| 0.2.24 | 2025-06-10 | [61501](https://github.com/airbytehq/airbyte/pull/61501) | Add employees stream |
| 0.2.23 | 2025-05-10 | [59801](https://github.com/airbytehq/airbyte/pull/59801) | Update dependencies |
| 0.2.22 | 2025-05-03 | [58784](https://github.com/airbytehq/airbyte/pull/58784) | Update dependencies |
| 0.2.21 | 2025-04-19 | [58206](https://github.com/airbytehq/airbyte/pull/58206) | Update dependencies |
| 0.2.20 | 2025-04-12 | [57740](https://github.com/airbytehq/airbyte/pull/57740) | Update dependencies |
| 0.2.19 | 2025-04-05 | [57099](https://github.com/airbytehq/airbyte/pull/57099) | Update dependencies |
| 0.2.18 | 2025-03-29 | [56646](https://github.com/airbytehq/airbyte/pull/56646) | Update dependencies |
| 0.2.17 | 2025-03-22 | [56067](https://github.com/airbytehq/airbyte/pull/56067) | Update dependencies |
| 0.2.16 | 2025-03-10 | [55674](https://github.com/airbytehq/airbyte/pull/55674) | Change check stream from payrolls to profiles |
| 0.2.15 | 2025-03-08 | [55484](https://github.com/airbytehq/airbyte/pull/55484) | Update dependencies |
| 0.2.14 | 2025-03-01 | [54742](https://github.com/airbytehq/airbyte/pull/54742) | Update dependencies |
| 0.2.13 | 2025-02-22 | [54314](https://github.com/airbytehq/airbyte/pull/54314) | Update dependencies |
| 0.2.12 | 2025-02-15 | [53809](https://github.com/airbytehq/airbyte/pull/53809) | Update dependencies |
| 0.2.11 | 2025-02-08 | [53265](https://github.com/airbytehq/airbyte/pull/53265) | Update dependencies |
| 0.2.10 | 2025-02-01 | [52737](https://github.com/airbytehq/airbyte/pull/52737) | Update dependencies |
| 0.2.9 | 2025-01-25 | [52220](https://github.com/airbytehq/airbyte/pull/52220) | Update dependencies |
| 0.2.8 | 2025-01-18 | [51802](https://github.com/airbytehq/airbyte/pull/51802) | Update dependencies |
| 0.2.7 | 2025-01-11 | [51201](https://github.com/airbytehq/airbyte/pull/51201) | Update dependencies |
| 0.2.6 | 2024-12-28 | [50628](https://github.com/airbytehq/airbyte/pull/50628) | Update dependencies |
| 0.2.5 | 2024-12-21 | [50132](https://github.com/airbytehq/airbyte/pull/50132) | Update dependencies |
| 0.2.4 | 2024-12-14 | [49595](https://github.com/airbytehq/airbyte/pull/49595) | Update dependencies |
| 0.2.3 | 2024-12-12 | [49240](https://github.com/airbytehq/airbyte/pull/49240) | Update dependencies |
| 0.2.2 | 2024-12-11 | [48972](https://github.com/airbytehq/airbyte/pull/48972) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.2.1 | 2024-10-28 | [47672](https://github.com/airbytehq/airbyte/pull/47672) | Update dependencies |
| 0.2.0 | 2024-08-21 | [44542](https://github.com/airbytehq/airbyte/pull/44542) | Refactor connector to manifest-only format |
| 0.1.3 | 2024-08-17 | [44298](https://github.com/airbytehq/airbyte/pull/44298) | Update dependencies |
| 0.1.2 | 2024-08-12 | [43853](https://github.com/airbytehq/airbyte/pull/43853) | Update dependencies |
| 0.1.1 | 2024-08-10 | [43519](https://github.com/airbytehq/airbyte/pull/43519) | Update dependencies |
| 0.1.0 | 2024-08-06 | [43336](https://github.com/airbytehq/airbyte/pull/43336) | New Source: HiBob |
</details>
