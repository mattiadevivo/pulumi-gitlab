// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public static class GetGroupVariable
    {
        /// <summary>
        /// The `gitlab.GroupVariable` data source allows to retrieve details about a group-level CI/CD variable.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/group_level_variables.html)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using GitLab = Pulumi.GitLab;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = GitLab.GetGroupVariable.Invoke(new()
        ///     {
        ///         Group = "my/example/group",
        ///         Key = "foo",
        ///     });
        /// 
        ///     var bar = GitLab.GetGroupVariable.Invoke(new()
        ///     {
        ///         EnvironmentScope = "staging/*",
        ///         Group = "my/example/group",
        ///         Key = "bar",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGroupVariableResult> InvokeAsync(GetGroupVariableArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGroupVariableResult>("gitlab:index/getGroupVariable:getGroupVariable", args ?? new GetGroupVariableArgs(), options.WithDefaults());

        /// <summary>
        /// The `gitlab.GroupVariable` data source allows to retrieve details about a group-level CI/CD variable.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/group_level_variables.html)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using GitLab = Pulumi.GitLab;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = GitLab.GetGroupVariable.Invoke(new()
        ///     {
        ///         Group = "my/example/group",
        ///         Key = "foo",
        ///     });
        /// 
        ///     var bar = GitLab.GetGroupVariable.Invoke(new()
        ///     {
        ///         EnvironmentScope = "staging/*",
        ///         Group = "my/example/group",
        ///         Key = "bar",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGroupVariableResult> Invoke(GetGroupVariableInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGroupVariableResult>("gitlab:index/getGroupVariable:getGroupVariable", args ?? new GetGroupVariableInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGroupVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The environment scope of the variable. Defaults to all environment (`*`). Note that in Community Editions of Gitlab, values other than `*` will cause inconsistent plans.
        /// </summary>
        [Input("environmentScope")]
        public string? EnvironmentScope { get; set; }

        /// <summary>
        /// The name or id of the group.
        /// </summary>
        [Input("group", required: true)]
        public string Group { get; set; } = null!;

        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        public GetGroupVariableArgs()
        {
        }
        public static new GetGroupVariableArgs Empty => new GetGroupVariableArgs();
    }

    public sealed class GetGroupVariableInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The environment scope of the variable. Defaults to all environment (`*`). Note that in Community Editions of Gitlab, values other than `*` will cause inconsistent plans.
        /// </summary>
        [Input("environmentScope")]
        public Input<string>? EnvironmentScope { get; set; }

        /// <summary>
        /// The name or id of the group.
        /// </summary>
        [Input("group", required: true)]
        public Input<string> Group { get; set; } = null!;

        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        public GetGroupVariableInvokeArgs()
        {
        }
        public static new GetGroupVariableInvokeArgs Empty => new GetGroupVariableInvokeArgs();
    }


    [OutputType]
    public sealed class GetGroupVariableResult
    {
        /// <summary>
        /// The environment scope of the variable. Defaults to all environment (`*`). Note that in Community Editions of Gitlab, values other than `*` will cause inconsistent plans.
        /// </summary>
        public readonly string EnvironmentScope;
        /// <summary>
        /// The name or id of the group.
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the variable.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
        /// </summary>
        public readonly bool Masked;
        /// <summary>
        /// If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
        /// </summary>
        public readonly bool Protected;
        /// <summary>
        /// The value of the variable.
        /// </summary>
        public readonly string Value;
        /// <summary>
        /// The type of a variable. Valid values are: `env_var`, `file`. Default is `env_var`.
        /// </summary>
        public readonly string VariableType;

        [OutputConstructor]
        private GetGroupVariableResult(
            string environmentScope,

            string group,

            string id,

            string key,

            bool masked,

            bool @protected,

            string value,

            string variableType)
        {
            EnvironmentScope = environmentScope;
            Group = group;
            Id = id;
            Key = key;
            Masked = masked;
            Protected = @protected;
            Value = value;
            VariableType = variableType;
        }
    }
}
