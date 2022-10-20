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
    public sealed class GetUsersUserResult
    {
        public readonly string AvatarUrl;
        public readonly string Bio;
        public readonly bool CanCreateGroup;
        public readonly bool CanCreateProject;
        public readonly int ColorSchemeId;
        public readonly string CreatedAt;
        public readonly string CurrentSignInAt;
        public readonly string Email;
        /// <summary>
        /// Lookup users by external UID. (Requires administrator privileges)
        /// </summary>
        public readonly string ExternUid;
        public readonly bool External;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly int Id;
        public readonly bool IsAdmin;
        public readonly string LastSignInAt;
        public readonly string Linkedin;
        public readonly string Location;
        public readonly string Name;
        public readonly int NamespaceId;
        public readonly string Organization;
        public readonly int ProjectsLimit;
        public readonly string Provider;
        public readonly string Skype;
        public readonly string State;
        public readonly int ThemeId;
        public readonly string Twitter;
        public readonly bool TwoFactorEnabled;
        public readonly string Username;
        public readonly string WebsiteUrl;

        [OutputConstructor]
        private GetUsersUserResult(
            string avatarUrl,

            string bio,

            bool canCreateGroup,

            bool canCreateProject,

            int colorSchemeId,

            string createdAt,

            string currentSignInAt,

            string email,

            string externUid,

            bool external,

            int id,

            bool isAdmin,

            string lastSignInAt,

            string linkedin,

            string location,

            string name,

            int namespaceId,

            string organization,

            int projectsLimit,

            string provider,

            string skype,

            string state,

            int themeId,

            string twitter,

            bool twoFactorEnabled,

            string username,

            string websiteUrl)
        {
            AvatarUrl = avatarUrl;
            Bio = bio;
            CanCreateGroup = canCreateGroup;
            CanCreateProject = canCreateProject;
            ColorSchemeId = colorSchemeId;
            CreatedAt = createdAt;
            CurrentSignInAt = currentSignInAt;
            Email = email;
            ExternUid = externUid;
            External = external;
            Id = id;
            IsAdmin = isAdmin;
            LastSignInAt = lastSignInAt;
            Linkedin = linkedin;
            Location = location;
            Name = name;
            NamespaceId = namespaceId;
            Organization = organization;
            ProjectsLimit = projectsLimit;
            Provider = provider;
            Skype = skype;
            State = state;
            ThemeId = themeId;
            Twitter = twitter;
            TwoFactorEnabled = twoFactorEnabled;
            Username = username;
            WebsiteUrl = websiteUrl;
        }
    }
}
