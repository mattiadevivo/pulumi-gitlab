# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from .. import utilities, tables

__config__ = pulumi.Config('gitlab')

base_url = __config__.get('baseUrl') or utilities.get_env('GITLAB_BASE_URL')
"""
The GitLab Base API URL
"""

cacert_file = __config__.get('cacertFile')
"""
A file containing the ca certificate to use in case ssl certificate is not from a standard chain
"""

insecure = __config__.get('insecure')
"""
Disable SSL verification of API calls
"""

token = __config__.get('token') or utilities.get_env('GITLAB_TOKEN')
"""
The OAuth token used to connect to GitLab.
"""

