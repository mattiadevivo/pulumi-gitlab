# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProjectEnvironmentArgs', 'ProjectEnvironment']

@pulumi.input_type
class ProjectEnvironmentArgs:
    def __init__(__self__, *,
                 project: pulumi.Input[str],
                 external_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 stop_before_destroy: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ProjectEnvironment resource.
        :param pulumi.Input[str] project: The ID or full path of the project to environment is created for.
        :param pulumi.Input[str] external_url: Place to link to for this environment.
        :param pulumi.Input[str] name: The name of the environment.
        :param pulumi.Input[bool] stop_before_destroy: Determines whether the environment is attempted to be stopped before the environment is deleted.
        """
        pulumi.set(__self__, "project", project)
        if external_url is not None:
            pulumi.set(__self__, "external_url", external_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if stop_before_destroy is not None:
            pulumi.set(__self__, "stop_before_destroy", stop_before_destroy)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[str]:
        """
        The ID or full path of the project to environment is created for.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[str]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="externalUrl")
    def external_url(self) -> Optional[pulumi.Input[str]]:
        """
        Place to link to for this environment.
        """
        return pulumi.get(self, "external_url")

    @external_url.setter
    def external_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the environment.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="stopBeforeDestroy")
    def stop_before_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines whether the environment is attempted to be stopped before the environment is deleted.
        """
        return pulumi.get(self, "stop_before_destroy")

    @stop_before_destroy.setter
    def stop_before_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "stop_before_destroy", value)


@pulumi.input_type
class _ProjectEnvironmentState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 external_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 stop_before_destroy: Optional[pulumi.Input[bool]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProjectEnvironment resources.
        :param pulumi.Input[str] created_at: The ISO8601 date/time that this environment was created at in UTC.
        :param pulumi.Input[str] external_url: Place to link to for this environment.
        :param pulumi.Input[str] name: The name of the environment.
        :param pulumi.Input[str] project: The ID or full path of the project to environment is created for.
        :param pulumi.Input[str] slug: The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -.
               No leading / trailing -. Use in URLs, host names and domain names.
        :param pulumi.Input[str] state: State the environment is in. Valid values are `available`, `stopped`.
        :param pulumi.Input[bool] stop_before_destroy: Determines whether the environment is attempted to be stopped before the environment is deleted.
        :param pulumi.Input[str] updated_at: The ISO8601 date/time that this environment was last updated at in UTC.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if external_url is not None:
            pulumi.set(__self__, "external_url", external_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if stop_before_destroy is not None:
            pulumi.set(__self__, "stop_before_destroy", stop_before_destroy)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The ISO8601 date/time that this environment was created at in UTC.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="externalUrl")
    def external_url(self) -> Optional[pulumi.Input[str]]:
        """
        Place to link to for this environment.
        """
        return pulumi.get(self, "external_url")

    @external_url.setter
    def external_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the environment.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID or full path of the project to environment is created for.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -.
        No leading / trailing -. Use in URLs, host names and domain names.
        """
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State the environment is in. Valid values are `available`, `stopped`.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="stopBeforeDestroy")
    def stop_before_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines whether the environment is attempted to be stopped before the environment is deleted.
        """
        return pulumi.get(self, "stop_before_destroy")

    @stop_before_destroy.setter
    def stop_before_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "stop_before_destroy", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The ISO8601 date/time that this environment was last updated at in UTC.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class ProjectEnvironment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 external_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 stop_before_destroy: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        this_group = gitlab.Group("thisGroup",
            path="example",
            description="An example group")
        this_project = gitlab.Project("thisProject",
            namespace_id=this_group.id,
            initialize_with_readme=True)
        this_project_environment = gitlab.ProjectEnvironment("thisProjectEnvironment",
            project=this_project.id,
            external_url="www.example.com")
        ```

        ## Import

        # GitLab project environments can be imported using an id made up of `projectId:environmenId`, e.g.

        ```sh
         $ pulumi import gitlab:index/projectEnvironment:ProjectEnvironment bar 123:321
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] external_url: Place to link to for this environment.
        :param pulumi.Input[str] name: The name of the environment.
        :param pulumi.Input[str] project: The ID or full path of the project to environment is created for.
        :param pulumi.Input[bool] stop_before_destroy: Determines whether the environment is attempted to be stopped before the environment is deleted.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectEnvironmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        this_group = gitlab.Group("thisGroup",
            path="example",
            description="An example group")
        this_project = gitlab.Project("thisProject",
            namespace_id=this_group.id,
            initialize_with_readme=True)
        this_project_environment = gitlab.ProjectEnvironment("thisProjectEnvironment",
            project=this_project.id,
            external_url="www.example.com")
        ```

        ## Import

        # GitLab project environments can be imported using an id made up of `projectId:environmenId`, e.g.

        ```sh
         $ pulumi import gitlab:index/projectEnvironment:ProjectEnvironment bar 123:321
        ```

        :param str resource_name: The name of the resource.
        :param ProjectEnvironmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectEnvironmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 external_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 stop_before_destroy: Optional[pulumi.Input[bool]] = None,
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
            __props__ = ProjectEnvironmentArgs.__new__(ProjectEnvironmentArgs)

            __props__.__dict__["external_url"] = external_url
            __props__.__dict__["name"] = name
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            __props__.__dict__["stop_before_destroy"] = stop_before_destroy
            __props__.__dict__["created_at"] = None
            __props__.__dict__["slug"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["updated_at"] = None
        super(ProjectEnvironment, __self__).__init__(
            'gitlab:index/projectEnvironment:ProjectEnvironment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            external_url: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            stop_before_destroy: Optional[pulumi.Input[bool]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'ProjectEnvironment':
        """
        Get an existing ProjectEnvironment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: The ISO8601 date/time that this environment was created at in UTC.
        :param pulumi.Input[str] external_url: Place to link to for this environment.
        :param pulumi.Input[str] name: The name of the environment.
        :param pulumi.Input[str] project: The ID or full path of the project to environment is created for.
        :param pulumi.Input[str] slug: The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -.
               No leading / trailing -. Use in URLs, host names and domain names.
        :param pulumi.Input[str] state: State the environment is in. Valid values are `available`, `stopped`.
        :param pulumi.Input[bool] stop_before_destroy: Determines whether the environment is attempted to be stopped before the environment is deleted.
        :param pulumi.Input[str] updated_at: The ISO8601 date/time that this environment was last updated at in UTC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectEnvironmentState.__new__(_ProjectEnvironmentState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["external_url"] = external_url
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["slug"] = slug
        __props__.__dict__["state"] = state
        __props__.__dict__["stop_before_destroy"] = stop_before_destroy
        __props__.__dict__["updated_at"] = updated_at
        return ProjectEnvironment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The ISO8601 date/time that this environment was created at in UTC.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="externalUrl")
    def external_url(self) -> pulumi.Output[Optional[str]]:
        """
        Place to link to for this environment.
        """
        return pulumi.get(self, "external_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the environment.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The ID or full path of the project to environment is created for.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        """
        The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -.
        No leading / trailing -. Use in URLs, host names and domain names.
        """
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State the environment is in. Valid values are `available`, `stopped`.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="stopBeforeDestroy")
    def stop_before_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Determines whether the environment is attempted to be stopped before the environment is deleted.
        """
        return pulumi.get(self, "stop_before_destroy")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The ISO8601 date/time that this environment was last updated at in UTC.
        """
        return pulumi.get(self, "updated_at")

