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
    'GetGroupsResult',
    'AwaitableGetGroupsResult',
    'get_groups',
    'get_groups_output',
]

@pulumi.output_type
class GetGroupsResult:
    """
    A collection of values returned by getGroups.
    """
    def __init__(__self__, groups=None, id=None, order_by=None, search=None, sort=None):
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)
        if search and not isinstance(search, str):
            raise TypeError("Expected argument 'search' to be a str")
        pulumi.set(__self__, "search", search)
        if sort and not isinstance(sort, str):
            raise TypeError("Expected argument 'sort' to be a str")
        pulumi.set(__self__, "sort", sort)

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetGroupsGroupResult']:
        """
        The list of groups.
        """
        return pulumi.get(self, "groups")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[str]:
        """
        Order the groups' list by `id`, `name`, `path`, or `similarity`. (Requires administrator privileges)
        """
        return pulumi.get(self, "order_by")

    @property
    @pulumi.getter
    def search(self) -> Optional[str]:
        """
        Search groups by name or path.
        """
        return pulumi.get(self, "search")

    @property
    @pulumi.getter
    def sort(self) -> Optional[str]:
        """
        Sort groups' list in asc or desc order. (Requires administrator privileges)
        """
        return pulumi.get(self, "sort")


class AwaitableGetGroupsResult(GetGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupsResult(
            groups=self.groups,
            id=self.id,
            order_by=self.order_by,
            search=self.search,
            sort=self.sort)


def get_groups(order_by: Optional[str] = None,
               search: Optional[str] = None,
               sort: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupsResult:
    """
    The `get_groups` data source allows details of multiple groups to be retrieved given some optional filter criteria.

    > Some attributes might not be returned depending on if you're an admin or not.

    > Some available options require administrator privileges.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#list-groups)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_groups(order_by="name",
        sort="desc")
    example_two = gitlab.get_groups(search="GitLab")
    ```


    :param str order_by: Order the groups' list by `id`, `name`, `path`, or `similarity`. (Requires administrator privileges)
    :param str search: Search groups by name or path.
    :param str sort: Sort groups' list in asc or desc order. (Requires administrator privileges)
    """
    __args__ = dict()
    __args__['orderBy'] = order_by
    __args__['search'] = search
    __args__['sort'] = sort
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gitlab:index/getGroups:getGroups', __args__, opts=opts, typ=GetGroupsResult).value

    return AwaitableGetGroupsResult(
        groups=__ret__.groups,
        id=__ret__.id,
        order_by=__ret__.order_by,
        search=__ret__.search,
        sort=__ret__.sort)


@_utilities.lift_output_func(get_groups)
def get_groups_output(order_by: Optional[pulumi.Input[Optional[str]]] = None,
                      search: Optional[pulumi.Input[Optional[str]]] = None,
                      sort: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGroupsResult]:
    """
    The `get_groups` data source allows details of multiple groups to be retrieved given some optional filter criteria.

    > Some attributes might not be returned depending on if you're an admin or not.

    > Some available options require administrator privileges.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#list-groups)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_groups(order_by="name",
        sort="desc")
    example_two = gitlab.get_groups(search="GitLab")
    ```


    :param str order_by: Order the groups' list by `id`, `name`, `path`, or `similarity`. (Requires administrator privileges)
    :param str search: Search groups by name or path.
    :param str sort: Sort groups' list in asc or desc order. (Requires administrator privileges)
    """
    ...
