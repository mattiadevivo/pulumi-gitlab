// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * GitLab project approval rules can be imported using a key composed of `<project-id>:<rule-id>`, e.g.
 *
 * ```sh
 *  $ pulumi import gitlab:index/projectApprovalRule:ProjectApprovalRule example "12345:6"
 * ```
 */
export class ProjectApprovalRule extends pulumi.CustomResource {
    /**
     * Get an existing ProjectApprovalRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectApprovalRuleState, opts?: pulumi.CustomResourceOptions): ProjectApprovalRule {
        return new ProjectApprovalRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/projectApprovalRule:ProjectApprovalRule';

    /**
     * Returns true if the given object is an instance of ProjectApprovalRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectApprovalRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectApprovalRule.__pulumiType;
    }

    /**
     * The number of approvals required for this rule.
     */
    public readonly approvalsRequired!: pulumi.Output<number>;
    /**
     * When this flag is set, the default `anyApprover` rule will not be imported if present.
     */
    public readonly disableImportingDefaultAnyApproverRuleOnCreate!: pulumi.Output<boolean | undefined>;
    /**
     * A list of group IDs whose members can approve of the merge request.
     */
    public readonly groupIds!: pulumi.Output<number[] | undefined>;
    /**
     * The name of the approval rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name or id of the project to add the approval rules.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * A list of protected branch IDs (not branch names) for which the rule applies.
     */
    public readonly protectedBranchIds!: pulumi.Output<number[] | undefined>;
    /**
     * String, defaults to 'regular'. The type of rule. `anyApprover` is a pre-configured default rule with `approvalsRequired` at `0`. Valid values are `regular`, `anyApprover`.
     */
    public readonly ruleType!: pulumi.Output<string>;
    /**
     * A list of specific User IDs to add to the list of approvers.
     */
    public readonly userIds!: pulumi.Output<number[] | undefined>;

    /**
     * Create a ProjectApprovalRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectApprovalRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectApprovalRuleArgs | ProjectApprovalRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectApprovalRuleState | undefined;
            resourceInputs["approvalsRequired"] = state ? state.approvalsRequired : undefined;
            resourceInputs["disableImportingDefaultAnyApproverRuleOnCreate"] = state ? state.disableImportingDefaultAnyApproverRuleOnCreate : undefined;
            resourceInputs["groupIds"] = state ? state.groupIds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["protectedBranchIds"] = state ? state.protectedBranchIds : undefined;
            resourceInputs["ruleType"] = state ? state.ruleType : undefined;
            resourceInputs["userIds"] = state ? state.userIds : undefined;
        } else {
            const args = argsOrState as ProjectApprovalRuleArgs | undefined;
            if ((!args || args.approvalsRequired === undefined) && !opts.urn) {
                throw new Error("Missing required property 'approvalsRequired'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            resourceInputs["approvalsRequired"] = args ? args.approvalsRequired : undefined;
            resourceInputs["disableImportingDefaultAnyApproverRuleOnCreate"] = args ? args.disableImportingDefaultAnyApproverRuleOnCreate : undefined;
            resourceInputs["groupIds"] = args ? args.groupIds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["protectedBranchIds"] = args ? args.protectedBranchIds : undefined;
            resourceInputs["ruleType"] = args ? args.ruleType : undefined;
            resourceInputs["userIds"] = args ? args.userIds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectApprovalRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectApprovalRule resources.
 */
export interface ProjectApprovalRuleState {
    /**
     * The number of approvals required for this rule.
     */
    approvalsRequired?: pulumi.Input<number>;
    /**
     * When this flag is set, the default `anyApprover` rule will not be imported if present.
     */
    disableImportingDefaultAnyApproverRuleOnCreate?: pulumi.Input<boolean>;
    /**
     * A list of group IDs whose members can approve of the merge request.
     */
    groupIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of the approval rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The name or id of the project to add the approval rules.
     */
    project?: pulumi.Input<string>;
    /**
     * A list of protected branch IDs (not branch names) for which the rule applies.
     */
    protectedBranchIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * String, defaults to 'regular'. The type of rule. `anyApprover` is a pre-configured default rule with `approvalsRequired` at `0`. Valid values are `regular`, `anyApprover`.
     */
    ruleType?: pulumi.Input<string>;
    /**
     * A list of specific User IDs to add to the list of approvers.
     */
    userIds?: pulumi.Input<pulumi.Input<number>[]>;
}

/**
 * The set of arguments for constructing a ProjectApprovalRule resource.
 */
export interface ProjectApprovalRuleArgs {
    /**
     * The number of approvals required for this rule.
     */
    approvalsRequired: pulumi.Input<number>;
    /**
     * When this flag is set, the default `anyApprover` rule will not be imported if present.
     */
    disableImportingDefaultAnyApproverRuleOnCreate?: pulumi.Input<boolean>;
    /**
     * A list of group IDs whose members can approve of the merge request.
     */
    groupIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of the approval rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The name or id of the project to add the approval rules.
     */
    project: pulumi.Input<string>;
    /**
     * A list of protected branch IDs (not branch names) for which the rule applies.
     */
    protectedBranchIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * String, defaults to 'regular'. The type of rule. `anyApprover` is a pre-configured default rule with `approvalsRequired` at `0`. Valid values are `regular`, `anyApprover`.
     */
    ruleType?: pulumi.Input<string>;
    /**
     * A list of specific User IDs to add to the list of approvers.
     */
    userIds?: pulumi.Input<pulumi.Input<number>[]>;
}
