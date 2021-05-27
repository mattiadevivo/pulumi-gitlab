// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # gitlab\_group_membership
 *
 * This resource allows you to add a user to an existing group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const test = new gitlab.GroupMembership("test", {
 *     accessLevel: "guest",
 *     expiresAt: "2020-12-31",
 *     groupId: "12345",
 *     userId: 1337,
 * });
 * ```
 *
 * ## Import
 *
 * GitLab group membership can be imported using an id made up of `group_id:user_id`, e.g.
 *
 * ```sh
 *  $ pulumi import gitlab:index/groupMembership:GroupMembership test "12345:1337"
 * ```
 */
export class GroupMembership extends pulumi.CustomResource {
    /**
     * Get an existing GroupMembership resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupMembershipState, opts?: pulumi.CustomResourceOptions): GroupMembership {
        return new GroupMembership(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/groupMembership:GroupMembership';

    /**
     * Returns true if the given object is an instance of GroupMembership.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GroupMembership {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GroupMembership.__pulumiType;
    }

    /**
     * Acceptable values are: guest, reporter, developer, maintainer, owner.
     */
    public readonly accessLevel!: pulumi.Output<string>;
    /**
     * Expiration date for the group membership. Format: `YYYY-MM-DD`
     */
    public readonly expiresAt!: pulumi.Output<string | undefined>;
    /**
     * The id of the group.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The id of the user.
     */
    public readonly userId!: pulumi.Output<number>;

    /**
     * Create a GroupMembership resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupMembershipArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupMembershipArgs | GroupMembershipState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupMembershipState | undefined;
            inputs["accessLevel"] = state ? state.accessLevel : undefined;
            inputs["expiresAt"] = state ? state.expiresAt : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as GroupMembershipArgs | undefined;
            if ((!args || args.accessLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessLevel'");
            }
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            inputs["accessLevel"] = args ? args.accessLevel : undefined;
            inputs["expiresAt"] = args ? args.expiresAt : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["userId"] = args ? args.userId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(GroupMembership.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GroupMembership resources.
 */
export interface GroupMembershipState {
    /**
     * Acceptable values are: guest, reporter, developer, maintainer, owner.
     */
    accessLevel?: pulumi.Input<string>;
    /**
     * Expiration date for the group membership. Format: `YYYY-MM-DD`
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * The id of the group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * The id of the user.
     */
    userId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a GroupMembership resource.
 */
export interface GroupMembershipArgs {
    /**
     * Acceptable values are: guest, reporter, developer, maintainer, owner.
     */
    accessLevel: pulumi.Input<string>;
    /**
     * Expiration date for the group membership. Format: `YYYY-MM-DD`
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * The id of the group.
     */
    groupId: pulumi.Input<string>;
    /**
     * The id of the user.
     */
    userId: pulumi.Input<number>;
}
