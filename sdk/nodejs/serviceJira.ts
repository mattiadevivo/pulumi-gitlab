// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage Jira integration.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 * 
 * const awesomeProject = new gitlab.Project("awesome_project", {
 *     description: "My awesome project.",
 *     visibilityLevel: "public",
 * });
 * const jira = new gitlab.ServiceJira("jira", {
 *     password: "mypass",
 *     project: awesomeProject.id,
 *     url: "https://jira.example.com",
 *     username: "user",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-gitlab/blob/master/website/docs/r/service_jira.html.markdown.
 */
export class ServiceJira extends pulumi.CustomResource {
    /**
     * Get an existing ServiceJira resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceJiraState, opts?: pulumi.CustomResourceOptions): ServiceJira {
        return new ServiceJira(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/serviceJira:ServiceJira';

    /**
     * Returns true if the given object is an instance of ServiceJira.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceJira {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceJira.__pulumiType;
    }

    public /*out*/ readonly active!: pulumi.Output<boolean>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The ID of a transition that moves issues to a closed state. You can find this number under the JIRA workflow administration (Administration > Issues > Workflows) by selecting View under Operations of the desired workflow of your project. By default, this ID is set to 2.
     */
    public readonly jiraIssueTransitionId!: pulumi.Output<string | undefined>;
    /**
     * The password of the user created to be used with GitLab/JIRA.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * ID of the project you want to activate integration on.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The short identifier for your JIRA project, all uppercase, e.g., PROJ.
     */
    public readonly projectKey!: pulumi.Output<string | undefined>;
    public /*out*/ readonly title!: pulumi.Output<string>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * The URL to the JIRA project which is being linked to this GitLab project. For example, https://jira.example.com.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * The username of the user created to be used with GitLab/JIRA.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a ServiceJira resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceJiraArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceJiraArgs | ServiceJiraState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ServiceJiraState | undefined;
            inputs["active"] = state ? state.active : undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["jiraIssueTransitionId"] = state ? state.jiraIssueTransitionId : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["project"] = state ? state.project : undefined;
            inputs["projectKey"] = state ? state.projectKey : undefined;
            inputs["title"] = state ? state.title : undefined;
            inputs["updatedAt"] = state ? state.updatedAt : undefined;
            inputs["url"] = state ? state.url : undefined;
            inputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as ServiceJiraArgs | undefined;
            if (!args || args.password === undefined) {
                throw new Error("Missing required property 'password'");
            }
            if (!args || args.project === undefined) {
                throw new Error("Missing required property 'project'");
            }
            if (!args || args.url === undefined) {
                throw new Error("Missing required property 'url'");
            }
            if (!args || args.username === undefined) {
                throw new Error("Missing required property 'username'");
            }
            inputs["jiraIssueTransitionId"] = args ? args.jiraIssueTransitionId : undefined;
            inputs["password"] = args ? args.password : undefined;
            inputs["project"] = args ? args.project : undefined;
            inputs["projectKey"] = args ? args.projectKey : undefined;
            inputs["url"] = args ? args.url : undefined;
            inputs["username"] = args ? args.username : undefined;
            inputs["active"] = undefined /*out*/;
            inputs["createdAt"] = undefined /*out*/;
            inputs["title"] = undefined /*out*/;
            inputs["updatedAt"] = undefined /*out*/;
        }
        super(ServiceJira.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceJira resources.
 */
export interface ServiceJiraState {
    readonly active?: pulumi.Input<boolean>;
    readonly createdAt?: pulumi.Input<string>;
    /**
     * The ID of a transition that moves issues to a closed state. You can find this number under the JIRA workflow administration (Administration > Issues > Workflows) by selecting View under Operations of the desired workflow of your project. By default, this ID is set to 2.
     */
    readonly jiraIssueTransitionId?: pulumi.Input<string>;
    /**
     * The password of the user created to be used with GitLab/JIRA.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * ID of the project you want to activate integration on.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The short identifier for your JIRA project, all uppercase, e.g., PROJ.
     */
    readonly projectKey?: pulumi.Input<string>;
    readonly title?: pulumi.Input<string>;
    readonly updatedAt?: pulumi.Input<string>;
    /**
     * The URL to the JIRA project which is being linked to this GitLab project. For example, https://jira.example.com.
     */
    readonly url?: pulumi.Input<string>;
    /**
     * The username of the user created to be used with GitLab/JIRA.
     */
    readonly username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceJira resource.
 */
export interface ServiceJiraArgs {
    /**
     * The ID of a transition that moves issues to a closed state. You can find this number under the JIRA workflow administration (Administration > Issues > Workflows) by selecting View under Operations of the desired workflow of your project. By default, this ID is set to 2.
     */
    readonly jiraIssueTransitionId?: pulumi.Input<string>;
    /**
     * The password of the user created to be used with GitLab/JIRA.
     */
    readonly password: pulumi.Input<string>;
    /**
     * ID of the project you want to activate integration on.
     */
    readonly project: pulumi.Input<string>;
    /**
     * The short identifier for your JIRA project, all uppercase, e.g., PROJ.
     */
    readonly projectKey?: pulumi.Input<string>;
    /**
     * The URL to the JIRA project which is being linked to this GitLab project. For example, https://jira.example.com.
     */
    readonly url: pulumi.Input<string>;
    /**
     * The username of the user created to be used with GitLab/JIRA.
     */
    readonly username: pulumi.Input<string>;
}
