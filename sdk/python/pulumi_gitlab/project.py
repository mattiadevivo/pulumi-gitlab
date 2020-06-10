# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Project(pulumi.CustomResource):
    approvals_before_merge: pulumi.Output[float]
    """
    Number of merge request approvals required for merging. Default is 0.
    """
    archived: pulumi.Output[bool]
    """
    Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
    """
    container_registry_enabled: pulumi.Output[bool]
    """
    Enable container registry for the project.
    """
    default_branch: pulumi.Output[str]
    """
    The default branch for the project.
    """
    description: pulumi.Output[str]
    """
    A description of the project.
    """
    http_url_to_repo: pulumi.Output[str]
    """
    URL that can be provided to `git clone` to clone the
    repository via HTTP.
    """
    initialize_with_readme: pulumi.Output[bool]
    """
    Create master branch with first commit containing a README.md file.
    """
    issues_enabled: pulumi.Output[bool]
    """
    Enable issue tracking for the project.
    """
    lfs_enabled: pulumi.Output[bool]
    """
    Enable LFS for the project.
    """
    merge_method: pulumi.Output[str]
    """
    Set to `ff` to create fast-forward merges
    Valid values are `merge`, `rebase_merge`, `ff`
    Repositories are created with `merge` by default
    """
    merge_requests_enabled: pulumi.Output[bool]
    """
    Enable merge requests for the project.
    """
    name: pulumi.Output[str]
    """
    The name of the project.
    """
    namespace_id: pulumi.Output[float]
    """
    The namespace (group or user) of the project. Defaults to your user.
    See `.Group` for an example.
    """
    only_allow_merge_if_all_discussions_are_resolved: pulumi.Output[bool]
    """
    Set to true if you want allow merges only if all discussions are resolved.
    """
    only_allow_merge_if_pipeline_succeeds: pulumi.Output[bool]
    """
    Set to true if you want allow merges only if a pipeline succeeds.
    """
    path: pulumi.Output[str]
    """
    The path of the repository.
    """
    pipelines_enabled: pulumi.Output[bool]
    """
    Enable pipelines for the project.
    """
    remove_source_branch_after_merge: pulumi.Output[bool]
    """
    Enable `Delete source branch` option by default for all new merge requests.
    """
    request_access_enabled: pulumi.Output[bool]
    """
    Allow users to request member access.
    """
    runners_token: pulumi.Output[str]
    """
    Registration token to use during runner setup.
    """
    shared_runners_enabled: pulumi.Output[bool]
    """
    Enable shared runners for this project.
    """
    shared_with_groups: pulumi.Output[list]
    """
    Enable sharing the project with a list of groups (maps).

      * `groupAccessLevel` (`str`) - Group's sharing permissions. See [group members permission][group_members_permissions] for more info.
        Valid values are `guest`, `reporter`, `developer`, `master`.
      * `group_id` (`float`) - Group id of the group you want to share the project with.
      * `groupName` (`str`) - Group's name.
    """
    snippets_enabled: pulumi.Output[bool]
    """
    Enable snippets for the project.
    """
    ssh_url_to_repo: pulumi.Output[str]
    """
    URL that can be provided to `git clone` to clone the
    repository via SSH.
    """
    tags: pulumi.Output[list]
    """
    Tags (topics) of the project.
    """
    visibility_level: pulumi.Output[str]
    """
    Set to `public` to create a public project.
    Valid values are `private`, `internal`, `public`.
    Repositories are created as private by default.
    """
    web_url: pulumi.Output[str]
    """
    URL that can be used to find the project in a browser.
    """
    wiki_enabled: pulumi.Output[bool]
    """
    Enable wiki for the project.
    """
    def __init__(__self__, resource_name, opts=None, approvals_before_merge=None, archived=None, container_registry_enabled=None, default_branch=None, description=None, initialize_with_readme=None, issues_enabled=None, lfs_enabled=None, merge_method=None, merge_requests_enabled=None, name=None, namespace_id=None, only_allow_merge_if_all_discussions_are_resolved=None, only_allow_merge_if_pipeline_succeeds=None, path=None, pipelines_enabled=None, remove_source_branch_after_merge=None, request_access_enabled=None, shared_runners_enabled=None, shared_with_groups=None, snippets_enabled=None, tags=None, visibility_level=None, wiki_enabled=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a Project resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] approvals_before_merge: Number of merge request approvals required for merging. Default is 0.
        :param pulumi.Input[bool] archived: Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
        :param pulumi.Input[bool] container_registry_enabled: Enable container registry for the project.
        :param pulumi.Input[str] default_branch: The default branch for the project.
        :param pulumi.Input[str] description: A description of the project.
        :param pulumi.Input[bool] initialize_with_readme: Create master branch with first commit containing a README.md file.
        :param pulumi.Input[bool] issues_enabled: Enable issue tracking for the project.
        :param pulumi.Input[bool] lfs_enabled: Enable LFS for the project.
        :param pulumi.Input[str] merge_method: Set to `ff` to create fast-forward merges
               Valid values are `merge`, `rebase_merge`, `ff`
               Repositories are created with `merge` by default
        :param pulumi.Input[bool] merge_requests_enabled: Enable merge requests for the project.
        :param pulumi.Input[str] name: The name of the project.
        :param pulumi.Input[float] namespace_id: The namespace (group or user) of the project. Defaults to your user.
               See `.Group` for an example.
        :param pulumi.Input[bool] only_allow_merge_if_all_discussions_are_resolved: Set to true if you want allow merges only if all discussions are resolved.
        :param pulumi.Input[bool] only_allow_merge_if_pipeline_succeeds: Set to true if you want allow merges only if a pipeline succeeds.
        :param pulumi.Input[str] path: The path of the repository.
        :param pulumi.Input[bool] pipelines_enabled: Enable pipelines for the project.
        :param pulumi.Input[bool] remove_source_branch_after_merge: Enable `Delete source branch` option by default for all new merge requests.
        :param pulumi.Input[bool] request_access_enabled: Allow users to request member access.
        :param pulumi.Input[bool] shared_runners_enabled: Enable shared runners for this project.
        :param pulumi.Input[list] shared_with_groups: Enable sharing the project with a list of groups (maps).
        :param pulumi.Input[bool] snippets_enabled: Enable snippets for the project.
        :param pulumi.Input[list] tags: Tags (topics) of the project.
        :param pulumi.Input[str] visibility_level: Set to `public` to create a public project.
               Valid values are `private`, `internal`, `public`.
               Repositories are created as private by default.
        :param pulumi.Input[bool] wiki_enabled: Enable wiki for the project.

        The **shared_with_groups** object supports the following:

          * `groupAccessLevel` (`pulumi.Input[str]`) - Group's sharing permissions. See [group members permission][group_members_permissions] for more info.
            Valid values are `guest`, `reporter`, `developer`, `master`.
          * `group_id` (`pulumi.Input[float]`) - Group id of the group you want to share the project with.
          * `groupName` (`pulumi.Input[str]`) - Group's name.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['approvals_before_merge'] = approvals_before_merge
            __props__['archived'] = archived
            __props__['container_registry_enabled'] = container_registry_enabled
            __props__['default_branch'] = default_branch
            __props__['description'] = description
            __props__['initialize_with_readme'] = initialize_with_readme
            __props__['issues_enabled'] = issues_enabled
            __props__['lfs_enabled'] = lfs_enabled
            __props__['merge_method'] = merge_method
            __props__['merge_requests_enabled'] = merge_requests_enabled
            __props__['name'] = name
            __props__['namespace_id'] = namespace_id
            __props__['only_allow_merge_if_all_discussions_are_resolved'] = only_allow_merge_if_all_discussions_are_resolved
            __props__['only_allow_merge_if_pipeline_succeeds'] = only_allow_merge_if_pipeline_succeeds
            __props__['path'] = path
            __props__['pipelines_enabled'] = pipelines_enabled
            __props__['remove_source_branch_after_merge'] = remove_source_branch_after_merge
            __props__['request_access_enabled'] = request_access_enabled
            __props__['shared_runners_enabled'] = shared_runners_enabled
            __props__['shared_with_groups'] = shared_with_groups
            __props__['snippets_enabled'] = snippets_enabled
            __props__['tags'] = tags
            __props__['visibility_level'] = visibility_level
            __props__['wiki_enabled'] = wiki_enabled
            __props__['http_url_to_repo'] = None
            __props__['runners_token'] = None
            __props__['ssh_url_to_repo'] = None
            __props__['web_url'] = None
        super(Project, __self__).__init__(
            'gitlab:index/project:Project',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, approvals_before_merge=None, archived=None, container_registry_enabled=None, default_branch=None, description=None, http_url_to_repo=None, initialize_with_readme=None, issues_enabled=None, lfs_enabled=None, merge_method=None, merge_requests_enabled=None, name=None, namespace_id=None, only_allow_merge_if_all_discussions_are_resolved=None, only_allow_merge_if_pipeline_succeeds=None, path=None, pipelines_enabled=None, remove_source_branch_after_merge=None, request_access_enabled=None, runners_token=None, shared_runners_enabled=None, shared_with_groups=None, snippets_enabled=None, ssh_url_to_repo=None, tags=None, visibility_level=None, web_url=None, wiki_enabled=None):
        """
        Get an existing Project resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] approvals_before_merge: Number of merge request approvals required for merging. Default is 0.
        :param pulumi.Input[bool] archived: Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
        :param pulumi.Input[bool] container_registry_enabled: Enable container registry for the project.
        :param pulumi.Input[str] default_branch: The default branch for the project.
        :param pulumi.Input[str] description: A description of the project.
        :param pulumi.Input[str] http_url_to_repo: URL that can be provided to `git clone` to clone the
               repository via HTTP.
        :param pulumi.Input[bool] initialize_with_readme: Create master branch with first commit containing a README.md file.
        :param pulumi.Input[bool] issues_enabled: Enable issue tracking for the project.
        :param pulumi.Input[bool] lfs_enabled: Enable LFS for the project.
        :param pulumi.Input[str] merge_method: Set to `ff` to create fast-forward merges
               Valid values are `merge`, `rebase_merge`, `ff`
               Repositories are created with `merge` by default
        :param pulumi.Input[bool] merge_requests_enabled: Enable merge requests for the project.
        :param pulumi.Input[str] name: The name of the project.
        :param pulumi.Input[float] namespace_id: The namespace (group or user) of the project. Defaults to your user.
               See `.Group` for an example.
        :param pulumi.Input[bool] only_allow_merge_if_all_discussions_are_resolved: Set to true if you want allow merges only if all discussions are resolved.
        :param pulumi.Input[bool] only_allow_merge_if_pipeline_succeeds: Set to true if you want allow merges only if a pipeline succeeds.
        :param pulumi.Input[str] path: The path of the repository.
        :param pulumi.Input[bool] pipelines_enabled: Enable pipelines for the project.
        :param pulumi.Input[bool] remove_source_branch_after_merge: Enable `Delete source branch` option by default for all new merge requests.
        :param pulumi.Input[bool] request_access_enabled: Allow users to request member access.
        :param pulumi.Input[str] runners_token: Registration token to use during runner setup.
        :param pulumi.Input[bool] shared_runners_enabled: Enable shared runners for this project.
        :param pulumi.Input[list] shared_with_groups: Enable sharing the project with a list of groups (maps).
        :param pulumi.Input[bool] snippets_enabled: Enable snippets for the project.
        :param pulumi.Input[str] ssh_url_to_repo: URL that can be provided to `git clone` to clone the
               repository via SSH.
        :param pulumi.Input[list] tags: Tags (topics) of the project.
        :param pulumi.Input[str] visibility_level: Set to `public` to create a public project.
               Valid values are `private`, `internal`, `public`.
               Repositories are created as private by default.
        :param pulumi.Input[str] web_url: URL that can be used to find the project in a browser.
        :param pulumi.Input[bool] wiki_enabled: Enable wiki for the project.

        The **shared_with_groups** object supports the following:

          * `groupAccessLevel` (`pulumi.Input[str]`) - Group's sharing permissions. See [group members permission][group_members_permissions] for more info.
            Valid values are `guest`, `reporter`, `developer`, `master`.
          * `group_id` (`pulumi.Input[float]`) - Group id of the group you want to share the project with.
          * `groupName` (`pulumi.Input[str]`) - Group's name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["approvals_before_merge"] = approvals_before_merge
        __props__["archived"] = archived
        __props__["container_registry_enabled"] = container_registry_enabled
        __props__["default_branch"] = default_branch
        __props__["description"] = description
        __props__["http_url_to_repo"] = http_url_to_repo
        __props__["initialize_with_readme"] = initialize_with_readme
        __props__["issues_enabled"] = issues_enabled
        __props__["lfs_enabled"] = lfs_enabled
        __props__["merge_method"] = merge_method
        __props__["merge_requests_enabled"] = merge_requests_enabled
        __props__["name"] = name
        __props__["namespace_id"] = namespace_id
        __props__["only_allow_merge_if_all_discussions_are_resolved"] = only_allow_merge_if_all_discussions_are_resolved
        __props__["only_allow_merge_if_pipeline_succeeds"] = only_allow_merge_if_pipeline_succeeds
        __props__["path"] = path
        __props__["pipelines_enabled"] = pipelines_enabled
        __props__["remove_source_branch_after_merge"] = remove_source_branch_after_merge
        __props__["request_access_enabled"] = request_access_enabled
        __props__["runners_token"] = runners_token
        __props__["shared_runners_enabled"] = shared_runners_enabled
        __props__["shared_with_groups"] = shared_with_groups
        __props__["snippets_enabled"] = snippets_enabled
        __props__["ssh_url_to_repo"] = ssh_url_to_repo
        __props__["tags"] = tags
        __props__["visibility_level"] = visibility_level
        __props__["web_url"] = web_url
        __props__["wiki_enabled"] = wiki_enabled
        return Project(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

