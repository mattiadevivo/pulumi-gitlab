// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GitLab.Inputs
{

    public sealed class BranchProtectionAllowedToPushGetArgs : Pulumi.ResourceArgs
    {
        [Input("accessLevel")]
        public Input<string>? AccessLevel { get; set; }

        [Input("accessLevelDescription")]
        public Input<string>? AccessLevelDescription { get; set; }

        /// <summary>
        /// The ID of a GitLab group allowed to perform the relevant action. Mutually exclusive with `user_id`.
        /// </summary>
        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        /// <summary>
        /// The ID of a GitLab user allowed to perform the relevant action. Mutually exclusive with `group_id`.
        /// </summary>
        [Input("userId")]
        public Input<int>? UserId { get; set; }

        public BranchProtectionAllowedToPushGetArgs()
        {
        }
    }
}
