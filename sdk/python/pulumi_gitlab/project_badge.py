# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProjectBadgeArgs', 'ProjectBadge']

@pulumi.input_type
class ProjectBadgeArgs:
    def __init__(__self__, *,
                 image_url: pulumi.Input[str],
                 link_url: pulumi.Input[str],
                 project: pulumi.Input[str]):
        """
        The set of arguments for constructing a ProjectBadge resource.
        :param pulumi.Input[str] image_url: The image url which will be presented on project overview.
        :param pulumi.Input[str] link_url: The url linked with the badge.
        :param pulumi.Input[str] project: The id of the project to add the badge to.
        """
        pulumi.set(__self__, "image_url", image_url)
        pulumi.set(__self__, "link_url", link_url)
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="imageUrl")
    def image_url(self) -> pulumi.Input[str]:
        """
        The image url which will be presented on project overview.
        """
        return pulumi.get(self, "image_url")

    @image_url.setter
    def image_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "image_url", value)

    @property
    @pulumi.getter(name="linkUrl")
    def link_url(self) -> pulumi.Input[str]:
        """
        The url linked with the badge.
        """
        return pulumi.get(self, "link_url")

    @link_url.setter
    def link_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "link_url", value)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[str]:
        """
        The id of the project to add the badge to.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[str]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _ProjectBadgeState:
    def __init__(__self__, *,
                 image_url: Optional[pulumi.Input[str]] = None,
                 link_url: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 rendered_image_url: Optional[pulumi.Input[str]] = None,
                 rendered_link_url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProjectBadge resources.
        :param pulumi.Input[str] image_url: The image url which will be presented on project overview.
        :param pulumi.Input[str] link_url: The url linked with the badge.
        :param pulumi.Input[str] project: The id of the project to add the badge to.
        :param pulumi.Input[str] rendered_image_url: The image_url argument rendered (in case of use of placeholders).
        :param pulumi.Input[str] rendered_link_url: The link_url argument rendered (in case of use of placeholders).
        """
        if image_url is not None:
            pulumi.set(__self__, "image_url", image_url)
        if link_url is not None:
            pulumi.set(__self__, "link_url", link_url)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if rendered_image_url is not None:
            pulumi.set(__self__, "rendered_image_url", rendered_image_url)
        if rendered_link_url is not None:
            pulumi.set(__self__, "rendered_link_url", rendered_link_url)

    @property
    @pulumi.getter(name="imageUrl")
    def image_url(self) -> Optional[pulumi.Input[str]]:
        """
        The image url which will be presented on project overview.
        """
        return pulumi.get(self, "image_url")

    @image_url.setter
    def image_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image_url", value)

    @property
    @pulumi.getter(name="linkUrl")
    def link_url(self) -> Optional[pulumi.Input[str]]:
        """
        The url linked with the badge.
        """
        return pulumi.get(self, "link_url")

    @link_url.setter
    def link_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link_url", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the project to add the badge to.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="renderedImageUrl")
    def rendered_image_url(self) -> Optional[pulumi.Input[str]]:
        """
        The image_url argument rendered (in case of use of placeholders).
        """
        return pulumi.get(self, "rendered_image_url")

    @rendered_image_url.setter
    def rendered_image_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rendered_image_url", value)

    @property
    @pulumi.getter(name="renderedLinkUrl")
    def rendered_link_url(self) -> Optional[pulumi.Input[str]]:
        """
        The link_url argument rendered (in case of use of placeholders).
        """
        return pulumi.get(self, "rendered_link_url")

    @rendered_link_url.setter
    def rendered_link_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rendered_link_url", value)


class ProjectBadge(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 image_url: Optional[pulumi.Input[str]] = None,
                 link_url: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## # gitlab\_project\_badge

        This resource allows you to create and manage badges for your GitLab projects.
        For further information on hooks, consult the [gitlab
        documentation](https://docs.gitlab.com/ce/user/project/badges.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        foo = gitlab.Project("foo")
        example = gitlab.ProjectBadge("example",
            project=foo.id,
            link_url="https://example.com/badge-123",
            image_url="https://example.com/badge-123.svg")
        ```

        ## Import

        GitLab project badges can be imported using an id made up of `{project_id}:{badge_id}`,

        e.g. bash

        ```sh
         $ pulumi import gitlab:index/projectBadge:ProjectBadge foo 1:3
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] image_url: The image url which will be presented on project overview.
        :param pulumi.Input[str] link_url: The url linked with the badge.
        :param pulumi.Input[str] project: The id of the project to add the badge to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectBadgeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # gitlab\_project\_badge

        This resource allows you to create and manage badges for your GitLab projects.
        For further information on hooks, consult the [gitlab
        documentation](https://docs.gitlab.com/ce/user/project/badges.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        foo = gitlab.Project("foo")
        example = gitlab.ProjectBadge("example",
            project=foo.id,
            link_url="https://example.com/badge-123",
            image_url="https://example.com/badge-123.svg")
        ```

        ## Import

        GitLab project badges can be imported using an id made up of `{project_id}:{badge_id}`,

        e.g. bash

        ```sh
         $ pulumi import gitlab:index/projectBadge:ProjectBadge foo 1:3
        ```

        :param str resource_name: The name of the resource.
        :param ProjectBadgeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectBadgeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 image_url: Optional[pulumi.Input[str]] = None,
                 link_url: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectBadgeArgs.__new__(ProjectBadgeArgs)

            if image_url is None and not opts.urn:
                raise TypeError("Missing required property 'image_url'")
            __props__.__dict__["image_url"] = image_url
            if link_url is None and not opts.urn:
                raise TypeError("Missing required property 'link_url'")
            __props__.__dict__["link_url"] = link_url
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            __props__.__dict__["rendered_image_url"] = None
            __props__.__dict__["rendered_link_url"] = None
        super(ProjectBadge, __self__).__init__(
            'gitlab:index/projectBadge:ProjectBadge',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            image_url: Optional[pulumi.Input[str]] = None,
            link_url: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            rendered_image_url: Optional[pulumi.Input[str]] = None,
            rendered_link_url: Optional[pulumi.Input[str]] = None) -> 'ProjectBadge':
        """
        Get an existing ProjectBadge resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] image_url: The image url which will be presented on project overview.
        :param pulumi.Input[str] link_url: The url linked with the badge.
        :param pulumi.Input[str] project: The id of the project to add the badge to.
        :param pulumi.Input[str] rendered_image_url: The image_url argument rendered (in case of use of placeholders).
        :param pulumi.Input[str] rendered_link_url: The link_url argument rendered (in case of use of placeholders).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectBadgeState.__new__(_ProjectBadgeState)

        __props__.__dict__["image_url"] = image_url
        __props__.__dict__["link_url"] = link_url
        __props__.__dict__["project"] = project
        __props__.__dict__["rendered_image_url"] = rendered_image_url
        __props__.__dict__["rendered_link_url"] = rendered_link_url
        return ProjectBadge(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="imageUrl")
    def image_url(self) -> pulumi.Output[str]:
        """
        The image url which will be presented on project overview.
        """
        return pulumi.get(self, "image_url")

    @property
    @pulumi.getter(name="linkUrl")
    def link_url(self) -> pulumi.Output[str]:
        """
        The url linked with the badge.
        """
        return pulumi.get(self, "link_url")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The id of the project to add the badge to.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="renderedImageUrl")
    def rendered_image_url(self) -> pulumi.Output[str]:
        """
        The image_url argument rendered (in case of use of placeholders).
        """
        return pulumi.get(self, "rendered_image_url")

    @property
    @pulumi.getter(name="renderedLinkUrl")
    def rendered_link_url(self) -> pulumi.Output[str]:
        """
        The link_url argument rendered (in case of use of placeholders).
        """
        return pulumi.get(self, "rendered_link_url")

