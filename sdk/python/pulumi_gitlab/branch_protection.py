# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class BranchProtection(pulumi.CustomResource):
    branch: pulumi.Output[str]
    """
    Name of the branch.
    """
    merge_access_level: pulumi.Output[str]
    """
    One of five levels of access to the project.
    """
    project: pulumi.Output[str]
    """
    The id of the project.
    """
    push_access_level: pulumi.Output[str]
    """
    One of five levels of access to the project.
    """
    def __init__(__self__, resource_name, opts=None, branch=None, merge_access_level=None, project=None, push_access_level=None, __name__=None, __opts__=None):
        """
        This resource allows you to protect a specific branch by an access level so that the user with less access level cannot Merge/Push to the branch. GitLab EE features to protect by group or user are not supported.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] branch: Name of the branch.
        :param pulumi.Input[str] merge_access_level: One of five levels of access to the project.
        :param pulumi.Input[str] project: The id of the project.
        :param pulumi.Input[str] push_access_level: One of five levels of access to the project.
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

        if branch is None:
            raise TypeError("Missing required property 'branch'")
        __props__['branch'] = branch

        if merge_access_level is None:
            raise TypeError("Missing required property 'merge_access_level'")
        __props__['merge_access_level'] = merge_access_level

        if project is None:
            raise TypeError("Missing required property 'project'")
        __props__['project'] = project

        if push_access_level is None:
            raise TypeError("Missing required property 'push_access_level'")
        __props__['push_access_level'] = push_access_level

        super(BranchProtection, __self__).__init__(
            'gitlab:index/branchProtection:BranchProtection',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

