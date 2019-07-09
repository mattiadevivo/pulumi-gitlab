// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to create and manage project clusters for your GitLab projects.
 * For further information on clusters, consult the [gitlab
 * documentation](https://docs.gitlab.com/ce/user/project/clusters/index.html).
 * 
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 * 
 * const foo = new gitlab.Project("foo", {});
 * const bar = new gitlab.ProjectCluster("bar", {
 *     domain: "example.com",
 *     enabled: true,
 *     environmentScope: "*",
 *     kubernetesApiUrl: "https://124.124.124",
 *     kubernetesAuthorizationType: "rbac",
 *     kubernetesCaCert: "some-cert",
 *     kubernetesNamespace: "namespace",
 *     kubernetesToken: "some-token",
 *     project: foo.id,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-gitlab/blob/master/website/docs/r/project_cluster.html.markdown.
 */
export class ProjectCluster extends pulumi.CustomResource {
    /**
     * Get an existing ProjectCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectClusterState, opts?: pulumi.CustomResourceOptions): ProjectCluster {
        return new ProjectCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/projectCluster:ProjectCluster';

    /**
     * Returns true if the given object is an instance of ProjectCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectCluster.__pulumiType;
    }

    public /*out*/ readonly clusterType!: pulumi.Output<string>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The base domain of the cluster.
     */
    public readonly domain!: pulumi.Output<string | undefined>;
    /**
     * Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The associated environment to the cluster. Defaults to `*`.
     */
    public readonly environmentScope!: pulumi.Output<string | undefined>;
    /**
     * The URL to access the Kubernetes API.
     */
    public readonly kubernetesApiUrl!: pulumi.Output<string>;
    /**
     * The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
     */
    public readonly kubernetesAuthorizationType!: pulumi.Output<string | undefined>;
    /**
     * TLS certificate (needed if API is using a self-signed TLS certificate).
     */
    public readonly kubernetesCaCert!: pulumi.Output<string | undefined>;
    /**
     * The unique namespace related to the project.
     */
    public readonly kubernetesNamespace!: pulumi.Output<string | undefined>;
    /**
     * The token to authenticate against Kubernetes.
     */
    public readonly kubernetesToken!: pulumi.Output<string>;
    /**
     * Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
     */
    public readonly managed!: pulumi.Output<boolean | undefined>;
    /**
     * The name of cluster.
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly platformType!: pulumi.Output<string>;
    /**
     * The id of the project to add the cluster to.
     */
    public readonly project!: pulumi.Output<string>;
    public /*out*/ readonly providerType!: pulumi.Output<string>;

    /**
     * Create a ProjectCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectClusterArgs | ProjectClusterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ProjectClusterState | undefined;
            inputs["clusterType"] = state ? state.clusterType : undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["domain"] = state ? state.domain : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["environmentScope"] = state ? state.environmentScope : undefined;
            inputs["kubernetesApiUrl"] = state ? state.kubernetesApiUrl : undefined;
            inputs["kubernetesAuthorizationType"] = state ? state.kubernetesAuthorizationType : undefined;
            inputs["kubernetesCaCert"] = state ? state.kubernetesCaCert : undefined;
            inputs["kubernetesNamespace"] = state ? state.kubernetesNamespace : undefined;
            inputs["kubernetesToken"] = state ? state.kubernetesToken : undefined;
            inputs["managed"] = state ? state.managed : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["platformType"] = state ? state.platformType : undefined;
            inputs["project"] = state ? state.project : undefined;
            inputs["providerType"] = state ? state.providerType : undefined;
        } else {
            const args = argsOrState as ProjectClusterArgs | undefined;
            if (!args || args.kubernetesApiUrl === undefined) {
                throw new Error("Missing required property 'kubernetesApiUrl'");
            }
            if (!args || args.kubernetesToken === undefined) {
                throw new Error("Missing required property 'kubernetesToken'");
            }
            if (!args || args.project === undefined) {
                throw new Error("Missing required property 'project'");
            }
            inputs["domain"] = args ? args.domain : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["environmentScope"] = args ? args.environmentScope : undefined;
            inputs["kubernetesApiUrl"] = args ? args.kubernetesApiUrl : undefined;
            inputs["kubernetesAuthorizationType"] = args ? args.kubernetesAuthorizationType : undefined;
            inputs["kubernetesCaCert"] = args ? args.kubernetesCaCert : undefined;
            inputs["kubernetesNamespace"] = args ? args.kubernetesNamespace : undefined;
            inputs["kubernetesToken"] = args ? args.kubernetesToken : undefined;
            inputs["managed"] = args ? args.managed : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["project"] = args ? args.project : undefined;
            inputs["clusterType"] = undefined /*out*/;
            inputs["createdAt"] = undefined /*out*/;
            inputs["platformType"] = undefined /*out*/;
            inputs["providerType"] = undefined /*out*/;
        }
        super(ProjectCluster.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectCluster resources.
 */
export interface ProjectClusterState {
    readonly clusterType?: pulumi.Input<string>;
    readonly createdAt?: pulumi.Input<string>;
    /**
     * The base domain of the cluster.
     */
    readonly domain?: pulumi.Input<string>;
    /**
     * Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The associated environment to the cluster. Defaults to `*`.
     */
    readonly environmentScope?: pulumi.Input<string>;
    /**
     * The URL to access the Kubernetes API.
     */
    readonly kubernetesApiUrl?: pulumi.Input<string>;
    /**
     * The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
     */
    readonly kubernetesAuthorizationType?: pulumi.Input<string>;
    /**
     * TLS certificate (needed if API is using a self-signed TLS certificate).
     */
    readonly kubernetesCaCert?: pulumi.Input<string>;
    /**
     * The unique namespace related to the project.
     */
    readonly kubernetesNamespace?: pulumi.Input<string>;
    /**
     * The token to authenticate against Kubernetes.
     */
    readonly kubernetesToken?: pulumi.Input<string>;
    /**
     * Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
     */
    readonly managed?: pulumi.Input<boolean>;
    /**
     * The name of cluster.
     */
    readonly name?: pulumi.Input<string>;
    readonly platformType?: pulumi.Input<string>;
    /**
     * The id of the project to add the cluster to.
     */
    readonly project?: pulumi.Input<string>;
    readonly providerType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProjectCluster resource.
 */
export interface ProjectClusterArgs {
    /**
     * The base domain of the cluster.
     */
    readonly domain?: pulumi.Input<string>;
    /**
     * Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The associated environment to the cluster. Defaults to `*`.
     */
    readonly environmentScope?: pulumi.Input<string>;
    /**
     * The URL to access the Kubernetes API.
     */
    readonly kubernetesApiUrl: pulumi.Input<string>;
    /**
     * The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
     */
    readonly kubernetesAuthorizationType?: pulumi.Input<string>;
    /**
     * TLS certificate (needed if API is using a self-signed TLS certificate).
     */
    readonly kubernetesCaCert?: pulumi.Input<string>;
    /**
     * The unique namespace related to the project.
     */
    readonly kubernetesNamespace?: pulumi.Input<string>;
    /**
     * The token to authenticate against Kubernetes.
     */
    readonly kubernetesToken: pulumi.Input<string>;
    /**
     * Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
     */
    readonly managed?: pulumi.Input<boolean>;
    /**
     * The name of cluster.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The id of the project to add the cluster to.
     */
    readonly project: pulumi.Input<string>;
}
