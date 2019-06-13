# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class User(pulumi.CustomResource):
    can_create_group: pulumi.Output[bool]
    """
    Boolean, defaults to false. Whether to allow the user to create groups.
    """
    email: pulumi.Output[str]
    """
    The e-mail address of the user.
    """
    is_admin: pulumi.Output[bool]
    """
    Boolean, defaults to false.  Whether to enable administrative priviledges
    for the user.
    """
    is_external: pulumi.Output[bool]
    """
    Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
    """
    name: pulumi.Output[str]
    """
    The name of the user.
    """
    password: pulumi.Output[str]
    """
    The password of the user.
    """
    projects_limit: pulumi.Output[float]
    """
    Integer, defaults to 0.  Number of projects user can create.
    """
    skip_confirmation: pulumi.Output[bool]
    """
    Boolean, defaults to true. Whether to skip confirmation.
    """
    username: pulumi.Output[str]
    """
    The username of the user.
    """
    def __init__(__self__, resource_name, opts=None, can_create_group=None, email=None, is_admin=None, is_external=None, name=None, password=None, projects_limit=None, skip_confirmation=None, username=None, __name__=None, __opts__=None):
        """
        This resource allows you to create and manage GitLab users.
        Note your provider will need to be configured with admin-level access for this resource to work.
        
        ## Importing users
        
        You can import a user to terraform state using `terraform import <resource> <id>`.
        The `id` must be an integer for the id of the user you want to import,
        for example:
        
            terraform import gitlab_user.example 42
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] can_create_group: Boolean, defaults to false. Whether to allow the user to create groups.
        :param pulumi.Input[str] email: The e-mail address of the user.
        :param pulumi.Input[bool] is_admin: Boolean, defaults to false.  Whether to enable administrative priviledges
               for the user.
        :param pulumi.Input[bool] is_external: Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
        :param pulumi.Input[str] name: The name of the user.
        :param pulumi.Input[str] password: The password of the user.
        :param pulumi.Input[float] projects_limit: Integer, defaults to 0.  Number of projects user can create.
        :param pulumi.Input[bool] skip_confirmation: Boolean, defaults to true. Whether to skip confirmation.
        :param pulumi.Input[str] username: The username of the user.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['can_create_group'] = can_create_group

        if email is None:
            raise TypeError("Missing required property 'email'")
        __props__['email'] = email

        __props__['is_admin'] = is_admin

        __props__['is_external'] = is_external

        __props__['name'] = name

        if password is None:
            raise TypeError("Missing required property 'password'")
        __props__['password'] = password

        __props__['projects_limit'] = projects_limit

        __props__['skip_confirmation'] = skip_confirmation

        if username is None:
            raise TypeError("Missing required property 'username'")
        __props__['username'] = username

        super(User, __self__).__init__(
            'gitlab:index/user:User',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

