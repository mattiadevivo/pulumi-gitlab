// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to create and manage instance clusters for your GitLab instances.
 * For further information on clusters, consult the [gitlab
 * documentation](https://docs.gitlab.com/ee/user/instance/clusters/).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const bar = new gitlab.InstanceCluster("bar", {
 *     domain: "example.com",
 *     enabled: true,
 *     environmentScope: "*",
 *     kubernetesApiUrl: "https://124.124.124",
 *     kubernetesAuthorizationType: "rbac",
 *     kubernetesCaCert: "some-cert",
 *     kubernetesNamespace: "namespace",
 *     kubernetesToken: "some-token",
 *     managementProjectId: "123456",
 * });
 * ```
 *
 * ## Import
 *
 * # GitLab instance clusters can be imported using a `clusterid`, e.g.
 *
 * ```sh
 *  $ pulumi import gitlab:index/instanceCluster:InstanceCluster bar 123
 * ```
 */
export class InstanceCluster extends pulumi.CustomResource {
    /**
     * Get an existing InstanceCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceClusterState, opts?: pulumi.CustomResourceOptions): InstanceCluster {
        return new InstanceCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/instanceCluster:InstanceCluster';

    /**
     * Returns true if the given object is an instance of InstanceCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceCluster.__pulumiType;
    }

    /**
     * Cluster type.
     */
    public /*out*/ readonly clusterType!: pulumi.Output<string>;
    /**
     * Create time.
     */
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
     * The cluster authorization type. Valid values are `rbac`, `abac`, `unknownAuthorization`. Defaults to `rbac`.
     */
    public readonly kubernetesAuthorizationType!: pulumi.Output<string | undefined>;
    /**
     * TLS certificate (needed if API is using a self-signed TLS certificate).
     */
    public readonly kubernetesCaCert!: pulumi.Output<string | undefined>;
    /**
     * The unique namespace related to the instance.
     */
    public readonly kubernetesNamespace!: pulumi.Output<string | undefined>;
    /**
     * The token to authenticate against Kubernetes. This attribute cannot be read.
     */
    public readonly kubernetesToken!: pulumi.Output<string>;
    /**
     * Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
     */
    public readonly managed!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the management project for the cluster.
     */
    public readonly managementProjectId!: pulumi.Output<string | undefined>;
    /**
     * The name of cluster.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Platform type.
     */
    public /*out*/ readonly platformType!: pulumi.Output<string>;
    /**
     * Provider type.
     */
    public /*out*/ readonly providerType!: pulumi.Output<string>;

    /**
     * Create a InstanceCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceClusterArgs | InstanceClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceClusterState | undefined;
            resourceInputs["clusterType"] = state ? state.clusterType : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["environmentScope"] = state ? state.environmentScope : undefined;
            resourceInputs["kubernetesApiUrl"] = state ? state.kubernetesApiUrl : undefined;
            resourceInputs["kubernetesAuthorizationType"] = state ? state.kubernetesAuthorizationType : undefined;
            resourceInputs["kubernetesCaCert"] = state ? state.kubernetesCaCert : undefined;
            resourceInputs["kubernetesNamespace"] = state ? state.kubernetesNamespace : undefined;
            resourceInputs["kubernetesToken"] = state ? state.kubernetesToken : undefined;
            resourceInputs["managed"] = state ? state.managed : undefined;
            resourceInputs["managementProjectId"] = state ? state.managementProjectId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["platformType"] = state ? state.platformType : undefined;
            resourceInputs["providerType"] = state ? state.providerType : undefined;
        } else {
            const args = argsOrState as InstanceClusterArgs | undefined;
            if ((!args || args.kubernetesApiUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kubernetesApiUrl'");
            }
            if ((!args || args.kubernetesToken === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kubernetesToken'");
            }
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["environmentScope"] = args ? args.environmentScope : undefined;
            resourceInputs["kubernetesApiUrl"] = args ? args.kubernetesApiUrl : undefined;
            resourceInputs["kubernetesAuthorizationType"] = args ? args.kubernetesAuthorizationType : undefined;
            resourceInputs["kubernetesCaCert"] = args ? args.kubernetesCaCert : undefined;
            resourceInputs["kubernetesNamespace"] = args ? args.kubernetesNamespace : undefined;
            resourceInputs["kubernetesToken"] = args ? args.kubernetesToken : undefined;
            resourceInputs["managed"] = args ? args.managed : undefined;
            resourceInputs["managementProjectId"] = args ? args.managementProjectId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["clusterType"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["platformType"] = undefined /*out*/;
            resourceInputs["providerType"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceCluster resources.
 */
export interface InstanceClusterState {
    /**
     * Cluster type.
     */
    clusterType?: pulumi.Input<string>;
    /**
     * Create time.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The base domain of the cluster.
     */
    domain?: pulumi.Input<string>;
    /**
     * Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The associated environment to the cluster. Defaults to `*`.
     */
    environmentScope?: pulumi.Input<string>;
    /**
     * The URL to access the Kubernetes API.
     */
    kubernetesApiUrl?: pulumi.Input<string>;
    /**
     * The cluster authorization type. Valid values are `rbac`, `abac`, `unknownAuthorization`. Defaults to `rbac`.
     */
    kubernetesAuthorizationType?: pulumi.Input<string>;
    /**
     * TLS certificate (needed if API is using a self-signed TLS certificate).
     */
    kubernetesCaCert?: pulumi.Input<string>;
    /**
     * The unique namespace related to the instance.
     */
    kubernetesNamespace?: pulumi.Input<string>;
    /**
     * The token to authenticate against Kubernetes. This attribute cannot be read.
     */
    kubernetesToken?: pulumi.Input<string>;
    /**
     * Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
     */
    managed?: pulumi.Input<boolean>;
    /**
     * The ID of the management project for the cluster.
     */
    managementProjectId?: pulumi.Input<string>;
    /**
     * The name of cluster.
     */
    name?: pulumi.Input<string>;
    /**
     * Platform type.
     */
    platformType?: pulumi.Input<string>;
    /**
     * Provider type.
     */
    providerType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceCluster resource.
 */
export interface InstanceClusterArgs {
    /**
     * The base domain of the cluster.
     */
    domain?: pulumi.Input<string>;
    /**
     * Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The associated environment to the cluster. Defaults to `*`.
     */
    environmentScope?: pulumi.Input<string>;
    /**
     * The URL to access the Kubernetes API.
     */
    kubernetesApiUrl: pulumi.Input<string>;
    /**
     * The cluster authorization type. Valid values are `rbac`, `abac`, `unknownAuthorization`. Defaults to `rbac`.
     */
    kubernetesAuthorizationType?: pulumi.Input<string>;
    /**
     * TLS certificate (needed if API is using a self-signed TLS certificate).
     */
    kubernetesCaCert?: pulumi.Input<string>;
    /**
     * The unique namespace related to the instance.
     */
    kubernetesNamespace?: pulumi.Input<string>;
    /**
     * The token to authenticate against Kubernetes. This attribute cannot be read.
     */
    kubernetesToken: pulumi.Input<string>;
    /**
     * Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
     */
    managed?: pulumi.Input<boolean>;
    /**
     * The ID of the management project for the cluster.
     */
    managementProjectId?: pulumi.Input<string>;
    /**
     * The name of cluster.
     */
    name?: pulumi.Input<string>;
}
