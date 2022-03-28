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
    /// The `gitlab.GroupCustomAttribute` resource allows to manage custom attributes for a group.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/custom_attributes.html)
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
    ///         var attr = new GitLab.GroupCustomAttribute("attr", new GitLab.GroupCustomAttributeArgs
    ///         {
    ///             Group = 42,
    ///             Key = "location",
    ///             Value = "Greenland",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// # You can import a group custom attribute using the an id made up of `{group-id}:{key}`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/groupCustomAttribute:GroupCustomAttribute attr 42:location
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/groupCustomAttribute:GroupCustomAttribute")]
    public partial class GroupCustomAttribute : Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the group.
        /// </summary>
        [Output("group")]
        public Output<int> Group { get; private set; } = null!;

        /// <summary>
        /// Key for the Custom Attribute.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// Value for the Custom Attribute.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a GroupCustomAttribute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GroupCustomAttribute(string name, GroupCustomAttributeArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/groupCustomAttribute:GroupCustomAttribute", name, args ?? new GroupCustomAttributeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GroupCustomAttribute(string name, Input<string> id, GroupCustomAttributeState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/groupCustomAttribute:GroupCustomAttribute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GroupCustomAttribute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GroupCustomAttribute Get(string name, Input<string> id, GroupCustomAttributeState? state = null, CustomResourceOptions? options = null)
        {
            return new GroupCustomAttribute(name, id, state, options);
        }
    }

    public sealed class GroupCustomAttributeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the group.
        /// </summary>
        [Input("group", required: true)]
        public Input<int> Group { get; set; } = null!;

        /// <summary>
        /// Key for the Custom Attribute.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Value for the Custom Attribute.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public GroupCustomAttributeArgs()
        {
        }
    }

    public sealed class GroupCustomAttributeState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the group.
        /// </summary>
        [Input("group")]
        public Input<int>? Group { get; set; }

        /// <summary>
        /// Key for the Custom Attribute.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Value for the Custom Attribute.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public GroupCustomAttributeState()
        {
        }
    }
}
