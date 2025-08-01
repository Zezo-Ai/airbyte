# OpenAQ
The OpenAQ API provides open access to global air quality data.
This connector enables you to fetch data from all the streams listed on their website such as Locations , Sensors , Measurements and much more.

Docs : https://docs.openaq.org/using-the-api/quick-start

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `country_ids` | `array` | Countries. The list of IDs of countries (comma separated) you need the data for, check more: https://docs.openaq.org/resources/countries |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| instruments | id | DefaultPaginator | ✅ |  ❌  |
| manufacturers | id | DefaultPaginator | ✅ |  ❌  |
| manufacturer_instruments | id | No pagination | ✅ |  ❌  |
| locations | id | DefaultPaginator | ✅ |  ❌  |
| licenses |  | DefaultPaginator | ✅ |  ❌  |
| license_instrument | id | No pagination | ✅ |  ❌  |
| parameters | id | DefaultPaginator | ✅ |  ❌  |
| countries | id | DefaultPaginator | ✅ |  ❌  |
| latest_parameters |  | No pagination | ✅ |  ❌  |
| sensors | id | DefaultPaginator | ✅ |  ❌  |
| providers | id | DefaultPaginator | ✅ |  ❌  |
| owners | id | DefaultPaginator | ✅ |  ❌  |
| location_latest_measure |  | No pagination | ✅ |  ❌  |
| sensor_measurements |  | DefaultPaginator | ✅ |  ❌  |
| measurements_daily |  | DefaultPaginator | ✅ |  ❌  |
| measurements_yearly |  | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.31 | 2025-08-02 | [64266](https://github.com/airbytehq/airbyte/pull/64266) | Update dependencies |
| 0.0.30 | 2025-07-26 | [63894](https://github.com/airbytehq/airbyte/pull/63894) | Update dependencies |
| 0.0.29 | 2025-07-19 | [63426](https://github.com/airbytehq/airbyte/pull/63426) | Update dependencies |
| 0.0.28 | 2025-07-12 | [63268](https://github.com/airbytehq/airbyte/pull/63268) | Update dependencies |
| 0.0.27 | 2025-07-05 | [62557](https://github.com/airbytehq/airbyte/pull/62557) | Update dependencies |
| 0.0.26 | 2025-06-28 | [62332](https://github.com/airbytehq/airbyte/pull/62332) | Update dependencies |
| 0.0.25 | 2025-06-21 | [61928](https://github.com/airbytehq/airbyte/pull/61928) | Update dependencies |
| 0.0.24 | 2025-06-14 | [61059](https://github.com/airbytehq/airbyte/pull/61059) | Update dependencies |
| 0.0.23 | 2025-05-24 | [60525](https://github.com/airbytehq/airbyte/pull/60525) | Update dependencies |
| 0.0.22 | 2025-05-10 | [60112](https://github.com/airbytehq/airbyte/pull/60112) | Update dependencies |
| 0.0.21 | 2025-05-03 | [59495](https://github.com/airbytehq/airbyte/pull/59495) | Update dependencies |
| 0.0.20 | 2025-04-27 | [59105](https://github.com/airbytehq/airbyte/pull/59105) | Update dependencies |
| 0.0.19 | 2025-04-19 | [58499](https://github.com/airbytehq/airbyte/pull/58499) | Update dependencies |
| 0.0.18 | 2025-04-12 | [57903](https://github.com/airbytehq/airbyte/pull/57903) | Update dependencies |
| 0.0.17 | 2025-04-05 | [57335](https://github.com/airbytehq/airbyte/pull/57335) | Update dependencies |
| 0.0.16 | 2025-03-29 | [56775](https://github.com/airbytehq/airbyte/pull/56775) | Update dependencies |
| 0.0.15 | 2025-03-22 | [56232](https://github.com/airbytehq/airbyte/pull/56232) | Update dependencies |
| 0.0.14 | 2025-03-08 | [55555](https://github.com/airbytehq/airbyte/pull/55555) | Update dependencies |
| 0.0.13 | 2025-03-01 | [55028](https://github.com/airbytehq/airbyte/pull/55028) | Update dependencies |
| 0.0.12 | 2025-02-23 | [54620](https://github.com/airbytehq/airbyte/pull/54620) | Update dependencies |
| 0.0.11 | 2025-02-15 | [53978](https://github.com/airbytehq/airbyte/pull/53978) | Update dependencies |
| 0.0.10 | 2025-02-08 | [53514](https://github.com/airbytehq/airbyte/pull/53514) | Update dependencies |
| 0.0.9 | 2025-02-01 | [52961](https://github.com/airbytehq/airbyte/pull/52961) | Update dependencies |
| 0.0.8 | 2025-01-25 | [52473](https://github.com/airbytehq/airbyte/pull/52473) | Update dependencies |
| 0.0.7 | 2025-01-18 | [51898](https://github.com/airbytehq/airbyte/pull/51898) | Update dependencies |
| 0.0.6 | 2025-01-11 | [51312](https://github.com/airbytehq/airbyte/pull/51312) | Update dependencies |
| 0.0.5 | 2024-12-28 | [50743](https://github.com/airbytehq/airbyte/pull/50743) | Update dependencies |
| 0.0.4 | 2024-12-21 | [49713](https://github.com/airbytehq/airbyte/pull/49713) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49318](https://github.com/airbytehq/airbyte/pull/49318) | Update dependencies |
| 0.0.2 | 2024-12-11 | [49083](https://github.com/airbytehq/airbyte/pull/49083) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-11-06 | | Initial release by [@marcosmarxm](https://github.com/marcosmarxm) via Connector Builder |

</details>
