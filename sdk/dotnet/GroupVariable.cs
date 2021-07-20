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
    /// ## # gitlab\_group\_variable
    /// 
    /// This resource allows you to create and manage CI/CD variables for your GitLab groups.
    /// For further information on variables, consult the [gitlab
    /// documentation](https://docs.gitlab.com/ce/ci/variables/README.html#variables).
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
    ///         var example = new GitLab.GroupVariable("example", new GitLab.GroupVariableArgs
    ///         {
    ///             Group = "12345",
    ///             Key = "group_variable_key",
    ///             Masked = false,
    ///             Protected = false,
    ///             Value = "group_variable_value",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// GitLab group variables can be imported using an id made up of `groupid:variablename`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/groupVariable:GroupVariable example 12345:group_variable_key
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/groupVariable:GroupVariable")]
    public partial class GroupVariable : Pulumi.CustomResource
    {
        /// <summary>
        /// The name or id of the group to add the hook to.
        /// </summary>
        [Output("group")]
        public Output<string> Group { get; private set; } = null!;

        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
        /// </summary>
        [Output("masked")]
        public Output<bool?> Masked { get; private set; } = null!;

        /// <summary>
        /// If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
        /// </summary>
        [Output("protected")]
        public Output<bool?> Protected { get; private set; } = null!;

        /// <summary>
        /// The value of the variable.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;

        /// <summary>
        /// The type of a variable. Available types are: env_var (default) and file.
        /// </summary>
        [Output("variableType")]
        public Output<string?> VariableType { get; private set; } = null!;


        /// <summary>
        /// Create a GroupVariable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GroupVariable(string name, GroupVariableArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/groupVariable:GroupVariable", name, args ?? new GroupVariableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GroupVariable(string name, Input<string> id, GroupVariableState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/groupVariable:GroupVariable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GroupVariable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GroupVariable Get(string name, Input<string> id, GroupVariableState? state = null, CustomResourceOptions? options = null)
        {
            return new GroupVariable(name, id, state, options);
        }
    }

    public sealed class GroupVariableArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name or id of the group to add the hook to.
        /// </summary>
        [Input("group", required: true)]
        public Input<string> Group { get; set; } = null!;

        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
        /// </summary>
        [Input("masked")]
        public Input<bool>? Masked { get; set; }

        /// <summary>
        /// If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
        /// </summary>
        [Input("protected")]
        public Input<bool>? Protected { get; set; }

        /// <summary>
        /// The value of the variable.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        /// <summary>
        /// The type of a variable. Available types are: env_var (default) and file.
        /// </summary>
        [Input("variableType")]
        public Input<string>? VariableType { get; set; }

        public GroupVariableArgs()
        {
        }
    }

    public sealed class GroupVariableState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name or id of the group to add the hook to.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
        /// </summary>
        [Input("masked")]
        public Input<bool>? Masked { get; set; }

        /// <summary>
        /// If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
        /// </summary>
        [Input("protected")]
        public Input<bool>? Protected { get; set; }

        /// <summary>
        /// The value of the variable.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// The type of a variable. Available types are: env_var (default) and file.
        /// </summary>
        [Input("variableType")]
        public Input<string>? VariableType { get; set; }

        public GroupVariableState()
        {
        }
    }
}
