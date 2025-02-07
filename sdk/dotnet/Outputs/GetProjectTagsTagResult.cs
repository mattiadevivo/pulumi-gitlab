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
    public sealed class GetProjectTagsTagResult
    {
        public readonly ImmutableArray<Outputs.GetProjectTagsTagCommitResult> Commits;
        public readonly string Message;
        public readonly string Name;
        public readonly bool Protected;
        public readonly ImmutableArray<Outputs.GetProjectTagsTagReleaseResult> Releases;
        public readonly string Target;

        [OutputConstructor]
        private GetProjectTagsTagResult(
            ImmutableArray<Outputs.GetProjectTagsTagCommitResult> commits,

            string message,

            string name,

            bool @protected,

            ImmutableArray<Outputs.GetProjectTagsTagReleaseResult> releases,

            string target)
        {
            Commits = commits;
            Message = message;
            Name = name;
            Protected = @protected;
            Releases = releases;
            Target = target;
        }
    }
}
