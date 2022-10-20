# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ServiceMicrosoftTeamsArgs', 'ServiceMicrosoftTeams']

@pulumi.input_type
class ServiceMicrosoftTeamsArgs:
    def __init__(__self__, *,
                 project: pulumi.Input[str],
                 webhook: pulumi.Input[str],
                 branches_to_be_notified: Optional[pulumi.Input[str]] = None,
                 confidential_issues_events: Optional[pulumi.Input[bool]] = None,
                 confidential_note_events: Optional[pulumi.Input[bool]] = None,
                 issues_events: Optional[pulumi.Input[bool]] = None,
                 merge_requests_events: Optional[pulumi.Input[bool]] = None,
                 note_events: Optional[pulumi.Input[bool]] = None,
                 notify_only_broken_pipelines: Optional[pulumi.Input[bool]] = None,
                 pipeline_events: Optional[pulumi.Input[bool]] = None,
                 push_events: Optional[pulumi.Input[bool]] = None,
                 tag_push_events: Optional[pulumi.Input[bool]] = None,
                 wiki_page_events: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ServiceMicrosoftTeams resource.
        :param pulumi.Input[str] project: ID of the project you want to activate integration on.
        :param pulumi.Input[str] webhook: The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
        :param pulumi.Input[str] branches_to_be_notified: Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
        :param pulumi.Input[bool] confidential_issues_events: Enable notifications for confidential issue events
        :param pulumi.Input[bool] confidential_note_events: Enable notifications for confidential note events
        :param pulumi.Input[bool] issues_events: Enable notifications for issue events
        :param pulumi.Input[bool] merge_requests_events: Enable notifications for merge request events
        :param pulumi.Input[bool] note_events: Enable notifications for note events
        :param pulumi.Input[bool] notify_only_broken_pipelines: Send notifications for broken pipelines
        :param pulumi.Input[bool] pipeline_events: Enable notifications for pipeline events
        :param pulumi.Input[bool] push_events: Enable notifications for push events
        :param pulumi.Input[bool] tag_push_events: Enable notifications for tag push events
        :param pulumi.Input[bool] wiki_page_events: Enable notifications for wiki page events
        """
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "webhook", webhook)
        if branches_to_be_notified is not None:
            pulumi.set(__self__, "branches_to_be_notified", branches_to_be_notified)
        if confidential_issues_events is not None:
            pulumi.set(__self__, "confidential_issues_events", confidential_issues_events)
        if confidential_note_events is not None:
            pulumi.set(__self__, "confidential_note_events", confidential_note_events)
        if issues_events is not None:
            pulumi.set(__self__, "issues_events", issues_events)
        if merge_requests_events is not None:
            pulumi.set(__self__, "merge_requests_events", merge_requests_events)
        if note_events is not None:
            pulumi.set(__self__, "note_events", note_events)
        if notify_only_broken_pipelines is not None:
            pulumi.set(__self__, "notify_only_broken_pipelines", notify_only_broken_pipelines)
        if pipeline_events is not None:
            pulumi.set(__self__, "pipeline_events", pipeline_events)
        if push_events is not None:
            pulumi.set(__self__, "push_events", push_events)
        if tag_push_events is not None:
            pulumi.set(__self__, "tag_push_events", tag_push_events)
        if wiki_page_events is not None:
            pulumi.set(__self__, "wiki_page_events", wiki_page_events)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[str]:
        """
        ID of the project you want to activate integration on.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[str]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def webhook(self) -> pulumi.Input[str]:
        """
        The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
        """
        return pulumi.get(self, "webhook")

    @webhook.setter
    def webhook(self, value: pulumi.Input[str]):
        pulumi.set(self, "webhook", value)

    @property
    @pulumi.getter(name="branchesToBeNotified")
    def branches_to_be_notified(self) -> Optional[pulumi.Input[str]]:
        """
        Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
        """
        return pulumi.get(self, "branches_to_be_notified")

    @branches_to_be_notified.setter
    def branches_to_be_notified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branches_to_be_notified", value)

    @property
    @pulumi.getter(name="confidentialIssuesEvents")
    def confidential_issues_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for confidential issue events
        """
        return pulumi.get(self, "confidential_issues_events")

    @confidential_issues_events.setter
    def confidential_issues_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "confidential_issues_events", value)

    @property
    @pulumi.getter(name="confidentialNoteEvents")
    def confidential_note_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for confidential note events
        """
        return pulumi.get(self, "confidential_note_events")

    @confidential_note_events.setter
    def confidential_note_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "confidential_note_events", value)

    @property
    @pulumi.getter(name="issuesEvents")
    def issues_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for issue events
        """
        return pulumi.get(self, "issues_events")

    @issues_events.setter
    def issues_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "issues_events", value)

    @property
    @pulumi.getter(name="mergeRequestsEvents")
    def merge_requests_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for merge request events
        """
        return pulumi.get(self, "merge_requests_events")

    @merge_requests_events.setter
    def merge_requests_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "merge_requests_events", value)

    @property
    @pulumi.getter(name="noteEvents")
    def note_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for note events
        """
        return pulumi.get(self, "note_events")

    @note_events.setter
    def note_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "note_events", value)

    @property
    @pulumi.getter(name="notifyOnlyBrokenPipelines")
    def notify_only_broken_pipelines(self) -> Optional[pulumi.Input[bool]]:
        """
        Send notifications for broken pipelines
        """
        return pulumi.get(self, "notify_only_broken_pipelines")

    @notify_only_broken_pipelines.setter
    def notify_only_broken_pipelines(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "notify_only_broken_pipelines", value)

    @property
    @pulumi.getter(name="pipelineEvents")
    def pipeline_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for pipeline events
        """
        return pulumi.get(self, "pipeline_events")

    @pipeline_events.setter
    def pipeline_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "pipeline_events", value)

    @property
    @pulumi.getter(name="pushEvents")
    def push_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for push events
        """
        return pulumi.get(self, "push_events")

    @push_events.setter
    def push_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "push_events", value)

    @property
    @pulumi.getter(name="tagPushEvents")
    def tag_push_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for tag push events
        """
        return pulumi.get(self, "tag_push_events")

    @tag_push_events.setter
    def tag_push_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "tag_push_events", value)

    @property
    @pulumi.getter(name="wikiPageEvents")
    def wiki_page_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for wiki page events
        """
        return pulumi.get(self, "wiki_page_events")

    @wiki_page_events.setter
    def wiki_page_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wiki_page_events", value)


@pulumi.input_type
class _ServiceMicrosoftTeamsState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 branches_to_be_notified: Optional[pulumi.Input[str]] = None,
                 confidential_issues_events: Optional[pulumi.Input[bool]] = None,
                 confidential_note_events: Optional[pulumi.Input[bool]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 issues_events: Optional[pulumi.Input[bool]] = None,
                 merge_requests_events: Optional[pulumi.Input[bool]] = None,
                 note_events: Optional[pulumi.Input[bool]] = None,
                 notify_only_broken_pipelines: Optional[pulumi.Input[bool]] = None,
                 pipeline_events: Optional[pulumi.Input[bool]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 push_events: Optional[pulumi.Input[bool]] = None,
                 tag_push_events: Optional[pulumi.Input[bool]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 webhook: Optional[pulumi.Input[str]] = None,
                 wiki_page_events: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ServiceMicrosoftTeams resources.
        :param pulumi.Input[bool] active: Whether the integration is active.
        :param pulumi.Input[str] branches_to_be_notified: Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
        :param pulumi.Input[bool] confidential_issues_events: Enable notifications for confidential issue events
        :param pulumi.Input[bool] confidential_note_events: Enable notifications for confidential note events
        :param pulumi.Input[str] created_at: Create time.
        :param pulumi.Input[bool] issues_events: Enable notifications for issue events
        :param pulumi.Input[bool] merge_requests_events: Enable notifications for merge request events
        :param pulumi.Input[bool] note_events: Enable notifications for note events
        :param pulumi.Input[bool] notify_only_broken_pipelines: Send notifications for broken pipelines
        :param pulumi.Input[bool] pipeline_events: Enable notifications for pipeline events
        :param pulumi.Input[str] project: ID of the project you want to activate integration on.
        :param pulumi.Input[bool] push_events: Enable notifications for push events
        :param pulumi.Input[bool] tag_push_events: Enable notifications for tag push events
        :param pulumi.Input[str] updated_at: Update time.
        :param pulumi.Input[str] webhook: The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
        :param pulumi.Input[bool] wiki_page_events: Enable notifications for wiki page events
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if branches_to_be_notified is not None:
            pulumi.set(__self__, "branches_to_be_notified", branches_to_be_notified)
        if confidential_issues_events is not None:
            pulumi.set(__self__, "confidential_issues_events", confidential_issues_events)
        if confidential_note_events is not None:
            pulumi.set(__self__, "confidential_note_events", confidential_note_events)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if issues_events is not None:
            pulumi.set(__self__, "issues_events", issues_events)
        if merge_requests_events is not None:
            pulumi.set(__self__, "merge_requests_events", merge_requests_events)
        if note_events is not None:
            pulumi.set(__self__, "note_events", note_events)
        if notify_only_broken_pipelines is not None:
            pulumi.set(__self__, "notify_only_broken_pipelines", notify_only_broken_pipelines)
        if pipeline_events is not None:
            pulumi.set(__self__, "pipeline_events", pipeline_events)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if push_events is not None:
            pulumi.set(__self__, "push_events", push_events)
        if tag_push_events is not None:
            pulumi.set(__self__, "tag_push_events", tag_push_events)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if webhook is not None:
            pulumi.set(__self__, "webhook", webhook)
        if wiki_page_events is not None:
            pulumi.set(__self__, "wiki_page_events", wiki_page_events)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the integration is active.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="branchesToBeNotified")
    def branches_to_be_notified(self) -> Optional[pulumi.Input[str]]:
        """
        Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
        """
        return pulumi.get(self, "branches_to_be_notified")

    @branches_to_be_notified.setter
    def branches_to_be_notified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branches_to_be_notified", value)

    @property
    @pulumi.getter(name="confidentialIssuesEvents")
    def confidential_issues_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for confidential issue events
        """
        return pulumi.get(self, "confidential_issues_events")

    @confidential_issues_events.setter
    def confidential_issues_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "confidential_issues_events", value)

    @property
    @pulumi.getter(name="confidentialNoteEvents")
    def confidential_note_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for confidential note events
        """
        return pulumi.get(self, "confidential_note_events")

    @confidential_note_events.setter
    def confidential_note_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "confidential_note_events", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Create time.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="issuesEvents")
    def issues_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for issue events
        """
        return pulumi.get(self, "issues_events")

    @issues_events.setter
    def issues_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "issues_events", value)

    @property
    @pulumi.getter(name="mergeRequestsEvents")
    def merge_requests_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for merge request events
        """
        return pulumi.get(self, "merge_requests_events")

    @merge_requests_events.setter
    def merge_requests_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "merge_requests_events", value)

    @property
    @pulumi.getter(name="noteEvents")
    def note_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for note events
        """
        return pulumi.get(self, "note_events")

    @note_events.setter
    def note_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "note_events", value)

    @property
    @pulumi.getter(name="notifyOnlyBrokenPipelines")
    def notify_only_broken_pipelines(self) -> Optional[pulumi.Input[bool]]:
        """
        Send notifications for broken pipelines
        """
        return pulumi.get(self, "notify_only_broken_pipelines")

    @notify_only_broken_pipelines.setter
    def notify_only_broken_pipelines(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "notify_only_broken_pipelines", value)

    @property
    @pulumi.getter(name="pipelineEvents")
    def pipeline_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for pipeline events
        """
        return pulumi.get(self, "pipeline_events")

    @pipeline_events.setter
    def pipeline_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "pipeline_events", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the project you want to activate integration on.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="pushEvents")
    def push_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for push events
        """
        return pulumi.get(self, "push_events")

    @push_events.setter
    def push_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "push_events", value)

    @property
    @pulumi.getter(name="tagPushEvents")
    def tag_push_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for tag push events
        """
        return pulumi.get(self, "tag_push_events")

    @tag_push_events.setter
    def tag_push_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "tag_push_events", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Update time.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter
    def webhook(self) -> Optional[pulumi.Input[str]]:
        """
        The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
        """
        return pulumi.get(self, "webhook")

    @webhook.setter
    def webhook(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "webhook", value)

    @property
    @pulumi.getter(name="wikiPageEvents")
    def wiki_page_events(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable notifications for wiki page events
        """
        return pulumi.get(self, "wiki_page_events")

    @wiki_page_events.setter
    def wiki_page_events(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wiki_page_events", value)


class ServiceMicrosoftTeams(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branches_to_be_notified: Optional[pulumi.Input[str]] = None,
                 confidential_issues_events: Optional[pulumi.Input[bool]] = None,
                 confidential_note_events: Optional[pulumi.Input[bool]] = None,
                 issues_events: Optional[pulumi.Input[bool]] = None,
                 merge_requests_events: Optional[pulumi.Input[bool]] = None,
                 note_events: Optional[pulumi.Input[bool]] = None,
                 notify_only_broken_pipelines: Optional[pulumi.Input[bool]] = None,
                 pipeline_events: Optional[pulumi.Input[bool]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 push_events: Optional[pulumi.Input[bool]] = None,
                 tag_push_events: Optional[pulumi.Input[bool]] = None,
                 webhook: Optional[pulumi.Input[str]] = None,
                 wiki_page_events: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        The `ServiceMicrosoftTeams` resource allows to manage the lifecycle of a project integration with Microsoft Teams.

        **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/integrations.html#microsoft-teams)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        awesome_project = gitlab.Project("awesomeProject",
            description="My awesome project.",
            visibility_level="public")
        teams = gitlab.ServiceMicrosoftTeams("teams",
            project=awesome_project.id,
            webhook="https://testurl.com/?token=XYZ",
            push_events=True)
        ```

        ## Import

        You can import a service_microsoft_teams state using the project ID, e.g.

        ```sh
         $ pulumi import gitlab:index/serviceMicrosoftTeams:ServiceMicrosoftTeams teams 1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] branches_to_be_notified: Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
        :param pulumi.Input[bool] confidential_issues_events: Enable notifications for confidential issue events
        :param pulumi.Input[bool] confidential_note_events: Enable notifications for confidential note events
        :param pulumi.Input[bool] issues_events: Enable notifications for issue events
        :param pulumi.Input[bool] merge_requests_events: Enable notifications for merge request events
        :param pulumi.Input[bool] note_events: Enable notifications for note events
        :param pulumi.Input[bool] notify_only_broken_pipelines: Send notifications for broken pipelines
        :param pulumi.Input[bool] pipeline_events: Enable notifications for pipeline events
        :param pulumi.Input[str] project: ID of the project you want to activate integration on.
        :param pulumi.Input[bool] push_events: Enable notifications for push events
        :param pulumi.Input[bool] tag_push_events: Enable notifications for tag push events
        :param pulumi.Input[str] webhook: The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
        :param pulumi.Input[bool] wiki_page_events: Enable notifications for wiki page events
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceMicrosoftTeamsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The `ServiceMicrosoftTeams` resource allows to manage the lifecycle of a project integration with Microsoft Teams.

        **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/integrations.html#microsoft-teams)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gitlab as gitlab

        awesome_project = gitlab.Project("awesomeProject",
            description="My awesome project.",
            visibility_level="public")
        teams = gitlab.ServiceMicrosoftTeams("teams",
            project=awesome_project.id,
            webhook="https://testurl.com/?token=XYZ",
            push_events=True)
        ```

        ## Import

        You can import a service_microsoft_teams state using the project ID, e.g.

        ```sh
         $ pulumi import gitlab:index/serviceMicrosoftTeams:ServiceMicrosoftTeams teams 1
        ```

        :param str resource_name: The name of the resource.
        :param ServiceMicrosoftTeamsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceMicrosoftTeamsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branches_to_be_notified: Optional[pulumi.Input[str]] = None,
                 confidential_issues_events: Optional[pulumi.Input[bool]] = None,
                 confidential_note_events: Optional[pulumi.Input[bool]] = None,
                 issues_events: Optional[pulumi.Input[bool]] = None,
                 merge_requests_events: Optional[pulumi.Input[bool]] = None,
                 note_events: Optional[pulumi.Input[bool]] = None,
                 notify_only_broken_pipelines: Optional[pulumi.Input[bool]] = None,
                 pipeline_events: Optional[pulumi.Input[bool]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 push_events: Optional[pulumi.Input[bool]] = None,
                 tag_push_events: Optional[pulumi.Input[bool]] = None,
                 webhook: Optional[pulumi.Input[str]] = None,
                 wiki_page_events: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceMicrosoftTeamsArgs.__new__(ServiceMicrosoftTeamsArgs)

            __props__.__dict__["branches_to_be_notified"] = branches_to_be_notified
            __props__.__dict__["confidential_issues_events"] = confidential_issues_events
            __props__.__dict__["confidential_note_events"] = confidential_note_events
            __props__.__dict__["issues_events"] = issues_events
            __props__.__dict__["merge_requests_events"] = merge_requests_events
            __props__.__dict__["note_events"] = note_events
            __props__.__dict__["notify_only_broken_pipelines"] = notify_only_broken_pipelines
            __props__.__dict__["pipeline_events"] = pipeline_events
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            __props__.__dict__["push_events"] = push_events
            __props__.__dict__["tag_push_events"] = tag_push_events
            if webhook is None and not opts.urn:
                raise TypeError("Missing required property 'webhook'")
            __props__.__dict__["webhook"] = webhook
            __props__.__dict__["wiki_page_events"] = wiki_page_events
            __props__.__dict__["active"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["updated_at"] = None
        super(ServiceMicrosoftTeams, __self__).__init__(
            'gitlab:index/serviceMicrosoftTeams:ServiceMicrosoftTeams',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            branches_to_be_notified: Optional[pulumi.Input[str]] = None,
            confidential_issues_events: Optional[pulumi.Input[bool]] = None,
            confidential_note_events: Optional[pulumi.Input[bool]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            issues_events: Optional[pulumi.Input[bool]] = None,
            merge_requests_events: Optional[pulumi.Input[bool]] = None,
            note_events: Optional[pulumi.Input[bool]] = None,
            notify_only_broken_pipelines: Optional[pulumi.Input[bool]] = None,
            pipeline_events: Optional[pulumi.Input[bool]] = None,
            project: Optional[pulumi.Input[str]] = None,
            push_events: Optional[pulumi.Input[bool]] = None,
            tag_push_events: Optional[pulumi.Input[bool]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            webhook: Optional[pulumi.Input[str]] = None,
            wiki_page_events: Optional[pulumi.Input[bool]] = None) -> 'ServiceMicrosoftTeams':
        """
        Get an existing ServiceMicrosoftTeams resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Whether the integration is active.
        :param pulumi.Input[str] branches_to_be_notified: Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
        :param pulumi.Input[bool] confidential_issues_events: Enable notifications for confidential issue events
        :param pulumi.Input[bool] confidential_note_events: Enable notifications for confidential note events
        :param pulumi.Input[str] created_at: Create time.
        :param pulumi.Input[bool] issues_events: Enable notifications for issue events
        :param pulumi.Input[bool] merge_requests_events: Enable notifications for merge request events
        :param pulumi.Input[bool] note_events: Enable notifications for note events
        :param pulumi.Input[bool] notify_only_broken_pipelines: Send notifications for broken pipelines
        :param pulumi.Input[bool] pipeline_events: Enable notifications for pipeline events
        :param pulumi.Input[str] project: ID of the project you want to activate integration on.
        :param pulumi.Input[bool] push_events: Enable notifications for push events
        :param pulumi.Input[bool] tag_push_events: Enable notifications for tag push events
        :param pulumi.Input[str] updated_at: Update time.
        :param pulumi.Input[str] webhook: The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
        :param pulumi.Input[bool] wiki_page_events: Enable notifications for wiki page events
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceMicrosoftTeamsState.__new__(_ServiceMicrosoftTeamsState)

        __props__.__dict__["active"] = active
        __props__.__dict__["branches_to_be_notified"] = branches_to_be_notified
        __props__.__dict__["confidential_issues_events"] = confidential_issues_events
        __props__.__dict__["confidential_note_events"] = confidential_note_events
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["issues_events"] = issues_events
        __props__.__dict__["merge_requests_events"] = merge_requests_events
        __props__.__dict__["note_events"] = note_events
        __props__.__dict__["notify_only_broken_pipelines"] = notify_only_broken_pipelines
        __props__.__dict__["pipeline_events"] = pipeline_events
        __props__.__dict__["project"] = project
        __props__.__dict__["push_events"] = push_events
        __props__.__dict__["tag_push_events"] = tag_push_events
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["webhook"] = webhook
        __props__.__dict__["wiki_page_events"] = wiki_page_events
        return ServiceMicrosoftTeams(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        """
        Whether the integration is active.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="branchesToBeNotified")
    def branches_to_be_notified(self) -> pulumi.Output[Optional[str]]:
        """
        Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
        """
        return pulumi.get(self, "branches_to_be_notified")

    @property
    @pulumi.getter(name="confidentialIssuesEvents")
    def confidential_issues_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for confidential issue events
        """
        return pulumi.get(self, "confidential_issues_events")

    @property
    @pulumi.getter(name="confidentialNoteEvents")
    def confidential_note_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for confidential note events
        """
        return pulumi.get(self, "confidential_note_events")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Create time.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="issuesEvents")
    def issues_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for issue events
        """
        return pulumi.get(self, "issues_events")

    @property
    @pulumi.getter(name="mergeRequestsEvents")
    def merge_requests_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for merge request events
        """
        return pulumi.get(self, "merge_requests_events")

    @property
    @pulumi.getter(name="noteEvents")
    def note_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for note events
        """
        return pulumi.get(self, "note_events")

    @property
    @pulumi.getter(name="notifyOnlyBrokenPipelines")
    def notify_only_broken_pipelines(self) -> pulumi.Output[Optional[bool]]:
        """
        Send notifications for broken pipelines
        """
        return pulumi.get(self, "notify_only_broken_pipelines")

    @property
    @pulumi.getter(name="pipelineEvents")
    def pipeline_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for pipeline events
        """
        return pulumi.get(self, "pipeline_events")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        ID of the project you want to activate integration on.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="pushEvents")
    def push_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for push events
        """
        return pulumi.get(self, "push_events")

    @property
    @pulumi.getter(name="tagPushEvents")
    def tag_push_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for tag push events
        """
        return pulumi.get(self, "tag_push_events")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Update time.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def webhook(self) -> pulumi.Output[str]:
        """
        The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
        """
        return pulumi.get(self, "webhook")

    @property
    @pulumi.getter(name="wikiPageEvents")
    def wiki_page_events(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable notifications for wiki page events
        """
        return pulumi.get(self, "wiki_page_events")

