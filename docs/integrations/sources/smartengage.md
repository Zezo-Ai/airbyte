# SmartEngage

## Sync overview

This source can sync data from the [SmartEngage API](https://smartengage.com/docs/#smartengage-api). At present this connector only supports full refresh syncs meaning that each time you use the connector it will sync all available records from scratch. Please use cautiously if you expect your API to have a lot of records.

## This Source Supports the Following Streams

- avatars
- tags
- custom_fields
- sequences

### Features

| Feature           | Supported?\(Yes/No\) | Notes |
| :---------------- | :------------------- | :---- |
| Full Refresh Sync | Yes                  |       |
| Incremental Sync  | No                   |       |

## Getting started

### Requirements

- SmartEngage API Key

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                                                         |
| :------ | :--------- | :------------------------------------------------------- | :------------------------------------------------------------------------------ |
| 0.2.27 | 2025-07-26 | [63972](https://github.com/airbytehq/airbyte/pull/63972) | Update dependencies |
| 0.2.26 | 2025-07-05 | [62694](https://github.com/airbytehq/airbyte/pull/62694) | Update dependencies |
| 0.2.25 | 2025-06-28 | [62287](https://github.com/airbytehq/airbyte/pull/62287) | Update dependencies |
| 0.2.24 | 2025-06-21 | [61303](https://github.com/airbytehq/airbyte/pull/61303) | Update dependencies |
| 0.2.23 | 2025-05-24 | [60551](https://github.com/airbytehq/airbyte/pull/60551) | Update dependencies |
| 0.2.22 | 2025-05-10 | [60181](https://github.com/airbytehq/airbyte/pull/60181) | Update dependencies |
| 0.2.21 | 2025-05-04 | [59583](https://github.com/airbytehq/airbyte/pull/59583) | Update dependencies |
| 0.2.20 | 2025-04-27 | [58969](https://github.com/airbytehq/airbyte/pull/58969) | Update dependencies |
| 0.2.19 | 2025-04-19 | [58380](https://github.com/airbytehq/airbyte/pull/58380) | Update dependencies |
| 0.2.18 | 2025-04-12 | [57975](https://github.com/airbytehq/airbyte/pull/57975) | Update dependencies |
| 0.2.17 | 2025-04-05 | [57420](https://github.com/airbytehq/airbyte/pull/57420) | Update dependencies |
| 0.2.16 | 2025-03-29 | [56869](https://github.com/airbytehq/airbyte/pull/56869) | Update dependencies |
| 0.2.15 | 2025-03-22 | [56269](https://github.com/airbytehq/airbyte/pull/56269) | Update dependencies |
| 0.2.14 | 2025-03-08 | [55591](https://github.com/airbytehq/airbyte/pull/55591) | Update dependencies |
| 0.2.13 | 2025-03-01 | [54542](https://github.com/airbytehq/airbyte/pull/54542) | Update dependencies |
| 0.2.12 | 2025-02-15 | [54041](https://github.com/airbytehq/airbyte/pull/54041) | Update dependencies |
| 0.2.11 | 2025-02-08 | [53572](https://github.com/airbytehq/airbyte/pull/53572) | Update dependencies |
| 0.2.10 | 2025-02-01 | [53048](https://github.com/airbytehq/airbyte/pull/53048) | Update dependencies |
| 0.2.9 | 2025-01-25 | [52402](https://github.com/airbytehq/airbyte/pull/52402) | Update dependencies |
| 0.2.8 | 2025-01-18 | [51950](https://github.com/airbytehq/airbyte/pull/51950) | Update dependencies |
| 0.2.7 | 2025-01-11 | [51382](https://github.com/airbytehq/airbyte/pull/51382) | Update dependencies |
| 0.2.6 | 2024-12-28 | [50790](https://github.com/airbytehq/airbyte/pull/50790) | Update dependencies |
| 0.2.5 | 2024-12-21 | [50311](https://github.com/airbytehq/airbyte/pull/50311) | Update dependencies |
| 0.2.4 | 2024-12-14 | [49739](https://github.com/airbytehq/airbyte/pull/49739) | Update dependencies |
| 0.2.3 | 2024-12-12 | [47929](https://github.com/airbytehq/airbyte/pull/47929) | Update dependencies |
| 0.2.2 | 2024-10-28 | [47507](https://github.com/airbytehq/airbyte/pull/47507) | Update dependencies |
| 0.2.1 | 2024-08-16 | [44196](https://github.com/airbytehq/airbyte/pull/44196) | Bump source-declarative-manifest version |
| 0.2.0 | 2024-08-14 | [44064](https://github.com/airbytehq/airbyte/pull/44064) | Refactor connector to manifest-only format |
| 0.1.15 | 2024-08-10 | [43523](https://github.com/airbytehq/airbyte/pull/43523) | Update dependencies |
| 0.1.14 | 2024-08-03 | [43294](https://github.com/airbytehq/airbyte/pull/43294) | Update dependencies |
| 0.1.13 | 2024-07-27 | [42690](https://github.com/airbytehq/airbyte/pull/42690) | Update dependencies |
| 0.1.12 | 2024-07-20 | [42194](https://github.com/airbytehq/airbyte/pull/42194) | Update dependencies |
| 0.1.11 | 2024-07-13 | [41703](https://github.com/airbytehq/airbyte/pull/41703) | Update dependencies |
| 0.1.10 | 2024-07-10 | [41411](https://github.com/airbytehq/airbyte/pull/41411) | Update dependencies |
| 0.1.9 | 2024-07-09 | [41252](https://github.com/airbytehq/airbyte/pull/41252) | Update dependencies |
| 0.1.8 | 2024-07-06 | [40950](https://github.com/airbytehq/airbyte/pull/40950) | Update dependencies |
| 0.1.7 | 2024-06-25 | [40432](https://github.com/airbytehq/airbyte/pull/40432) | Update dependencies |
| 0.1.6 | 2024-06-22 | [40103](https://github.com/airbytehq/airbyte/pull/40103) | Update dependencies |
| 0.1.5 | 2024-06-06 | [39155](https://github.com/airbytehq/airbyte/pull/39155) | [autopull] Upgrade base image to v1.2.2 |
| 0.1.4 | 2024-05-31 | [38787](https://github.com/airbytehq/airbyte/pull/38787) | Make compatible with the builder |
| 0.1.3 | 2024-04-19 | [37261](https://github.com/airbytehq/airbyte/pull/37261) | Upgrade to CDK 0.80.0 and manage dependencies with Poetry. |
| 0.1.2 | 2024-04-15 | [37261](https://github.com/airbytehq/airbyte/pull/37261) | Base image migration: remove Dockerfile and use the python-connector-base image |
| 0.1.1 | 2024-04-12 | [37261](https://github.com/airbytehq/airbyte/pull/37261) | schema descriptions |
| 0.1.0 | 2022-10-25 | [18701](https://github.com/airbytehq/airbyte/pull/18701) | Initial commit |

</details>
