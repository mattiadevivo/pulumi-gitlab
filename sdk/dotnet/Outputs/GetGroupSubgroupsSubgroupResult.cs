// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab.Outputs
{

    [OutputType]
    public sealed class GetGroupSubgroupsSubgroupResult
    {
        public readonly bool AutoDevopsEnabled;
        public readonly string AvatarUrl;
        public readonly string CreatedAt;
        public readonly int DefaultBranchProtection;
        public readonly string Description;
        public readonly bool EmailsDisabled;
        public readonly int FileTemplateProjectId;
        public readonly string FullName;
        public readonly string FullPath;
        /// <summary>
        /// The ID of the group.
        /// </summary>
        public readonly int GroupId;
        public readonly string IpRestrictionRanges;
        public readonly bool LfsEnabled;
        public readonly bool MentionsDisabled;
        public readonly string Name;
        public readonly int ParentId;
        public readonly string Path;
        public readonly string ProjectCreationLevel;
        public readonly bool RequestAccessEnabled;
        public readonly bool RequireTwoFactorAuthentication;
        public readonly bool ShareWithGroupLock;
        /// <summary>
        /// Include group statistics (administrators only).
        /// </summary>
        public readonly ImmutableDictionary<string, string> Statistics;
        public readonly string SubgroupCreationLevel;
        public readonly int TwoFactorGracePeriod;
        public readonly string Visibility;
        public readonly string WebUrl;

        [OutputConstructor]
        private GetGroupSubgroupsSubgroupResult(
            bool autoDevopsEnabled,

            string avatarUrl,

            string createdAt,

            int defaultBranchProtection,

            string description,

            bool emailsDisabled,

            int fileTemplateProjectId,

            string fullName,

            string fullPath,

            int groupId,

            string ipRestrictionRanges,

            bool lfsEnabled,

            bool mentionsDisabled,

            string name,

            int parentId,

            string path,

            string projectCreationLevel,

            bool requestAccessEnabled,

            bool requireTwoFactorAuthentication,

            bool shareWithGroupLock,

            ImmutableDictionary<string, string> statistics,

            string subgroupCreationLevel,

            int twoFactorGracePeriod,

            string visibility,

            string webUrl)
        {
            AutoDevopsEnabled = autoDevopsEnabled;
            AvatarUrl = avatarUrl;
            CreatedAt = createdAt;
            DefaultBranchProtection = defaultBranchProtection;
            Description = description;
            EmailsDisabled = emailsDisabled;
            FileTemplateProjectId = fileTemplateProjectId;
            FullName = fullName;
            FullPath = fullPath;
            GroupId = groupId;
            IpRestrictionRanges = ipRestrictionRanges;
            LfsEnabled = lfsEnabled;
            MentionsDisabled = mentionsDisabled;
            Name = name;
            ParentId = parentId;
            Path = path;
            ProjectCreationLevel = projectCreationLevel;
            RequestAccessEnabled = requestAccessEnabled;
            RequireTwoFactorAuthentication = requireTwoFactorAuthentication;
            ShareWithGroupLock = shareWithGroupLock;
            Statistics = statistics;
            SubgroupCreationLevel = subgroupCreationLevel;
            TwoFactorGracePeriod = twoFactorGracePeriod;
            Visibility = visibility;
            WebUrl = webUrl;
        }
    }
}
