# Phyllo
Website: https://dashboard.getphyllo.com/
API Reference: https://docs.getphyllo.com/docs/api-reference/introduction/introduction

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `client_id` | `string` | Client ID. Your Client ID for the Phyllo API. You can find this in the Phyllo Developer Dashboard under API credentials. |  |
| `environment` | `string` | Environment. The environment for the API (e.g., &#39;api.sandbox&#39;, &#39;api.staging&#39;, &#39;api&#39;) | api |
| `client_secret` | `string` | Client Secret. Your Client Secret for the Phyllo API. You can find this in the Phyllo Developer Dashboard under API credentials. |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| work-platforms | id | DefaultPaginator | ✅ |  ✅  |
| users | id | DefaultPaginator | ✅ |  ✅  |
| accounts | id | DefaultPaginator | ✅ |  ✅  |
| profiles | id | DefaultPaginator | ✅ |  ✅  |
| content_items | id | DefaultPaginator | ✅ |  ✅  |
| social_income_transactions | id | DefaultPaginator | ✅ |  ✅  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.15 | 2025-08-02 | [64283](https://github.com/airbytehq/airbyte/pull/64283) | Update dependencies |
| 0.0.14 | 2025-07-26 | [63926](https://github.com/airbytehq/airbyte/pull/63926) | Update dependencies |
| 0.0.13 | 2025-07-19 | [63409](https://github.com/airbytehq/airbyte/pull/63409) | Update dependencies |
| 0.0.12 | 2025-07-12 | [63181](https://github.com/airbytehq/airbyte/pull/63181) | Update dependencies |
| 0.0.11 | 2025-07-05 | [62582](https://github.com/airbytehq/airbyte/pull/62582) | Update dependencies |
| 0.0.10 | 2025-06-28 | [62296](https://github.com/airbytehq/airbyte/pull/62296) | Update dependencies |
| 0.0.9 | 2025-06-21 | [61906](https://github.com/airbytehq/airbyte/pull/61906) | Update dependencies |
| 0.0.8 | 2025-06-14 | [61054](https://github.com/airbytehq/airbyte/pull/61054) | Update dependencies |
| 0.0.7 | 2025-05-24 | [60441](https://github.com/airbytehq/airbyte/pull/60441) | Update dependencies |
| 0.0.6 | 2025-05-10 | [59490](https://github.com/airbytehq/airbyte/pull/59490) | Update dependencies |
| 0.0.5 | 2025-04-27 | [59070](https://github.com/airbytehq/airbyte/pull/59070) | Update dependencies |
| 0.0.4 | 2025-04-19 | [58493](https://github.com/airbytehq/airbyte/pull/58493) | Update dependencies |
| 0.0.3 | 2025-04-12 | [57895](https://github.com/airbytehq/airbyte/pull/57895) | Update dependencies |
| 0.0.2 | 2025-04-05 | [57326](https://github.com/airbytehq/airbyte/pull/57326) | Update dependencies |
| 0.0.1 | 2025-04-04 | [57012](https://github.com/airbytehq/airbyte/pull/57012) | Initial release by [@btkcodedev](https://github.com/btkcodedev) via Connector Builder |

</details>
