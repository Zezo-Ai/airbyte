# Google Forms
Google Forms is a free online tool from Google that allows users to create custom surveys, quizzes, and forms. It enables easy collection and organization of data by automating responses into a connected Google Sheets spreadsheet. With Google Forms, you can design forms with various question types, share them via email or links, and track responses in real-time, making it ideal for feedback collection, event registration, or educational assessments.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `client_id` | `string` | Client ID.  |  |
| `client_secret` | `string` | Client secret.  |  |
| `client_refresh_token` | `string` | Refresh token.  |  |
| `form_id` | `array` | Forms IDs.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| forms | `formId` | No pagination | ✅ |  ❌  |
| form_responses | `responseId` | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.29 | 2025-08-02 | [64267](https://github.com/airbytehq/airbyte/pull/64267) | Update dependencies |
| 0.0.28 | 2025-07-26 | [63860](https://github.com/airbytehq/airbyte/pull/63860) | Update dependencies |
| 0.0.27 | 2025-07-19 | [63493](https://github.com/airbytehq/airbyte/pull/63493) | Update dependencies |
| 0.0.26 | 2025-07-12 | [63116](https://github.com/airbytehq/airbyte/pull/63116) | Update dependencies |
| 0.0.25 | 2025-07-05 | [62544](https://github.com/airbytehq/airbyte/pull/62544) | Update dependencies |
| 0.0.24 | 2025-06-21 | [61860](https://github.com/airbytehq/airbyte/pull/61860) | Update dependencies |
| 0.0.23 | 2025-06-14 | [61092](https://github.com/airbytehq/airbyte/pull/61092) | Update dependencies |
| 0.0.22 | 2025-05-24 | [60634](https://github.com/airbytehq/airbyte/pull/60634) | Update dependencies |
| 0.0.21 | 2025-05-10 | [59804](https://github.com/airbytehq/airbyte/pull/59804) | Update dependencies |
| 0.0.20 | 2025-05-03 | [59275](https://github.com/airbytehq/airbyte/pull/59275) | Update dependencies |
| 0.0.19 | 2025-04-26 | [58802](https://github.com/airbytehq/airbyte/pull/58802) | Update dependencies |
| 0.0.18 | 2025-04-19 | [58223](https://github.com/airbytehq/airbyte/pull/58223) | Update dependencies |
| 0.0.17 | 2025-04-12 | [57707](https://github.com/airbytehq/airbyte/pull/57707) | Update dependencies |
| 0.0.16 | 2025-04-05 | [57060](https://github.com/airbytehq/airbyte/pull/57060) | Update dependencies |
| 0.0.15 | 2025-03-29 | [56641](https://github.com/airbytehq/airbyte/pull/56641) | Update dependencies |
| 0.0.14 | 2025-03-22 | [56028](https://github.com/airbytehq/airbyte/pull/56028) | Update dependencies |
| 0.0.13 | 2025-03-08 | [55328](https://github.com/airbytehq/airbyte/pull/55328) | Update dependencies |
| 0.0.12 | 2025-03-01 | [54933](https://github.com/airbytehq/airbyte/pull/54933) | Update dependencies |
| 0.0.11 | 2025-02-22 | [54429](https://github.com/airbytehq/airbyte/pull/54429) | Update dependencies |
| 0.0.10 | 2025-02-15 | [53728](https://github.com/airbytehq/airbyte/pull/53728) | Update dependencies |
| 0.0.9 | 2025-02-08 | [53376](https://github.com/airbytehq/airbyte/pull/53376) | Update dependencies |
| 0.0.8 | 2025-02-01 | [52821](https://github.com/airbytehq/airbyte/pull/52821) | Update dependencies |
| 0.0.7 | 2025-01-25 | [52298](https://github.com/airbytehq/airbyte/pull/52298) | Update dependencies |
| 0.0.6 | 2025-01-18 | [51676](https://github.com/airbytehq/airbyte/pull/51676) | Update dependencies |
| 0.0.5 | 2025-01-11 | [51057](https://github.com/airbytehq/airbyte/pull/51057) | Update dependencies |
| 0.0.4 | 2024-12-28 | [50568](https://github.com/airbytehq/airbyte/pull/50568) | Update dependencies |
| 0.0.3 | 2024-12-21 | [49501](https://github.com/airbytehq/airbyte/pull/49501) | Update dependencies |
| 0.0.2 | 2024-12-12 | [48967](https://github.com/airbytehq/airbyte/pull/48967) | Update dependencies |
| 0.0.1 | 2024-11-09 | | Initial release by [@bala-ceg](https://github.com/bala-ceg) via Connector Builder |

</details>
