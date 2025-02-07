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
    public sealed class ProjectTagCommit
    {
        public readonly string? AuthorEmail;
        public readonly string? AuthorName;
        public readonly string? AuthoredDate;
        public readonly string? CommittedDate;
        public readonly string? CommitterEmail;
        public readonly string? CommitterName;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The message of the annotated tag.
        /// </summary>
        public readonly string? Message;
        public readonly ImmutableArray<string> ParentIds;
        public readonly string? ShortId;
        public readonly string? Title;

        [OutputConstructor]
        private ProjectTagCommit(
            string? authorEmail,

            string? authorName,

            string? authoredDate,

            string? committedDate,

            string? committerEmail,

            string? committerName,

            string? id,

            string? message,

            ImmutableArray<string> parentIds,

            string? shortId,

            string? title)
        {
            AuthorEmail = authorEmail;
            AuthorName = authorName;
            AuthoredDate = authoredDate;
            CommittedDate = committedDate;
            CommitterEmail = committerEmail;
            CommitterName = committerName;
            Id = id;
            Message = message;
            ParentIds = parentIds;
            ShortId = shortId;
            Title = title;
        }
    }
}
