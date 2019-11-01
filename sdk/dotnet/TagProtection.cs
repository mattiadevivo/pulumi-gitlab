// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gitlab
{
    /// <summary>
    /// This resource allows you to protect a specific tag or wildcard by an access level so that the user with less access level cannot Create the tags.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-gitlab/blob/master/website/docs/r/tag_protection.html.markdown.
    /// </summary>
    public partial class TagProtection : Pulumi.CustomResource
    {
        /// <summary>
        /// One of five levels of access to the project.
        /// </summary>
        [Output("createAccessLevel")]
        public Output<string> CreateAccessLevel { get; private set; } = null!;

        /// <summary>
        /// The id of the project.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Name of the tag or wildcard.
        /// </summary>
        [Output("tag")]
        public Output<string> Tag { get; private set; } = null!;


        /// <summary>
        /// Create a TagProtection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TagProtection(string name, TagProtectionArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/tagProtection:TagProtection", name, args, MakeResourceOptions(options, ""))
        {
        }

        private TagProtection(string name, Input<string> id, TagProtectionState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/tagProtection:TagProtection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TagProtection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TagProtection Get(string name, Input<string> id, TagProtectionState? state = null, CustomResourceOptions? options = null)
        {
            return new TagProtection(name, id, state, options);
        }
    }

    public sealed class TagProtectionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// One of five levels of access to the project.
        /// </summary>
        [Input("createAccessLevel", required: true)]
        public Input<string> CreateAccessLevel { get; set; } = null!;

        /// <summary>
        /// The id of the project.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Name of the tag or wildcard.
        /// </summary>
        [Input("tag", required: true)]
        public Input<string> Tag { get; set; } = null!;

        public TagProtectionArgs()
        {
        }
    }

    public sealed class TagProtectionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// One of five levels of access to the project.
        /// </summary>
        [Input("createAccessLevel")]
        public Input<string>? CreateAccessLevel { get; set; }

        /// <summary>
        /// The id of the project.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Name of the tag or wildcard.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        public TagProtectionState()
        {
        }
    }
}
