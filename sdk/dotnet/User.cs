// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab
{
    /// <summary>
    /// The `gitlab.User` resource allows to manage the lifecycle of a user.
    /// 
    /// &gt; the provider needs to be configured with admin-level access for this resource to work.
    /// 
    /// &gt; You must specify either password or reset_password.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/users.html)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using GitLab = Pulumi.GitLab;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new GitLab.User("example", new GitLab.UserArgs
    ///         {
    ///             CanCreateGroup = false,
    ///             Email = "gitlab@user.create",
    ///             IsAdmin = true,
    ///             IsExternal = true,
    ///             Password = "superPassword",
    ///             ProjectsLimit = 4,
    ///             ResetPassword = false,
    ///             Username = "example",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/user:User # You can import a user to terraform state using `&lt;resource&gt; &lt;id&gt;`.
    /// ```
    /// 
    /// # The `id` must be an integer for the id of the user you want to import, # for example
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/user:User example 42
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/user:User")]
    public partial class User : Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean, defaults to false. Whether to allow the user to create groups.
        /// </summary>
        [Output("canCreateGroup")]
        public Output<bool?> CanCreateGroup { get; private set; } = null!;

        /// <summary>
        /// The e-mail address of the user.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// Boolean, defaults to false.  Whether to enable administrative privileges
        /// </summary>
        [Output("isAdmin")]
        public Output<bool?> IsAdmin { get; private set; } = null!;

        /// <summary>
        /// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
        /// </summary>
        [Output("isExternal")]
        public Output<bool?> IsExternal { get; private set; } = null!;

        /// <summary>
        /// The name of the user.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The note associated to the user.
        /// </summary>
        [Output("note")]
        public Output<string?> Note { get; private set; } = null!;

        /// <summary>
        /// The password of the user.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Integer, defaults to 0.  Number of projects user can create.
        /// </summary>
        [Output("projectsLimit")]
        public Output<int?> ProjectsLimit { get; private set; } = null!;

        /// <summary>
        /// Boolean, defaults to false. Send user password reset link.
        /// </summary>
        [Output("resetPassword")]
        public Output<bool?> ResetPassword { get; private set; } = null!;

        /// <summary>
        /// Boolean, defaults to true. Whether to skip confirmation.
        /// </summary>
        [Output("skipConfirmation")]
        public Output<bool?> SkipConfirmation { get; private set; } = null!;

        /// <summary>
        /// String, defaults to 'active'. The state of the user account. Valid values are `active`, `deactivated`, `blocked`.
        /// </summary>
        [Output("state")]
        public Output<string?> State { get; private set; } = null!;

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/user:User", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean, defaults to false. Whether to allow the user to create groups.
        /// </summary>
        [Input("canCreateGroup")]
        public Input<bool>? CanCreateGroup { get; set; }

        /// <summary>
        /// The e-mail address of the user.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// Boolean, defaults to false.  Whether to enable administrative privileges
        /// </summary>
        [Input("isAdmin")]
        public Input<bool>? IsAdmin { get; set; }

        /// <summary>
        /// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
        /// </summary>
        [Input("isExternal")]
        public Input<bool>? IsExternal { get; set; }

        /// <summary>
        /// The name of the user.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The note associated to the user.
        /// </summary>
        [Input("note")]
        public Input<string>? Note { get; set; }

        /// <summary>
        /// The password of the user.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Integer, defaults to 0.  Number of projects user can create.
        /// </summary>
        [Input("projectsLimit")]
        public Input<int>? ProjectsLimit { get; set; }

        /// <summary>
        /// Boolean, defaults to false. Send user password reset link.
        /// </summary>
        [Input("resetPassword")]
        public Input<bool>? ResetPassword { get; set; }

        /// <summary>
        /// Boolean, defaults to true. Whether to skip confirmation.
        /// </summary>
        [Input("skipConfirmation")]
        public Input<bool>? SkipConfirmation { get; set; }

        /// <summary>
        /// String, defaults to 'active'. The state of the user account. Valid values are `active`, `deactivated`, `blocked`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public UserArgs()
        {
        }
    }

    public sealed class UserState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean, defaults to false. Whether to allow the user to create groups.
        /// </summary>
        [Input("canCreateGroup")]
        public Input<bool>? CanCreateGroup { get; set; }

        /// <summary>
        /// The e-mail address of the user.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Boolean, defaults to false.  Whether to enable administrative privileges
        /// </summary>
        [Input("isAdmin")]
        public Input<bool>? IsAdmin { get; set; }

        /// <summary>
        /// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
        /// </summary>
        [Input("isExternal")]
        public Input<bool>? IsExternal { get; set; }

        /// <summary>
        /// The name of the user.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The note associated to the user.
        /// </summary>
        [Input("note")]
        public Input<string>? Note { get; set; }

        /// <summary>
        /// The password of the user.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Integer, defaults to 0.  Number of projects user can create.
        /// </summary>
        [Input("projectsLimit")]
        public Input<int>? ProjectsLimit { get; set; }

        /// <summary>
        /// Boolean, defaults to false. Send user password reset link.
        /// </summary>
        [Input("resetPassword")]
        public Input<bool>? ResetPassword { get; set; }

        /// <summary>
        /// Boolean, defaults to true. Whether to skip confirmation.
        /// </summary>
        [Input("skipConfirmation")]
        public Input<bool>? SkipConfirmation { get; set; }

        /// <summary>
        /// String, defaults to 'active'. The state of the user account. Valid values are `active`, `deactivated`, `blocked`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public UserState()
        {
        }
    }
}
