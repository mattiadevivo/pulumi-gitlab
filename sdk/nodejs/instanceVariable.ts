// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to create and manage CI/CD variables for your GitLab instance.
 * For further information on variables, consult the [gitlab
 * documentation](https://docs.gitlab.com/ee/api/instance_level_ci_variables.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const example = new gitlab.InstanceVariable("example", {
 *     key: "instance_variable_key",
 *     masked: false,
 *     protected: false,
 *     value: "instance_variable_value",
 * });
 * ```
 *
 * ## Import
 *
 * GitLab instance variables can be imported using an id made up of `variablename`, e.g. console
 *
 * ```sh
 *  $ pulumi import gitlab:index/instanceVariable:InstanceVariable example instance_variable_key
 * ```
 */
export class InstanceVariable extends pulumi.CustomResource {
    /**
     * Get an existing InstanceVariable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceVariableState, opts?: pulumi.CustomResourceOptions): InstanceVariable {
        return new InstanceVariable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/instanceVariable:InstanceVariable';

    /**
     * Returns true if the given object is an instance of InstanceVariable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceVariable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceVariable.__pulumiType;
    }

    /**
     * The name of the variable.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variable-requirements). Defaults to `false`.
     */
    public readonly masked!: pulumi.Output<boolean | undefined>;
    /**
     * If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
     */
    public readonly protected!: pulumi.Output<boolean | undefined>;
    /**
     * The value of the variable.
     */
    public readonly value!: pulumi.Output<string>;
    /**
     * The type of a variable. Available types are: envVar (default) and file.
     */
    public readonly variableType!: pulumi.Output<string | undefined>;

    /**
     * Create a InstanceVariable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceVariableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceVariableArgs | InstanceVariableState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceVariableState | undefined;
            inputs["key"] = state ? state.key : undefined;
            inputs["masked"] = state ? state.masked : undefined;
            inputs["protected"] = state ? state.protected : undefined;
            inputs["value"] = state ? state.value : undefined;
            inputs["variableType"] = state ? state.variableType : undefined;
        } else {
            const args = argsOrState as InstanceVariableArgs | undefined;
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            inputs["key"] = args ? args.key : undefined;
            inputs["masked"] = args ? args.masked : undefined;
            inputs["protected"] = args ? args.protected : undefined;
            inputs["value"] = args ? args.value : undefined;
            inputs["variableType"] = args ? args.variableType : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(InstanceVariable.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceVariable resources.
 */
export interface InstanceVariableState {
    /**
     * The name of the variable.
     */
    key?: pulumi.Input<string>;
    /**
     * If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variable-requirements). Defaults to `false`.
     */
    masked?: pulumi.Input<boolean>;
    /**
     * If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
     */
    protected?: pulumi.Input<boolean>;
    /**
     * The value of the variable.
     */
    value?: pulumi.Input<string>;
    /**
     * The type of a variable. Available types are: envVar (default) and file.
     */
    variableType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceVariable resource.
 */
export interface InstanceVariableArgs {
    /**
     * The name of the variable.
     */
    key: pulumi.Input<string>;
    /**
     * If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variable-requirements). Defaults to `false`.
     */
    masked?: pulumi.Input<boolean>;
    /**
     * If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
     */
    protected?: pulumi.Input<boolean>;
    /**
     * The value of the variable.
     */
    value: pulumi.Input<string>;
    /**
     * The type of a variable. Available types are: envVar (default) and file.
     */
    variableType?: pulumi.Input<string>;
}
