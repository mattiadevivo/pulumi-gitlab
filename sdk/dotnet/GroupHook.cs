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
    /// The `gitlab.GroupHook` resource allows to manage the lifecycle of a group hook.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#hooks)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using GitLab = Pulumi.GitLab;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new GitLab.GroupHook("example", new()
    ///     {
    ///         Group = "example/hooked",
    ///         MergeRequestsEvents = true,
    ///         Url = "https://example.com/hook/example",
    ///     });
    /// 
    ///     // Setting all attributes
    ///     var allAttributes = new GitLab.GroupHook("allAttributes", new()
    ///     {
    ///         ConfidentialIssuesEvents = false,
    ///         ConfidentialNoteEvents = true,
    ///         DeploymentEvents = true,
    ///         EnableSslVerification = false,
    ///         Group = "1",
    ///         IssuesEvents = false,
    ///         JobEvents = true,
    ///         MergeRequestsEvents = true,
    ///         NoteEvents = true,
    ///         PipelineEvents = true,
    ///         PushEvents = true,
    ///         PushEventsBranchFilter = "devel",
    ///         ReleasesEvents = true,
    ///         SubgroupEvents = true,
    ///         TagPushEvents = true,
    ///         Token = "supersecret",
    ///         Url = "http://example.com",
    ///         WikiPageEvents = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A GitLab Group Hook can be imported using a key composed of `&lt;group-id&gt;:&lt;hook-id&gt;`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/groupHook:GroupHook example "12345:1"
    /// ```
    /// 
    ///  NOTEthe `token` resource attribute is not available for imported resources as this information cannot be read from the GitLab API.
    /// </summary>
    [GitLabResourceType("gitlab:index/groupHook:GroupHook")]
    public partial class GroupHook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Invoke the hook for confidential issues events.
        /// </summary>
        [Output("confidentialIssuesEvents")]
        public Output<bool?> ConfidentialIssuesEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for confidential notes events.
        /// </summary>
        [Output("confidentialNoteEvents")]
        public Output<bool?> ConfidentialNoteEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for deployment events.
        /// </summary>
        [Output("deploymentEvents")]
        public Output<bool?> DeploymentEvents { get; private set; } = null!;

        /// <summary>
        /// Enable ssl verification when invoking the hook.
        /// </summary>
        [Output("enableSslVerification")]
        public Output<bool?> EnableSslVerification { get; private set; } = null!;

        /// <summary>
        /// The ID or full path of the group.
        /// </summary>
        [Output("group")]
        public Output<string> Group { get; private set; } = null!;

        /// <summary>
        /// The id of the group for the hook.
        /// </summary>
        [Output("groupId")]
        public Output<int> GroupId { get; private set; } = null!;

        /// <summary>
        /// The id of the group hook.
        /// </summary>
        [Output("hookId")]
        public Output<int> HookId { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for issues events.
        /// </summary>
        [Output("issuesEvents")]
        public Output<bool?> IssuesEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for job events.
        /// </summary>
        [Output("jobEvents")]
        public Output<bool?> JobEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for merge requests.
        /// </summary>
        [Output("mergeRequestsEvents")]
        public Output<bool?> MergeRequestsEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for notes events.
        /// </summary>
        [Output("noteEvents")]
        public Output<bool?> NoteEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for pipeline events.
        /// </summary>
        [Output("pipelineEvents")]
        public Output<bool?> PipelineEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for push events.
        /// </summary>
        [Output("pushEvents")]
        public Output<bool?> PushEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for push events on matching branches only.
        /// </summary>
        [Output("pushEventsBranchFilter")]
        public Output<string?> PushEventsBranchFilter { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for releases events.
        /// </summary>
        [Output("releasesEvents")]
        public Output<bool?> ReleasesEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for subgroup events.
        /// </summary>
        [Output("subgroupEvents")]
        public Output<bool?> SubgroupEvents { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for tag push events.
        /// </summary>
        [Output("tagPushEvents")]
        public Output<bool?> TagPushEvents { get; private set; } = null!;

        /// <summary>
        /// A token to present when invoking the hook. The token is not available for imported resources.
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;

        /// <summary>
        /// The url of the hook to invoke.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Invoke the hook for wiki page events.
        /// </summary>
        [Output("wikiPageEvents")]
        public Output<bool?> WikiPageEvents { get; private set; } = null!;


        /// <summary>
        /// Create a GroupHook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GroupHook(string name, GroupHookArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/groupHook:GroupHook", name, args ?? new GroupHookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GroupHook(string name, Input<string> id, GroupHookState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/groupHook:GroupHook", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GroupHook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GroupHook Get(string name, Input<string> id, GroupHookState? state = null, CustomResourceOptions? options = null)
        {
            return new GroupHook(name, id, state, options);
        }
    }

    public sealed class GroupHookArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Invoke the hook for confidential issues events.
        /// </summary>
        [Input("confidentialIssuesEvents")]
        public Input<bool>? ConfidentialIssuesEvents { get; set; }

        /// <summary>
        /// Invoke the hook for confidential notes events.
        /// </summary>
        [Input("confidentialNoteEvents")]
        public Input<bool>? ConfidentialNoteEvents { get; set; }

        /// <summary>
        /// Invoke the hook for deployment events.
        /// </summary>
        [Input("deploymentEvents")]
        public Input<bool>? DeploymentEvents { get; set; }

        /// <summary>
        /// Enable ssl verification when invoking the hook.
        /// </summary>
        [Input("enableSslVerification")]
        public Input<bool>? EnableSslVerification { get; set; }

        /// <summary>
        /// The ID or full path of the group.
        /// </summary>
        [Input("group", required: true)]
        public Input<string> Group { get; set; } = null!;

        /// <summary>
        /// Invoke the hook for issues events.
        /// </summary>
        [Input("issuesEvents")]
        public Input<bool>? IssuesEvents { get; set; }

        /// <summary>
        /// Invoke the hook for job events.
        /// </summary>
        [Input("jobEvents")]
        public Input<bool>? JobEvents { get; set; }

        /// <summary>
        /// Invoke the hook for merge requests.
        /// </summary>
        [Input("mergeRequestsEvents")]
        public Input<bool>? MergeRequestsEvents { get; set; }

        /// <summary>
        /// Invoke the hook for notes events.
        /// </summary>
        [Input("noteEvents")]
        public Input<bool>? NoteEvents { get; set; }

        /// <summary>
        /// Invoke the hook for pipeline events.
        /// </summary>
        [Input("pipelineEvents")]
        public Input<bool>? PipelineEvents { get; set; }

        /// <summary>
        /// Invoke the hook for push events.
        /// </summary>
        [Input("pushEvents")]
        public Input<bool>? PushEvents { get; set; }

        /// <summary>
        /// Invoke the hook for push events on matching branches only.
        /// </summary>
        [Input("pushEventsBranchFilter")]
        public Input<string>? PushEventsBranchFilter { get; set; }

        /// <summary>
        /// Invoke the hook for releases events.
        /// </summary>
        [Input("releasesEvents")]
        public Input<bool>? ReleasesEvents { get; set; }

        /// <summary>
        /// Invoke the hook for subgroup events.
        /// </summary>
        [Input("subgroupEvents")]
        public Input<bool>? SubgroupEvents { get; set; }

        /// <summary>
        /// Invoke the hook for tag push events.
        /// </summary>
        [Input("tagPushEvents")]
        public Input<bool>? TagPushEvents { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// A token to present when invoking the hook. The token is not available for imported resources.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The url of the hook to invoke.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// Invoke the hook for wiki page events.
        /// </summary>
        [Input("wikiPageEvents")]
        public Input<bool>? WikiPageEvents { get; set; }

        public GroupHookArgs()
        {
        }
        public static new GroupHookArgs Empty => new GroupHookArgs();
    }

    public sealed class GroupHookState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Invoke the hook for confidential issues events.
        /// </summary>
        [Input("confidentialIssuesEvents")]
        public Input<bool>? ConfidentialIssuesEvents { get; set; }

        /// <summary>
        /// Invoke the hook for confidential notes events.
        /// </summary>
        [Input("confidentialNoteEvents")]
        public Input<bool>? ConfidentialNoteEvents { get; set; }

        /// <summary>
        /// Invoke the hook for deployment events.
        /// </summary>
        [Input("deploymentEvents")]
        public Input<bool>? DeploymentEvents { get; set; }

        /// <summary>
        /// Enable ssl verification when invoking the hook.
        /// </summary>
        [Input("enableSslVerification")]
        public Input<bool>? EnableSslVerification { get; set; }

        /// <summary>
        /// The ID or full path of the group.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// The id of the group for the hook.
        /// </summary>
        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        /// <summary>
        /// The id of the group hook.
        /// </summary>
        [Input("hookId")]
        public Input<int>? HookId { get; set; }

        /// <summary>
        /// Invoke the hook for issues events.
        /// </summary>
        [Input("issuesEvents")]
        public Input<bool>? IssuesEvents { get; set; }

        /// <summary>
        /// Invoke the hook for job events.
        /// </summary>
        [Input("jobEvents")]
        public Input<bool>? JobEvents { get; set; }

        /// <summary>
        /// Invoke the hook for merge requests.
        /// </summary>
        [Input("mergeRequestsEvents")]
        public Input<bool>? MergeRequestsEvents { get; set; }

        /// <summary>
        /// Invoke the hook for notes events.
        /// </summary>
        [Input("noteEvents")]
        public Input<bool>? NoteEvents { get; set; }

        /// <summary>
        /// Invoke the hook for pipeline events.
        /// </summary>
        [Input("pipelineEvents")]
        public Input<bool>? PipelineEvents { get; set; }

        /// <summary>
        /// Invoke the hook for push events.
        /// </summary>
        [Input("pushEvents")]
        public Input<bool>? PushEvents { get; set; }

        /// <summary>
        /// Invoke the hook for push events on matching branches only.
        /// </summary>
        [Input("pushEventsBranchFilter")]
        public Input<string>? PushEventsBranchFilter { get; set; }

        /// <summary>
        /// Invoke the hook for releases events.
        /// </summary>
        [Input("releasesEvents")]
        public Input<bool>? ReleasesEvents { get; set; }

        /// <summary>
        /// Invoke the hook for subgroup events.
        /// </summary>
        [Input("subgroupEvents")]
        public Input<bool>? SubgroupEvents { get; set; }

        /// <summary>
        /// Invoke the hook for tag push events.
        /// </summary>
        [Input("tagPushEvents")]
        public Input<bool>? TagPushEvents { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// A token to present when invoking the hook. The token is not available for imported resources.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The url of the hook to invoke.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Invoke the hook for wiki page events.
        /// </summary>
        [Input("wikiPageEvents")]
        public Input<bool>? WikiPageEvents { get; set; }

        public GroupHookState()
        {
        }
        public static new GroupHookState Empty => new GroupHookState();
    }
}
