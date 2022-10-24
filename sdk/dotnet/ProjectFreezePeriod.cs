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
    /// The `gitlab.ProjectFreezePeriod` resource allows to manage the lifecycle of a freeze period for a project.
    /// 
    /// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/freeze_periods.html)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using GitLab = Pulumi.GitLab;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var schedule = new GitLab.ProjectFreezePeriod("schedule", new()
    ///     {
    ///         ProjectId = gitlab_project.Foo.Id,
    ///         FreezeStart = "0 23 * * 5",
    ///         FreezeEnd = "0 7 * * 1",
    ///         CronTimezone = "UTC",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GitLab project freeze periods can be imported using an id made up of `project_id:freeze_period_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gitlab:index/projectFreezePeriod:ProjectFreezePeriod schedule "12345:1337"
    /// ```
    /// </summary>
    [GitLabResourceType("gitlab:index/projectFreezePeriod:ProjectFreezePeriod")]
    public partial class ProjectFreezePeriod : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The timezone.
        /// </summary>
        [Output("cronTimezone")]
        public Output<string?> CronTimezone { get; private set; } = null!;

        /// <summary>
        /// End of the Freeze Period in cron format (e.g. `0 2 * * *`).
        /// </summary>
        [Output("freezeEnd")]
        public Output<string> FreezeEnd { get; private set; } = null!;

        /// <summary>
        /// Start of the Freeze Period in cron format (e.g. `0 1 * * *`).
        /// </summary>
        [Output("freezeStart")]
        public Output<string> FreezeStart { get; private set; } = null!;

        /// <summary>
        /// The id of the project to add the schedule to.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectFreezePeriod resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectFreezePeriod(string name, ProjectFreezePeriodArgs args, CustomResourceOptions? options = null)
            : base("gitlab:index/projectFreezePeriod:ProjectFreezePeriod", name, args ?? new ProjectFreezePeriodArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectFreezePeriod(string name, Input<string> id, ProjectFreezePeriodState? state = null, CustomResourceOptions? options = null)
            : base("gitlab:index/projectFreezePeriod:ProjectFreezePeriod", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectFreezePeriod resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectFreezePeriod Get(string name, Input<string> id, ProjectFreezePeriodState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectFreezePeriod(name, id, state, options);
        }
    }

    public sealed class ProjectFreezePeriodArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timezone.
        /// </summary>
        [Input("cronTimezone")]
        public Input<string>? CronTimezone { get; set; }

        /// <summary>
        /// End of the Freeze Period in cron format (e.g. `0 2 * * *`).
        /// </summary>
        [Input("freezeEnd", required: true)]
        public Input<string> FreezeEnd { get; set; } = null!;

        /// <summary>
        /// Start of the Freeze Period in cron format (e.g. `0 1 * * *`).
        /// </summary>
        [Input("freezeStart", required: true)]
        public Input<string> FreezeStart { get; set; } = null!;

        /// <summary>
        /// The id of the project to add the schedule to.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public ProjectFreezePeriodArgs()
        {
        }
        public static new ProjectFreezePeriodArgs Empty => new ProjectFreezePeriodArgs();
    }

    public sealed class ProjectFreezePeriodState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timezone.
        /// </summary>
        [Input("cronTimezone")]
        public Input<string>? CronTimezone { get; set; }

        /// <summary>
        /// End of the Freeze Period in cron format (e.g. `0 2 * * *`).
        /// </summary>
        [Input("freezeEnd")]
        public Input<string>? FreezeEnd { get; set; }

        /// <summary>
        /// Start of the Freeze Period in cron format (e.g. `0 1 * * *`).
        /// </summary>
        [Input("freezeStart")]
        public Input<string>? FreezeStart { get; set; }

        /// <summary>
        /// The id of the project to add the schedule to.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public ProjectFreezePeriodState()
        {
        }
        public static new ProjectFreezePeriodState Empty => new ProjectFreezePeriodState();
    }
}
