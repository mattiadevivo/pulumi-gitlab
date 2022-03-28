# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetProjectProtectedBranchesResult',
    'AwaitableGetProjectProtectedBranchesResult',
    'get_project_protected_branches',
    'get_project_protected_branches_output',
]

@pulumi.output_type
class GetProjectProtectedBranchesResult:
    """
    A collection of values returned by getProjectProtectedBranches.
    """
    def __init__(__self__, id=None, project_id=None, protected_branches=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if protected_branches and not isinstance(protected_branches, list):
            raise TypeError("Expected argument 'protected_branches' to be a list")
        pulumi.set(__self__, "protected_branches", protected_branches)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        The integer or path with namespace that uniquely identifies the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="protectedBranches")
    def protected_branches(self) -> Sequence['outputs.GetProjectProtectedBranchesProtectedBranchResult']:
        """
        A list of protected branches, as defined below.
        """
        return pulumi.get(self, "protected_branches")


class AwaitableGetProjectProtectedBranchesResult(GetProjectProtectedBranchesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectProtectedBranchesResult(
            id=self.id,
            project_id=self.project_id,
            protected_branches=self.protected_branches)


def get_project_protected_branches(project_id: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectProtectedBranchesResult:
    """
    The `gitlab_protected_branches` data source allows details of the protected branches of a given project.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/protected_branches.html#list-protected-branches)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_project_protected_branches(project_id="foo/bar/baz")
    ```


    :param str project_id: The integer or path with namespace that uniquely identifies the project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('gitlab:index/getProjectProtectedBranches:getProjectProtectedBranches', __args__, opts=opts, typ=GetProjectProtectedBranchesResult).value

    return AwaitableGetProjectProtectedBranchesResult(
        id=__ret__.id,
        project_id=__ret__.project_id,
        protected_branches=__ret__.protected_branches)


@_utilities.lift_output_func(get_project_protected_branches)
def get_project_protected_branches_output(project_id: Optional[pulumi.Input[str]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProjectProtectedBranchesResult]:
    """
    The `gitlab_protected_branches` data source allows details of the protected branches of a given project.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/protected_branches.html#list-protected-branches)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_project_protected_branches(project_id="foo/bar/baz")
    ```


    :param str project_id: The integer or path with namespace that uniquely identifies the project.
    """
    ...
