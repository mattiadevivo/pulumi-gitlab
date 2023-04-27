// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public static class GetInstanceVariables
    {
        /// <summary>
        /// The `gitlab.getInstanceVariables` data source allows to retrieve all instance-level CI/CD variables.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/instance_level_ci_variables.html)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using GitLab = Pulumi.GitLab;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var vars = GitLab.GetInstanceVariables.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceVariablesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceVariablesResult>("gitlab:index/getInstanceVariables:getInstanceVariables", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetInstanceVariablesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of variables returned by the search
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceVariablesVariableResult> Variables;

        [OutputConstructor]
        private GetInstanceVariablesResult(
            string id,

            ImmutableArray<Outputs.GetInstanceVariablesVariableResult> variables)
        {
            Id = id;
            Variables = variables;
        }
    }
}
