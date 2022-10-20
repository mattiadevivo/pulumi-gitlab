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
    public sealed class GetReleaseLinksReleaseLinkResult
    {
        public readonly string DirectAssetUrl;
        public readonly bool External;
        public readonly string Filepath;
        public readonly int LinkId;
        public readonly string LinkType;
        public readonly string Name;
        /// <summary>
        /// The ID or full path to the project.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// The tag associated with the Release.
        /// </summary>
        public readonly string TagName;
        public readonly string Url;

        [OutputConstructor]
        private GetReleaseLinksReleaseLinkResult(
            string directAssetUrl,

            bool external,

            string filepath,

            int linkId,

            string linkType,

            string name,

            string project,

            string tagName,

            string url)
        {
            DirectAssetUrl = directAssetUrl;
            External = external;
            Filepath = filepath;
            LinkId = linkId;
            LinkType = linkType;
            Name = name;
            Project = project;
            TagName = tagName;
            Url = url;
        }
    }
}
