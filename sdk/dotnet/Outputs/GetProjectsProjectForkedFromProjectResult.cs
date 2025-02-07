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
    public sealed class GetProjectsProjectForkedFromProjectResult
    {
        public readonly string HttpUrlToRepo;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly int Id;
        public readonly string Name;
        public readonly string NameWithNamespace;
        public readonly string Path;
        public readonly string PathWithNamespace;
        public readonly string WebUrl;

        [OutputConstructor]
        private GetProjectsProjectForkedFromProjectResult(
            string httpUrlToRepo,

            int id,

            string name,

            string nameWithNamespace,

            string path,

            string pathWithNamespace,

            string webUrl)
        {
            HttpUrlToRepo = httpUrlToRepo;
            Id = id;
            Name = name;
            NameWithNamespace = nameWithNamespace;
            Path = path;
            PathWithNamespace = pathWithNamespace;
            WebUrl = webUrl;
        }
    }
}
