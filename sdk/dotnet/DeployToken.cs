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
    /// The `gitlab.DeployToken` resource allows to manage the lifecycle of group and project deploy tokens.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/deploy_tokens.html)
    /// 
    /// ## Import
    /// 
    /// # GitLab deploy tokens can be imported using an id made up of `{type}:{type_id}:{deploy_token_id}`, where type is one ofproject, group.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/deployToken:DeployToken group_token group:1:3
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/deployToken:DeployToken project_token project:1:4
    /// ```
    /// 
    /// # Notethe `token` resource attribute is not available for imported resources as this information cannot be read from the GitLab API.
    /// </summary>
    [GitLabResourceType("gitlab:index/deployToken:DeployToken")]
    public partial class DeployToken : Pulumi.CustomResource
    {
        /// <summary>
        /// Time the token will expire it, RFC3339 format. Will not expire per default.
        /// </summary>
        [Output("expiresAt")]
        public Output<string?> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// The name or id of the group to add the deploy token to.
        /// </summary>
        [Output("group")]
        public Output<string?> Group { get; private set; } = null!;

        /// <summary>
        /// A name to describe the deploy token with.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name or id of the project to add the deploy token to.
        /// </summary>
        [Output("project")]
        public Output<string?> Project { get; private set; } = null!;

        /// <summary>
        /// Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
        /// </summary>
        [Output("scopes")]
        public Output<ImmutableArray<string>> Scopes { get; private set; } = null!;

        /// <summary>
        /// The secret token. This is only populated when creating a new deploy token. **Note**: The token is not available for
        /// imported resources.
        /// </summary>
        [Output("token")]
        public Output<string> Token { get; private set; } = null!;

        /// <summary>
        /// A username for the deploy token. Default is `gitlab+deploy-token-{n}`.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a DeployToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeployToken(string name, DeployTokenArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/deployToken:DeployToken", name, args ?? new DeployTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeployToken(string name, Input<string> id, DeployTokenState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/deployToken:DeployToken", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeployToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeployToken Get(string name, Input<string> id, DeployTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new DeployToken(name, id, state, options);
        }
    }

    public sealed class DeployTokenArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time the token will expire it, RFC3339 format. Will not expire per default.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// The name or id of the group to add the deploy token to.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// A name to describe the deploy token with.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name or id of the project to add the deploy token to.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("scopes", required: true)]
        private InputList<string>? _scopes;

        /// <summary>
        /// Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        /// <summary>
        /// A username for the deploy token. Default is `gitlab+deploy-token-{n}`.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public DeployTokenArgs()
        {
        }
    }

    public sealed class DeployTokenState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time the token will expire it, RFC3339 format. Will not expire per default.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// The name or id of the group to add the deploy token to.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// A name to describe the deploy token with.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name or id of the project to add the deploy token to.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        /// <summary>
        /// The secret token. This is only populated when creating a new deploy token. **Note**: The token is not available for
        /// imported resources.
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        /// <summary>
        /// A username for the deploy token. Default is `gitlab+deploy-token-{n}`.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public DeployTokenState()
        {
        }
    }
}
