# JustCall
JustCall connector enables seamless data integration by syncing call logs, contacts, and analytics from JustCall to various data destinations. This connector ensures businesses can centralize communication data for better reporting and analysis

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key_2` | `string` | API Key.  |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| users | id | DefaultPaginator | ✅ |  ❌  |
| calls | id | DefaultPaginator | ✅ |  ✅  |
| sms | id | DefaultPaginator | ✅ |  ✅  |
| contacts | id | No pagination | ✅ |  ❌  |
| phone_numbers | id | No pagination | ✅ |  ❌  |
| agent_analytics | agent_id | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.29 | 2025-08-02 | [64202](https://github.com/airbytehq/airbyte/pull/64202) | Update dependencies |
| 0.0.28 | 2025-07-19 | [63473](https://github.com/airbytehq/airbyte/pull/63473) | Update dependencies |
| 0.0.27 | 2025-07-12 | [63121](https://github.com/airbytehq/airbyte/pull/63121) | Update dependencies |
| 0.0.26 | 2025-07-05 | [62654](https://github.com/airbytehq/airbyte/pull/62654) | Update dependencies |
| 0.0.25 | 2025-06-21 | [61868](https://github.com/airbytehq/airbyte/pull/61868) | Update dependencies |
| 0.0.24 | 2025-06-14 | [60620](https://github.com/airbytehq/airbyte/pull/60620) | Update dependencies |
| 0.0.23 | 2025-05-10 | [59826](https://github.com/airbytehq/airbyte/pull/59826) | Update dependencies |
| 0.0.22 | 2025-05-03 | [59289](https://github.com/airbytehq/airbyte/pull/59289) | Update dependencies |
| 0.0.21 | 2025-04-26 | [57695](https://github.com/airbytehq/airbyte/pull/57695) | Update dependencies |
| 0.0.20 | 2025-04-05 | [57027](https://github.com/airbytehq/airbyte/pull/57027) | Update dependencies |
| 0.0.19 | 2025-03-29 | [56632](https://github.com/airbytehq/airbyte/pull/56632) | Update dependencies |
| 0.0.18 | 2025-03-22 | [56058](https://github.com/airbytehq/airbyte/pull/56058) | Update dependencies |
| 0.0.17 | 2025-03-08 | [55496](https://github.com/airbytehq/airbyte/pull/55496) | Update dependencies |
| 0.0.16 | 2025-03-01 | [54755](https://github.com/airbytehq/airbyte/pull/54755) | Update dependencies |
| 0.0.15 | 2025-02-22 | [54344](https://github.com/airbytehq/airbyte/pull/54344) | Update dependencies |
| 0.0.14 | 2025-02-15 | [53808](https://github.com/airbytehq/airbyte/pull/53808) | Update dependencies |
| 0.0.13 | 2025-02-08 | [53264](https://github.com/airbytehq/airbyte/pull/53264) | Update dependencies |
| 0.0.12 | 2025-02-01 | [52770](https://github.com/airbytehq/airbyte/pull/52770) | Update dependencies |
| 0.0.11 | 2025-01-25 | [52287](https://github.com/airbytehq/airbyte/pull/52287) | Update dependencies |
| 0.0.10 | 2025-01-18 | [51806](https://github.com/airbytehq/airbyte/pull/51806) | Update dependencies |
| 0.0.9 | 2025-01-11 | [51212](https://github.com/airbytehq/airbyte/pull/51212) | Update dependencies |
| 0.0.8 | 2024-12-28 | [50640](https://github.com/airbytehq/airbyte/pull/50640) | Update dependencies |
| 0.0.7 | 2024-12-21 | [50072](https://github.com/airbytehq/airbyte/pull/50072) | Update dependencies |
| 0.0.6 | 2024-12-14 | [49638](https://github.com/airbytehq/airbyte/pull/49638) | Update dependencies |
| 0.0.5 | 2024-12-12 | [49251](https://github.com/airbytehq/airbyte/pull/49251) | Update dependencies |
| 0.0.4 | 2024-12-11 | [48974](https://github.com/airbytehq/airbyte/pull/48974) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.3 | 2024-11-04 | [48164](https://github.com/airbytehq/airbyte/pull/48164) | Update dependencies |
| 0.0.2 | 2024-10-29 | [47799](https://github.com/airbytehq/airbyte/pull/47799) | Update dependencies |
| 0.0.1 | 2024-10-21 | | Initial release by [@bishalbera](https://github.com/bishalbera) via Connector Builder |

</details>
