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
    public sealed class ProjectProtectedEnvironmentDeployAccessLevel
    {
        /// <summary>
        /// Levels of access required to deploy to this protected environment. Valid values are `developer`, `maintainer`.
        /// </summary>
        public readonly string? AccessLevel;
        /// <summary>
        /// Readable description of level of access.
        /// </summary>
        public readonly string? AccessLevelDescription;
        /// <summary>
        /// The ID of the group allowed to deploy to this protected environment. The project must be shared with the group.
        /// </summary>
        public readonly int? GroupId;
        /// <summary>
        /// The ID of the user allowed to deploy to this protected environment. The user must be a member of the project.
        /// </summary>
        public readonly int? UserId;

        [OutputConstructor]
        private ProjectProtectedEnvironmentDeployAccessLevel(
            string? accessLevel,

            string? accessLevelDescription,

            int? groupId,

            int? userId)
        {
            AccessLevel = accessLevel;
            AccessLevelDescription = accessLevelDescription;
            GroupId = groupId;
            UserId = userId;
        }
    }
}
