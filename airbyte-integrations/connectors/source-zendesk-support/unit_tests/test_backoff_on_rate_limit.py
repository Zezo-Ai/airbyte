#
# Copyright (c) 2023 Airbyte, Inc., all rights reserved.
#


from typing import Dict

import pytest
import requests
from source_zendesk_support.source import SourceZendeskSupport
from source_zendesk_support.streams import Users


_ANY_ATTEMPT_COUNT = 10


@pytest.fixture(scope="session", name="config")
def test_config():
    config = {
        "subdomain": "sandbox",
        "start_date": "2021-06-01T00:00:00Z",
        "credentials": {"credentials": "api_token", "email": "integration-test@airbyte.io", "api_token": "api_token"},
    }
    return config


def prepare_config(config: Dict):
    return SourceZendeskSupport(config=config, catalog=None, state=None).convert_config2stream_args(config)


@pytest.mark.parametrize(
    "x_rate_limit, retry_after, expected",
    [("60", {}, 1), ("0", {}, None), ("0", {"Retry-After": "5"}, 5), ("0", {"Retry-After": "5, 4"}, 5)],
)
def test_backoff(requests_mock, config, x_rate_limit, retry_after, expected):
    """ """
    test_response_header = {"X-Rate-Limit": x_rate_limit} | retry_after
    test_response_json = {"count": {"value": 1, "refreshed_at": "2022-03-29T10:10:51+00:00"}}

    # create client
    config = prepare_config(config)
    # test stream
    test_stream = Users(**config)

    url = f"{test_stream.url_base}{test_stream.path()}/count.json"
    requests_mock.get(url, json=test_response_json, headers=test_response_header, status_code=429)
    test_response = requests.get(url)

    actual = test_stream.get_backoff_strategy().backoff_time(test_response, _ANY_ATTEMPT_COUNT)
    assert actual == expected
