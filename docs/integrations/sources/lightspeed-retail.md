# Lightspeed Retail
Lightspeed Retail is a one-stop commerce platform empowering merchants around the world to simplify, scale and provide exceptional customer experiences. This source connector ingests data from the lightspeed retail API https://www.lightspeedhq.com/

In order to use this source, you must first create an account.
Note down the store url name as this will be needed for your subdomain name in the source. 
After logging in, you can create your personal token by navigating to Setup -&gt; Personal Token. You can learn more about the API here https://x-series-api.lightspeedhq.com/reference/listcustomers



 

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key. API key or access token |  |
| `subdomain` | `string` | Subdomain. The subdomain for the retailer, e.g., &#39;example&#39; in &#39;example.retail.lightspeed.app&#39;. |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| users | id | CursorPagination | ✅ |  ❌  |
| customers | id | CursorPagination | ✅ |  ❌  |
| audit | id | CursorPagination | ✅ |  ❌  |
| brands | id | CursorPagination | ✅ |  ❌  |
| attributes | id | CursorPagination | ✅ |  ❌  |
| tax | id | CursorPagination | ✅ |  ❌  |
| tags | id | CursorPagination | ✅ |  ❌  |
| suppliers | id | CursorPagination | ✅ |  ❌  |
| serial_numbers | id | CursorPagination | ✅ |  ❌  |
| sales | id | CursorPagination | ✅ |  ❌  |
| registers | id | CursorPagination | ✅ |  ❌  |
| quotes | id | CursorPagination | ✅ |  ❌  |
| services | id | CursorPagination | ✅ |  ❌  |
| promotions | id | CursorPagination | ✅ |  ❌  |
| products | id | CursorPagination | ✅ |  ❌  |
| product_categories | id | CursorPagination | ✅ |  ❌  |
| price_books | id | CursorPagination | ✅ |  ❌  |
| payment_types | id | CursorPagination | ✅ |  ❌  |
| outlets | id | CursorPagination | ✅ |  ❌  |
| inventory | id | CursorPagination | ✅ |  ❌  |
| fulfillments | id | CursorPagination | ✅ |  ❌  |
| customer_groups | id | CursorPagination | ✅ |  ❌  |
| consignments | id | CursorPagination | ✅ |  ❌  |
| consignment_products | product_id | CursorPagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.31 | 2025-08-02 | [64229](https://github.com/airbytehq/airbyte/pull/64229) | Update dependencies |
| 0.0.30 | 2025-07-19 | [63496](https://github.com/airbytehq/airbyte/pull/63496) | Update dependencies |
| 0.0.29 | 2025-07-12 | [63135](https://github.com/airbytehq/airbyte/pull/63135) | Update dependencies |
| 0.0.28 | 2025-07-05 | [62596](https://github.com/airbytehq/airbyte/pull/62596) | Update dependencies |
| 0.0.27 | 2025-06-28 | [62197](https://github.com/airbytehq/airbyte/pull/62197) | Update dependencies |
| 0.0.26 | 2025-06-21 | [61805](https://github.com/airbytehq/airbyte/pull/61805) | Update dependencies |
| 0.0.25 | 2025-06-14 | [61128](https://github.com/airbytehq/airbyte/pull/61128) | Update dependencies |
| 0.0.24 | 2025-05-24 | [60730](https://github.com/airbytehq/airbyte/pull/60730) | Update dependencies |
| 0.0.23 | 2025-05-10 | [59858](https://github.com/airbytehq/airbyte/pull/59858) | Update dependencies |
| 0.0.22 | 2025-05-03 | [59287](https://github.com/airbytehq/airbyte/pull/59287) | Update dependencies |
| 0.0.21 | 2025-04-26 | [58755](https://github.com/airbytehq/airbyte/pull/58755) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58173](https://github.com/airbytehq/airbyte/pull/58173) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57689](https://github.com/airbytehq/airbyte/pull/57689) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57081](https://github.com/airbytehq/airbyte/pull/57081) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56687](https://github.com/airbytehq/airbyte/pull/56687) | Update dependencies |
| 0.0.16 | 2025-03-22 | [56011](https://github.com/airbytehq/airbyte/pull/56011) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55497](https://github.com/airbytehq/airbyte/pull/55497) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54800](https://github.com/airbytehq/airbyte/pull/54800) | Update dependencies |
| 0.0.13 | 2025-02-22 | [54361](https://github.com/airbytehq/airbyte/pull/54361) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53837](https://github.com/airbytehq/airbyte/pull/53837) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53304](https://github.com/airbytehq/airbyte/pull/53304) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52763](https://github.com/airbytehq/airbyte/pull/52763) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52226](https://github.com/airbytehq/airbyte/pull/52226) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51831](https://github.com/airbytehq/airbyte/pull/51831) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51213](https://github.com/airbytehq/airbyte/pull/51213) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50619](https://github.com/airbytehq/airbyte/pull/50619) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50129](https://github.com/airbytehq/airbyte/pull/50129) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49651](https://github.com/airbytehq/airbyte/pull/49651) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49226](https://github.com/airbytehq/airbyte/pull/49226) | Update dependencies |
| 0.0.2 | 2024-12-11 | [48954](https://github.com/airbytehq/airbyte/pull/48954) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-23 | | Initial release by [@aazam-gh](https://github.com/aazam-gh) via Connector Builder |

</details>
