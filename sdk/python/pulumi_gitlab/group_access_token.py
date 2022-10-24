# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GroupAccessTokenArgs', 'GroupAccessToken']

@pulumi.input_type
class GroupAccessTokenArgs:
    def __init__(__self__, *,
                 group: pulumi.Input[str],
                 scopes: pulumi.Input[Sequence[pulumi.Input[str]]],
                 access_level: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GroupAccessToken resource.
        :param pulumi.Input[str] group: The ID or path of the group to add the group access token to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
        :param pulumi.Input[str] access_level: The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
        :param pulumi.Input[str] expires_at: The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD. Default is never.
        :param pulumi.Input[str] name: The name of the group access token.
        """
        pulumi.set(__self__, "group", group)
        pulumi.set(__self__, "scopes", scopes)
        if access_level is not None:
            pulumi.set(__self__, "access_level", access_level)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def group(self) -> pulumi.Input[str]:
        """
        The ID or path of the group to add the group access token to.
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: pulumi.Input[str]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "scopes", value)

    @property
    @pulumi.getter(name="accessLevel")
    def access_level(self) -> Optional[pulumi.Input[str]]:
        """
        The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
        """
        return pulumi.get(self, "access_level")

    @access_level.setter
    def access_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_level", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD. Default is never.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the group access token.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _GroupAccessTokenState:
    def __init__(__self__, *,
                 access_level: Optional[pulumi.Input[str]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 revoked: Optional[pulumi.Input[bool]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering GroupAccessToken resources.
        :param pulumi.Input[str] access_level: The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
        :param pulumi.Input[bool] active: True if the token is active.
        :param pulumi.Input[str] created_at: Time the token has been created, RFC3339 format.
        :param pulumi.Input[str] expires_at: The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD. Default is never.
        :param pulumi.Input[str] group: The ID or path of the group to add the group access token to.
        :param pulumi.Input[str] name: The name of the group access token.
        :param pulumi.Input[bool] revoked: True if the token is revoked.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
        :param pulumi.Input[str] token: The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
        :param pulumi.Input[int] user_id: The user id associated to the token.
        """
        if access_level is not None:
            pulumi.set(__self__, "access_level", access_level)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if group is not None:
            pulumi.set(__self__, "group", group)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if revoked is not None:
            pulumi.set(__self__, "revoked", revoked)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)
        if token is not None:
            pulumi.set(__self__, "token", token)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="accessLevel")
    def access_level(self) -> Optional[pulumi.Input[str]]:
        """
        The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
        """
        return pulumi.get(self, "access_level")

    @access_level.setter
    def access_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_level", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        True if the token is active.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Time the token has been created, RFC3339 format.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD. Default is never.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter
    def group(self) -> Optional[pulumi.Input[str]]:
        """
        The ID or path of the group to add the group access token to.
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the group access token.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def revoked(self) -> Optional[pulumi.Input[bool]]:
        """
        True if the token is revoked.
        """
        return pulumi.get(self, "revoked")

    @revoked.setter
    def revoked(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "revoked", value)

    @property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "scopes", value)

    @property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[str]]:
        """
        The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[int]]:
        """
        The user id associated to the token.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "user_id", value)


class GroupAccessToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_level: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        The `gitlab_group_access`token resource allows to manage the lifecycle of a group access token.

        > Group Access Token were introduced in GitLab 14.7

        **Upstream API**: [GitLab REST API](https://docs.gitlab.com/ee/api/group_access_tokens.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        example_group_access_token = gitlab.GroupAccessToken("exampleGroupAccessToken",
            group="25",
            expires_at="2020-03-14",
            access_level="developer",
            scopes=["api"])
        example_group_variable = gitlab.GroupVariable("exampleGroupVariable",
            group="25",
            key="gat",
            value=example_group_access_token.token)
        ```

        ## Import

        A GitLab Group Access Token can be imported using a key composed of `<group-id>:<token-id>`, e.g.

        ```sh
         $ pulumi import gitlab:index/groupAccessToken:GroupAccessToken example "12345:1"
        ```

         ATTENTIONthe `token` resource attribute is not available for imported resources as this information cannot be read from the GitLab API.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_level: The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
        :param pulumi.Input[str] expires_at: The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD. Default is never.
        :param pulumi.Input[str] group: The ID or path of the group to add the group access token to.
        :param pulumi.Input[str] name: The name of the group access token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupAccessTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The `gitlab_group_access`token resource allows to manage the lifecycle of a group access token.

        > Group Access Token were introduced in GitLab 14.7

        **Upstream API**: [GitLab REST API](https://docs.gitlab.com/ee/api/group_access_tokens.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        example_group_access_token = gitlab.GroupAccessToken("exampleGroupAccessToken",
            group="25",
            expires_at="2020-03-14",
            access_level="developer",
            scopes=["api"])
        example_group_variable = gitlab.GroupVariable("exampleGroupVariable",
            group="25",
            key="gat",
            value=example_group_access_token.token)
        ```

        ## Import

        A GitLab Group Access Token can be imported using a key composed of `<group-id>:<token-id>`, e.g.

        ```sh
         $ pulumi import gitlab:index/groupAccessToken:GroupAccessToken example "12345:1"
        ```

         ATTENTIONthe `token` resource attribute is not available for imported resources as this information cannot be read from the GitLab API.

        :param str resource_name: The name of the resource.
        :param GroupAccessTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupAccessTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_level: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupAccessTokenArgs.__new__(GroupAccessTokenArgs)

            __props__.__dict__["access_level"] = access_level
            __props__.__dict__["expires_at"] = expires_at
            if group is None and not opts.urn:
                raise TypeError("Missing required property 'group'")
            __props__.__dict__["group"] = group
            __props__.__dict__["name"] = name
            if scopes is None and not opts.urn:
                raise TypeError("Missing required property 'scopes'")
            __props__.__dict__["scopes"] = scopes
            __props__.__dict__["active"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["revoked"] = None
            __props__.__dict__["token"] = None
            __props__.__dict__["user_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(GroupAccessToken, __self__).__init__(
            'gitlab:index/groupAccessToken:GroupAccessToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_level: Optional[pulumi.Input[str]] = None,
            active: Optional[pulumi.Input[bool]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            group: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            revoked: Optional[pulumi.Input[bool]] = None,
            scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            token: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[int]] = None) -> 'GroupAccessToken':
        """
        Get an existing GroupAccessToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_level: The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
        :param pulumi.Input[bool] active: True if the token is active.
        :param pulumi.Input[str] created_at: Time the token has been created, RFC3339 format.
        :param pulumi.Input[str] expires_at: The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD. Default is never.
        :param pulumi.Input[str] group: The ID or path of the group to add the group access token to.
        :param pulumi.Input[str] name: The name of the group access token.
        :param pulumi.Input[bool] revoked: True if the token is revoked.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
        :param pulumi.Input[str] token: The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
        :param pulumi.Input[int] user_id: The user id associated to the token.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupAccessTokenState.__new__(_GroupAccessTokenState)

        __props__.__dict__["access_level"] = access_level
        __props__.__dict__["active"] = active
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["group"] = group
        __props__.__dict__["name"] = name
        __props__.__dict__["revoked"] = revoked
        __props__.__dict__["scopes"] = scopes
        __props__.__dict__["token"] = token
        __props__.__dict__["user_id"] = user_id
        return GroupAccessToken(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessLevel")
    def access_level(self) -> pulumi.Output[Optional[str]]:
        """
        The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
        """
        return pulumi.get(self, "access_level")

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        """
        True if the token is active.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Time the token has been created, RFC3339 format.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> pulumi.Output[Optional[str]]:
        """
        The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD. Default is never.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter
    def group(self) -> pulumi.Output[str]:
        """
        The ID or path of the group to add the group access token to.
        """
        return pulumi.get(self, "group")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the group access token.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def revoked(self) -> pulumi.Output[bool]:
        """
        True if the token is revoked.
        """
        return pulumi.get(self, "revoked")

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Output[Sequence[str]]:
        """
        The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
        """
        return pulumi.get(self, "scopes")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[str]:
        """
        The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
        """
        return pulumi.get(self, "token")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[int]:
        """
        The user id associated to the token.
        """
        return pulumi.get(self, "user_id")

