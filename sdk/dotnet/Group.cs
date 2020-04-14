// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public partial class Group : Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The full name of the group.
        /// </summary>
        [Output("fullName")]
        public Output<string> FullName { get; private set; } = null!;

        /// <summary>
        /// The full path of the group.
        /// </summary>
        [Output("fullPath")]
        public Output<string> FullPath { get; private set; } = null!;

        /// <summary>
        /// Boolean, defaults to true.  Whether to enable LFS
        /// support for projects in this group.
        /// </summary>
        [Output("lfsEnabled")]
        public Output<bool?> LfsEnabled { get; private set; } = null!;

        /// <summary>
        /// The name of this group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Integer, id of the parent group (creates a nested group).
        /// </summary>
        [Output("parentId")]
        public Output<int?> ParentId { get; private set; } = null!;

        /// <summary>
        /// The path of the group.
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        /// <summary>
        /// Boolean, defaults to false.  Whether to
        /// enable users to request access to the group.
        /// </summary>
        [Output("requestAccessEnabled")]
        public Output<bool?> RequestAccessEnabled { get; private set; } = null!;

        /// <summary>
        /// The group level registration token to use during runner setup.
        /// </summary>
        [Output("runnersToken")]
        public Output<string> RunnersToken { get; private set; } = null!;

        /// <summary>
        /// Set to `public` to create a public group.
        /// Valid values are `private`, `internal`, `public`.
        /// Groups are created as private by default.
        /// </summary>
        [Output("visibilityLevel")]
        public Output<string> VisibilityLevel { get; private set; } = null!;

        /// <summary>
        /// Web URL of the group.
        /// </summary>
        [Output("webUrl")]
        public Output<string> WebUrl { get; private set; } = null!;


        /// <summary>
        /// Create a Group resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Group(string name, GroupArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/group:Group", name, args ?? new GroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Group(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/group:Group", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Group resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Group Get(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
        {
            return new Group(name, id, state, options);
        }
    }

    public sealed class GroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Boolean, defaults to true.  Whether to enable LFS
        /// support for projects in this group.
        /// </summary>
        [Input("lfsEnabled")]
        public Input<bool>? LfsEnabled { get; set; }

        /// <summary>
        /// The name of this group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Integer, id of the parent group (creates a nested group).
        /// </summary>
        [Input("parentId")]
        public Input<int>? ParentId { get; set; }

        /// <summary>
        /// The path of the group.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Boolean, defaults to false.  Whether to
        /// enable users to request access to the group.
        /// </summary>
        [Input("requestAccessEnabled")]
        public Input<bool>? RequestAccessEnabled { get; set; }

        /// <summary>
        /// Set to `public` to create a public group.
        /// Valid values are `private`, `internal`, `public`.
        /// Groups are created as private by default.
        /// </summary>
        [Input("visibilityLevel")]
        public Input<string>? VisibilityLevel { get; set; }

        public GroupArgs()
        {
        }
    }

    public sealed class GroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The full name of the group.
        /// </summary>
        [Input("fullName")]
        public Input<string>? FullName { get; set; }

        /// <summary>
        /// The full path of the group.
        /// </summary>
        [Input("fullPath")]
        public Input<string>? FullPath { get; set; }

        /// <summary>
        /// Boolean, defaults to true.  Whether to enable LFS
        /// support for projects in this group.
        /// </summary>
        [Input("lfsEnabled")]
        public Input<bool>? LfsEnabled { get; set; }

        /// <summary>
        /// The name of this group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Integer, id of the parent group (creates a nested group).
        /// </summary>
        [Input("parentId")]
        public Input<int>? ParentId { get; set; }

        /// <summary>
        /// The path of the group.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Boolean, defaults to false.  Whether to
        /// enable users to request access to the group.
        /// </summary>
        [Input("requestAccessEnabled")]
        public Input<bool>? RequestAccessEnabled { get; set; }

        /// <summary>
        /// The group level registration token to use during runner setup.
        /// </summary>
        [Input("runnersToken")]
        public Input<string>? RunnersToken { get; set; }

        /// <summary>
        /// Set to `public` to create a public group.
        /// Valid values are `private`, `internal`, `public`.
        /// Groups are created as private by default.
        /// </summary>
        [Input("visibilityLevel")]
        public Input<string>? VisibilityLevel { get; set; }

        /// <summary>
        /// Web URL of the group.
        /// </summary>
        [Input("webUrl")]
        public Input<string>? WebUrl { get; set; }

        public GroupState()
        {
        }
    }
}
