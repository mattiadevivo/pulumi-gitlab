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
    /// ## Import
    /// 
    /// Gitlab protected branches can be imported with a key composed of `&lt;project_id&gt;:&lt;branch&gt;`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/branchProtection:BranchProtection BranchProtect "12345:main"
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/branchProtection:BranchProtection")]
    public partial class BranchProtection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Can be set to true to allow users with push access to force push.
        /// </summary>
        [Output("allowForcePush")]
        public Output<bool?> AllowForcePush { get; private set; } = null!;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        [Output("allowedToMerges")]
        public Output<ImmutableArray<Outputs.BranchProtectionAllowedToMerge>> AllowedToMerges { get; private set; } = null!;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        [Output("allowedToPushes")]
        public Output<ImmutableArray<Outputs.BranchProtectionAllowedToPush>> AllowedToPushes { get; private set; } = null!;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        [Output("allowedToUnprotects")]
        public Output<ImmutableArray<Outputs.BranchProtectionAllowedToUnprotect>> AllowedToUnprotects { get; private set; } = null!;

        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Output("branch")]
        public Output<string> Branch { get; private set; } = null!;

        /// <summary>
        /// The ID of the branch protection (not the branch name).
        /// </summary>
        [Output("branchProtectionId")]
        public Output<int> BranchProtectionId { get; private set; } = null!;

        /// <summary>
        /// Can be set to true to require code owner approval before merging. Only available own Premium and Ultimate instances.
        /// </summary>
        [Output("codeOwnerApprovalRequired")]
        public Output<bool?> CodeOwnerApprovalRequired { get; private set; } = null!;

        /// <summary>
        /// Access levels allowed to merge. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Output("mergeAccessLevel")]
        public Output<string?> MergeAccessLevel { get; private set; } = null!;

        /// <summary>
        /// The id of the project.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Access levels allowed to push. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Output("pushAccessLevel")]
        public Output<string?> PushAccessLevel { get; private set; } = null!;

        /// <summary>
        /// Access levels allowed to unprotect. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Output("unprotectAccessLevel")]
        public Output<string?> UnprotectAccessLevel { get; private set; } = null!;


        /// <summary>
        /// Create a BranchProtection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BranchProtection(string name, BranchProtectionArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/branchProtection:BranchProtection", name, args ?? new BranchProtectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BranchProtection(string name, Input<string> id, BranchProtectionState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/branchProtection:BranchProtection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BranchProtection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BranchProtection Get(string name, Input<string> id, BranchProtectionState? state = null, CustomResourceOptions? options = null)
        {
            return new BranchProtection(name, id, state, options);
        }
    }

    public sealed class BranchProtectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can be set to true to allow users with push access to force push.
        /// </summary>
        [Input("allowForcePush")]
        public Input<bool>? AllowForcePush { get; set; }

        [Input("allowedToMerges")]
        private InputList<Inputs.BranchProtectionAllowedToMergeArgs>? _allowedToMerges;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        public InputList<Inputs.BranchProtectionAllowedToMergeArgs> AllowedToMerges
        {
            get => _allowedToMerges ?? (_allowedToMerges = new InputList<Inputs.BranchProtectionAllowedToMergeArgs>());
            set => _allowedToMerges = value;
        }

        [Input("allowedToPushes")]
        private InputList<Inputs.BranchProtectionAllowedToPushArgs>? _allowedToPushes;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        public InputList<Inputs.BranchProtectionAllowedToPushArgs> AllowedToPushes
        {
            get => _allowedToPushes ?? (_allowedToPushes = new InputList<Inputs.BranchProtectionAllowedToPushArgs>());
            set => _allowedToPushes = value;
        }

        [Input("allowedToUnprotects")]
        private InputList<Inputs.BranchProtectionAllowedToUnprotectArgs>? _allowedToUnprotects;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        public InputList<Inputs.BranchProtectionAllowedToUnprotectArgs> AllowedToUnprotects
        {
            get => _allowedToUnprotects ?? (_allowedToUnprotects = new InputList<Inputs.BranchProtectionAllowedToUnprotectArgs>());
            set => _allowedToUnprotects = value;
        }

        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Input("branch", required: true)]
        public Input<string> Branch { get; set; } = null!;

        /// <summary>
        /// Can be set to true to require code owner approval before merging. Only available own Premium and Ultimate instances.
        /// </summary>
        [Input("codeOwnerApprovalRequired")]
        public Input<bool>? CodeOwnerApprovalRequired { get; set; }

        /// <summary>
        /// Access levels allowed to merge. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Input("mergeAccessLevel")]
        public Input<string>? MergeAccessLevel { get; set; }

        /// <summary>
        /// The id of the project.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Access levels allowed to push. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Input("pushAccessLevel")]
        public Input<string>? PushAccessLevel { get; set; }

        /// <summary>
        /// Access levels allowed to unprotect. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Input("unprotectAccessLevel")]
        public Input<string>? UnprotectAccessLevel { get; set; }

        public BranchProtectionArgs()
        {
        }
        public static new BranchProtectionArgs Empty => new BranchProtectionArgs();
    }

    public sealed class BranchProtectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can be set to true to allow users with push access to force push.
        /// </summary>
        [Input("allowForcePush")]
        public Input<bool>? AllowForcePush { get; set; }

        [Input("allowedToMerges")]
        private InputList<Inputs.BranchProtectionAllowedToMergeGetArgs>? _allowedToMerges;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        public InputList<Inputs.BranchProtectionAllowedToMergeGetArgs> AllowedToMerges
        {
            get => _allowedToMerges ?? (_allowedToMerges = new InputList<Inputs.BranchProtectionAllowedToMergeGetArgs>());
            set => _allowedToMerges = value;
        }

        [Input("allowedToPushes")]
        private InputList<Inputs.BranchProtectionAllowedToPushGetArgs>? _allowedToPushes;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        public InputList<Inputs.BranchProtectionAllowedToPushGetArgs> AllowedToPushes
        {
            get => _allowedToPushes ?? (_allowedToPushes = new InputList<Inputs.BranchProtectionAllowedToPushGetArgs>());
            set => _allowedToPushes = value;
        }

        [Input("allowedToUnprotects")]
        private InputList<Inputs.BranchProtectionAllowedToUnprotectGetArgs>? _allowedToUnprotects;

        /// <summary>
        /// Defines permissions for action.
        /// </summary>
        public InputList<Inputs.BranchProtectionAllowedToUnprotectGetArgs> AllowedToUnprotects
        {
            get => _allowedToUnprotects ?? (_allowedToUnprotects = new InputList<Inputs.BranchProtectionAllowedToUnprotectGetArgs>());
            set => _allowedToUnprotects = value;
        }

        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// The ID of the branch protection (not the branch name).
        /// </summary>
        [Input("branchProtectionId")]
        public Input<int>? BranchProtectionId { get; set; }

        /// <summary>
        /// Can be set to true to require code owner approval before merging. Only available own Premium and Ultimate instances.
        /// </summary>
        [Input("codeOwnerApprovalRequired")]
        public Input<bool>? CodeOwnerApprovalRequired { get; set; }

        /// <summary>
        /// Access levels allowed to merge. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Input("mergeAccessLevel")]
        public Input<string>? MergeAccessLevel { get; set; }

        /// <summary>
        /// The id of the project.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Access levels allowed to push. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Input("pushAccessLevel")]
        public Input<string>? PushAccessLevel { get; set; }

        /// <summary>
        /// Access levels allowed to unprotect. Valid values are: `no one`, `developer`, `maintainer`.
        /// </summary>
        [Input("unprotectAccessLevel")]
        public Input<string>? UnprotectAccessLevel { get; set; }

        public BranchProtectionState()
        {
        }
        public static new BranchProtectionState Empty => new BranchProtectionState();
    }
}
