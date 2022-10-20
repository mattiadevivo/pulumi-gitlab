// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `gitlabProjectLevelMrApprovalRule` resource allows to manage the lifecycle of a Merge Request-level approval rule.
 *
 * > This resource requires a GitLab Enterprise instance.
 *
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/merge_request_approvals.html#merge-request-level-mr-approvals)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const fooProject = new gitlab.Project("fooProject", {description: "My example project"});
 * const fooProjectLevelMrApprovals = new gitlab.ProjectLevelMrApprovals("fooProjectLevelMrApprovals", {
 *     projectId: fooProject.id,
 *     resetApprovalsOnPush: true,
 *     disableOverridingApproversPerMergeRequest: false,
 *     mergeRequestsAuthorApproval: false,
 *     mergeRequestsDisableCommittersApproval: true,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals You can import an approval configuration state using `<resource> <project_id>`.
 * ```
 *
 * # For example
 *
 * ```sh
 *  $ pulumi import gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals foo 1234
 * ```
 */
export class ProjectLevelMrApprovals extends pulumi.CustomResource {
    /**
     * Get an existing ProjectLevelMrApprovals resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectLevelMrApprovalsState, opts?: pulumi.CustomResourceOptions): ProjectLevelMrApprovals {
        return new ProjectLevelMrApprovals(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals';

    /**
     * Returns true if the given object is an instance of ProjectLevelMrApprovals.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectLevelMrApprovals {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectLevelMrApprovals.__pulumiType;
    }

    /**
     * By default, users are able to edit the approval rules in merge requests. If set to true,
     */
    public readonly disableOverridingApproversPerMergeRequest!: pulumi.Output<boolean | undefined>;
    /**
     * Set to `true` if you want to allow merge request authors to self-approve merge requests. Authors
     */
    public readonly mergeRequestsAuthorApproval!: pulumi.Output<boolean | undefined>;
    /**
     * Set to `true` if you want to prevent approval of merge requests by merge request committers.
     */
    public readonly mergeRequestsDisableCommittersApproval!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the project to change MR approval configuration.
     */
    public readonly projectId!: pulumi.Output<number>;
    /**
     * Set to `true` if you want to require authentication when approving a merge request.
     */
    public readonly requirePasswordToApprove!: pulumi.Output<boolean | undefined>;
    /**
     * Set to `true` if you want to remove all approvals in a merge request when new commits are pushed to its source branch. Default is `true`.
     */
    public readonly resetApprovalsOnPush!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ProjectLevelMrApprovals resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectLevelMrApprovalsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectLevelMrApprovalsArgs | ProjectLevelMrApprovalsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectLevelMrApprovalsState | undefined;
            resourceInputs["disableOverridingApproversPerMergeRequest"] = state ? state.disableOverridingApproversPerMergeRequest : undefined;
            resourceInputs["mergeRequestsAuthorApproval"] = state ? state.mergeRequestsAuthorApproval : undefined;
            resourceInputs["mergeRequestsDisableCommittersApproval"] = state ? state.mergeRequestsDisableCommittersApproval : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["requirePasswordToApprove"] = state ? state.requirePasswordToApprove : undefined;
            resourceInputs["resetApprovalsOnPush"] = state ? state.resetApprovalsOnPush : undefined;
        } else {
            const args = argsOrState as ProjectLevelMrApprovalsArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["disableOverridingApproversPerMergeRequest"] = args ? args.disableOverridingApproversPerMergeRequest : undefined;
            resourceInputs["mergeRequestsAuthorApproval"] = args ? args.mergeRequestsAuthorApproval : undefined;
            resourceInputs["mergeRequestsDisableCommittersApproval"] = args ? args.mergeRequestsDisableCommittersApproval : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["requirePasswordToApprove"] = args ? args.requirePasswordToApprove : undefined;
            resourceInputs["resetApprovalsOnPush"] = args ? args.resetApprovalsOnPush : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectLevelMrApprovals.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectLevelMrApprovals resources.
 */
export interface ProjectLevelMrApprovalsState {
    /**
     * By default, users are able to edit the approval rules in merge requests. If set to true,
     */
    disableOverridingApproversPerMergeRequest?: pulumi.Input<boolean>;
    /**
     * Set to `true` if you want to allow merge request authors to self-approve merge requests. Authors
     */
    mergeRequestsAuthorApproval?: pulumi.Input<boolean>;
    /**
     * Set to `true` if you want to prevent approval of merge requests by merge request committers.
     */
    mergeRequestsDisableCommittersApproval?: pulumi.Input<boolean>;
    /**
     * The ID of the project to change MR approval configuration.
     */
    projectId?: pulumi.Input<number>;
    /**
     * Set to `true` if you want to require authentication when approving a merge request.
     */
    requirePasswordToApprove?: pulumi.Input<boolean>;
    /**
     * Set to `true` if you want to remove all approvals in a merge request when new commits are pushed to its source branch. Default is `true`.
     */
    resetApprovalsOnPush?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ProjectLevelMrApprovals resource.
 */
export interface ProjectLevelMrApprovalsArgs {
    /**
     * By default, users are able to edit the approval rules in merge requests. If set to true,
     */
    disableOverridingApproversPerMergeRequest?: pulumi.Input<boolean>;
    /**
     * Set to `true` if you want to allow merge request authors to self-approve merge requests. Authors
     */
    mergeRequestsAuthorApproval?: pulumi.Input<boolean>;
    /**
     * Set to `true` if you want to prevent approval of merge requests by merge request committers.
     */
    mergeRequestsDisableCommittersApproval?: pulumi.Input<boolean>;
    /**
     * The ID of the project to change MR approval configuration.
     */
    projectId: pulumi.Input<number>;
    /**
     * Set to `true` if you want to require authentication when approving a merge request.
     */
    requirePasswordToApprove?: pulumi.Input<boolean>;
    /**
     * Set to `true` if you want to remove all approvals in a merge request when new commits are pushed to its source branch. Default is `true`.
     */
    resetApprovalsOnPush?: pulumi.Input<boolean>;
}
