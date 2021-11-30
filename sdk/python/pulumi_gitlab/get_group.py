# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetGroupResult',
    'AwaitableGetGroupResult',
    'get_group',
    'get_group_output',
]

@pulumi.output_type
class GetGroupResult:
    """
    A collection of values returned by getGroup.
    """
    def __init__(__self__, default_branch_protection=None, description=None, full_name=None, full_path=None, group_id=None, id=None, lfs_enabled=None, name=None, parent_id=None, path=None, request_access_enabled=None, runners_token=None, visibility_level=None, web_url=None):
        if default_branch_protection and not isinstance(default_branch_protection, int):
            raise TypeError("Expected argument 'default_branch_protection' to be a int")
        pulumi.set(__self__, "default_branch_protection", default_branch_protection)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if full_name and not isinstance(full_name, str):
            raise TypeError("Expected argument 'full_name' to be a str")
        pulumi.set(__self__, "full_name", full_name)
        if full_path and not isinstance(full_path, str):
            raise TypeError("Expected argument 'full_path' to be a str")
        pulumi.set(__self__, "full_path", full_path)
        if group_id and not isinstance(group_id, int):
            raise TypeError("Expected argument 'group_id' to be a int")
        pulumi.set(__self__, "group_id", group_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lfs_enabled and not isinstance(lfs_enabled, bool):
            raise TypeError("Expected argument 'lfs_enabled' to be a bool")
        pulumi.set(__self__, "lfs_enabled", lfs_enabled)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if parent_id and not isinstance(parent_id, int):
            raise TypeError("Expected argument 'parent_id' to be a int")
        pulumi.set(__self__, "parent_id", parent_id)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if request_access_enabled and not isinstance(request_access_enabled, bool):
            raise TypeError("Expected argument 'request_access_enabled' to be a bool")
        pulumi.set(__self__, "request_access_enabled", request_access_enabled)
        if runners_token and not isinstance(runners_token, str):
            raise TypeError("Expected argument 'runners_token' to be a str")
        pulumi.set(__self__, "runners_token", runners_token)
        if visibility_level and not isinstance(visibility_level, str):
            raise TypeError("Expected argument 'visibility_level' to be a str")
        pulumi.set(__self__, "visibility_level", visibility_level)
        if web_url and not isinstance(web_url, str):
            raise TypeError("Expected argument 'web_url' to be a str")
        pulumi.set(__self__, "web_url", web_url)

    @property
    @pulumi.getter(name="defaultBranchProtection")
    def default_branch_protection(self) -> int:
        """
        Whether developers and maintainers can push to the applicable default branch.
        """
        return pulumi.get(self, "default_branch_protection")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fullName")
    def full_name(self) -> str:
        """
        The full name of the group.
        """
        return pulumi.get(self, "full_name")

    @property
    @pulumi.getter(name="fullPath")
    def full_path(self) -> str:
        """
        The full path of the group.
        """
        return pulumi.get(self, "full_path")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> int:
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lfsEnabled")
    def lfs_enabled(self) -> bool:
        """
        Boolean, is LFS enabled for projects in this group.
        """
        return pulumi.get(self, "lfs_enabled")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of this group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> int:
        """
        Integer, ID of the parent group.
        """
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        The path of the group.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="requestAccessEnabled")
    def request_access_enabled(self) -> bool:
        """
        Boolean, is request for access enabled to the group.
        """
        return pulumi.get(self, "request_access_enabled")

    @property
    @pulumi.getter(name="runnersToken")
    def runners_token(self) -> str:
        """
        The group level registration token to use during runner setup.
        """
        return pulumi.get(self, "runners_token")

    @property
    @pulumi.getter(name="visibilityLevel")
    def visibility_level(self) -> str:
        """
        Visibility level of the group. Possible values are `private`, `internal`, `public`.
        """
        return pulumi.get(self, "visibility_level")

    @property
    @pulumi.getter(name="webUrl")
    def web_url(self) -> str:
        """
        Web URL of the group.
        """
        return pulumi.get(self, "web_url")


class AwaitableGetGroupResult(GetGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupResult(
            default_branch_protection=self.default_branch_protection,
            description=self.description,
            full_name=self.full_name,
            full_path=self.full_path,
            group_id=self.group_id,
            id=self.id,
            lfs_enabled=self.lfs_enabled,
            name=self.name,
            parent_id=self.parent_id,
            path=self.path,
            request_access_enabled=self.request_access_enabled,
            runners_token=self.runners_token,
            visibility_level=self.visibility_level,
            web_url=self.web_url)


def get_group(full_path: Optional[str] = None,
              group_id: Optional[int] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupResult:
    """
    ## # gitlab\_group

    Provide details about a specific group in the gitlab provider.

    ## Example Usage
    ### By group's ID

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    foo = gitlab.get_group(group_id=123)
    ```
    ### By group's full path

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    foo = gitlab.get_group(full_path="foo/bar")
    ```


    :param str full_path: The full path of the group.
    :param int group_id: The ID of the group.
    """
    __args__ = dict()
    __args__['fullPath'] = full_path
    __args__['groupId'] = group_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('gitlab:index/getGroup:getGroup', __args__, opts=opts, typ=GetGroupResult).value

    return AwaitableGetGroupResult(
        default_branch_protection=__ret__.default_branch_protection,
        description=__ret__.description,
        full_name=__ret__.full_name,
        full_path=__ret__.full_path,
        group_id=__ret__.group_id,
        id=__ret__.id,
        lfs_enabled=__ret__.lfs_enabled,
        name=__ret__.name,
        parent_id=__ret__.parent_id,
        path=__ret__.path,
        request_access_enabled=__ret__.request_access_enabled,
        runners_token=__ret__.runners_token,
        visibility_level=__ret__.visibility_level,
        web_url=__ret__.web_url)


@_utilities.lift_output_func(get_group)
def get_group_output(full_path: Optional[pulumi.Input[Optional[str]]] = None,
                     group_id: Optional[pulumi.Input[Optional[int]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGroupResult]:
    """
    ## # gitlab\_group

    Provide details about a specific group in the gitlab provider.

    ## Example Usage
    ### By group's ID

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    foo = gitlab.get_group(group_id=123)
    ```
    ### By group's full path

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    foo = gitlab.get_group(full_path="foo/bar")
    ```


    :param str full_path: The full path of the group.
    :param int group_id: The ID of the group.
    """
    ...
