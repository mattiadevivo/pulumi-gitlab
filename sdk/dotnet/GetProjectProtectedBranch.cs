// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public static class GetProjectProtectedBranch
    {
        /// <summary>
        /// The `gitlab_protected_branch` data source allows details of a protected branch to be retrieved by its name and the project it belongs to.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/protected_branches.html#get-a-single-protected-branch-or-wildcard-protected-branch)
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
        ///     var example = GitLab.GetProjectProtectedBranch.Invoke(new()
        ///     {
        ///         Name = "main",
        ///         ProjectId = "foo/bar/baz",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectProtectedBranchResult> InvokeAsync(GetProjectProtectedBranchArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectProtectedBranchResult>("gitlab:index/getProjectProtectedBranch:getProjectProtectedBranch", args ?? new GetProjectProtectedBranchArgs(), options.WithDefaults());

        /// <summary>
        /// The `gitlab_protected_branch` data source allows details of a protected branch to be retrieved by its name and the project it belongs to.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/protected_branches.html#get-a-single-protected-branch-or-wildcard-protected-branch)
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
        ///     var example = GitLab.GetProjectProtectedBranch.Invoke(new()
        ///     {
        ///         Name = "main",
        ///         ProjectId = "foo/bar/baz",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProjectProtectedBranchResult> Invoke(GetProjectProtectedBranchInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectProtectedBranchResult>("gitlab:index/getProjectProtectedBranch:getProjectProtectedBranch", args ?? new GetProjectProtectedBranchInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectProtectedBranchArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the protected branch.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The integer or path with namespace that uniquely identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetProjectProtectedBranchArgs()
        {
        }
        public static new GetProjectProtectedBranchArgs Empty => new GetProjectProtectedBranchArgs();
    }

    public sealed class GetProjectProtectedBranchInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the protected branch.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The integer or path with namespace that uniquely identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetProjectProtectedBranchInvokeArgs()
        {
        }
        public static new GetProjectProtectedBranchInvokeArgs Empty => new GetProjectProtectedBranchInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectProtectedBranchResult
    {
        /// <summary>
        /// Whether force push is allowed.
        /// </summary>
        public readonly bool AllowForcePush;
        /// <summary>
        /// Reject code pushes that change files listed in the CODEOWNERS file.
        /// </summary>
        public readonly bool CodeOwnerApprovalRequired;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// Describes which access levels, users, or groups are allowed to perform the action.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectProtectedBranchMergeAccessLevelResult> MergeAccessLevels;
        /// <summary>
        /// The name of the protected branch.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The integer or path with namespace that uniquely identifies the project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Describes which access levels, users, or groups are allowed to perform the action.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectProtectedBranchPushAccessLevelResult> PushAccessLevels;

        [OutputConstructor]
        private GetProjectProtectedBranchResult(
            bool allowForcePush,

            bool codeOwnerApprovalRequired,

            int id,

            ImmutableArray<Outputs.GetProjectProtectedBranchMergeAccessLevelResult> mergeAccessLevels,

            string name,

            string projectId,

            ImmutableArray<Outputs.GetProjectProtectedBranchPushAccessLevelResult> pushAccessLevels)
        {
            AllowForcePush = allowForcePush;
            CodeOwnerApprovalRequired = codeOwnerApprovalRequired;
            Id = id;
            MergeAccessLevels = mergeAccessLevels;
            Name = name;
            ProjectId = projectId;
            PushAccessLevels = pushAccessLevels;
        }
    }
}
