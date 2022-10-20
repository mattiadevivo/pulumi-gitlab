// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `gitlab.ServiceMicrosoftTeams` resource allows to manage the lifecycle of a project integration with Microsoft Teams.
 *
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/integrations.html#microsoft-teams)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const awesomeProject = new gitlab.Project("awesomeProject", {
 *     description: "My awesome project.",
 *     visibilityLevel: "public",
 * });
 * const teams = new gitlab.ServiceMicrosoftTeams("teams", {
 *     project: awesomeProject.id,
 *     webhook: "https://testurl.com/?token=XYZ",
 *     pushEvents: true,
 * });
 * ```
 *
 * ## Import
 *
 * You can import a service_microsoft_teams state using the project ID, e.g.
 *
 * ```sh
 *  $ pulumi import gitlab:index/serviceMicrosoftTeams:ServiceMicrosoftTeams teams 1
 * ```
 */
export class ServiceMicrosoftTeams extends pulumi.CustomResource {
    /**
     * Get an existing ServiceMicrosoftTeams resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceMicrosoftTeamsState, opts?: pulumi.CustomResourceOptions): ServiceMicrosoftTeams {
        return new ServiceMicrosoftTeams(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/serviceMicrosoftTeams:ServiceMicrosoftTeams';

    /**
     * Returns true if the given object is an instance of ServiceMicrosoftTeams.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceMicrosoftTeams {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceMicrosoftTeams.__pulumiType;
    }

    /**
     * Whether the integration is active.
     */
    public /*out*/ readonly active!: pulumi.Output<boolean>;
    /**
     * Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
     */
    public readonly branchesToBeNotified!: pulumi.Output<string | undefined>;
    /**
     * Enable notifications for confidential issue events
     */
    public readonly confidentialIssuesEvents!: pulumi.Output<boolean | undefined>;
    /**
     * Enable notifications for confidential note events
     */
    public readonly confidentialNoteEvents!: pulumi.Output<boolean | undefined>;
    /**
     * Create time.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Enable notifications for issue events
     */
    public readonly issuesEvents!: pulumi.Output<boolean | undefined>;
    /**
     * Enable notifications for merge request events
     */
    public readonly mergeRequestsEvents!: pulumi.Output<boolean | undefined>;
    /**
     * Enable notifications for note events
     */
    public readonly noteEvents!: pulumi.Output<boolean | undefined>;
    /**
     * Send notifications for broken pipelines
     */
    public readonly notifyOnlyBrokenPipelines!: pulumi.Output<boolean | undefined>;
    /**
     * Enable notifications for pipeline events
     */
    public readonly pipelineEvents!: pulumi.Output<boolean | undefined>;
    /**
     * ID of the project you want to activate integration on.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Enable notifications for push events
     */
    public readonly pushEvents!: pulumi.Output<boolean | undefined>;
    /**
     * Enable notifications for tag push events
     */
    public readonly tagPushEvents!: pulumi.Output<boolean | undefined>;
    /**
     * Update time.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
     */
    public readonly webhook!: pulumi.Output<string>;
    /**
     * Enable notifications for wiki page events
     */
    public readonly wikiPageEvents!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ServiceMicrosoftTeams resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceMicrosoftTeamsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceMicrosoftTeamsArgs | ServiceMicrosoftTeamsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceMicrosoftTeamsState | undefined;
            resourceInputs["active"] = state ? state.active : undefined;
            resourceInputs["branchesToBeNotified"] = state ? state.branchesToBeNotified : undefined;
            resourceInputs["confidentialIssuesEvents"] = state ? state.confidentialIssuesEvents : undefined;
            resourceInputs["confidentialNoteEvents"] = state ? state.confidentialNoteEvents : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["issuesEvents"] = state ? state.issuesEvents : undefined;
            resourceInputs["mergeRequestsEvents"] = state ? state.mergeRequestsEvents : undefined;
            resourceInputs["noteEvents"] = state ? state.noteEvents : undefined;
            resourceInputs["notifyOnlyBrokenPipelines"] = state ? state.notifyOnlyBrokenPipelines : undefined;
            resourceInputs["pipelineEvents"] = state ? state.pipelineEvents : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pushEvents"] = state ? state.pushEvents : undefined;
            resourceInputs["tagPushEvents"] = state ? state.tagPushEvents : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["webhook"] = state ? state.webhook : undefined;
            resourceInputs["wikiPageEvents"] = state ? state.wikiPageEvents : undefined;
        } else {
            const args = argsOrState as ServiceMicrosoftTeamsArgs | undefined;
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.webhook === undefined) && !opts.urn) {
                throw new Error("Missing required property 'webhook'");
            }
            resourceInputs["branchesToBeNotified"] = args ? args.branchesToBeNotified : undefined;
            resourceInputs["confidentialIssuesEvents"] = args ? args.confidentialIssuesEvents : undefined;
            resourceInputs["confidentialNoteEvents"] = args ? args.confidentialNoteEvents : undefined;
            resourceInputs["issuesEvents"] = args ? args.issuesEvents : undefined;
            resourceInputs["mergeRequestsEvents"] = args ? args.mergeRequestsEvents : undefined;
            resourceInputs["noteEvents"] = args ? args.noteEvents : undefined;
            resourceInputs["notifyOnlyBrokenPipelines"] = args ? args.notifyOnlyBrokenPipelines : undefined;
            resourceInputs["pipelineEvents"] = args ? args.pipelineEvents : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["pushEvents"] = args ? args.pushEvents : undefined;
            resourceInputs["tagPushEvents"] = args ? args.tagPushEvents : undefined;
            resourceInputs["webhook"] = args ? args.webhook : undefined;
            resourceInputs["wikiPageEvents"] = args ? args.wikiPageEvents : undefined;
            resourceInputs["active"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceMicrosoftTeams.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceMicrosoftTeams resources.
 */
export interface ServiceMicrosoftTeamsState {
    /**
     * Whether the integration is active.
     */
    active?: pulumi.Input<boolean>;
    /**
     * Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
     */
    branchesToBeNotified?: pulumi.Input<string>;
    /**
     * Enable notifications for confidential issue events
     */
    confidentialIssuesEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for confidential note events
     */
    confidentialNoteEvents?: pulumi.Input<boolean>;
    /**
     * Create time.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Enable notifications for issue events
     */
    issuesEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for merge request events
     */
    mergeRequestsEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for note events
     */
    noteEvents?: pulumi.Input<boolean>;
    /**
     * Send notifications for broken pipelines
     */
    notifyOnlyBrokenPipelines?: pulumi.Input<boolean>;
    /**
     * Enable notifications for pipeline events
     */
    pipelineEvents?: pulumi.Input<boolean>;
    /**
     * ID of the project you want to activate integration on.
     */
    project?: pulumi.Input<string>;
    /**
     * Enable notifications for push events
     */
    pushEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for tag push events
     */
    tagPushEvents?: pulumi.Input<boolean>;
    /**
     * Update time.
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
     */
    webhook?: pulumi.Input<string>;
    /**
     * Enable notifications for wiki page events
     */
    wikiPageEvents?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ServiceMicrosoftTeams resource.
 */
export interface ServiceMicrosoftTeamsArgs {
    /**
     * Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
     */
    branchesToBeNotified?: pulumi.Input<string>;
    /**
     * Enable notifications for confidential issue events
     */
    confidentialIssuesEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for confidential note events
     */
    confidentialNoteEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for issue events
     */
    issuesEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for merge request events
     */
    mergeRequestsEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for note events
     */
    noteEvents?: pulumi.Input<boolean>;
    /**
     * Send notifications for broken pipelines
     */
    notifyOnlyBrokenPipelines?: pulumi.Input<boolean>;
    /**
     * Enable notifications for pipeline events
     */
    pipelineEvents?: pulumi.Input<boolean>;
    /**
     * ID of the project you want to activate integration on.
     */
    project: pulumi.Input<string>;
    /**
     * Enable notifications for push events
     */
    pushEvents?: pulumi.Input<boolean>;
    /**
     * Enable notifications for tag push events
     */
    tagPushEvents?: pulumi.Input<boolean>;
    /**
     * The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
     */
    webhook: pulumi.Input<string>;
    /**
     * Enable notifications for wiki page events
     */
    wikiPageEvents?: pulumi.Input<boolean>;
}
