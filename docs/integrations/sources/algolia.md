# Algolia
This page contains the setup guide and reference information for the [Algolia](https://dashboard.algolia.com/) source connector.

## Documentation reference:
Visit `https://www.algolia.com/doc/rest-api/search/` for API documentation

## Authentication setup
`Source-algolia` uses API keys and application id for its authentication,
Visit `https://dashboard.algolia.com/account/overview` for getting credentials and application id.
Visit `https://www.algolia.com/doc/rest-api/search/#section/Authentication` for more about authentication.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `application_id` | `string` | Application ID. The application ID for your application found in settings |  |
| `search_query` | `string` | Indexes Search query. Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex` | hitsPerPage=2&amp;getRankingInfo=1 |
| `start_date` | `string` | Start date.  |  |
| `object_id` | `string` | Object ID. Object ID within index for search queries | ecommerce-sample-data-9999996 |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| indices | name | DefaultPaginator | ✅ |  ✅  |
| indexes_query |  | No pagination | ✅ |  ❌  |
| available_languages |  | No pagination | ✅ |  ❌  |
| logs | sha1 | No pagination | ✅ |  ✅  |
| indexes_settings |  | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date | Pull Request | Subject |
| ------------------ | ------------ | --- | ---------------- |
| 0.0.30 | 2025-07-26 | [63799](https://github.com/airbytehq/airbyte/pull/63799) | Update dependencies |
| 0.0.29 | 2025-07-19 | [63479](https://github.com/airbytehq/airbyte/pull/63479) | Update dependencies |
| 0.0.28 | 2025-07-12 | [63073](https://github.com/airbytehq/airbyte/pull/63073) | Update dependencies |
| 0.0.27 | 2025-07-05 | [61630](https://github.com/airbytehq/airbyte/pull/61630) | Update dependencies |
| 0.0.26 | 2025-05-24 | [60643](https://github.com/airbytehq/airbyte/pull/60643) | Update dependencies |
| 0.0.25 | 2025-05-10 | [59889](https://github.com/airbytehq/airbyte/pull/59889) | Update dependencies |
| 0.0.24 | 2025-05-03 | [59339](https://github.com/airbytehq/airbyte/pull/59339) | Update dependencies |
| 0.0.23 | 2025-04-26 | [58744](https://github.com/airbytehq/airbyte/pull/58744) | Update dependencies |
| 0.0.22 | 2025-04-19 | [58237](https://github.com/airbytehq/airbyte/pull/58237) | Update dependencies |
| 0.0.21 | 2025-04-12 | [57629](https://github.com/airbytehq/airbyte/pull/57629) | Update dependencies |
| 0.0.20 | 2025-04-05 | [57122](https://github.com/airbytehq/airbyte/pull/57122) | Update dependencies |
| 0.0.19 | 2025-03-29 | [56565](https://github.com/airbytehq/airbyte/pull/56565) | Update dependencies |
| 0.0.18 | 2025-03-22 | [56118](https://github.com/airbytehq/airbyte/pull/56118) | Update dependencies |
| 0.0.17 | 2025-03-08 | [55411](https://github.com/airbytehq/airbyte/pull/55411) | Update dependencies |
| 0.0.16 | 2025-03-01 | [54856](https://github.com/airbytehq/airbyte/pull/54856) | Update dependencies |
| 0.0.15 | 2025-02-22 | [54224](https://github.com/airbytehq/airbyte/pull/54224) | Update dependencies |
| 0.0.14 | 2025-02-15 | [53913](https://github.com/airbytehq/airbyte/pull/53913) | Update dependencies |
| 0.0.13 | 2025-02-08 | [53391](https://github.com/airbytehq/airbyte/pull/53391) | Update dependencies |
| 0.0.12 | 2025-02-01 | [52932](https://github.com/airbytehq/airbyte/pull/52932) | Update dependencies |
| 0.0.11 | 2025-01-25 | [52207](https://github.com/airbytehq/airbyte/pull/52207) | Update dependencies |
| 0.0.10 | 2025-01-18 | [51773](https://github.com/airbytehq/airbyte/pull/51773) | Update dependencies |
| 0.0.9 | 2025-01-11 | [51225](https://github.com/airbytehq/airbyte/pull/51225) | Update dependencies |
| 0.0.8 | 2024-12-28 | [50499](https://github.com/airbytehq/airbyte/pull/50499) | Update dependencies |
| 0.0.7 | 2024-12-21 | [50177](https://github.com/airbytehq/airbyte/pull/50177) | Update dependencies |
| 0.0.6 | 2024-12-14 | [49560](https://github.com/airbytehq/airbyte/pull/49560) | Update dependencies |
| 0.0.5 | 2024-12-12 | [49308](https://github.com/airbytehq/airbyte/pull/49308) | Update dependencies |
| 0.0.4 | 2024-12-11 | [49027](https://github.com/airbytehq/airbyte/pull/49027) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.3 | 2024-11-04 | [48182](https://github.com/airbytehq/airbyte/pull/48182) | Update dependencies |
| 0.0.2 | 2024-10-29 | [47659](https://github.com/airbytehq/airbyte/pull/47659) | Update dependencies |
| 0.0.1 | 2024-09-16 | [45605](https://github.com/airbytehq/airbyte/pull/45605) | Initial release by [@btkcodedev](https://github.com/btkcodedev) via Connector Builder |

</details>
