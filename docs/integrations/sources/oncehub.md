# Oncehub
This is the Oncehub source that ingests data from the Oncehub API.

Oncehub is a no-code conversational journeys builder, integrating AI, chatbots, live chat, instant calls, and scheduled meetings https://oncehub.com/.

To use this source you must first create an account. Once logged in head over to Settings -&gt; API &amp; Webhooks and copy your API Key.
You can learn more about the API here https://developers.oncehub.com/reference/introduction

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key. API key to use. Find it in your OnceHub account under the API &amp; Webhooks Integration page. |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| bookings | id | CursorPagination | ✅ |  ✅  |
| booking_pages | id | CursorPagination | ✅ |  ❌  |
| event_types | id | CursorPagination | ✅ |  ❌  |
| master_pages | id | CursorPagination | ✅ |  ❌  |
| users | id | CursorPagination | ✅ |  ❌  |
| teams | id | CursorPagination | ✅ |  ❌  |
| contacts | id | CursorPagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.31 | 2025-08-02 | [64185](https://github.com/airbytehq/airbyte/pull/64185) | Update dependencies |
| 0.0.30 | 2025-07-26 | [63831](https://github.com/airbytehq/airbyte/pull/63831) | Update dependencies |
| 0.0.29 | 2025-07-19 | [63407](https://github.com/airbytehq/airbyte/pull/63407) | Update dependencies |
| 0.0.28 | 2025-07-12 | [63219](https://github.com/airbytehq/airbyte/pull/63219) | Update dependencies |
| 0.0.27 | 2025-07-05 | [62543](https://github.com/airbytehq/airbyte/pull/62543) | Update dependencies |
| 0.0.26 | 2025-06-28 | [62321](https://github.com/airbytehq/airbyte/pull/62321) | Update dependencies |
| 0.0.25 | 2025-06-21 | [61895](https://github.com/airbytehq/airbyte/pull/61895) | Update dependencies |
| 0.0.24 | 2025-06-14 | [61050](https://github.com/airbytehq/airbyte/pull/61050) | Update dependencies |
| 0.0.23 | 2025-05-24 | [60483](https://github.com/airbytehq/airbyte/pull/60483) | Update dependencies |
| 0.0.22 | 2025-05-10 | [60091](https://github.com/airbytehq/airbyte/pull/60091) | Update dependencies |
| 0.0.21 | 2025-05-03 | [59491](https://github.com/airbytehq/airbyte/pull/59491) | Update dependencies |
| 0.0.20 | 2025-04-27 | [59061](https://github.com/airbytehq/airbyte/pull/59061) | Update dependencies |
| 0.0.19 | 2025-04-19 | [58527](https://github.com/airbytehq/airbyte/pull/58527) | Update dependencies |
| 0.0.18 | 2025-04-12 | [57917](https://github.com/airbytehq/airbyte/pull/57917) | Update dependencies |
| 0.0.17 | 2025-04-05 | [57317](https://github.com/airbytehq/airbyte/pull/57317) | Update dependencies |
| 0.0.16 | 2025-03-29 | [56760](https://github.com/airbytehq/airbyte/pull/56760) | Update dependencies |
| 0.0.15 | 2025-03-22 | [56174](https://github.com/airbytehq/airbyte/pull/56174) | Update dependencies |
| 0.0.14 | 2025-03-08 | [55071](https://github.com/airbytehq/airbyte/pull/55071) | Update dependencies |
| 0.0.13 | 2025-02-23 | [54565](https://github.com/airbytehq/airbyte/pull/54565) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53994](https://github.com/airbytehq/airbyte/pull/53994) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53504](https://github.com/airbytehq/airbyte/pull/53504) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52996](https://github.com/airbytehq/airbyte/pull/52996) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52487](https://github.com/airbytehq/airbyte/pull/52487) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51919](https://github.com/airbytehq/airbyte/pull/51919) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51329](https://github.com/airbytehq/airbyte/pull/51329) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50690](https://github.com/airbytehq/airbyte/pull/50690) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50238](https://github.com/airbytehq/airbyte/pull/50238) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49725](https://github.com/airbytehq/airbyte/pull/49725) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49329](https://github.com/airbytehq/airbyte/pull/49329) | Update dependencies |
| 0.0.2 | 2024-12-11 | [49094](https://github.com/airbytehq/airbyte/pull/49094) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-30 | | Initial release by [@aazam-gh](https://github.com/aazam-gh) via Connector Builder |

</details>
