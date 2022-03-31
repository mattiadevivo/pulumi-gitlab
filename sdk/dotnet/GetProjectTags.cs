// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public static class GetProjectTags
    {
        /// <summary>
        /// The `gitlab.getProjectTags` data source allows details of project tags to be retrieved by some search criteria.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/tags.html#list-project-repository-tags)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using GitLab = Pulumi.GitLab;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(GitLab.GetProjectTags.InvokeAsync(new GitLab.GetProjectTagsArgs
        ///         {
        ///             Project = "foo/bar",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectTagsResult> InvokeAsync(GetProjectTagsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProjectTagsResult>("gitlab:index/getProjectTags:getProjectTags", args ?? new GetProjectTagsArgs(), options.WithDefaults());

        /// <summary>
        /// The `gitlab.getProjectTags` data source allows details of project tags to be retrieved by some search criteria.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/tags.html#list-project-repository-tags)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using GitLab = Pulumi.GitLab;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(GitLab.GetProjectTags.InvokeAsync(new GitLab.GetProjectTagsArgs
        ///         {
        ///             Project = "foo/bar",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProjectTagsResult> Invoke(GetProjectTagsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetProjectTagsResult>("gitlab:index/getProjectTags:getProjectTags", args ?? new GetProjectTagsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectTagsArgs : Pulumi.InvokeArgs
    {
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        [Input("search")]
        public string? Search { get; set; }

        [Input("sort")]
        public string? Sort { get; set; }

        public GetProjectTagsArgs()
        {
        }
    }

    public sealed class GetProjectTagsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("search")]
        public Input<string>? Search { get; set; }

        [Input("sort")]
        public Input<string>? Sort { get; set; }

        public GetProjectTagsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetProjectTagsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OrderBy;
        public readonly string Project;
        public readonly string? Search;
        public readonly string? Sort;
        public readonly ImmutableArray<Outputs.GetProjectTagsTagResult> Tags;

        [OutputConstructor]
        private GetProjectTagsResult(
            string id,

            string? orderBy,

            string project,

            string? search,

            string? sort,

            ImmutableArray<Outputs.GetProjectTagsTagResult> tags)
        {
            Id = id;
            OrderBy = orderBy;
            Project = project;
            Search = search;
            Sort = sort;
            Tags = tags;
        }
    }
}
