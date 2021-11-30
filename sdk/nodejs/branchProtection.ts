// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## # gitlab\_branch\_protection
 *
 * This resource allows you to protect a specific branch by an access level so that the user with less access level cannot Merge/Push to the branch.
 *
 * > The `allowedToPush`, `allowedToMerge` and `codeOwnerApprovalRequired` arguments require a GitLab Premium account or above.  Please refer to [Gitlab API documentation](https://docs.gitlab.com/ee/api/protected_branches.html) for further information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const branchProtect = new gitlab.BranchProtection("BranchProtect", {
 *     allowedToMerges: [
 *         {
 *             userId: 15,
 *         },
 *         {
 *             userId: 37,
 *         },
 *     ],
 *     allowedToPushes: [
 *         {
 *             userId: 5,
 *         },
 *         {
 *             userId: 521,
 *         },
 *     ],
 *     branch: "BranchProtected",
 *     codeOwnerApprovalRequired: true,
 *     mergeAccessLevel: "developer",
 *     project: "12345",
 *     pushAccessLevel: "developer",
 * });
 * ```
 * ### Example using dynamic block
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const main = new gitlab.BranchProtection("main", {
 *     project: "12345",
 *     branch: "main",
 *     pushAccessLevel: "maintainer",
 *     mergeAccessLevel: "maintainer",
 *     dynamic: [{
 *         forEach: [
 *             50,
 *             55,
 *             60,
 *         ],
 *         content: [{
 *             userId: allowed_to_push.value,
 *         }],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Gitlab protected branches can be imported with a key composed of `<project_id>:<branch>`, e.g.
 *
 * ```sh
 *  $ pulumi import gitlab:index/branchProtection:BranchProtection BranchProtect "12345:main"
 * ```
 */
export class BranchProtection extends pulumi.CustomResource {
    /**
     * Get an existing BranchProtection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BranchProtectionState, opts?: pulumi.CustomResourceOptions): BranchProtection {
        return new BranchProtection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/branchProtection:BranchProtection';

    /**
     * Returns true if the given object is an instance of BranchProtection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BranchProtection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BranchProtection.__pulumiType;
    }

    public readonly allowedToMerges!: pulumi.Output<outputs.BranchProtectionAllowedToMerge[] | undefined>;
    public readonly allowedToPushes!: pulumi.Output<outputs.BranchProtectionAllowedToPush[] | undefined>;
    /**
     * Name of the branch.
     */
    public readonly branch!: pulumi.Output<string>;
    /**
     * The ID of the branch protection (not the branch name).
     */
    public /*out*/ readonly branchProtectionId!: pulumi.Output<number>;
    /**
     * Bool, defaults to false. Can be set to true to require code owner approval before merging.
     */
    public readonly codeOwnerApprovalRequired!: pulumi.Output<boolean | undefined>;
    /**
     * One of five levels of access to the project. Valid values are: `no one`, `developer`, `maintainer`, `admin`.
     */
    public readonly mergeAccessLevel!: pulumi.Output<string>;
    /**
     * The id of the project.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * One of five levels of access to the project. Valid values are: `no one`, `developer`, `maintainer`, `admin`.
     */
    public readonly pushAccessLevel!: pulumi.Output<string>;

    /**
     * Create a BranchProtection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BranchProtectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BranchProtectionArgs | BranchProtectionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BranchProtectionState | undefined;
            inputs["allowedToMerges"] = state ? state.allowedToMerges : undefined;
            inputs["allowedToPushes"] = state ? state.allowedToPushes : undefined;
            inputs["branch"] = state ? state.branch : undefined;
            inputs["branchProtectionId"] = state ? state.branchProtectionId : undefined;
            inputs["codeOwnerApprovalRequired"] = state ? state.codeOwnerApprovalRequired : undefined;
            inputs["mergeAccessLevel"] = state ? state.mergeAccessLevel : undefined;
            inputs["project"] = state ? state.project : undefined;
            inputs["pushAccessLevel"] = state ? state.pushAccessLevel : undefined;
        } else {
            const args = argsOrState as BranchProtectionArgs | undefined;
            if ((!args || args.branch === undefined) && !opts.urn) {
                throw new Error("Missing required property 'branch'");
            }
            if ((!args || args.mergeAccessLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mergeAccessLevel'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.pushAccessLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pushAccessLevel'");
            }
            inputs["allowedToMerges"] = args ? args.allowedToMerges : undefined;
            inputs["allowedToPushes"] = args ? args.allowedToPushes : undefined;
            inputs["branch"] = args ? args.branch : undefined;
            inputs["codeOwnerApprovalRequired"] = args ? args.codeOwnerApprovalRequired : undefined;
            inputs["mergeAccessLevel"] = args ? args.mergeAccessLevel : undefined;
            inputs["project"] = args ? args.project : undefined;
            inputs["pushAccessLevel"] = args ? args.pushAccessLevel : undefined;
            inputs["branchProtectionId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(BranchProtection.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BranchProtection resources.
 */
export interface BranchProtectionState {
    allowedToMerges?: pulumi.Input<pulumi.Input<inputs.BranchProtectionAllowedToMerge>[]>;
    allowedToPushes?: pulumi.Input<pulumi.Input<inputs.BranchProtectionAllowedToPush>[]>;
    /**
     * Name of the branch.
     */
    branch?: pulumi.Input<string>;
    /**
     * The ID of the branch protection (not the branch name).
     */
    branchProtectionId?: pulumi.Input<number>;
    /**
     * Bool, defaults to false. Can be set to true to require code owner approval before merging.
     */
    codeOwnerApprovalRequired?: pulumi.Input<boolean>;
    /**
     * One of five levels of access to the project. Valid values are: `no one`, `developer`, `maintainer`, `admin`.
     */
    mergeAccessLevel?: pulumi.Input<string>;
    /**
     * The id of the project.
     */
    project?: pulumi.Input<string>;
    /**
     * One of five levels of access to the project. Valid values are: `no one`, `developer`, `maintainer`, `admin`.
     */
    pushAccessLevel?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BranchProtection resource.
 */
export interface BranchProtectionArgs {
    allowedToMerges?: pulumi.Input<pulumi.Input<inputs.BranchProtectionAllowedToMerge>[]>;
    allowedToPushes?: pulumi.Input<pulumi.Input<inputs.BranchProtectionAllowedToPush>[]>;
    /**
     * Name of the branch.
     */
    branch: pulumi.Input<string>;
    /**
     * Bool, defaults to false. Can be set to true to require code owner approval before merging.
     */
    codeOwnerApprovalRequired?: pulumi.Input<boolean>;
    /**
     * One of five levels of access to the project. Valid values are: `no one`, `developer`, `maintainer`, `admin`.
     */
    mergeAccessLevel: pulumi.Input<string>;
    /**
     * The id of the project.
     */
    project: pulumi.Input<string>;
    /**
     * One of five levels of access to the project. Valid values are: `no one`, `developer`, `maintainer`, `admin`.
     */
    pushAccessLevel: pulumi.Input<string>;
}
