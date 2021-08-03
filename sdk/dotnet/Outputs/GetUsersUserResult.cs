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
        /// <summary>
        /// The avatar URL of the user.
        /// </summary>
        public readonly string AvatarUrl;
        /// <summary>
        /// The bio of the user.
        /// </summary>
        public readonly string Bio;
        /// <summary>
        /// Whether the user can create groups.
        /// </summary>
        public readonly bool CanCreateGroup;
        /// <summary>
        /// Whether the user can create projects.
        /// </summary>
        public readonly bool CanCreateProject;
        /// <summary>
        /// User's color scheme ID.
        /// </summary>
        public readonly int ColorSchemeId;
        /// <summary>
        /// Date the user was created at.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Current user's sign-in date.
        /// </summary>
        public readonly string CurrentSignInAt;
        /// <summary>
        /// The e-mail address of the user.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// Lookup users by external UID. (Requires administrator privileges)
        /// </summary>
        public readonly string ExternUid;
        /// <summary>
        /// Whether the user is external.
        /// </summary>
        public readonly bool External;
        /// <summary>
        /// The unique id assigned to the user by the gitlab server.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// Whether the user is an admin.
        /// </summary>
        public readonly bool IsAdmin;
        /// <summary>
        /// Last user's sign-in date.
        /// </summary>
        public readonly string LastSignInAt;
        /// <summary>
        /// LinkedIn profile of the user.
        /// </summary>
        public readonly string Linkedin;
        /// <summary>
        /// The location of the user.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The name of the user.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The organization of the user.
        /// </summary>
        public readonly string Organization;
        /// <summary>
        /// Number of projects the user can create.
        /// </summary>
        public readonly int ProjectsLimit;
        /// <summary>
        /// The UID provider of the user.
        /// </summary>
        public readonly string Provider;
        /// <summary>
        /// Skype username of the user.
        /// </summary>
        public readonly string Skype;
        /// <summary>
        /// Whether the user is active or blocked.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// User's theme ID.
        /// </summary>
        public readonly int ThemeId;
        /// <summary>
        /// Twitter username of the user.
        /// </summary>
        public readonly string Twitter;
        /// <summary>
        /// Whether user's two-factor auth is enabled.
        /// </summary>
        public readonly bool TwoFactorEnabled;
        /// <summary>
        /// The username of the user.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// User's website URL.
        /// </summary>
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
