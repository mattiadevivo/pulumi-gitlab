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
    /// The `gitlab.GroupBadge` resource allows to mange the lifecycle of group badges.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/user/project/badges.html#group-badges)
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
    ///     var foo = new GitLab.Group("foo");
    /// 
    ///     var example = new GitLab.GroupBadge("example", new()
    ///     {
    ///         Group = foo.Id,
    ///         LinkUrl = "https://example.com/badge-123",
    ///         ImageUrl = "https://example.com/badge-123.svg",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GitLab group badges can be imported using an id made up of `{group_id}:{badge_id}`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/groupBadge:GroupBadge foo 1:3
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/groupBadge:GroupBadge")]
    public partial class GroupBadge : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the group to add the badge to.
        /// </summary>
        [Output("group")]
        public Output<string> Group { get; private set; } = null!;

        /// <summary>
        /// The image url which will be presented on group overview.
        /// </summary>
        [Output("imageUrl")]
        public Output<string> ImageUrl { get; private set; } = null!;

        /// <summary>
        /// The url linked with the badge.
        /// </summary>
        [Output("linkUrl")]
        public Output<string> LinkUrl { get; private set; } = null!;

        /// <summary>
        /// The image_url argument rendered (in case of use of placeholders).
        /// </summary>
        [Output("renderedImageUrl")]
        public Output<string> RenderedImageUrl { get; private set; } = null!;

        /// <summary>
        /// The link_url argument rendered (in case of use of placeholders).
        /// </summary>
        [Output("renderedLinkUrl")]
        public Output<string> RenderedLinkUrl { get; private set; } = null!;


        /// <summary>
        /// Create a GroupBadge resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GroupBadge(string name, GroupBadgeArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/groupBadge:GroupBadge", name, args ?? new GroupBadgeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GroupBadge(string name, Input<string> id, GroupBadgeState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/groupBadge:GroupBadge", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GroupBadge resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GroupBadge Get(string name, Input<string> id, GroupBadgeState? state = null, CustomResourceOptions? options = null)
        {
            return new GroupBadge(name, id, state, options);
        }
    }

    public sealed class GroupBadgeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the group to add the badge to.
        /// </summary>
        [Input("group", required: true)]
        public Input<string> Group { get; set; } = null!;

        /// <summary>
        /// The image url which will be presented on group overview.
        /// </summary>
        [Input("imageUrl", required: true)]
        public Input<string> ImageUrl { get; set; } = null!;

        /// <summary>
        /// The url linked with the badge.
        /// </summary>
        [Input("linkUrl", required: true)]
        public Input<string> LinkUrl { get; set; } = null!;

        public GroupBadgeArgs()
        {
        }
        public static new GroupBadgeArgs Empty => new GroupBadgeArgs();
    }

    public sealed class GroupBadgeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the group to add the badge to.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// The image url which will be presented on group overview.
        /// </summary>
        [Input("imageUrl")]
        public Input<string>? ImageUrl { get; set; }

        /// <summary>
        /// The url linked with the badge.
        /// </summary>
        [Input("linkUrl")]
        public Input<string>? LinkUrl { get; set; }

        /// <summary>
        /// The image_url argument rendered (in case of use of placeholders).
        /// </summary>
        [Input("renderedImageUrl")]
        public Input<string>? RenderedImageUrl { get; set; }

        /// <summary>
        /// The link_url argument rendered (in case of use of placeholders).
        /// </summary>
        [Input("renderedLinkUrl")]
        public Input<string>? RenderedLinkUrl { get; set; }

        public GroupBadgeState()
        {
        }
        public static new GroupBadgeState Empty => new GroupBadgeState();
    }
}
