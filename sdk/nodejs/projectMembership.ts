// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # gitlab\_project_membership
 *
 * This resource allows you to add a current user to an existing project with a set access level.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const test = new gitlab.ProjectMembership("test", {
 *     accessLevel: "guest",
 *     projectId: "12345",
 *     userId: 1337,
 * });
 * ```
 *
 * ## Import
 *
 * GitLab group membership can be imported using an id made up of `group_id:user_id`, e.g.
 *
 * ```sh
 *  $ pulumi import gitlab:index/projectMembership:ProjectMembership test "12345:1337"
 * ```
 */
export class ProjectMembership extends pulumi.CustomResource {
    /**
     * Get an existing ProjectMembership resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectMembershipState, opts?: pulumi.CustomResourceOptions): ProjectMembership {
        return new ProjectMembership(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/projectMembership:ProjectMembership';

    /**
     * Returns true if the given object is an instance of ProjectMembership.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectMembership {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectMembership.__pulumiType;
    }

    /**
     * One of five levels of access to the project.
     */
    public readonly accessLevel!: pulumi.Output<string>;
    /**
     * The id of the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The id of the user.
     */
    public readonly userId!: pulumi.Output<number>;

    /**
     * Create a ProjectMembership resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectMembershipArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectMembershipArgs | ProjectMembershipState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectMembershipState | undefined;
            inputs["accessLevel"] = state ? state.accessLevel : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as ProjectMembershipArgs | undefined;
            if ((!args || args.accessLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessLevel'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            inputs["accessLevel"] = args ? args.accessLevel : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["userId"] = args ? args.userId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ProjectMembership.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectMembership resources.
 */
export interface ProjectMembershipState {
    /**
     * One of five levels of access to the project.
     */
    readonly accessLevel?: pulumi.Input<string>;
    /**
     * The id of the project.
     */
    readonly projectId?: pulumi.Input<string>;
    /**
     * The id of the user.
     */
    readonly userId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ProjectMembership resource.
 */
export interface ProjectMembershipArgs {
    /**
     * One of five levels of access to the project.
     */
    readonly accessLevel: pulumi.Input<string>;
    /**
     * The id of the project.
     */
    readonly projectId: pulumi.Input<string>;
    /**
     * The id of the user.
     */
    readonly userId: pulumi.Input<number>;
}
