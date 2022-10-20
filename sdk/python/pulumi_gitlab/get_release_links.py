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
    'GetReleaseLinksResult',
    'AwaitableGetReleaseLinksResult',
    'get_release_links',
    'get_release_links_output',
]

@pulumi.output_type
class GetReleaseLinksResult:
    """
    A collection of values returned by getReleaseLinks.
    """
    def __init__(__self__, id=None, project=None, release_links=None, tag_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if release_links and not isinstance(release_links, list):
            raise TypeError("Expected argument 'release_links' to be a list")
        pulumi.set(__self__, "release_links", release_links)
        if tag_name and not isinstance(tag_name, str):
            raise TypeError("Expected argument 'tag_name' to be a str")
        pulumi.set(__self__, "tag_name", tag_name)

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
        The ID or full path to the project.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="releaseLinks")
    def release_links(self) -> Sequence['outputs.GetReleaseLinksReleaseLinkResult']:
        """
        List of release links
        """
        return pulumi.get(self, "release_links")

    @property
    @pulumi.getter(name="tagName")
    def tag_name(self) -> str:
        """
        The tag associated with the Release.
        """
        return pulumi.get(self, "tag_name")


class AwaitableGetReleaseLinksResult(GetReleaseLinksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetReleaseLinksResult(
            id=self.id,
            project=self.project,
            release_links=self.release_links,
            tag_name=self.tag_name)


def get_release_links(project: Optional[str] = None,
                      tag_name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetReleaseLinksResult:
    """
    The `get_release_links` data source allows get details of release links.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/releases/links.html)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_release_links(project="foo/bar",
        tag_name="v1.0.1")
    ```


    :param str project: The ID or full path to the project.
    :param str tag_name: The tag associated with the Release.
    """
    __args__ = dict()
    __args__['project'] = project
    __args__['tagName'] = tag_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gitlab:index/getReleaseLinks:getReleaseLinks', __args__, opts=opts, typ=GetReleaseLinksResult).value

    return AwaitableGetReleaseLinksResult(
        id=__ret__.id,
        project=__ret__.project,
        release_links=__ret__.release_links,
        tag_name=__ret__.tag_name)


@_utilities.lift_output_func(get_release_links)
def get_release_links_output(project: Optional[pulumi.Input[str]] = None,
                             tag_name: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetReleaseLinksResult]:
    """
    The `get_release_links` data source allows get details of release links.

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/releases/links.html)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_release_links(project="foo/bar",
        tag_name="v1.0.1")
    ```


    :param str project: The ID or full path to the project.
    :param str tag_name: The tag associated with the Release.
    """
    ...
