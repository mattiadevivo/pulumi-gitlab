// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public static class GetGroup
    {
        /// <summary>
        /// The `gitlab.Group` data source allows details of a group to be retrieved by its id or full path.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#details-of-a-group)
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
        ///     var foo = GitLab.GetGroup.Invoke(new()
        ///     {
        ///         FullPath = "foo/bar",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGroupResult> InvokeAsync(GetGroupArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGroupResult>("gitlab:index/getGroup:getGroup", args ?? new GetGroupArgs(), options.WithDefaults());

        /// <summary>
        /// The `gitlab.Group` data source allows details of a group to be retrieved by its id or full path.
        /// 
        /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#details-of-a-group)
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
        ///     var foo = GitLab.GetGroup.Invoke(new()
        ///     {
        ///         FullPath = "foo/bar",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGroupResult> Invoke(GetGroupInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGroupResult>("gitlab:index/getGroup:getGroup", args ?? new GetGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The full path of the group.
        /// </summary>
        [Input("fullPath")]
        public string? FullPath { get; set; }

        /// <summary>
        /// The ID of the group.
        /// </summary>
        [Input("groupId")]
        public int? GroupId { get; set; }

        public GetGroupArgs()
        {
        }
        public static new GetGroupArgs Empty => new GetGroupArgs();
    }

    public sealed class GetGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The full path of the group.
        /// </summary>
        [Input("fullPath")]
        public Input<string>? FullPath { get; set; }

        /// <summary>
        /// The ID of the group.
        /// </summary>
        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        public GetGroupInvokeArgs()
        {
        }
        public static new GetGroupInvokeArgs Empty => new GetGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetGroupResult
    {
        /// <summary>
        /// Whether developers and maintainers can push to the applicable default branch.
        /// </summary>
        public readonly int DefaultBranchProtection;
        /// <summary>
        /// The description of the group.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Can be set by administrators only. Additional CI/CD minutes for this group.
        /// </summary>
        public readonly int ExtraSharedRunnersMinutesLimit;
        /// <summary>
        /// The full name of the group.
        /// </summary>
        public readonly string FullName;
        /// <summary>
        /// The full path of the group.
        /// </summary>
        public readonly string FullPath;
        /// <summary>
        /// The ID of the group.
        /// </summary>
        public readonly int GroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Boolean, is LFS enabled for projects in this group.
        /// </summary>
        public readonly bool LfsEnabled;
        /// <summary>
        /// Users cannot be added to projects in this group.
        /// </summary>
        public readonly bool MembershipLock;
        /// <summary>
        /// The name of this group.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Integer, ID of the parent group.
        /// </summary>
        public readonly int ParentId;
        /// <summary>
        /// The path of the group.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// When enabled, users can not fork projects from this group to external namespaces.
        /// </summary>
        public readonly bool PreventForkingOutsideGroup;
        /// <summary>
        /// Boolean, is request for access enabled to the group.
        /// </summary>
        public readonly bool RequestAccessEnabled;
        /// <summary>
        /// The group level registration token to use during runner setup.
        /// </summary>
        public readonly string RunnersToken;
        /// <summary>
        /// Can be set by administrators only. Maximum number of monthly CI/CD minutes for this group. Can be nil (default; inherit system default), 0 (unlimited), or &gt; 0.
        /// </summary>
        public readonly int SharedRunnersMinutesLimit;
        /// <summary>
        /// Visibility level of the group. Possible values are `private`, `internal`, `public`.
        /// </summary>
        public readonly string VisibilityLevel;
        /// <summary>
        /// Web URL of the group.
        /// </summary>
        public readonly string WebUrl;

        [OutputConstructor]
        private GetGroupResult(
            int defaultBranchProtection,

            string description,

            int extraSharedRunnersMinutesLimit,

            string fullName,

            string fullPath,

            int groupId,

            string id,

            bool lfsEnabled,

            bool membershipLock,

            string name,

            int parentId,

            string path,

            bool preventForkingOutsideGroup,

            bool requestAccessEnabled,

            string runnersToken,

            int sharedRunnersMinutesLimit,

            string visibilityLevel,

            string webUrl)
        {
            DefaultBranchProtection = defaultBranchProtection;
            Description = description;
            ExtraSharedRunnersMinutesLimit = extraSharedRunnersMinutesLimit;
            FullName = fullName;
            FullPath = fullPath;
            GroupId = groupId;
            Id = id;
            LfsEnabled = lfsEnabled;
            MembershipLock = membershipLock;
            Name = name;
            ParentId = parentId;
            Path = path;
            PreventForkingOutsideGroup = preventForkingOutsideGroup;
            RequestAccessEnabled = requestAccessEnabled;
            RunnersToken = runnersToken;
            SharedRunnersMinutesLimit = sharedRunnersMinutesLimit;
            VisibilityLevel = visibilityLevel;
            WebUrl = webUrl;
        }
    }
}
