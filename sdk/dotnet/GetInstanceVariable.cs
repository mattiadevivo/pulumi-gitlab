// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public static class GetInstanceVariable
    {
        /// <summary>
        /// The `gitlab.InstanceVariable` data source allows to retrieve details about an instance-level CI/CD variable.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/instance_level_ci_variables.html)
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
        ///     var foo = GitLab.GetInstanceVariable.Invoke(new()
        ///     {
        ///         Key = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceVariableResult> InvokeAsync(GetInstanceVariableArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceVariableResult>("gitlab:index/getInstanceVariable:getInstanceVariable", args ?? new GetInstanceVariableArgs(), options.WithDefaults());

        /// <summary>
        /// The `gitlab.InstanceVariable` data source allows to retrieve details about an instance-level CI/CD variable.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/instance_level_ci_variables.html)
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
        ///     var foo = GitLab.GetInstanceVariable.Invoke(new()
        ///     {
        ///         Key = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceVariableResult> Invoke(GetInstanceVariableInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceVariableResult>("gitlab:index/getInstanceVariable:getInstanceVariable", args ?? new GetInstanceVariableInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        public GetInstanceVariableArgs()
        {
        }
        public static new GetInstanceVariableArgs Empty => new GetInstanceVariableArgs();
    }

    public sealed class GetInstanceVariableInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        public GetInstanceVariableInvokeArgs()
        {
        }
        public static new GetInstanceVariableInvokeArgs Empty => new GetInstanceVariableInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceVariableResult
    {
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
        private GetInstanceVariableResult(
            string id,

            string key,

            bool masked,

            bool @protected,

            string value,

            string variableType)
        {
            Id = id;
            Key = key;
            Masked = masked;
            Protected = @protected;
            Value = value;
            VariableType = variableType;
        }
    }
}
