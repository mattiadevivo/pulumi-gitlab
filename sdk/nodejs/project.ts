// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * This resource allows you to create and manage projects within your GitLab group or within your user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const example = new gitlab.Project("example", {
 *     description: "My awesome codebase",
 *     visibilityLevel: "public",
 * });
 * // Project with custom push rules
 * const example_two = new gitlab.Project("example-two", {
 *     pushRules: {
 *         authorEmailRegex: "@example\\.com$",
 *         commitCommitterCheck: true,
 *         memberCheck: true,
 *         preventSecrets: true,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import gitlab:index/project:Project # You can import a project state using `<resource> <id>`. The
 * ```
 *
 * # `id` can be whatever the [get single project api][get_single_project] takes for # its `:id` value, so for example
 *
 * ```sh
 *  $ pulumi import gitlab:index/project:Project example richardc/example
 * ```
 */
export class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project {
        return new Project(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/project:Project';

    /**
     * Returns true if the given object is an instance of Project.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Project {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Project.__pulumiType;
    }

    /**
     * Set to true if you want to treat skipped pipelines as if they finished with success.
     */
    public readonly allowMergeOnSkippedPipeline!: pulumi.Output<boolean | undefined>;
    /**
     * Number of merge request approvals required for merging. Default is 0.
     */
    public readonly approvalsBeforeMerge!: pulumi.Output<number | undefined>;
    /**
     * Set to `true` to archive the project instead of deleting on destroy. If set to `true` it will entire omit the `DELETE` operation.
     */
    public readonly archiveOnDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
     */
    public readonly archived!: pulumi.Output<boolean | undefined>;
    /**
     * Test coverage parsing for the project.
     */
    public readonly buildCoverageRegex!: pulumi.Output<string | undefined>;
    /**
     * Custom Path to CI config file.
     */
    public readonly ciConfigPath!: pulumi.Output<string | undefined>;
    /**
     * Enable container registry for the project.
     */
    public readonly containerRegistryEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The default branch for the project.
     */
    public readonly defaultBranch!: pulumi.Output<string>;
    /**
     * A description of the project.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * For group-level custom templates, specifies ID of group from which all the custom project templates are sourced. Leave empty for instance-level templates. Requires use*custom*template to be true (enterprise edition).
     */
    public readonly groupWithProjectTemplatesId!: pulumi.Output<number | undefined>;
    /**
     * URL that can be provided to `git clone` to clone the
     */
    public /*out*/ readonly httpUrlToRepo!: pulumi.Output<string>;
    /**
     * Git URL to a repository to be imported.
     */
    public readonly importUrl!: pulumi.Output<string | undefined>;
    /**
     * Create main branch with first commit containing a README.md file.
     */
    public readonly initializeWithReadme!: pulumi.Output<boolean | undefined>;
    /**
     * Enable issue tracking for the project.
     */
    public readonly issuesEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Sets the template for new issues in the project.
     */
    public readonly issuesTemplate!: pulumi.Output<string | undefined>;
    /**
     * Enable LFS for the project.
     */
    public readonly lfsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Set to `ff` to create fast-forward merges
     */
    public readonly mergeMethod!: pulumi.Output<string | undefined>;
    /**
     * Enable merge requests for the project.
     */
    public readonly mergeRequestsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Sets the template for new merge requests in the project.
     */
    public readonly mergeRequestsTemplate!: pulumi.Output<string | undefined>;
    /**
     * Enable project pull mirror.
     */
    public readonly mirror!: pulumi.Output<boolean | undefined>;
    /**
     * Enable overwrite diverged branches for a mirrored project.
     */
    public readonly mirrorOverwritesDivergedBranches!: pulumi.Output<boolean | undefined>;
    /**
     * Enable trigger builds on pushes for a mirrored project.
     */
    public readonly mirrorTriggerBuilds!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the project.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace (group or user) of the project. Defaults to your user.
     */
    public readonly namespaceId!: pulumi.Output<number>;
    /**
     * Set to true if you want allow merges only if all discussions are resolved.
     */
    public readonly onlyAllowMergeIfAllDiscussionsAreResolved!: pulumi.Output<boolean | undefined>;
    /**
     * Set to true if you want allow merges only if a pipeline succeeds.
     */
    public readonly onlyAllowMergeIfPipelineSucceeds!: pulumi.Output<boolean | undefined>;
    /**
     * Enable only mirror protected branches for a mirrored project.
     */
    public readonly onlyMirrorProtectedBranches!: pulumi.Output<boolean | undefined>;
    /**
     * Enable packages repository for the project.
     */
    public readonly packagesEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Enable pages access control
     */
    public readonly pagesAccessLevel!: pulumi.Output<string | undefined>;
    /**
     * The path of the repository.
     */
    public readonly path!: pulumi.Output<string | undefined>;
    /**
     * The path of the repository with namespace.
     */
    public /*out*/ readonly pathWithNamespace!: pulumi.Output<string>;
    /**
     * Enable pipelines for the project.
     */
    public readonly pipelinesEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Push rules for the project.
     */
    public readonly pushRules!: pulumi.Output<outputs.ProjectPushRules>;
    /**
     * Enable `Delete source branch` option by default for all new merge requests.
     */
    public readonly removeSourceBranchAfterMerge!: pulumi.Output<boolean | undefined>;
    /**
     * Allow users to request member access.
     */
    public readonly requestAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Registration token to use during runner setup.
     */
    public /*out*/ readonly runnersToken!: pulumi.Output<string>;
    /**
     * Enable shared runners for this project.
     */
    public readonly sharedRunnersEnabled!: pulumi.Output<boolean>;
    /**
     * Enable snippets for the project.
     */
    public readonly snippetsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Squash commits when merge request. Valid values are `never`, `always`, `defaultOn`, or `defaultOff`. The default value is `defaultOff`.
     */
    public readonly squashOption!: pulumi.Output<string | undefined>;
    /**
     * URL that can be provided to `git clone` to clone the
     */
    public /*out*/ readonly sshUrlToRepo!: pulumi.Output<string>;
    /**
     * Tags (topics) of the project.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * When used without use*custom*template, name of a built-in project template. When used with use*custom*template, name of a custom project template. This option is mutually exclusive with `templateProjectId`.
     */
    public readonly templateName!: pulumi.Output<string | undefined>;
    /**
     * When used with use*custom*template, project ID of a custom project template. This is preferable to using template*name since template*name may be ambiguous (enterprise edition). This option is mutually exclusive with `templateName`.
     */
    public readonly templateProjectId!: pulumi.Output<number | undefined>;
    /**
     * Use either custom instance or group (with group*with*project*templates*id) project template (enterprise edition).
     */
    public readonly useCustomTemplate!: pulumi.Output<boolean | undefined>;
    /**
     * Set to `public` to create a public project.
     */
    public readonly visibilityLevel!: pulumi.Output<string | undefined>;
    /**
     * URL that can be used to find the project in a browser.
     */
    public /*out*/ readonly webUrl!: pulumi.Output<string>;
    /**
     * Enable wiki for the project.
     */
    public readonly wikiEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectArgs | ProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectState | undefined;
            resourceInputs["allowMergeOnSkippedPipeline"] = state ? state.allowMergeOnSkippedPipeline : undefined;
            resourceInputs["approvalsBeforeMerge"] = state ? state.approvalsBeforeMerge : undefined;
            resourceInputs["archiveOnDestroy"] = state ? state.archiveOnDestroy : undefined;
            resourceInputs["archived"] = state ? state.archived : undefined;
            resourceInputs["buildCoverageRegex"] = state ? state.buildCoverageRegex : undefined;
            resourceInputs["ciConfigPath"] = state ? state.ciConfigPath : undefined;
            resourceInputs["containerRegistryEnabled"] = state ? state.containerRegistryEnabled : undefined;
            resourceInputs["defaultBranch"] = state ? state.defaultBranch : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["groupWithProjectTemplatesId"] = state ? state.groupWithProjectTemplatesId : undefined;
            resourceInputs["httpUrlToRepo"] = state ? state.httpUrlToRepo : undefined;
            resourceInputs["importUrl"] = state ? state.importUrl : undefined;
            resourceInputs["initializeWithReadme"] = state ? state.initializeWithReadme : undefined;
            resourceInputs["issuesEnabled"] = state ? state.issuesEnabled : undefined;
            resourceInputs["issuesTemplate"] = state ? state.issuesTemplate : undefined;
            resourceInputs["lfsEnabled"] = state ? state.lfsEnabled : undefined;
            resourceInputs["mergeMethod"] = state ? state.mergeMethod : undefined;
            resourceInputs["mergeRequestsEnabled"] = state ? state.mergeRequestsEnabled : undefined;
            resourceInputs["mergeRequestsTemplate"] = state ? state.mergeRequestsTemplate : undefined;
            resourceInputs["mirror"] = state ? state.mirror : undefined;
            resourceInputs["mirrorOverwritesDivergedBranches"] = state ? state.mirrorOverwritesDivergedBranches : undefined;
            resourceInputs["mirrorTriggerBuilds"] = state ? state.mirrorTriggerBuilds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
            resourceInputs["onlyAllowMergeIfAllDiscussionsAreResolved"] = state ? state.onlyAllowMergeIfAllDiscussionsAreResolved : undefined;
            resourceInputs["onlyAllowMergeIfPipelineSucceeds"] = state ? state.onlyAllowMergeIfPipelineSucceeds : undefined;
            resourceInputs["onlyMirrorProtectedBranches"] = state ? state.onlyMirrorProtectedBranches : undefined;
            resourceInputs["packagesEnabled"] = state ? state.packagesEnabled : undefined;
            resourceInputs["pagesAccessLevel"] = state ? state.pagesAccessLevel : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["pathWithNamespace"] = state ? state.pathWithNamespace : undefined;
            resourceInputs["pipelinesEnabled"] = state ? state.pipelinesEnabled : undefined;
            resourceInputs["pushRules"] = state ? state.pushRules : undefined;
            resourceInputs["removeSourceBranchAfterMerge"] = state ? state.removeSourceBranchAfterMerge : undefined;
            resourceInputs["requestAccessEnabled"] = state ? state.requestAccessEnabled : undefined;
            resourceInputs["runnersToken"] = state ? state.runnersToken : undefined;
            resourceInputs["sharedRunnersEnabled"] = state ? state.sharedRunnersEnabled : undefined;
            resourceInputs["snippetsEnabled"] = state ? state.snippetsEnabled : undefined;
            resourceInputs["squashOption"] = state ? state.squashOption : undefined;
            resourceInputs["sshUrlToRepo"] = state ? state.sshUrlToRepo : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["templateName"] = state ? state.templateName : undefined;
            resourceInputs["templateProjectId"] = state ? state.templateProjectId : undefined;
            resourceInputs["useCustomTemplate"] = state ? state.useCustomTemplate : undefined;
            resourceInputs["visibilityLevel"] = state ? state.visibilityLevel : undefined;
            resourceInputs["webUrl"] = state ? state.webUrl : undefined;
            resourceInputs["wikiEnabled"] = state ? state.wikiEnabled : undefined;
        } else {
            const args = argsOrState as ProjectArgs | undefined;
            resourceInputs["allowMergeOnSkippedPipeline"] = args ? args.allowMergeOnSkippedPipeline : undefined;
            resourceInputs["approvalsBeforeMerge"] = args ? args.approvalsBeforeMerge : undefined;
            resourceInputs["archiveOnDestroy"] = args ? args.archiveOnDestroy : undefined;
            resourceInputs["archived"] = args ? args.archived : undefined;
            resourceInputs["buildCoverageRegex"] = args ? args.buildCoverageRegex : undefined;
            resourceInputs["ciConfigPath"] = args ? args.ciConfigPath : undefined;
            resourceInputs["containerRegistryEnabled"] = args ? args.containerRegistryEnabled : undefined;
            resourceInputs["defaultBranch"] = args ? args.defaultBranch : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["groupWithProjectTemplatesId"] = args ? args.groupWithProjectTemplatesId : undefined;
            resourceInputs["importUrl"] = args ? args.importUrl : undefined;
            resourceInputs["initializeWithReadme"] = args ? args.initializeWithReadme : undefined;
            resourceInputs["issuesEnabled"] = args ? args.issuesEnabled : undefined;
            resourceInputs["issuesTemplate"] = args ? args.issuesTemplate : undefined;
            resourceInputs["lfsEnabled"] = args ? args.lfsEnabled : undefined;
            resourceInputs["mergeMethod"] = args ? args.mergeMethod : undefined;
            resourceInputs["mergeRequestsEnabled"] = args ? args.mergeRequestsEnabled : undefined;
            resourceInputs["mergeRequestsTemplate"] = args ? args.mergeRequestsTemplate : undefined;
            resourceInputs["mirror"] = args ? args.mirror : undefined;
            resourceInputs["mirrorOverwritesDivergedBranches"] = args ? args.mirrorOverwritesDivergedBranches : undefined;
            resourceInputs["mirrorTriggerBuilds"] = args ? args.mirrorTriggerBuilds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
            resourceInputs["onlyAllowMergeIfAllDiscussionsAreResolved"] = args ? args.onlyAllowMergeIfAllDiscussionsAreResolved : undefined;
            resourceInputs["onlyAllowMergeIfPipelineSucceeds"] = args ? args.onlyAllowMergeIfPipelineSucceeds : undefined;
            resourceInputs["onlyMirrorProtectedBranches"] = args ? args.onlyMirrorProtectedBranches : undefined;
            resourceInputs["packagesEnabled"] = args ? args.packagesEnabled : undefined;
            resourceInputs["pagesAccessLevel"] = args ? args.pagesAccessLevel : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["pipelinesEnabled"] = args ? args.pipelinesEnabled : undefined;
            resourceInputs["pushRules"] = args ? args.pushRules : undefined;
            resourceInputs["removeSourceBranchAfterMerge"] = args ? args.removeSourceBranchAfterMerge : undefined;
            resourceInputs["requestAccessEnabled"] = args ? args.requestAccessEnabled : undefined;
            resourceInputs["sharedRunnersEnabled"] = args ? args.sharedRunnersEnabled : undefined;
            resourceInputs["snippetsEnabled"] = args ? args.snippetsEnabled : undefined;
            resourceInputs["squashOption"] = args ? args.squashOption : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["templateName"] = args ? args.templateName : undefined;
            resourceInputs["templateProjectId"] = args ? args.templateProjectId : undefined;
            resourceInputs["useCustomTemplate"] = args ? args.useCustomTemplate : undefined;
            resourceInputs["visibilityLevel"] = args ? args.visibilityLevel : undefined;
            resourceInputs["wikiEnabled"] = args ? args.wikiEnabled : undefined;
            resourceInputs["httpUrlToRepo"] = undefined /*out*/;
            resourceInputs["pathWithNamespace"] = undefined /*out*/;
            resourceInputs["runnersToken"] = undefined /*out*/;
            resourceInputs["sshUrlToRepo"] = undefined /*out*/;
            resourceInputs["webUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Project.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * Set to true if you want to treat skipped pipelines as if they finished with success.
     */
    allowMergeOnSkippedPipeline?: pulumi.Input<boolean>;
    /**
     * Number of merge request approvals required for merging. Default is 0.
     */
    approvalsBeforeMerge?: pulumi.Input<number>;
    /**
     * Set to `true` to archive the project instead of deleting on destroy. If set to `true` it will entire omit the `DELETE` operation.
     */
    archiveOnDestroy?: pulumi.Input<boolean>;
    /**
     * Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
     */
    archived?: pulumi.Input<boolean>;
    /**
     * Test coverage parsing for the project.
     */
    buildCoverageRegex?: pulumi.Input<string>;
    /**
     * Custom Path to CI config file.
     */
    ciConfigPath?: pulumi.Input<string>;
    /**
     * Enable container registry for the project.
     */
    containerRegistryEnabled?: pulumi.Input<boolean>;
    /**
     * The default branch for the project.
     */
    defaultBranch?: pulumi.Input<string>;
    /**
     * A description of the project.
     */
    description?: pulumi.Input<string>;
    /**
     * For group-level custom templates, specifies ID of group from which all the custom project templates are sourced. Leave empty for instance-level templates. Requires use*custom*template to be true (enterprise edition).
     */
    groupWithProjectTemplatesId?: pulumi.Input<number>;
    /**
     * URL that can be provided to `git clone` to clone the
     */
    httpUrlToRepo?: pulumi.Input<string>;
    /**
     * Git URL to a repository to be imported.
     */
    importUrl?: pulumi.Input<string>;
    /**
     * Create main branch with first commit containing a README.md file.
     */
    initializeWithReadme?: pulumi.Input<boolean>;
    /**
     * Enable issue tracking for the project.
     */
    issuesEnabled?: pulumi.Input<boolean>;
    /**
     * Sets the template for new issues in the project.
     */
    issuesTemplate?: pulumi.Input<string>;
    /**
     * Enable LFS for the project.
     */
    lfsEnabled?: pulumi.Input<boolean>;
    /**
     * Set to `ff` to create fast-forward merges
     */
    mergeMethod?: pulumi.Input<string>;
    /**
     * Enable merge requests for the project.
     */
    mergeRequestsEnabled?: pulumi.Input<boolean>;
    /**
     * Sets the template for new merge requests in the project.
     */
    mergeRequestsTemplate?: pulumi.Input<string>;
    /**
     * Enable project pull mirror.
     */
    mirror?: pulumi.Input<boolean>;
    /**
     * Enable overwrite diverged branches for a mirrored project.
     */
    mirrorOverwritesDivergedBranches?: pulumi.Input<boolean>;
    /**
     * Enable trigger builds on pushes for a mirrored project.
     */
    mirrorTriggerBuilds?: pulumi.Input<boolean>;
    /**
     * The name of the project.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace (group or user) of the project. Defaults to your user.
     */
    namespaceId?: pulumi.Input<number>;
    /**
     * Set to true if you want allow merges only if all discussions are resolved.
     */
    onlyAllowMergeIfAllDiscussionsAreResolved?: pulumi.Input<boolean>;
    /**
     * Set to true if you want allow merges only if a pipeline succeeds.
     */
    onlyAllowMergeIfPipelineSucceeds?: pulumi.Input<boolean>;
    /**
     * Enable only mirror protected branches for a mirrored project.
     */
    onlyMirrorProtectedBranches?: pulumi.Input<boolean>;
    /**
     * Enable packages repository for the project.
     */
    packagesEnabled?: pulumi.Input<boolean>;
    /**
     * Enable pages access control
     */
    pagesAccessLevel?: pulumi.Input<string>;
    /**
     * The path of the repository.
     */
    path?: pulumi.Input<string>;
    /**
     * The path of the repository with namespace.
     */
    pathWithNamespace?: pulumi.Input<string>;
    /**
     * Enable pipelines for the project.
     */
    pipelinesEnabled?: pulumi.Input<boolean>;
    /**
     * Push rules for the project.
     */
    pushRules?: pulumi.Input<inputs.ProjectPushRules>;
    /**
     * Enable `Delete source branch` option by default for all new merge requests.
     */
    removeSourceBranchAfterMerge?: pulumi.Input<boolean>;
    /**
     * Allow users to request member access.
     */
    requestAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Registration token to use during runner setup.
     */
    runnersToken?: pulumi.Input<string>;
    /**
     * Enable shared runners for this project.
     */
    sharedRunnersEnabled?: pulumi.Input<boolean>;
    /**
     * Enable snippets for the project.
     */
    snippetsEnabled?: pulumi.Input<boolean>;
    /**
     * Squash commits when merge request. Valid values are `never`, `always`, `defaultOn`, or `defaultOff`. The default value is `defaultOff`.
     */
    squashOption?: pulumi.Input<string>;
    /**
     * URL that can be provided to `git clone` to clone the
     */
    sshUrlToRepo?: pulumi.Input<string>;
    /**
     * Tags (topics) of the project.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When used without use*custom*template, name of a built-in project template. When used with use*custom*template, name of a custom project template. This option is mutually exclusive with `templateProjectId`.
     */
    templateName?: pulumi.Input<string>;
    /**
     * When used with use*custom*template, project ID of a custom project template. This is preferable to using template*name since template*name may be ambiguous (enterprise edition). This option is mutually exclusive with `templateName`.
     */
    templateProjectId?: pulumi.Input<number>;
    /**
     * Use either custom instance or group (with group*with*project*templates*id) project template (enterprise edition).
     */
    useCustomTemplate?: pulumi.Input<boolean>;
    /**
     * Set to `public` to create a public project.
     */
    visibilityLevel?: pulumi.Input<string>;
    /**
     * URL that can be used to find the project in a browser.
     */
    webUrl?: pulumi.Input<string>;
    /**
     * Enable wiki for the project.
     */
    wikiEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Set to true if you want to treat skipped pipelines as if they finished with success.
     */
    allowMergeOnSkippedPipeline?: pulumi.Input<boolean>;
    /**
     * Number of merge request approvals required for merging. Default is 0.
     */
    approvalsBeforeMerge?: pulumi.Input<number>;
    /**
     * Set to `true` to archive the project instead of deleting on destroy. If set to `true` it will entire omit the `DELETE` operation.
     */
    archiveOnDestroy?: pulumi.Input<boolean>;
    /**
     * Whether the project is in read-only mode (archived). Repositories can be archived/unarchived by toggling this parameter.
     */
    archived?: pulumi.Input<boolean>;
    /**
     * Test coverage parsing for the project.
     */
    buildCoverageRegex?: pulumi.Input<string>;
    /**
     * Custom Path to CI config file.
     */
    ciConfigPath?: pulumi.Input<string>;
    /**
     * Enable container registry for the project.
     */
    containerRegistryEnabled?: pulumi.Input<boolean>;
    /**
     * The default branch for the project.
     */
    defaultBranch?: pulumi.Input<string>;
    /**
     * A description of the project.
     */
    description?: pulumi.Input<string>;
    /**
     * For group-level custom templates, specifies ID of group from which all the custom project templates are sourced. Leave empty for instance-level templates. Requires use*custom*template to be true (enterprise edition).
     */
    groupWithProjectTemplatesId?: pulumi.Input<number>;
    /**
     * Git URL to a repository to be imported.
     */
    importUrl?: pulumi.Input<string>;
    /**
     * Create main branch with first commit containing a README.md file.
     */
    initializeWithReadme?: pulumi.Input<boolean>;
    /**
     * Enable issue tracking for the project.
     */
    issuesEnabled?: pulumi.Input<boolean>;
    /**
     * Sets the template for new issues in the project.
     */
    issuesTemplate?: pulumi.Input<string>;
    /**
     * Enable LFS for the project.
     */
    lfsEnabled?: pulumi.Input<boolean>;
    /**
     * Set to `ff` to create fast-forward merges
     */
    mergeMethod?: pulumi.Input<string>;
    /**
     * Enable merge requests for the project.
     */
    mergeRequestsEnabled?: pulumi.Input<boolean>;
    /**
     * Sets the template for new merge requests in the project.
     */
    mergeRequestsTemplate?: pulumi.Input<string>;
    /**
     * Enable project pull mirror.
     */
    mirror?: pulumi.Input<boolean>;
    /**
     * Enable overwrite diverged branches for a mirrored project.
     */
    mirrorOverwritesDivergedBranches?: pulumi.Input<boolean>;
    /**
     * Enable trigger builds on pushes for a mirrored project.
     */
    mirrorTriggerBuilds?: pulumi.Input<boolean>;
    /**
     * The name of the project.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace (group or user) of the project. Defaults to your user.
     */
    namespaceId?: pulumi.Input<number>;
    /**
     * Set to true if you want allow merges only if all discussions are resolved.
     */
    onlyAllowMergeIfAllDiscussionsAreResolved?: pulumi.Input<boolean>;
    /**
     * Set to true if you want allow merges only if a pipeline succeeds.
     */
    onlyAllowMergeIfPipelineSucceeds?: pulumi.Input<boolean>;
    /**
     * Enable only mirror protected branches for a mirrored project.
     */
    onlyMirrorProtectedBranches?: pulumi.Input<boolean>;
    /**
     * Enable packages repository for the project.
     */
    packagesEnabled?: pulumi.Input<boolean>;
    /**
     * Enable pages access control
     */
    pagesAccessLevel?: pulumi.Input<string>;
    /**
     * The path of the repository.
     */
    path?: pulumi.Input<string>;
    /**
     * Enable pipelines for the project.
     */
    pipelinesEnabled?: pulumi.Input<boolean>;
    /**
     * Push rules for the project.
     */
    pushRules?: pulumi.Input<inputs.ProjectPushRules>;
    /**
     * Enable `Delete source branch` option by default for all new merge requests.
     */
    removeSourceBranchAfterMerge?: pulumi.Input<boolean>;
    /**
     * Allow users to request member access.
     */
    requestAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Enable shared runners for this project.
     */
    sharedRunnersEnabled?: pulumi.Input<boolean>;
    /**
     * Enable snippets for the project.
     */
    snippetsEnabled?: pulumi.Input<boolean>;
    /**
     * Squash commits when merge request. Valid values are `never`, `always`, `defaultOn`, or `defaultOff`. The default value is `defaultOff`.
     */
    squashOption?: pulumi.Input<string>;
    /**
     * Tags (topics) of the project.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When used without use*custom*template, name of a built-in project template. When used with use*custom*template, name of a custom project template. This option is mutually exclusive with `templateProjectId`.
     */
    templateName?: pulumi.Input<string>;
    /**
     * When used with use*custom*template, project ID of a custom project template. This is preferable to using template*name since template*name may be ambiguous (enterprise edition). This option is mutually exclusive with `templateName`.
     */
    templateProjectId?: pulumi.Input<number>;
    /**
     * Use either custom instance or group (with group*with*project*templates*id) project template (enterprise edition).
     */
    useCustomTemplate?: pulumi.Input<boolean>;
    /**
     * Set to `public` to create a public project.
     */
    visibilityLevel?: pulumi.Input<string>;
    /**
     * Enable wiki for the project.
     */
    wikiEnabled?: pulumi.Input<boolean>;
}
