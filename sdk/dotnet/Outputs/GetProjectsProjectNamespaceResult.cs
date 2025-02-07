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
    public sealed class GetProjectsProjectNamespaceResult
    {
        public readonly string FullPath;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly int Id;
        public readonly string Kind;
        public readonly string Name;
        public readonly string Path;

        [OutputConstructor]
        private GetProjectsProjectNamespaceResult(
            string fullPath,

            int id,

            string kind,

            string name,

            string path)
        {
            FullPath = fullPath;
            Id = id;
            Kind = kind;
            Name = name;
            Path = path;
        }
    }
}
