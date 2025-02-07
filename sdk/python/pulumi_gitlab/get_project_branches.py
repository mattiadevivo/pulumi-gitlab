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
    'GetProjectBranchesResult',
    'AwaitableGetProjectBranchesResult',
    'get_project_branches',
    'get_project_branches_output',
]

@pulumi.output_type
class GetProjectBranchesResult:
    """
    A collection of values returned by getProjectBranches.
    """
    def __init__(__self__, branches=None, id=None, project=None):
        if branches and not isinstance(branches, list):
            raise TypeError("Expected argument 'branches' to be a list")
        pulumi.set(__self__, "branches", branches)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def branches(self) -> Sequence['outputs.GetProjectBranchesBranchResult']:
        """
        The list of branches of the project, as defined below.
        """
        return pulumi.get(self, "branches")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        ID or URL-encoded path of the project owned by the authenticated user.
        """
        return pulumi.get(self, "project")


class AwaitableGetProjectBranchesResult(GetProjectBranchesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectBranchesResult(
            branches=self.branches,
            id=self.id,
            project=self.project)


def get_project_branches(project: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectBranchesResult:
    """
    The `get_project_branches` data source allows details of the branches of a given project to be retrieved.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/branches.html#list-repository-branches)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_project_branches(project="foo/bar/baz")
    ```


    :param str project: ID or URL-encoded path of the project owned by the authenticated user.
    """
    __args__ = dict()
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gitlab:index/getProjectBranches:getProjectBranches', __args__, opts=opts, typ=GetProjectBranchesResult).value

    return AwaitableGetProjectBranchesResult(
        branches=__ret__.branches,
        id=__ret__.id,
        project=__ret__.project)


@_utilities.lift_output_func(get_project_branches)
def get_project_branches_output(project: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProjectBranchesResult]:
    """
    The `get_project_branches` data source allows details of the branches of a given project to be retrieved.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/branches.html#list-repository-branches)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_project_branches(project="foo/bar/baz")
    ```


    :param str project: ID or URL-encoded path of the project owned by the authenticated user.
    """
    ...
