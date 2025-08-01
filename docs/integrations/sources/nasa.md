# NASA

## Overview

The NASA source supports full refresh syncs

### Output schema

Asingle output stream is available (at the moment) from this source:

\*[APOD](https://github.com/nasa/apod-api#docs-).

If there are more endpoints you'd like Airbyte to support, please [create an issue.](https://github.com/airbytehq/airbyte/issues/new/choose)

### Features

| Feature           | Supported? |
| :---------------- | :--------- |
| Full Refresh Sync | Yes        |
| Incremental Sync  | Yes        |
| SSL connection    | No         |
| Namespaces        | No         |

### Performance considerations

The NASA connector should not run into NASA API limitations under normal usage. Please [create an issue](https://github.com/airbytehq/airbyte/issues) if you see any rate limit issues that are not automatically retried successfully.

## Getting started

### Requirements

- NASA API Key. You can use `DEMO_KEY` (see rate limits [here](https://api.nasa.gov/)).

### Connect using `API Key`:

1. Generate an API Key as described [here](https://api.nasa.gov/).
2. Use the generated `API Key` in the Airbyte connection.

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                    |
| :------ | :--------- | :------------------------------------------------------- | :----------------------------------------- |
| 0.3.32 | 2025-07-26 | [63834](https://github.com/airbytehq/airbyte/pull/63834) | Update dependencies |
| 0.3.31 | 2025-07-19 | [63410](https://github.com/airbytehq/airbyte/pull/63410) | Update dependencies |
| 0.3.30 | 2025-07-12 | [63258](https://github.com/airbytehq/airbyte/pull/63258) | Update dependencies |
| 0.3.29 | 2025-07-05 | [62620](https://github.com/airbytehq/airbyte/pull/62620) | Update dependencies |
| 0.3.28 | 2025-06-28 | [62396](https://github.com/airbytehq/airbyte/pull/62396) | Update dependencies |
| 0.3.27 | 2025-06-21 | [61046](https://github.com/airbytehq/airbyte/pull/61046) | Update dependencies |
| 0.3.26 | 2025-05-24 | [60543](https://github.com/airbytehq/airbyte/pull/60543) | Update dependencies |
| 0.3.25 | 2025-05-10 | [60116](https://github.com/airbytehq/airbyte/pull/60116) | Update dependencies |
| 0.3.24 | 2025-05-03 | [59501](https://github.com/airbytehq/airbyte/pull/59501) | Update dependencies |
| 0.3.23 | 2025-04-27 | [59067](https://github.com/airbytehq/airbyte/pull/59067) | Update dependencies |
| 0.3.22 | 2025-04-19 | [58504](https://github.com/airbytehq/airbyte/pull/58504) | Update dependencies |
| 0.3.21 | 2025-04-12 | [57921](https://github.com/airbytehq/airbyte/pull/57921) | Update dependencies |
| 0.3.20 | 2025-04-05 | [57287](https://github.com/airbytehq/airbyte/pull/57287) | Update dependencies |
| 0.3.19 | 2025-03-29 | [56667](https://github.com/airbytehq/airbyte/pull/56667) | Update dependencies |
| 0.3.18 | 2025-03-22 | [56032](https://github.com/airbytehq/airbyte/pull/56032) | Update dependencies |
| 0.3.17 | 2025-03-08 | [55503](https://github.com/airbytehq/airbyte/pull/55503) | Update dependencies |
| 0.3.16 | 2025-03-01 | [54783](https://github.com/airbytehq/airbyte/pull/54783) | Update dependencies |
| 0.3.15 | 2025-02-22 | [54341](https://github.com/airbytehq/airbyte/pull/54341) | Update dependencies |
| 0.3.14 | 2025-02-15 | [53803](https://github.com/airbytehq/airbyte/pull/53803) | Update dependencies |
| 0.3.13 | 2025-02-08 | [53303](https://github.com/airbytehq/airbyte/pull/53303) | Update dependencies |
| 0.3.12 | 2025-02-01 | [52778](https://github.com/airbytehq/airbyte/pull/52778) | Update dependencies |
| 0.3.11 | 2025-01-25 | [52275](https://github.com/airbytehq/airbyte/pull/52275) | Update dependencies |
| 0.3.10 | 2025-01-18 | [51793](https://github.com/airbytehq/airbyte/pull/51793) | Update dependencies |
| 0.3.9 | 2025-01-11 | [51178](https://github.com/airbytehq/airbyte/pull/51178) | Update dependencies |
| 0.3.8 | 2024-12-28 | [50595](https://github.com/airbytehq/airbyte/pull/50595) | Update dependencies |
| 0.3.7 | 2024-12-21 | [50083](https://github.com/airbytehq/airbyte/pull/50083) | Update dependencies |
| 0.3.6 | 2024-12-14 | [49637](https://github.com/airbytehq/airbyte/pull/49637) | Update dependencies |
| 0.3.5 | 2024-12-12 | [49231](https://github.com/airbytehq/airbyte/pull/49231) | Update dependencies |
| 0.3.4 | 2024-12-11 | [48990](https://github.com/airbytehq/airbyte/pull/48990) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.3.3 | 2024-10-29 | [47740](https://github.com/airbytehq/airbyte/pull/47740) | Update dependencies |
| 0.3.2 | 2024-10-28 | [47491](https://github.com/airbytehq/airbyte/pull/47491) | Update dependencies |
| 0.3.1 | 2024-08-16 | [44196](https://github.com/airbytehq/airbyte/pull/44196) | Bump source-declarative-manifest version |
| 0.3.0 | 2024-08-15 | [44115](https://github.com/airbytehq/airbyte/pull/44115) | Refactor connector to manifest-only format |
| 0.2.14 | 2024-08-12 | [43907](https://github.com/airbytehq/airbyte/pull/43907) | Update dependencies |
| 0.2.13 | 2024-08-10 | [43625](https://github.com/airbytehq/airbyte/pull/43625) | Update dependencies |
| 0.2.12 | 2024-08-03 | [43295](https://github.com/airbytehq/airbyte/pull/43295) | Update dependencies |
| 0.2.11 | 2024-07-27 | [42592](https://github.com/airbytehq/airbyte/pull/42592) | Update dependencies |
| 0.2.10 | 2024-07-20 | [42163](https://github.com/airbytehq/airbyte/pull/42163) | Update dependencies |
| 0.2.9 | 2024-07-13 | [41776](https://github.com/airbytehq/airbyte/pull/41776) | Update dependencies |
| 0.2.8 | 2024-07-10 | [41545](https://github.com/airbytehq/airbyte/pull/41545) | Update dependencies |
| 0.2.7 | 2024-07-09 | [41154](https://github.com/airbytehq/airbyte/pull/41154) | Update dependencies |
| 0.2.6 | 2024-07-06 | [40764](https://github.com/airbytehq/airbyte/pull/40764) | Update dependencies |
| 0.2.5 | 2024-06-25 | [40416](https://github.com/airbytehq/airbyte/pull/40416) | Update dependencies |
| 0.2.4 | 2024-06-22 | [40114](https://github.com/airbytehq/airbyte/pull/40114) | Update dependencies |
| 0.2.3 | 2024-06-15 | [39498](https://github.com/airbytehq/airbyte/pull/39498) | Make compatible with builder |
| 0.2.2 | 2024-06-06 | [39218](https://github.com/airbytehq/airbyte/pull/39218) | [autopull] Upgrade base image to v1.2.2 |
| 0.2.1 | 2024-05-21 | [38520](https://github.com/airbytehq/airbyte/pull/38520) | [autopull] base image + poetry + up_to_date |
| 0.2.0 | 2023-10-10 | [31051](https://github.com/airbytehq/airbyte/pull/31051) | Migrate to lowcode |
| 0.1.1 | 2023-02-13 | [22934](https://github.com/airbytehq/airbyte/pull/22934) | Specified date formatting in specification |
| 0.1.0 | 2022-10-24 | [18394](https://github.com/airbytehq/airbyte/pull/18394) | 🎉 New Source: NASA APOD |

</details>
