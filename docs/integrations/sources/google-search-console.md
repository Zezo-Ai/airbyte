# Google Search Console

<HideInUI>

This page contains the setup guide and reference information for the [Google Search Console](https://developers.google.com) source connector.

</HideInUI>

## Prerequisites

- Google Account
- A verified property in Google Search Console (or the list of the `Site URLs` (Website URL Property))
<!-- env:oss -->
- Google Search Console API enabled for your project (**Airbyte Open Source** only)
<!-- /env:oss -->

## Setup guide

### Step 1: Set up Google Search Console

To authenticate the Google Search Console connector, you will need to use one of the following methods:

<!-- env:cloud -->

#### OAuth (Recommended for Airbyte Cloud)

You can authenticate using your Google Account with OAuth if you are the owner of the Google Search Console property or have view permissions. Follow [Google's instructions](https://support.google.com/webmasters/answer/7687615?sjid=11103698321670173176-NA) to ensure that your account has the necessary permissions (**Owner** or **Full User**) to view the Google Search Console property. This option is recommended for **Airbyte Cloud** users, as it significantly simplifies the setup process and allows you to authenticate the connection [directly from the Airbyte UI](#step-2-set-up-the-google-search-console-connector-in-airbyte).

<!-- /env:cloud -->

<!-- env:oss -->

To authenticate with OAuth in **Airbyte Open Source**, you will need to create an authentication app and obtain the following credentials and tokens:

- Client ID
- Client Secret
- Refresh Token
- Access Token

More information on the steps to create an OAuth app to access Google APIs and obtain these credentials can be found [in Google's documentation](https://developers.google.com/identity/protocols/oauth2).

#### Google service account with JSON key file (Recommended for Airbyte Open Source)

You can authenticate the connection using a JSON key file associated with a Google service account. This option is recommended for **Airbyte Open Source** users. Follow the steps below to create a service account and generate the JSON key file:

1. Open the [Service Accounts page](https://console.developers.google.com/iam-admin/serviceaccounts).
2. Select an existing project, or create a new project.
3. At the top of the page, click **+ Create service account**.
4. Enter a name and description for the service account, then click **Create and Continue**.
5. Under **Service account permissions**, select the roles to grant to the service account, then click **Continue**. We recommend the **Viewer** role.
   - Optional: Under **Grant users access to this service account**, you may specify the users or groups that are allowed to use and manage the service account.
6. Go to the [API Console/Credentials](https://console.cloud.google.com/apis/credentials) and click on the email address of the service account you just created.
7. In the **Keys** tab, click **+ Add key**, then click **Create new key**.
8. Select **JSON** as the Key type. This will generate and download the JSON key file that you'll use for authentication. Click **Continue**.

:::caution
This file serves as the only copy of your JSON service key, and you will not be able to re-download it. Be sure to store it in a secure location.
:::

:::note
You can return to the [API Console/Credentials](https://console.cloud.google.com/apis/credentials) at any time to manage your service account or generate additional JSON keys. For more details about service account credentials, see [Google's IAM documentation](https://cloud.google.com/iam/docs/understanding-service-accounts).
:::

#### Note on delegating domain-wide authority to the service account

Domain-wide delegation is a powerful feature that allows service accounts to access users' data across an organization's Google Workspace environment through 'impersonation'. This authority is necessary in certain use cases, such as when a service account needs broad access across multiple users and services within a domain.

:::note
Only the super admin of your Google Workspace domain can enable domain-wide delegation of authority to a service account.
:::

To enable delegated domain-wide authority, follow the steps listed in the [Google documentation](https://developers.google.com/identity/protocols/oauth2/service-account#delegatingauthority). Please make sure to grant the following OAuth scopes to the service account:

- `https://www.googleapis.com/auth/webmasters.readonly`

For more information on this topic, please refer to [this Google article](https://support.google.com/a/answer/162106?hl=en).

<!-- /env:oss -->

### Step 2: Set up the Google Search Console connector in Airbyte

<!-- env:cloud -->

#### For Airbyte Cloud:

1. [Log into your Airbyte Cloud](https://cloud.airbyte.com/workspaces) account.
2. Click Sources and then click + New source.
3. On the Set up the source page, select Google Search Console from the Source type dropdown.
4. Enter a name for the Google Search Console connector.
5. For **Website URL Property**, enter the specific website property in Google Seach Console with data you want to replicate.
6. For **Start Date**, by default the `2021-01-01` is set, use the provided datepicker or enter a date in the format `YYYY-MM-DD`. Any data created on or after this date will be replicated.
7. To authenticate the connection:
<!-- env:cloud -->

<!-- env:oss -->
### For Airbyte Open Source:

1. Navigate to the Airbyte Open Source dashboard.
2. Click Sources and then click + New source.
3. On the Set up the source page, select Google Search Console from the Source type dropdown.
4. Enter a name for the Google Search Console connector.
<!-- /env:oss -->

- **For Airbyte Cloud:**
  - Select **Oauth** from the Authentication dropdown, then click **Sign in with Google** to authorize your account.
    <!-- /env:cloud -->
    <!-- env:oss -->
- **For Airbyte Open Source:**
  - (Recommended) Select **Service Account Key Authorization** from the Authentication dropdown, then enter the **Admin Email** and **Service Account JSON Key**. For the key, copy and paste the JSON key you obtained during the service account setup. It should begin with `{"type": "service account", "project_id": YOUR_PROJECT_ID, "private_key_id": YOUR_PRIVATE_KEY, ...}`
  - Select **Oauth** from the Authentication dropdown, then enter your **Client ID**, **Client Secret**, **Access Token** and **Refresh Token**.
  <!-- /env:oss -->

8. (Optional) For **End Date**, you may optionally provide a date in the format `YYYY-MM-DD`. Any data created between the defined Start Date and End Date will be replicated. Leaving this field blank will replicate all data created on or after the Start Date to the present.
9. (Optional) For **Custom Reports**, you may optionally provide an array of JSON objects representing any custom reports you wish to query the API with. Refer to the [Custom reports](#custom-reports) section below for more information on formulating these reports.
10. (Optional) For **Data Freshness**, you may choose whether to include "fresh" data that has not been finalized by Google, and may be subject to change. Please note that if you are using Incremental sync mode, we highly recommend leaving this option to its default value of `final`. Refer to the [Data Freshness](#data-freshness) section below for more information on this parameter.
11. Click **Set up source** and wait for the tests to complete.

<HideInUI>

## Supported sync modes

The Google Search Console source connector supports the following [sync modes](https://docs.airbyte.com/cloud/core-concepts/#connection-sync-modes):

- [Full Refresh - Overwrite](https://docs.airbyte.com/understanding-airbyte/connections/full-refresh-overwrite/)
- [Full Refresh - Append](https://docs.airbyte.com/understanding-airbyte/connections/full-refresh-append)
- [Incremental - Append](https://docs.airbyte.com/understanding-airbyte/connections/incremental-append)
- [Incremental - Append + Deduped](https://docs.airbyte.com/understanding-airbyte/connections/incremental-append-deduped)

:::note
The granularity for the cursor is 1 day, so Incremental Sync in Append mode may result in duplicating the data.
:::

## Supported Streams

- [Sites](https://developers.google.com/webmaster-tools/search-console-api-original/v3/sites/get)
- [Sitemaps](https://developers.google.com/webmaster-tools/search-console-api-original/v3/sitemaps/list)
- [Full Analytics report](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query) \(this stream has a long sync time because it is very detailed, use with care\)
- [Analytics report by country](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics report by date](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics report by device](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics report by page](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics report by query](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics keyword report](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics keyword report by page](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics keyword report by site](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics page report](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics site report by page](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- [Analytics site report by site](https://developers.google.com/webmaster-tools/search-console-api-original/v3/searchanalytics/query)
- Analytics report by custom dimensions

### Entity-Relationship Diagram (ERD)
<EntityRelationshipDiagram></EntityRelationshipDiagram>

## Connector-specific configurations

### Custom reports

Custom reports allow you to query the API with a custom set of dimensions to group results by. Results are grouped in the order that you supply these dimensions. Each custom report should be constructed like following:

1. Click `Add` under the `Custom Reports` section
2. Enter the `Name` of the report, this will be the name of the stream
3. Select one or more `Dimensions` from the available dropdown list

The available `Dimensions` are:

- `country`
- `date`
- `device`
- `page`
- `query`

For example, to query the API for a report that groups results by country, then by date, you could enter the following custom report:

- Name: country_date
- Dimensions: ["country", "date"]

Please note, that for technical reasons `date` is the default dimension which will be included in your query whether you specify it or not. By specifying it you can change the order the results are grouped in. Primary key will consist of your custom dimensions and the default dimension along with `site_url` and `search_type`.

The information you provide via UI Custom report builder will then be transformed into the custom stream by it's `Name`

You can use the [Google APIS Explorer](https://developers.google.com/webmaster-tools/v1/searchanalytics/query) to build and test the reports you want to use.

### Data Freshness

The **Data Freshness** parameter deals with the "freshness", or finality of the data that is being queried.

- `final`: The query will include only finalized, stable data. This is data that has been processed, verified, and is unlikely to change. When you select this option, you are querying for the definitive statistics and information that Google has analyzed and confirmed.
- `all`: The query will return both finalized data and what Google terms "fresh" data. Fresh data includes more recent data that hasn't gone through the full processing and verification that finalized data has. This option can give you more up-to-the-minute insights, but it may be subject to change as Google continues to process and analyze it.

:::caution
When using Incremental Sync mode, we recommend leaving this parameter to its default state of `final`, as the `all` option may cause discrepancies between the data in your destination table and the finalized data in Google Search Console.
:::

## Data type map

| Integration Type | Airbyte Type |
| :--------------- | :----------- |
| `string`         | `string`     |
| `number`         | `number`     |
| `array`          | `array`      |
| `object`         | `object`     |

## Limitations & Troubleshooting

<details>
<summary>
Expand to see details about Google Search Console connector limitations and troubleshooting.
</summary>

### Connector limitations

#### Rate limiting

This connector attempts to back off gracefully when it hits Reports API's rate limits. To find more information about limits, see [Usage Limits](https://developers.google.com/webmaster-tools/limits) documentation.

#### Data retention

Google Search Console only retains data for websites from the last 16 months. Any data prior to this cutoff point will not be accessible. [Please see this article for more information](https://seotesting.com/google-search-console/how-long-does-gsc-keep-my-data/#:~:text=Google%20Search%20Console%20holds%20relevant,October%2C%202022%2C%20until%20today.).

### Troubleshooting

- Check out common troubleshooting issues for the Google Search Console source connector on our [Airbyte Forum](https://github.com/airbytehq/airbyte/discussions).

</details>

## Changelog

<details>
  <summary>Expand to review</summary>

| Version     | Date       | Pull Request                                             | Subject                                                                                                                                                                |
|:------------|:-----------|:---------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.10.8 | 2025-08-02 | [64187](https://github.com/airbytehq/airbyte/pull/64187) | Update dependencies |
| 1.10.7 | 2025-07-26 | [63877](https://github.com/airbytehq/airbyte/pull/63877) | Update dependencies |
| 1.10.6 | 2025-07-22 | [63720](https://github.com/airbytehq/airbyte/pull/63720) | Ignore 403 "insufficient permission" errors |
| 1.10.5 | 2025-07-19 | [63471](https://github.com/airbytehq/airbyte/pull/63471) | Update dependencies |
| 1.10.4 | 2025-07-15 | [63309](https://github.com/airbytehq/airbyte/pull/63309) | Adds `type` property to `config_normalization_rules` in manifest |
| 1.10.3 | 2025-07-12 | [63094](https://github.com/airbytehq/airbyte/pull/63094) | Update dependencies |
| 1.10.2 | 2025-07-05 | [62613](https://github.com/airbytehq/airbyte/pull/62613) | Update dependencies |
| 1.10.1 | 2025-06-28 | [62194](https://github.com/airbytehq/airbyte/pull/62194) | Update dependencies |
| 1.10.0 | 2025-06-23 | [61425](https://github.com/airbytehq/airbyte/pull/61425) | Migrate to manifest-only |
| 1.9.4 | 2025-06-21 | [61789](https://github.com/airbytehq/airbyte/pull/61789) | Update dependencies |
| 1.9.3 | 2025-06-18 | [61706](https://github.com/airbytehq/airbyte/pull/61706) | Fix record serialization bug |
| 1.9.2 | 2025-06-14 | [60663](https://github.com/airbytehq/airbyte/pull/60663) | Update dependencies |
| 1.9.1 | 2025-06-10 | [61514](https://github.com/airbytehq/airbyte/pull/61514) | Promoting release candidate 1.9.1-rc.1 to a main version. |
| 1.9.1-rc.1  | 2025-06-10 | [61508](https://github.com/airbytehq/airbyte/pull/61508) | Add API budget, reduce concurrency levels, and catch 403 rate limiting errors                                                                                          |
| 1.9.0       | 2025-06-06 | [61408](https://github.com/airbytehq/airbyte/pull/61408) | Migrate custom reports streams to low-code                                                                                                                             |
| 1.8.0       | 2025-06-06 | [61335](https://github.com/airbytehq/airbyte/pull/61335) | Migrate `SearchAnalyticsAllFields`, `SearchAnalyticsByDate`, `SearchAnalyticsByDevice`, `SearchAnalyticsByPage`, and `SearchAnalyticsByQuery` to low-code              |
| 1.7.0       | 2025-06-05 | [61332](https://github.com/airbytehq/airbyte/pull/61332) | Migrate search_by_keyword streams to low-code                                                                                                                          |
| 1.6.0       | 2025-06-04 | [61380](https://github.com/airbytehq/airbyte/pull/61380) | Promoting release candidate 1.6.0-rc.1 to a main version.                                                                                                              |
| 1.6.0-rc.1  | 2025-06-02 | [60928](https://github.com/airbytehq/airbyte/pull/60928) | Migrate `search_analytics_by_country`, `sites`, and `sitemaps` to low-code                                                                                             |
| 1.5.18      | 2025-05-28 | [54426](https://github.com/airbytehq/airbyte/pull/58121) | Prevent KeyError raise on check connetion when account does not have access to any site. Better Error message                                                          |
| 1.5.17      | 2025-05-10 | [54946](https://github.com/airbytehq/airbyte/pull/54946) | Update dependencies                                                                                                                                                    |
| 1.5.16      | 2025-05-09 | [59737](https://github.com/airbytehq/airbyte/pull/59737) | Promoting release candidate 1.5.16-rc.1 to a main version.                                                                                                             |
| 1.5.16-rc.1 | 2025-05-02 | [59140](https://github.com/airbytehq/airbyte/pull/59140) | Migrate to CDK V6                                                                                                                                                      |
| 1.5.15      | 2025-02-22 | [54426](https://github.com/airbytehq/airbyte/pull/54426) | Update dependencies                                                                                                                                                    |
| 1.5.14      | 2025-02-15 | [53781](https://github.com/airbytehq/airbyte/pull/53781) | Update dependencies                                                                                                                                                    |
| 1.5.13      | 2025-02-01 | [52854](https://github.com/airbytehq/airbyte/pull/52854) | Update dependencies                                                                                                                                                    |
| 1.5.12      | 2025-01-25 | [52303](https://github.com/airbytehq/airbyte/pull/52303) | Update dependencies                                                                                                                                                    |
| 1.5.11      | 2025-01-18 | [51629](https://github.com/airbytehq/airbyte/pull/51629) | Update dependencies                                                                                                                                                    |
| 1.5.10      | 2025-01-11 | [51129](https://github.com/airbytehq/airbyte/pull/51129) | Update dependencies                                                                                                                                                    |
| 1.5.9       | 2025-01-04 | [50919](https://github.com/airbytehq/airbyte/pull/50919) | Update dependencies                                                                                                                                                    |
| 1.5.8       | 2024-12-28 | [50579](https://github.com/airbytehq/airbyte/pull/50579) | Update dependencies                                                                                                                                                    |
| 1.5.7       | 2024-12-21 | [50040](https://github.com/airbytehq/airbyte/pull/50040) | Update dependencies                                                                                                                                                    |
| 1.5.6       | 2024-12-14 | [49173](https://github.com/airbytehq/airbyte/pull/49173) | Update dependencies                                                                                                                                                    |
| 1.5.5       | 2024-11-25 | [43730](https://github.com/airbytehq/airbyte/pull/43730) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 1.5.4       | 2024-09-06 | [45196](https://github.com/airbytehq/airbyte/pull/45196) | Fix request body for report streams by keyword                                                                                                                         |
| 1.5.3       | 2024-08-03 | [43067](https://github.com/airbytehq/airbyte/pull/43067) | Update dependencies                                                                                                                                                    |
| 1.5.2       | 2024-07-27 | [42786](https://github.com/airbytehq/airbyte/pull/42786) | Update dependencies                                                                                                                                                    |
| 1.5.1       | 2024-07-20 | [42142](https://github.com/airbytehq/airbyte/pull/42142) | Update dependencies                                                                                                                                                    |
| 1.5.0       | 2024-07-17 | [42073](https://github.com/airbytehq/airbyte/pull/42073) | Migrate to CDK v1.8.0                                                                                                                                                  |
| 1.4.13      | 2024-07-13 | [41734](https://github.com/airbytehq/airbyte/pull/41734) | Update dependencies                                                                                                                                                    |
| 1.4.12      | 2024-07-10 | [41440](https://github.com/airbytehq/airbyte/pull/41440) | Update dependencies                                                                                                                                                    |
| 1.4.11      | 2024-07-09 | [41164](https://github.com/airbytehq/airbyte/pull/41164) | Update dependencies                                                                                                                                                    |
| 1.4.10      | 2024-07-06 | [40981](https://github.com/airbytehq/airbyte/pull/40981) | Update dependencies                                                                                                                                                    |
| 1.4.9       | 2024-06-27 | [40215](https://github.com/airbytehq/airbyte/pull/40215) | Replaced deprecated AirbyteLogger with logging.Logger                                                                                                                  |
| 1.4.8       | 2024-06-26 | [40532](https://github.com/airbytehq/airbyte/pull/40532) | Update dependencies                                                                                                                                                    |
| 1.4.7       | 2024-06-25 | [40312](https://github.com/airbytehq/airbyte/pull/40312) | Update dependencies                                                                                                                                                    |
| 1.4.6       | 2024-06-22 | [40077](https://github.com/airbytehq/airbyte/pull/40077) | Update dependencies                                                                                                                                                    |
| 1.4.5       | 2024-06-17 | [39516](https://github.com/airbytehq/airbyte/pull/39516) | Update state handling for incremental streams                                                                                                                          |
| 1.4.4       | 2024-06-04 | [39059](https://github.com/airbytehq/airbyte/pull/39059) | [autopull] Upgrade base image to v1.2.1                                                                                                                                |
| 1.4.3       | 2024-05-24 | [38649](https://github.com/airbytehq/airbyte/pull/38649) | Update deprecated auth package                                                                                                                                         |
| 1.4.2       | 2024-04-19 | [36639](https://github.com/airbytehq/airbyte/pull/36639) | Updating to 0.80.0 CDK                                                                                                                                                 |
| 1.4.1       | 2024-04-12 | [36639](https://github.com/airbytehq/airbyte/pull/36639) | Schema descriptions                                                                                                                                                    |
| 1.4.0       | 2024-03-19 | [36267](https://github.com/airbytehq/airbyte/pull/36267) | Pin airbyte-cdk version to `^0`                                                                                                                                        |
| 1.3.7       | 2024-02-12 | [35163](https://github.com/airbytehq/airbyte/pull/35163) | Manage dependencies with Poetry                                                                                                                                        |
| 1.3.6       | 2023-10-26 | [31863](https://github.com/airbytehq/airbyte/pull/31863) | Base image migration: remove Dockerfile and use the python-connector-base image                                                                                        |
| 1.3.5       | 2023-09-28 | [30822](https://github.com/airbytehq/airbyte/pull/30822) | Fix primary key for custom reports                                                                                                                                     |
| 1.3.4       | 2023-09-27 | [30785](https://github.com/airbytehq/airbyte/pull/30785) | Do not migrate config for the newly created connections                                                                                                                |
| 1.3.3       | 2023-08-29 | [29941](https://github.com/airbytehq/airbyte/pull/29941) | Added `primary key` to each stream, added `custom_report` config migration                                                                                             |
| 1.3.2       | 2023-08-25 | [29829](https://github.com/airbytehq/airbyte/pull/29829) | Make `Start Date` a non-required, added the `suggested streams`, corrected public docs                                                                                 |
| 1.3.1       | 2023-08-24 | [29329](https://github.com/airbytehq/airbyte/pull/29329) | Update tooltip descriptions                                                                                                                                            |
| 1.3.0       | 2023-08-24 | [29750](https://github.com/airbytehq/airbyte/pull/29750) | Add new `Keyword-Site-Report-By-Site` stream                                                                                                                           |
| 1.2.2       | 2023-08-23 | [29741](https://github.com/airbytehq/airbyte/pull/29741) | Handle `HTTP-401`, `HTTP-403` errors                                                                                                                                   |
| 1.2.1       | 2023-07-04 | [27952](https://github.com/airbytehq/airbyte/pull/27952) | Removed deprecated `searchType`, added `discover`(Discover results) and `googleNews`(Results from news.google.com, etc.) types                                         |
| 1.2.0       | 2023-06-29 | [27831](https://github.com/airbytehq/airbyte/pull/27831) | Add new streams                                                                                                                                                        |
| 1.1.0       | 2023-06-26 | [27738](https://github.com/airbytehq/airbyte/pull/27738) | License Update: Elv2                                                                                                                                                   |
| 1.0.2       | 2023-06-13 | [27307](https://github.com/airbytehq/airbyte/pull/27307) | Fix `data_state` config typo                                                                                                                                           |
| 1.0.1       | 2023-05-30 | [26746](https://github.com/airbytehq/airbyte/pull/26746) | Remove `authSpecification` from connector spec in favour of advancedAuth                                                                                               |
| 1.0.0       | 2023-05-24 | [26452](https://github.com/airbytehq/airbyte/pull/26452) | Add data_state parameter to specification                                                                                                                              |
| 0.1.22      | 2023-03-20 | [22295](https://github.com/airbytehq/airbyte/pull/22295) | Update specification examples                                                                                                                                          |
| 0.1.21      | 2023-02-14 | [22984](https://github.com/airbytehq/airbyte/pull/22984) | Specified date formatting in specification                                                                                                                             |
| 0.1.20      | 2023-02-02 | [22334](https://github.com/airbytehq/airbyte/pull/22334) | Turn on default HttpAvailabilityStrategy                                                                                                                               |
| 0.1.19      | 2023-01-27 | [22007](https://github.com/airbytehq/airbyte/pull/22007) | Set `AvailabilityStrategy` for streams explicitly to `None`                                                                                                            |
| 0.1.18      | 2022-10-27 | [18568](https://github.com/airbytehq/airbyte/pull/18568) | Improved config validation: custom_reports.dimension                                                                                                                   |
| 0.1.17      | 2022-10-08 | [17751](https://github.com/airbytehq/airbyte/pull/17751) | Improved config validation: start_date, end_date, site_urls                                                                                                            |
| 0.1.16      | 2022-09-28 | [17304](https://github.com/airbytehq/airbyte/pull/17304) | Migrate to per-stream state.                                                                                                                                           |
| 0.1.15      | 2022-09-16 | [16819](https://github.com/airbytehq/airbyte/pull/16819) | Check available site urls to avoid 403 error on sync                                                                                                                   |
| 0.1.14      | 2022-09-08 | [16433](https://github.com/airbytehq/airbyte/pull/16433) | Add custom analytics stream.                                                                                                                                           |
| 0.1.13      | 2022-07-21 | [14924](https://github.com/airbytehq/airbyte/pull/14924) | Remove `additionalProperties` field from specs                                                                                                                         |
| 0.1.12      | 2022-05-04 | [12482](https://github.com/airbytehq/airbyte/pull/12482) | Update input configuration copy                                                                                                                                        |
| 0.1.11      | 2022-01-05 | [9186](https://github.com/airbytehq/airbyte/pull/9186)   | Fix incremental sync: keep all urls in state object                                                                                                                    |
| 0.1.10      | 2021-12-23 | [9073](https://github.com/airbytehq/airbyte/pull/9073)   | Add slicing by date range                                                                                                                                              |
| 0.1.9       | 2021-12-22 | [9047](https://github.com/airbytehq/airbyte/pull/9047)   | Add 'order' to spec.json props                                                                                                                                         |
| 0.1.8       | 2021-12-21 | [8248](https://github.com/airbytehq/airbyte/pull/8248)   | Enable Sentry for performance and errors tracking                                                                                                                      |
| 0.1.7       | 2021-11-26 | [7431](https://github.com/airbytehq/airbyte/pull/7431)   | Add default `end_date` param value                                                                                                                                     |
| 0.1.6       | 2021-09-27 | [6460](https://github.com/airbytehq/airbyte/pull/6460)   | Update OAuth Spec File                                                                                                                                                 |
| 0.1.4       | 2021-09-23 | [6394](https://github.com/airbytehq/airbyte/pull/6394)   | Update Doc link Spec File                                                                                                                                              |
| 0.1.3       | 2021-09-23 | [6405](https://github.com/airbytehq/airbyte/pull/6405)   | Correct Spec File                                                                                                                                                      |
| 0.1.2       | 2021-09-17 | [6222](https://github.com/airbytehq/airbyte/pull/6222)   | Correct Spec File                                                                                                                                                      |
| 0.1.1       | 2021-09-22 | [6315](https://github.com/airbytehq/airbyte/pull/6315)   | Verify access to all sites when performing connection check                                                                                                            |
| 0.1.0       | 2021-09-03 | [5350](https://github.com/airbytehq/airbyte/pull/5350)   | Initial Release                                                                                                                                                        |
>>>>>>> master

</details>

</HideInUI>
