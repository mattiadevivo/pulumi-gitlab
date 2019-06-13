# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class PipelineSchedule(pulumi.CustomResource):
    active: pulumi.Output[bool]
    """
    The activation of pipeline schedule. If false is set, the pipeline schedule will deactivated initially.
    """
    cron: pulumi.Output[str]
    """
    The cron (e.g. `0 1 * * *`).
    """
    cron_timezone: pulumi.Output[str]
    """
    The timezone.
    """
    description: pulumi.Output[str]
    """
    The description of the pipeline schedule.
    """
    project: pulumi.Output[str]
    """
    The name or id of the project to add the schedule to.
    """
    ref: pulumi.Output[str]
    """
    The branch/tag name to be triggered.
    """
    def __init__(__self__, resource_name, opts=None, active=None, cron=None, cron_timezone=None, description=None, project=None, ref=None, __name__=None, __opts__=None):
        """
        This resource allows you to create and manage pipeline schedules.
        For further information on clusters, consult the [gitlab
        documentation](https://docs.gitlab.com/ce/user/project/pipelines/schedules.html).
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: The activation of pipeline schedule. If false is set, the pipeline schedule will deactivated initially.
        :param pulumi.Input[str] cron: The cron (e.g. `0 1 * * *`).
        :param pulumi.Input[str] cron_timezone: The timezone.
        :param pulumi.Input[str] description: The description of the pipeline schedule.
        :param pulumi.Input[str] project: The name or id of the project to add the schedule to.
        :param pulumi.Input[str] ref: The branch/tag name to be triggered.
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

        __props__['active'] = active

        if cron is None:
            raise TypeError("Missing required property 'cron'")
        __props__['cron'] = cron

        __props__['cron_timezone'] = cron_timezone

        if description is None:
            raise TypeError("Missing required property 'description'")
        __props__['description'] = description

        if project is None:
            raise TypeError("Missing required property 'project'")
        __props__['project'] = project

        if ref is None:
            raise TypeError("Missing required property 'ref'")
        __props__['ref'] = ref

        super(PipelineSchedule, __self__).__init__(
            'gitlab:index/pipelineSchedule:PipelineSchedule',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

