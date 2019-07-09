# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class ProjectHook(pulumi.CustomResource):
    enable_ssl_verification: pulumi.Output[bool]
    """
    Enable ssl verification when invoking
    the hook.
    """
    issues_events: pulumi.Output[bool]
    """
    Invoke the hook for issues events.
    """
    job_events: pulumi.Output[bool]
    """
    Invoke the hook for job events.
    """
    merge_requests_events: pulumi.Output[bool]
    """
    Invoke the hook for merge requests.
    """
    note_events: pulumi.Output[bool]
    """
    Invoke the hook for notes events.
    """
    pipeline_events: pulumi.Output[bool]
    """
    Invoke the hook for pipeline events.
    """
    project: pulumi.Output[str]
    """
    The name or id of the project to add the hook to.
    """
    push_events: pulumi.Output[bool]
    """
    Invoke the hook for push events.
    """
    tag_push_events: pulumi.Output[bool]
    """
    Invoke the hook for tag push events.
    """
    token: pulumi.Output[str]
    """
    A token to present when invoking the hook.
    """
    url: pulumi.Output[str]
    """
    The url of the hook to invoke.
    """
    wiki_page_events: pulumi.Output[bool]
    """
    Invoke the hook for wiki page events.
    """
    def __init__(__self__, resource_name, opts=None, enable_ssl_verification=None, issues_events=None, job_events=None, merge_requests_events=None, note_events=None, pipeline_events=None, project=None, push_events=None, tag_push_events=None, token=None, url=None, wiki_page_events=None, __name__=None, __opts__=None):
        """
        This resource allows you to create and manage hooks for your GitLab projects.
        For further information on hooks, consult the [gitlab
        documentation](https://docs.gitlab.com/ce/user/project/integrations/webhooks.html).
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enable_ssl_verification: Enable ssl verification when invoking
               the hook.
        :param pulumi.Input[bool] issues_events: Invoke the hook for issues events.
        :param pulumi.Input[bool] job_events: Invoke the hook for job events.
        :param pulumi.Input[bool] merge_requests_events: Invoke the hook for merge requests.
        :param pulumi.Input[bool] note_events: Invoke the hook for notes events.
        :param pulumi.Input[bool] pipeline_events: Invoke the hook for pipeline events.
        :param pulumi.Input[str] project: The name or id of the project to add the hook to.
        :param pulumi.Input[bool] push_events: Invoke the hook for push events.
        :param pulumi.Input[bool] tag_push_events: Invoke the hook for tag push events.
        :param pulumi.Input[str] token: A token to present when invoking the hook.
        :param pulumi.Input[str] url: The url of the hook to invoke.
        :param pulumi.Input[bool] wiki_page_events: Invoke the hook for wiki page events.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-gitlab/blob/master/website/docs/r/project_hook.html.markdown.
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

        __props__['enable_ssl_verification'] = enable_ssl_verification

        __props__['issues_events'] = issues_events

        __props__['job_events'] = job_events

        __props__['merge_requests_events'] = merge_requests_events

        __props__['note_events'] = note_events

        __props__['pipeline_events'] = pipeline_events

        if project is None:
            raise TypeError("Missing required property 'project'")
        __props__['project'] = project

        __props__['push_events'] = push_events

        __props__['tag_push_events'] = tag_push_events

        __props__['token'] = token

        if url is None:
            raise TypeError("Missing required property 'url'")
        __props__['url'] = url

        __props__['wiki_page_events'] = wiki_page_events

        super(ProjectHook, __self__).__init__(
            'gitlab:index/projectHook:ProjectHook',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

