// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    /// <summary>
    /// The `gitlab.Project` resource allows to manage the lifecycle of a project.
    /// 
    /// A project can either be created in a group or user namespace.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ce/api/projects.html)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using GitLab = Pulumi.GitLab;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new GitLab.Project("example", new GitLab.ProjectArgs
    ///         {
    ///             Description = "My awesome codebase",
    ///             VisibilityLevel = "public",
    ///         });
    ///         // Project with custom push rules
    ///         var example_two = new GitLab.Project("example-two", new GitLab.ProjectArgs
    ///         {
    ///             PushRules = new GitLab.Inputs.ProjectPushRulesArgs
    ///             {
    ///                 AuthorEmailRegex = "@example\\.com$",
    ///                 CommitCommitterCheck = true,
    ///                 MemberCheck = true,
    ///                 PreventSecrets = true,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/project:Project # You can import a project state using `&lt;resource&gt; &lt;id&gt;`. The
    /// ```
    /// 
    /// # `id` can be whatever the [get single project api][get_single_project] takes for # its `:id` value, so for example
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/project:Project example richardc/example
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/project:Project")]
    public partial class Project : Pulumi.CustomResource
    {
        /// <summary>
        /// Set to true if you want to treat skipped pipelines as if they finished with success.
        /// </summary>
        [Output("allowMergeOnSkippedPipeline")]
        public Output<bool?> AllowMergeOnSkippedPipeline { get; private set; } = null!;

        /// <summary>
        /// Number of merge request approvals required for merging. Default is 0.
        /// </summary>
        [Output("approvalsBeforeMerge")]
        public Output<int?> ApprovalsBeforeMerge { get; private set; } = null!;

        /// <summary>
        /// Set to `true` to archive the project instead of deleting on destroy. If set to `true` it will entire omit the `DELETE` operation.
        /// </summary>
        [Output("archiveOnDestroy")]
        public Output<bool?> ArchiveOnDestroy { get; private set; } = null!;

        /// <summary>
        /// Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
        /// </summary>
        [Output("archived")]
        public Output<bool?> Archived { get; private set; } = null!;

        /// <summary>
        /// Test coverage parsing for the project.
        /// </summary>
        [Output("buildCoverageRegex")]
        public Output<string?> BuildCoverageRegex { get; private set; } = null!;

        /// <summary>
        /// Custom Path to CI config file.
        /// </summary>
        [Output("ciConfigPath")]
        public Output<string?> CiConfigPath { get; private set; } = null!;

        /// <summary>
        /// When a new deployment job starts, skip older deployment jobs that are still pending.
        /// </summary>
        [Output("ciForwardDeploymentEnabled")]
        public Output<bool?> CiForwardDeploymentEnabled { get; private set; } = null!;

        /// <summary>
        /// Enable container registry for the project.
        /// </summary>
        [Output("containerRegistryEnabled")]
        public Output<bool?> ContainerRegistryEnabled { get; private set; } = null!;

        /// <summary>
        /// The default branch for the project.
        /// </summary>
        [Output("defaultBranch")]
        public Output<string> DefaultBranch { get; private set; } = null!;

        /// <summary>
        /// A description of the project.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// For group-level custom templates, specifies ID of group from which all the custom project templates are sourced. Leave empty for instance-level templates. Requires use*custom*template to be true (enterprise edition).
        /// </summary>
        [Output("groupWithProjectTemplatesId")]
        public Output<int?> GroupWithProjectTemplatesId { get; private set; } = null!;

        /// <summary>
        /// URL that can be provided to `git clone` to clone the
        /// </summary>
        [Output("httpUrlToRepo")]
        public Output<string> HttpUrlToRepo { get; private set; } = null!;

        /// <summary>
        /// Git URL to a repository to be imported.
        /// </summary>
        [Output("importUrl")]
        public Output<string?> ImportUrl { get; private set; } = null!;

        /// <summary>
        /// Create main branch with first commit containing a README.md file.
        /// </summary>
        [Output("initializeWithReadme")]
        public Output<bool?> InitializeWithReadme { get; private set; } = null!;

        /// <summary>
        /// Enable issue tracking for the project.
        /// </summary>
        [Output("issuesEnabled")]
        public Output<bool?> IssuesEnabled { get; private set; } = null!;

        /// <summary>
        /// Sets the template for new issues in the project.
        /// </summary>
        [Output("issuesTemplate")]
        public Output<string?> IssuesTemplate { get; private set; } = null!;

        /// <summary>
        /// Enable LFS for the project.
        /// </summary>
        [Output("lfsEnabled")]
        public Output<bool?> LfsEnabled { get; private set; } = null!;

        /// <summary>
        /// Set to `ff` to create fast-forward merges
        /// </summary>
        [Output("mergeMethod")]
        public Output<string?> MergeMethod { get; private set; } = null!;

        /// <summary>
        /// Enable or disable merge pipelines.
        /// </summary>
        [Output("mergePipelinesEnabled")]
        public Output<bool?> MergePipelinesEnabled { get; private set; } = null!;

        /// <summary>
        /// Enable merge requests for the project.
        /// </summary>
        [Output("mergeRequestsEnabled")]
        public Output<bool?> MergeRequestsEnabled { get; private set; } = null!;

        /// <summary>
        /// Sets the template for new merge requests in the project.
        /// </summary>
        [Output("mergeRequestsTemplate")]
        public Output<string?> MergeRequestsTemplate { get; private set; } = null!;

        /// <summary>
        /// Enable or disable merge trains. Requires `merge_pipelines_enabled` to be set to `true` to take effect.
        /// </summary>
        [Output("mergeTrainsEnabled")]
        public Output<bool?> MergeTrainsEnabled { get; private set; } = null!;

        /// <summary>
        /// Enable project pull mirror.
        /// </summary>
        [Output("mirror")]
        public Output<bool?> Mirror { get; private set; } = null!;

        /// <summary>
        /// Enable overwrite diverged branches for a mirrored project.
        /// </summary>
        [Output("mirrorOverwritesDivergedBranches")]
        public Output<bool?> MirrorOverwritesDivergedBranches { get; private set; } = null!;

        /// <summary>
        /// Enable trigger builds on pushes for a mirrored project.
        /// </summary>
        [Output("mirrorTriggerBuilds")]
        public Output<bool?> MirrorTriggerBuilds { get; private set; } = null!;

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace (group or user) of the project. Defaults to your user.
        /// </summary>
        [Output("namespaceId")]
        public Output<int> NamespaceId { get; private set; } = null!;

        /// <summary>
        /// Set to true if you want allow merges only if all discussions are resolved.
        /// </summary>
        [Output("onlyAllowMergeIfAllDiscussionsAreResolved")]
        public Output<bool?> OnlyAllowMergeIfAllDiscussionsAreResolved { get; private set; } = null!;

        /// <summary>
        /// Set to true if you want allow merges only if a pipeline succeeds.
        /// </summary>
        [Output("onlyAllowMergeIfPipelineSucceeds")]
        public Output<bool?> OnlyAllowMergeIfPipelineSucceeds { get; private set; } = null!;

        /// <summary>
        /// Enable only mirror protected branches for a mirrored project.
        /// </summary>
        [Output("onlyMirrorProtectedBranches")]
        public Output<bool?> OnlyMirrorProtectedBranches { get; private set; } = null!;

        /// <summary>
        /// Enable packages repository for the project.
        /// </summary>
        [Output("packagesEnabled")]
        public Output<bool?> PackagesEnabled { get; private set; } = null!;

        /// <summary>
        /// Enable pages access control
        /// </summary>
        [Output("pagesAccessLevel")]
        public Output<string?> PagesAccessLevel { get; private set; } = null!;

        /// <summary>
        /// The path of the repository.
        /// </summary>
        [Output("path")]
        public Output<string?> Path { get; private set; } = null!;

        /// <summary>
        /// The path of the repository with namespace.
        /// </summary>
        [Output("pathWithNamespace")]
        public Output<string> PathWithNamespace { get; private set; } = null!;

        /// <summary>
        /// Enable pipelines for the project.
        /// </summary>
        [Output("pipelinesEnabled")]
        public Output<bool?> PipelinesEnabled { get; private set; } = null!;

        /// <summary>
        /// Show link to create/view merge request when pushing from the command line
        /// </summary>
        [Output("printingMergeRequestLinkEnabled")]
        public Output<bool?> PrintingMergeRequestLinkEnabled { get; private set; } = null!;

        /// <summary>
        /// Push rules for the project.
        /// </summary>
        [Output("pushRules")]
        public Output<Outputs.ProjectPushRules> PushRules { get; private set; } = null!;

        /// <summary>
        /// Enable `Delete source branch` option by default for all new merge requests.
        /// </summary>
        [Output("removeSourceBranchAfterMerge")]
        public Output<bool?> RemoveSourceBranchAfterMerge { get; private set; } = null!;

        /// <summary>
        /// Allow users to request member access.
        /// </summary>
        [Output("requestAccessEnabled")]
        public Output<bool?> RequestAccessEnabled { get; private set; } = null!;

        /// <summary>
        /// Registration token to use during runner setup.
        /// </summary>
        [Output("runnersToken")]
        public Output<string> RunnersToken { get; private set; } = null!;

        /// <summary>
        /// Enable shared runners for this project.
        /// </summary>
        [Output("sharedRunnersEnabled")]
        public Output<bool> SharedRunnersEnabled { get; private set; } = null!;

        /// <summary>
        /// Enable snippets for the project.
        /// </summary>
        [Output("snippetsEnabled")]
        public Output<bool?> SnippetsEnabled { get; private set; } = null!;

        /// <summary>
        /// Squash commits when merge request. Valid values are `never`, `always`, `default_on`, or `default_off`. The default value is `default_off`. [GitLab &gt;= 14.1]
        /// </summary>
        [Output("squashOption")]
        public Output<string?> SquashOption { get; private set; } = null!;

        /// <summary>
        /// URL that can be provided to `git clone` to clone the
        /// </summary>
        [Output("sshUrlToRepo")]
        public Output<string> SshUrlToRepo { get; private set; } = null!;

        /// <summary>
        /// Tags (topics) of the project.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// When used without use*custom*template, name of a built-in project template. When used with use*custom*template, name of a custom project template. This option is mutually exclusive with `template_project_id`.
        /// </summary>
        [Output("templateName")]
        public Output<string?> TemplateName { get; private set; } = null!;

        /// <summary>
        /// When used with use*custom*template, project ID of a custom project template. This is preferable to using template*name since template*name may be ambiguous (enterprise edition). This option is mutually exclusive with `template_name`.
        /// </summary>
        [Output("templateProjectId")]
        public Output<int?> TemplateProjectId { get; private set; } = null!;

        /// <summary>
        /// Use either custom instance or group (with group*with*project*templates*id) project template (enterprise edition).
        /// </summary>
        [Output("useCustomTemplate")]
        public Output<bool?> UseCustomTemplate { get; private set; } = null!;

        /// <summary>
        /// Set to `public` to create a public project.
        /// </summary>
        [Output("visibilityLevel")]
        public Output<string?> VisibilityLevel { get; private set; } = null!;

        /// <summary>
        /// URL that can be used to find the project in a browser.
        /// </summary>
        [Output("webUrl")]
        public Output<string> WebUrl { get; private set; } = null!;

        /// <summary>
        /// Enable wiki for the project.
        /// </summary>
        [Output("wikiEnabled")]
        public Output<bool?> WikiEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs? args = null, CustomResourceOptions? options = null)
            : base("gitlab:index/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/project:Project", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to true if you want to treat skipped pipelines as if they finished with success.
        /// </summary>
        [Input("allowMergeOnSkippedPipeline")]
        public Input<bool>? AllowMergeOnSkippedPipeline { get; set; }

        /// <summary>
        /// Number of merge request approvals required for merging. Default is 0.
        /// </summary>
        [Input("approvalsBeforeMerge")]
        public Input<int>? ApprovalsBeforeMerge { get; set; }

        /// <summary>
        /// Set to `true` to archive the project instead of deleting on destroy. If set to `true` it will entire omit the `DELETE` operation.
        /// </summary>
        [Input("archiveOnDestroy")]
        public Input<bool>? ArchiveOnDestroy { get; set; }

        /// <summary>
        /// Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
        /// </summary>
        [Input("archived")]
        public Input<bool>? Archived { get; set; }

        /// <summary>
        /// Test coverage parsing for the project.
        /// </summary>
        [Input("buildCoverageRegex")]
        public Input<string>? BuildCoverageRegex { get; set; }

        /// <summary>
        /// Custom Path to CI config file.
        /// </summary>
        [Input("ciConfigPath")]
        public Input<string>? CiConfigPath { get; set; }

        /// <summary>
        /// When a new deployment job starts, skip older deployment jobs that are still pending.
        /// </summary>
        [Input("ciForwardDeploymentEnabled")]
        public Input<bool>? CiForwardDeploymentEnabled { get; set; }

        /// <summary>
        /// Enable container registry for the project.
        /// </summary>
        [Input("containerRegistryEnabled")]
        public Input<bool>? ContainerRegistryEnabled { get; set; }

        /// <summary>
        /// The default branch for the project.
        /// </summary>
        [Input("defaultBranch")]
        public Input<string>? DefaultBranch { get; set; }

        /// <summary>
        /// A description of the project.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// For group-level custom templates, specifies ID of group from which all the custom project templates are sourced. Leave empty for instance-level templates. Requires use*custom*template to be true (enterprise edition).
        /// </summary>
        [Input("groupWithProjectTemplatesId")]
        public Input<int>? GroupWithProjectTemplatesId { get; set; }

        /// <summary>
        /// Git URL to a repository to be imported.
        /// </summary>
        [Input("importUrl")]
        public Input<string>? ImportUrl { get; set; }

        /// <summary>
        /// Create main branch with first commit containing a README.md file.
        /// </summary>
        [Input("initializeWithReadme")]
        public Input<bool>? InitializeWithReadme { get; set; }

        /// <summary>
        /// Enable issue tracking for the project.
        /// </summary>
        [Input("issuesEnabled")]
        public Input<bool>? IssuesEnabled { get; set; }

        /// <summary>
        /// Sets the template for new issues in the project.
        /// </summary>
        [Input("issuesTemplate")]
        public Input<string>? IssuesTemplate { get; set; }

        /// <summary>
        /// Enable LFS for the project.
        /// </summary>
        [Input("lfsEnabled")]
        public Input<bool>? LfsEnabled { get; set; }

        /// <summary>
        /// Set to `ff` to create fast-forward merges
        /// </summary>
        [Input("mergeMethod")]
        public Input<string>? MergeMethod { get; set; }

        /// <summary>
        /// Enable or disable merge pipelines.
        /// </summary>
        [Input("mergePipelinesEnabled")]
        public Input<bool>? MergePipelinesEnabled { get; set; }

        /// <summary>
        /// Enable merge requests for the project.
        /// </summary>
        [Input("mergeRequestsEnabled")]
        public Input<bool>? MergeRequestsEnabled { get; set; }

        /// <summary>
        /// Sets the template for new merge requests in the project.
        /// </summary>
        [Input("mergeRequestsTemplate")]
        public Input<string>? MergeRequestsTemplate { get; set; }

        /// <summary>
        /// Enable or disable merge trains. Requires `merge_pipelines_enabled` to be set to `true` to take effect.
        /// </summary>
        [Input("mergeTrainsEnabled")]
        public Input<bool>? MergeTrainsEnabled { get; set; }

        /// <summary>
        /// Enable project pull mirror.
        /// </summary>
        [Input("mirror")]
        public Input<bool>? Mirror { get; set; }

        /// <summary>
        /// Enable overwrite diverged branches for a mirrored project.
        /// </summary>
        [Input("mirrorOverwritesDivergedBranches")]
        public Input<bool>? MirrorOverwritesDivergedBranches { get; set; }

        /// <summary>
        /// Enable trigger builds on pushes for a mirrored project.
        /// </summary>
        [Input("mirrorTriggerBuilds")]
        public Input<bool>? MirrorTriggerBuilds { get; set; }

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace (group or user) of the project. Defaults to your user.
        /// </summary>
        [Input("namespaceId")]
        public Input<int>? NamespaceId { get; set; }

        /// <summary>
        /// Set to true if you want allow merges only if all discussions are resolved.
        /// </summary>
        [Input("onlyAllowMergeIfAllDiscussionsAreResolved")]
        public Input<bool>? OnlyAllowMergeIfAllDiscussionsAreResolved { get; set; }

        /// <summary>
        /// Set to true if you want allow merges only if a pipeline succeeds.
        /// </summary>
        [Input("onlyAllowMergeIfPipelineSucceeds")]
        public Input<bool>? OnlyAllowMergeIfPipelineSucceeds { get; set; }

        /// <summary>
        /// Enable only mirror protected branches for a mirrored project.
        /// </summary>
        [Input("onlyMirrorProtectedBranches")]
        public Input<bool>? OnlyMirrorProtectedBranches { get; set; }

        /// <summary>
        /// Enable packages repository for the project.
        /// </summary>
        [Input("packagesEnabled")]
        public Input<bool>? PackagesEnabled { get; set; }

        /// <summary>
        /// Enable pages access control
        /// </summary>
        [Input("pagesAccessLevel")]
        public Input<string>? PagesAccessLevel { get; set; }

        /// <summary>
        /// The path of the repository.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Enable pipelines for the project.
        /// </summary>
        [Input("pipelinesEnabled")]
        public Input<bool>? PipelinesEnabled { get; set; }

        /// <summary>
        /// Show link to create/view merge request when pushing from the command line
        /// </summary>
        [Input("printingMergeRequestLinkEnabled")]
        public Input<bool>? PrintingMergeRequestLinkEnabled { get; set; }

        /// <summary>
        /// Push rules for the project.
        /// </summary>
        [Input("pushRules")]
        public Input<Inputs.ProjectPushRulesArgs>? PushRules { get; set; }

        /// <summary>
        /// Enable `Delete source branch` option by default for all new merge requests.
        /// </summary>
        [Input("removeSourceBranchAfterMerge")]
        public Input<bool>? RemoveSourceBranchAfterMerge { get; set; }

        /// <summary>
        /// Allow users to request member access.
        /// </summary>
        [Input("requestAccessEnabled")]
        public Input<bool>? RequestAccessEnabled { get; set; }

        /// <summary>
        /// Enable shared runners for this project.
        /// </summary>
        [Input("sharedRunnersEnabled")]
        public Input<bool>? SharedRunnersEnabled { get; set; }

        /// <summary>
        /// Enable snippets for the project.
        /// </summary>
        [Input("snippetsEnabled")]
        public Input<bool>? SnippetsEnabled { get; set; }

        /// <summary>
        /// Squash commits when merge request. Valid values are `never`, `always`, `default_on`, or `default_off`. The default value is `default_off`. [GitLab &gt;= 14.1]
        /// </summary>
        [Input("squashOption")]
        public Input<string>? SquashOption { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags (topics) of the project.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// When used without use*custom*template, name of a built-in project template. When used with use*custom*template, name of a custom project template. This option is mutually exclusive with `template_project_id`.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        /// <summary>
        /// When used with use*custom*template, project ID of a custom project template. This is preferable to using template*name since template*name may be ambiguous (enterprise edition). This option is mutually exclusive with `template_name`.
        /// </summary>
        [Input("templateProjectId")]
        public Input<int>? TemplateProjectId { get; set; }

        /// <summary>
        /// Use either custom instance or group (with group*with*project*templates*id) project template (enterprise edition).
        /// </summary>
        [Input("useCustomTemplate")]
        public Input<bool>? UseCustomTemplate { get; set; }

        /// <summary>
        /// Set to `public` to create a public project.
        /// </summary>
        [Input("visibilityLevel")]
        public Input<string>? VisibilityLevel { get; set; }

        /// <summary>
        /// Enable wiki for the project.
        /// </summary>
        [Input("wikiEnabled")]
        public Input<bool>? WikiEnabled { get; set; }

        public ProjectArgs()
        {
        }
    }

    public sealed class ProjectState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to true if you want to treat skipped pipelines as if they finished with success.
        /// </summary>
        [Input("allowMergeOnSkippedPipeline")]
        public Input<bool>? AllowMergeOnSkippedPipeline { get; set; }

        /// <summary>
        /// Number of merge request approvals required for merging. Default is 0.
        /// </summary>
        [Input("approvalsBeforeMerge")]
        public Input<int>? ApprovalsBeforeMerge { get; set; }

        /// <summary>
        /// Set to `true` to archive the project instead of deleting on destroy. If set to `true` it will entire omit the `DELETE` operation.
        /// </summary>
        [Input("archiveOnDestroy")]
        public Input<bool>? ArchiveOnDestroy { get; set; }

        /// <summary>
        /// Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
        /// </summary>
        [Input("archived")]
        public Input<bool>? Archived { get; set; }

        /// <summary>
        /// Test coverage parsing for the project.
        /// </summary>
        [Input("buildCoverageRegex")]
        public Input<string>? BuildCoverageRegex { get; set; }

        /// <summary>
        /// Custom Path to CI config file.
        /// </summary>
        [Input("ciConfigPath")]
        public Input<string>? CiConfigPath { get; set; }

        /// <summary>
        /// When a new deployment job starts, skip older deployment jobs that are still pending.
        /// </summary>
        [Input("ciForwardDeploymentEnabled")]
        public Input<bool>? CiForwardDeploymentEnabled { get; set; }

        /// <summary>
        /// Enable container registry for the project.
        /// </summary>
        [Input("containerRegistryEnabled")]
        public Input<bool>? ContainerRegistryEnabled { get; set; }

        /// <summary>
        /// The default branch for the project.
        /// </summary>
        [Input("defaultBranch")]
        public Input<string>? DefaultBranch { get; set; }

        /// <summary>
        /// A description of the project.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// For group-level custom templates, specifies ID of group from which all the custom project templates are sourced. Leave empty for instance-level templates. Requires use*custom*template to be true (enterprise edition).
        /// </summary>
        [Input("groupWithProjectTemplatesId")]
        public Input<int>? GroupWithProjectTemplatesId { get; set; }

        /// <summary>
        /// URL that can be provided to `git clone` to clone the
        /// </summary>
        [Input("httpUrlToRepo")]
        public Input<string>? HttpUrlToRepo { get; set; }

        /// <summary>
        /// Git URL to a repository to be imported.
        /// </summary>
        [Input("importUrl")]
        public Input<string>? ImportUrl { get; set; }

        /// <summary>
        /// Create main branch with first commit containing a README.md file.
        /// </summary>
        [Input("initializeWithReadme")]
        public Input<bool>? InitializeWithReadme { get; set; }

        /// <summary>
        /// Enable issue tracking for the project.
        /// </summary>
        [Input("issuesEnabled")]
        public Input<bool>? IssuesEnabled { get; set; }

        /// <summary>
        /// Sets the template for new issues in the project.
        /// </summary>
        [Input("issuesTemplate")]
        public Input<string>? IssuesTemplate { get; set; }

        /// <summary>
        /// Enable LFS for the project.
        /// </summary>
        [Input("lfsEnabled")]
        public Input<bool>? LfsEnabled { get; set; }

        /// <summary>
        /// Set to `ff` to create fast-forward merges
        /// </summary>
        [Input("mergeMethod")]
        public Input<string>? MergeMethod { get; set; }

        /// <summary>
        /// Enable or disable merge pipelines.
        /// </summary>
        [Input("mergePipelinesEnabled")]
        public Input<bool>? MergePipelinesEnabled { get; set; }

        /// <summary>
        /// Enable merge requests for the project.
        /// </summary>
        [Input("mergeRequestsEnabled")]
        public Input<bool>? MergeRequestsEnabled { get; set; }

        /// <summary>
        /// Sets the template for new merge requests in the project.
        /// </summary>
        [Input("mergeRequestsTemplate")]
        public Input<string>? MergeRequestsTemplate { get; set; }

        /// <summary>
        /// Enable or disable merge trains. Requires `merge_pipelines_enabled` to be set to `true` to take effect.
        /// </summary>
        [Input("mergeTrainsEnabled")]
        public Input<bool>? MergeTrainsEnabled { get; set; }

        /// <summary>
        /// Enable project pull mirror.
        /// </summary>
        [Input("mirror")]
        public Input<bool>? Mirror { get; set; }

        /// <summary>
        /// Enable overwrite diverged branches for a mirrored project.
        /// </summary>
        [Input("mirrorOverwritesDivergedBranches")]
        public Input<bool>? MirrorOverwritesDivergedBranches { get; set; }

        /// <summary>
        /// Enable trigger builds on pushes for a mirrored project.
        /// </summary>
        [Input("mirrorTriggerBuilds")]
        public Input<bool>? MirrorTriggerBuilds { get; set; }

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace (group or user) of the project. Defaults to your user.
        /// </summary>
        [Input("namespaceId")]
        public Input<int>? NamespaceId { get; set; }

        /// <summary>
        /// Set to true if you want allow merges only if all discussions are resolved.
        /// </summary>
        [Input("onlyAllowMergeIfAllDiscussionsAreResolved")]
        public Input<bool>? OnlyAllowMergeIfAllDiscussionsAreResolved { get; set; }

        /// <summary>
        /// Set to true if you want allow merges only if a pipeline succeeds.
        /// </summary>
        [Input("onlyAllowMergeIfPipelineSucceeds")]
        public Input<bool>? OnlyAllowMergeIfPipelineSucceeds { get; set; }

        /// <summary>
        /// Enable only mirror protected branches for a mirrored project.
        /// </summary>
        [Input("onlyMirrorProtectedBranches")]
        public Input<bool>? OnlyMirrorProtectedBranches { get; set; }

        /// <summary>
        /// Enable packages repository for the project.
        /// </summary>
        [Input("packagesEnabled")]
        public Input<bool>? PackagesEnabled { get; set; }

        /// <summary>
        /// Enable pages access control
        /// </summary>
        [Input("pagesAccessLevel")]
        public Input<string>? PagesAccessLevel { get; set; }

        /// <summary>
        /// The path of the repository.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The path of the repository with namespace.
        /// </summary>
        [Input("pathWithNamespace")]
        public Input<string>? PathWithNamespace { get; set; }

        /// <summary>
        /// Enable pipelines for the project.
        /// </summary>
        [Input("pipelinesEnabled")]
        public Input<bool>? PipelinesEnabled { get; set; }

        /// <summary>
        /// Show link to create/view merge request when pushing from the command line
        /// </summary>
        [Input("printingMergeRequestLinkEnabled")]
        public Input<bool>? PrintingMergeRequestLinkEnabled { get; set; }

        /// <summary>
        /// Push rules for the project.
        /// </summary>
        [Input("pushRules")]
        public Input<Inputs.ProjectPushRulesGetArgs>? PushRules { get; set; }

        /// <summary>
        /// Enable `Delete source branch` option by default for all new merge requests.
        /// </summary>
        [Input("removeSourceBranchAfterMerge")]
        public Input<bool>? RemoveSourceBranchAfterMerge { get; set; }

        /// <summary>
        /// Allow users to request member access.
        /// </summary>
        [Input("requestAccessEnabled")]
        public Input<bool>? RequestAccessEnabled { get; set; }

        /// <summary>
        /// Registration token to use during runner setup.
        /// </summary>
        [Input("runnersToken")]
        public Input<string>? RunnersToken { get; set; }

        /// <summary>
        /// Enable shared runners for this project.
        /// </summary>
        [Input("sharedRunnersEnabled")]
        public Input<bool>? SharedRunnersEnabled { get; set; }

        /// <summary>
        /// Enable snippets for the project.
        /// </summary>
        [Input("snippetsEnabled")]
        public Input<bool>? SnippetsEnabled { get; set; }

        /// <summary>
        /// Squash commits when merge request. Valid values are `never`, `always`, `default_on`, or `default_off`. The default value is `default_off`. [GitLab &gt;= 14.1]
        /// </summary>
        [Input("squashOption")]
        public Input<string>? SquashOption { get; set; }

        /// <summary>
        /// URL that can be provided to `git clone` to clone the
        /// </summary>
        [Input("sshUrlToRepo")]
        public Input<string>? SshUrlToRepo { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags (topics) of the project.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// When used without use*custom*template, name of a built-in project template. When used with use*custom*template, name of a custom project template. This option is mutually exclusive with `template_project_id`.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        /// <summary>
        /// When used with use*custom*template, project ID of a custom project template. This is preferable to using template*name since template*name may be ambiguous (enterprise edition). This option is mutually exclusive with `template_name`.
        /// </summary>
        [Input("templateProjectId")]
        public Input<int>? TemplateProjectId { get; set; }

        /// <summary>
        /// Use either custom instance or group (with group*with*project*templates*id) project template (enterprise edition).
        /// </summary>
        [Input("useCustomTemplate")]
        public Input<bool>? UseCustomTemplate { get; set; }

        /// <summary>
        /// Set to `public` to create a public project.
        /// </summary>
        [Input("visibilityLevel")]
        public Input<string>? VisibilityLevel { get; set; }

        /// <summary>
        /// URL that can be used to find the project in a browser.
        /// </summary>
        [Input("webUrl")]
        public Input<string>? WebUrl { get; set; }

        /// <summary>
        /// Enable wiki for the project.
        /// </summary>
        [Input("wikiEnabled")]
        public Input<bool>? WikiEnabled { get; set; }

        public ProjectState()
        {
        }
    }
}
