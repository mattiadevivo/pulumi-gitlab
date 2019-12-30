// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    public static partial class Invokes
    {
        /// <summary>
        /// Provides details about a specific user in the gitlab provider. Especially the ability to lookup the id for linking to other resources.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-gitlab/blob/master/website/docs/d/user.html.markdown.
        /// </summary>
        public static Task<GetUserResult> GetUser(GetUserArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("gitlab:index/getUser:getUser", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetUserArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The e-mail address of the user. (Requires administrator privileges)
        /// </summary>
        [Input("email")]
        public string? Email { get; set; }

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Input("userId")]
        public int? UserId { get; set; }

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        public GetUserArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetUserResult
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
        /// The external UID of the user.
        /// </summary>
        public readonly string ExternUid;
        /// <summary>
        /// Whether the user is external.
        /// </summary>
        public readonly bool External;
        /// <summary>
        /// Whether the user is an admin.
        /// </summary>
        public readonly bool IsAdmin;
        /// <summary>
        /// Last user's sign-in date.
        /// </summary>
        public readonly string LastSignInAt;
        /// <summary>
        /// Linkedin profile of the user.
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
        /// Whether user's two factor auth is enabled.
        /// </summary>
        public readonly bool TwoFactorEnabled;
        public readonly int UserId;
        /// <summary>
        /// The UID provider of the user.
        /// </summary>
        public readonly string UserProvider;
        /// <summary>
        /// The username of the user.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// User's website URL.
        /// </summary>
        public readonly string WebsiteUrl;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetUserResult(
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
            bool isAdmin,
            string lastSignInAt,
            string linkedin,
            string location,
            string name,
            string organization,
            int projectsLimit,
            string skype,
            string state,
            int themeId,
            string twitter,
            bool twoFactorEnabled,
            int userId,
            string userProvider,
            string username,
            string websiteUrl,
            string id)
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
            IsAdmin = isAdmin;
            LastSignInAt = lastSignInAt;
            Linkedin = linkedin;
            Location = location;
            Name = name;
            Organization = organization;
            ProjectsLimit = projectsLimit;
            Skype = skype;
            State = state;
            ThemeId = themeId;
            Twitter = twitter;
            TwoFactorEnabled = twoFactorEnabled;
            UserId = userId;
            UserProvider = userProvider;
            Username = username;
            WebsiteUrl = websiteUrl;
            Id = id;
        }
    }
}
