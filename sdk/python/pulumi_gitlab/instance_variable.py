# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['InstanceVariable']


class InstanceVariable(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 masked: Optional[pulumi.Input[bool]] = None,
                 protected: Optional[pulumi.Input[bool]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 variable_type: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        This resource allows you to create and manage CI/CD variables for your GitLab instance.
        For further information on variables, consult the [gitlab
        documentation](https://docs.gitlab.com/ee/api/instance_level_ci_variables.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        example = gitlab.InstanceVariable("example",
            key="instance_variable_key",
            masked=False,
            protected=False,
            value="instance_variable_value")
        ```

        ## Import

        GitLab instance variables can be imported using an id made up of `variablename`, e.g. console

        ```sh
         $ pulumi import gitlab:index/instanceVariable:InstanceVariable example instance_variable_key
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The name of the variable.
        :param pulumi.Input[bool] masked: If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variable-requirements). Defaults to `false`.
        :param pulumi.Input[bool] protected: If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
        :param pulumi.Input[str] value: The value of the variable.
        :param pulumi.Input[str] variable_type: The type of a variable. Available types are: env_var (default) and file.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if key is None:
                raise TypeError("Missing required property 'key'")
            __props__['key'] = key
            __props__['masked'] = masked
            __props__['protected'] = protected
            if value is None:
                raise TypeError("Missing required property 'value'")
            __props__['value'] = value
            __props__['variable_type'] = variable_type
        super(InstanceVariable, __self__).__init__(
            'gitlab:index/instanceVariable:InstanceVariable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key: Optional[pulumi.Input[str]] = None,
            masked: Optional[pulumi.Input[bool]] = None,
            protected: Optional[pulumi.Input[bool]] = None,
            value: Optional[pulumi.Input[str]] = None,
            variable_type: Optional[pulumi.Input[str]] = None) -> 'InstanceVariable':
        """
        Get an existing InstanceVariable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The name of the variable.
        :param pulumi.Input[bool] masked: If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variable-requirements). Defaults to `false`.
        :param pulumi.Input[bool] protected: If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
        :param pulumi.Input[str] value: The value of the variable.
        :param pulumi.Input[str] variable_type: The type of a variable. Available types are: env_var (default) and file.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["key"] = key
        __props__["masked"] = masked
        __props__["protected"] = protected
        __props__["value"] = value
        __props__["variable_type"] = variable_type
        return InstanceVariable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        The name of the variable.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def masked(self) -> pulumi.Output[Optional[bool]]:
        """
        If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variable-requirements). Defaults to `false`.
        """
        return pulumi.get(self, "masked")

    @property
    @pulumi.getter
    def protected(self) -> pulumi.Output[Optional[bool]]:
        """
        If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
        """
        return pulumi.get(self, "protected")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        The value of the variable.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="variableType")
    def variable_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of a variable. Available types are: env_var (default) and file.
        """
        return pulumi.get(self, "variable_type")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

