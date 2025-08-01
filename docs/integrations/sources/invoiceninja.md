# Invoiceninja
Invoice Ninja is an invoicing, billing, and payment management software.
With this connector we can extract data from various streams such asproducts , invoice , payments and quotes.
Docs : https://api-docs.invoicing.co/#overview--introduction

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| clients | id | DefaultPaginator | ✅ |  ❌  |
| products | id | DefaultPaginator | ✅ |  ❌  |
| invoices | id | DefaultPaginator | ✅ |  ❌  |
| recurring invoices | id | DefaultPaginator | ✅ |  ❌  |
| payments | id | DefaultPaginator | ✅ |  ❌  |
| quotes | id | DefaultPaginator | ✅ |  ❌  |
| credits | id | DefaultPaginator | ✅ |  ❌  |
| projects | id | DefaultPaginator | ✅ |  ❌  |
| tasks | id | DefaultPaginator | ✅ |  ❌  |
| vendors | id | DefaultPaginator | ✅ |  ❌  |
| purchase_orders | id | DefaultPaginator | ✅ |  ❌  |
| expenses | id | DefaultPaginator | ✅ |  ❌  |
| recurring expenses | id | DefaultPaginator | ✅ |  ❌  |
| bank transactions | id | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.31 | 2025-08-02 | [64247](https://github.com/airbytehq/airbyte/pull/64247) | Update dependencies |
| 0.0.30 | 2025-07-26 | [63889](https://github.com/airbytehq/airbyte/pull/63889) | Update dependencies |
| 0.0.29 | 2025-07-19 | [63509](https://github.com/airbytehq/airbyte/pull/63509) | Update dependencies |
| 0.0.28 | 2025-07-12 | [63132](https://github.com/airbytehq/airbyte/pull/63132) | Update dependencies |
| 0.0.27 | 2025-07-05 | [62632](https://github.com/airbytehq/airbyte/pull/62632) | Update dependencies |
| 0.0.26 | 2025-06-21 | [61861](https://github.com/airbytehq/airbyte/pull/61861) | Update dependencies |
| 0.0.25 | 2025-06-14 | [61104](https://github.com/airbytehq/airbyte/pull/61104) | Update dependencies |
| 0.0.24 | 2025-05-24 | [60697](https://github.com/airbytehq/airbyte/pull/60697) | Update dependencies |
| 0.0.23 | 2025-05-10 | [59795](https://github.com/airbytehq/airbyte/pull/59795) | Update dependencies |
| 0.0.22 | 2025-05-03 | [59230](https://github.com/airbytehq/airbyte/pull/59230) | Update dependencies |
| 0.0.21 | 2025-04-26 | [58761](https://github.com/airbytehq/airbyte/pull/58761) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58207](https://github.com/airbytehq/airbyte/pull/58207) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57742](https://github.com/airbytehq/airbyte/pull/57742) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57107](https://github.com/airbytehq/airbyte/pull/57107) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56637](https://github.com/airbytehq/airbyte/pull/56637) | Update dependencies |
| 0.0.16 | 2025-03-22 | [56052](https://github.com/airbytehq/airbyte/pull/56052) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55470](https://github.com/airbytehq/airbyte/pull/55470) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54827](https://github.com/airbytehq/airbyte/pull/54827) | Update dependencies |
| 0.0.13 | 2025-02-22 | [54317](https://github.com/airbytehq/airbyte/pull/54317) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53798](https://github.com/airbytehq/airbyte/pull/53798) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53289](https://github.com/airbytehq/airbyte/pull/53289) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52764](https://github.com/airbytehq/airbyte/pull/52764) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52273](https://github.com/airbytehq/airbyte/pull/52273) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51780](https://github.com/airbytehq/airbyte/pull/51780) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51179](https://github.com/airbytehq/airbyte/pull/51179) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50664](https://github.com/airbytehq/airbyte/pull/50664) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50134](https://github.com/airbytehq/airbyte/pull/50134) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49605](https://github.com/airbytehq/airbyte/pull/49605) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49234](https://github.com/airbytehq/airbyte/pull/49234) | Update dependencies |
| 0.0.2 | 2024-12-11 | [48917](https://github.com/airbytehq/airbyte/pull/48917) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-11-07 | | Initial release by [@ombhardwajj](https://github.com/ombhardwajj) via Connector Builder |

</details>
