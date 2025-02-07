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
    public sealed class GetRepositoryTreeTreeResult
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        public readonly string Mode;
        public readonly string Name;
        /// <summary>
        /// The path inside repository. Used to get content of subdirectories.
        /// </summary>
        public readonly string Path;
        public readonly string Type;

        [OutputConstructor]
        private GetRepositoryTreeTreeResult(
            string id,

            string mode,

            string name,

            string path,

            string type)
        {
            Id = id;
            Mode = mode;
            Name = name;
            Path = path;
            Type = type;
        }
    }
}
