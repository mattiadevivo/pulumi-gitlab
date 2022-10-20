# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetInstanceVariablesResult',
    'AwaitableGetInstanceVariablesResult',
    'get_instance_variables',
]

@pulumi.output_type
class GetInstanceVariablesResult:
    """
    A collection of values returned by getInstanceVariables.
    """
    def __init__(__self__, id=None, variables=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if variables and not isinstance(variables, list):
            raise TypeError("Expected argument 'variables' to be a list")
        pulumi.set(__self__, "variables", variables)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def variables(self) -> Sequence['outputs.GetInstanceVariablesVariableResult']:
        """
        The list of variables returned by the search
        """
        return pulumi.get(self, "variables")


class AwaitableGetInstanceVariablesResult(GetInstanceVariablesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceVariablesResult(
            id=self.id,
            variables=self.variables)


def get_instance_variables(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceVariablesResult:
    """
    The `get_instance_variables` data source allows to retrieve all instance-level CI/CD variables.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/instance_level_ci_variables.html)
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gitlab:index/getInstanceVariables:getInstanceVariables', __args__, opts=opts, typ=GetInstanceVariablesResult).value

    return AwaitableGetInstanceVariablesResult(
        id=__ret__.id,
        variables=__ret__.variables)
