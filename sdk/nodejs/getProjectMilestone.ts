// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `gitlab.ProjectMilestone` data source allows get details of a project milestone.
 *
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/milestones.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const example = gitlab.getProjectMilestone({
 *     milestoneId: 10,
 *     project: "foo/bar",
 * });
 * ```
 */
export function getProjectMilestone(args: GetProjectMilestoneArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectMilestoneResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gitlab:index/getProjectMilestone:getProjectMilestone", {
        "milestoneId": args.milestoneId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectMilestone.
 */
export interface GetProjectMilestoneArgs {
    /**
     * The instance-wide ID of the project’s milestone.
     */
    milestoneId: number;
    /**
     * The ID or URL-encoded path of the project owned by the authenticated user.
     */
    project: string;
}

/**
 * A collection of values returned by getProjectMilestone.
 */
export interface GetProjectMilestoneResult {
    /**
     * The time of creation of the milestone. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z.
     */
    readonly createdAt: string;
    /**
     * The description of the milestone.
     */
    readonly description: string;
    /**
     * The due date of the milestone. Date time string in the format YYYY-MM-DD, for example 2016-03-11.
     */
    readonly dueDate: string;
    /**
     * Bool, true if milestore expired.
     */
    readonly expired: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the project's milestone.
     */
    readonly iid: number;
    /**
     * The instance-wide ID of the project’s milestone.
     */
    readonly milestoneId: number;
    /**
     * The ID or URL-encoded path of the project owned by the authenticated user.
     */
    readonly project: string;
    /**
     * The project ID of milestone.
     */
    readonly projectId: number;
    /**
     * The start date of the milestone. Date time string in the format YYYY-MM-DD, for example 2016-03-11.
     */
    readonly startDate: string;
    /**
     * The state of the milestone. Valid values are: `active`, `closed`.
     */
    readonly state: string;
    /**
     * The title of a milestone.
     */
    readonly title: string;
    /**
     * The last update time of the milestone. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z.
     */
    readonly updatedAt: string;
    /**
     * The web URL of the milestone.
     */
    readonly webUrl: string;
}
/**
 * The `gitlab.ProjectMilestone` data source allows get details of a project milestone.
 *
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/milestones.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const example = gitlab.getProjectMilestone({
 *     milestoneId: 10,
 *     project: "foo/bar",
 * });
 * ```
 */
export function getProjectMilestoneOutput(args: GetProjectMilestoneOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProjectMilestoneResult> {
    return pulumi.output(args).apply((a: any) => getProjectMilestone(a, opts))
}

/**
 * A collection of arguments for invoking getProjectMilestone.
 */
export interface GetProjectMilestoneOutputArgs {
    /**
     * The instance-wide ID of the project’s milestone.
     */
    milestoneId: pulumi.Input<number>;
    /**
     * The ID or URL-encoded path of the project owned by the authenticated user.
     */
    project: pulumi.Input<string>;
}
