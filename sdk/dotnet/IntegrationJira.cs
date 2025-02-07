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
    /// The `gitlab.IntegrationJira` resource allows to manage the lifecycle of a project integration with Jira.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/services.html#jira)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using GitLab = Pulumi.GitLab;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var awesomeProject = new GitLab.Project("awesomeProject", new()
    ///     {
    ///         Description = "My awesome project.",
    ///         VisibilityLevel = "public",
    ///     });
    /// 
    ///     var jira = new GitLab.IntegrationJira("jira", new()
    ///     {
    ///         Project = awesomeProject.Id,
    ///         Url = "https://jira.example.com",
    ///         Username = "user",
    ///         Password = "mypass",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a gitlab_integration_jira state using the project ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/integrationJira:IntegrationJira jira 1
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/integrationJira:IntegrationJira")]
    public partial class IntegrationJira : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the integration is active.
        /// </summary>
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        /// <summary>
        /// The base URL to the Jira instance API. Web URL value is used if not set. For example, https://jira-api.example.com.
        /// </summary>
        [Output("apiUrl")]
        public Output<string> ApiUrl { get; private set; } = null!;

        /// <summary>
        /// Enable comments inside Jira issues on each GitLab event (commit / merge request)
        /// </summary>
        [Output("commentOnEventEnabled")]
        public Output<bool> CommentOnEventEnabled { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for commit events
        /// </summary>
        [Output("commitEvents")]
        public Output<bool> CommitEvents { get; private set; } = null!;

        /// <summary>
        /// Create time.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for issues events.
        /// </summary>
        [Output("issuesEvents")]
        public Output<bool> IssuesEvents { get; private set; } = null!;

        /// <summary>
        /// The ID of a transition that moves issues to a closed state. You can find this number under the JIRA workflow administration (Administration &gt; Issues &gt; Workflows) by selecting View under Operations of the desired workflow of your project. By default, this ID is set to 2. *Note**: importing this field is only supported since GitLab 15.2.
        /// </summary>
        [Output("jiraIssueTransitionId")]
        public Output<string?> JiraIssueTransitionId { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for job events.
        /// </summary>
        [Output("jobEvents")]
        public Output<bool> JobEvents { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for merge request events
        /// </summary>
        [Output("mergeRequestsEvents")]
        public Output<bool> MergeRequestsEvents { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for note events.
        /// </summary>
        [Output("noteEvents")]
        public Output<bool> NoteEvents { get; private set; } = null!;

        /// <summary>
        /// The password of the user created to be used with GitLab/JIRA.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for pipeline events.
        /// </summary>
        [Output("pipelineEvents")]
        public Output<bool> PipelineEvents { get; private set; } = null!;

        /// <summary>
        /// ID of the project you want to activate integration on.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The short identifier for your JIRA project, all uppercase, e.g., PROJ.
        /// </summary>
        [Output("projectKey")]
        public Output<string?> ProjectKey { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for push events.
        /// </summary>
        [Output("pushEvents")]
        public Output<bool> PushEvents { get; private set; } = null!;

        /// <summary>
        /// Enable notifications for tag_push events.
        /// </summary>
        [Output("tagPushEvents")]
        public Output<bool> TagPushEvents { get; private set; } = null!;

        /// <summary>
        /// Title.
        /// </summary>
        [Output("title")]
        public Output<string> Title { get; private set; } = null!;

        /// <summary>
        /// Update time.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// The URL to the JIRA project which is being linked to this GitLab project. For example, https://jira.example.com.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// The username of the user created to be used with GitLab/JIRA.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationJira resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationJira(string name, IntegrationJiraArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/integrationJira:IntegrationJira", name, args ?? new IntegrationJiraArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationJira(string name, Input<string> id, IntegrationJiraState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/integrationJira:IntegrationJira", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing IntegrationJira resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationJira Get(string name, Input<string> id, IntegrationJiraState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationJira(name, id, state, options);
        }
    }

    public sealed class IntegrationJiraArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The base URL to the Jira instance API. Web URL value is used if not set. For example, https://jira-api.example.com.
        /// </summary>
        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        /// <summary>
        /// Enable comments inside Jira issues on each GitLab event (commit / merge request)
        /// </summary>
        [Input("commentOnEventEnabled")]
        public Input<bool>? CommentOnEventEnabled { get; set; }

        /// <summary>
        /// Enable notifications for commit events
        /// </summary>
        [Input("commitEvents")]
        public Input<bool>? CommitEvents { get; set; }

        /// <summary>
        /// Enable notifications for issues events.
        /// </summary>
        [Input("issuesEvents")]
        public Input<bool>? IssuesEvents { get; set; }

        /// <summary>
        /// The ID of a transition that moves issues to a closed state. You can find this number under the JIRA workflow administration (Administration &gt; Issues &gt; Workflows) by selecting View under Operations of the desired workflow of your project. By default, this ID is set to 2. *Note**: importing this field is only supported since GitLab 15.2.
        /// </summary>
        [Input("jiraIssueTransitionId")]
        public Input<string>? JiraIssueTransitionId { get; set; }

        /// <summary>
        /// Enable notifications for job events.
        /// </summary>
        [Input("jobEvents")]
        public Input<bool>? JobEvents { get; set; }

        /// <summary>
        /// Enable notifications for merge request events
        /// </summary>
        [Input("mergeRequestsEvents")]
        public Input<bool>? MergeRequestsEvents { get; set; }

        /// <summary>
        /// Enable notifications for note events.
        /// </summary>
        [Input("noteEvents")]
        public Input<bool>? NoteEvents { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password of the user created to be used with GitLab/JIRA.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Enable notifications for pipeline events.
        /// </summary>
        [Input("pipelineEvents")]
        public Input<bool>? PipelineEvents { get; set; }

        /// <summary>
        /// ID of the project you want to activate integration on.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// The short identifier for your JIRA project, all uppercase, e.g., PROJ.
        /// </summary>
        [Input("projectKey")]
        public Input<string>? ProjectKey { get; set; }

        /// <summary>
        /// Enable notifications for push events.
        /// </summary>
        [Input("pushEvents")]
        public Input<bool>? PushEvents { get; set; }

        /// <summary>
        /// Enable notifications for tag_push events.
        /// </summary>
        [Input("tagPushEvents")]
        public Input<bool>? TagPushEvents { get; set; }

        /// <summary>
        /// The URL to the JIRA project which is being linked to this GitLab project. For example, https://jira.example.com.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// The username of the user created to be used with GitLab/JIRA.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public IntegrationJiraArgs()
        {
        }
        public static new IntegrationJiraArgs Empty => new IntegrationJiraArgs();
    }

    public sealed class IntegrationJiraState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the integration is active.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The base URL to the Jira instance API. Web URL value is used if not set. For example, https://jira-api.example.com.
        /// </summary>
        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        /// <summary>
        /// Enable comments inside Jira issues on each GitLab event (commit / merge request)
        /// </summary>
        [Input("commentOnEventEnabled")]
        public Input<bool>? CommentOnEventEnabled { get; set; }

        /// <summary>
        /// Enable notifications for commit events
        /// </summary>
        [Input("commitEvents")]
        public Input<bool>? CommitEvents { get; set; }

        /// <summary>
        /// Create time.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Enable notifications for issues events.
        /// </summary>
        [Input("issuesEvents")]
        public Input<bool>? IssuesEvents { get; set; }

        /// <summary>
        /// The ID of a transition that moves issues to a closed state. You can find this number under the JIRA workflow administration (Administration &gt; Issues &gt; Workflows) by selecting View under Operations of the desired workflow of your project. By default, this ID is set to 2. *Note**: importing this field is only supported since GitLab 15.2.
        /// </summary>
        [Input("jiraIssueTransitionId")]
        public Input<string>? JiraIssueTransitionId { get; set; }

        /// <summary>
        /// Enable notifications for job events.
        /// </summary>
        [Input("jobEvents")]
        public Input<bool>? JobEvents { get; set; }

        /// <summary>
        /// Enable notifications for merge request events
        /// </summary>
        [Input("mergeRequestsEvents")]
        public Input<bool>? MergeRequestsEvents { get; set; }

        /// <summary>
        /// Enable notifications for note events.
        /// </summary>
        [Input("noteEvents")]
        public Input<bool>? NoteEvents { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the user created to be used with GitLab/JIRA.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Enable notifications for pipeline events.
        /// </summary>
        [Input("pipelineEvents")]
        public Input<bool>? PipelineEvents { get; set; }

        /// <summary>
        /// ID of the project you want to activate integration on.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The short identifier for your JIRA project, all uppercase, e.g., PROJ.
        /// </summary>
        [Input("projectKey")]
        public Input<string>? ProjectKey { get; set; }

        /// <summary>
        /// Enable notifications for push events.
        /// </summary>
        [Input("pushEvents")]
        public Input<bool>? PushEvents { get; set; }

        /// <summary>
        /// Enable notifications for tag_push events.
        /// </summary>
        [Input("tagPushEvents")]
        public Input<bool>? TagPushEvents { get; set; }

        /// <summary>
        /// Title.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// Update time.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// The URL to the JIRA project which is being linked to this GitLab project. For example, https://jira.example.com.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// The username of the user created to be used with GitLab/JIRA.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public IntegrationJiraState()
        {
        }
        public static new IntegrationJiraState Empty => new IntegrationJiraState();
    }
}
