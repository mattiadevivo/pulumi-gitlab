// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `GroupCluster` resource allows to manage the lifecycle of a group cluster.
//
// > This is deprecated GitLab feature since 14.5
//
// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/group_clusters.html)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gitlab/sdk/v4/go/gitlab"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		foo, err := gitlab.NewGroup(ctx, "foo", &gitlab.GroupArgs{
// 			Path: pulumi.String("foo-path"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = gitlab.NewGroupCluster(ctx, "bar", &gitlab.GroupClusterArgs{
// 			Group:                       foo.ID(),
// 			Domain:                      pulumi.String("example.com"),
// 			Enabled:                     pulumi.Bool(true),
// 			KubernetesApiUrl:            pulumi.String("https://124.124.124"),
// 			KubernetesToken:             pulumi.String("some-token"),
// 			KubernetesCaCert:            pulumi.String("some-cert"),
// 			KubernetesAuthorizationType: pulumi.String("rbac"),
// 			EnvironmentScope:            pulumi.String("*"),
// 			ManagementProjectId:         pulumi.String("123456"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// # GitLab group clusters can be imported using an id made up of `groupid:clusterid`, e.g.
//
// ```sh
//  $ pulumi import gitlab:index/groupCluster:GroupCluster bar 123:321
// ```
type GroupCluster struct {
	pulumi.CustomResourceState

	// Cluster type.
	ClusterType pulumi.StringOutput `pulumi:"clusterType"`
	// Create time.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The base domain of the cluster.
	Domain pulumi.StringPtrOutput `pulumi:"domain"`
	// Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The associated environment to the cluster. Defaults to `*`.
	EnvironmentScope pulumi.StringPtrOutput `pulumi:"environmentScope"`
	// The id of the group to add the cluster to.
	Group pulumi.StringOutput `pulumi:"group"`
	// The URL to access the Kubernetes API.
	KubernetesApiUrl pulumi.StringOutput `pulumi:"kubernetesApiUrl"`
	// The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
	KubernetesAuthorizationType pulumi.StringPtrOutput `pulumi:"kubernetesAuthorizationType"`
	// TLS certificate (needed if API is using a self-signed TLS certificate).
	KubernetesCaCert pulumi.StringPtrOutput `pulumi:"kubernetesCaCert"`
	// The token to authenticate against Kubernetes.
	KubernetesToken pulumi.StringOutput `pulumi:"kubernetesToken"`
	// Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
	Managed pulumi.BoolPtrOutput `pulumi:"managed"`
	// The ID of the management project for the cluster.
	ManagementProjectId pulumi.StringPtrOutput `pulumi:"managementProjectId"`
	// The name of cluster.
	Name pulumi.StringOutput `pulumi:"name"`
	// Platform type.
	PlatformType pulumi.StringOutput `pulumi:"platformType"`
	// Provider type.
	ProviderType pulumi.StringOutput `pulumi:"providerType"`
}

// NewGroupCluster registers a new resource with the given unique name, arguments, and options.
func NewGroupCluster(ctx *pulumi.Context,
	name string, args *GroupClusterArgs, opts ...pulumi.ResourceOption) (*GroupCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Group == nil {
		return nil, errors.New("invalid value for required argument 'Group'")
	}
	if args.KubernetesApiUrl == nil {
		return nil, errors.New("invalid value for required argument 'KubernetesApiUrl'")
	}
	if args.KubernetesToken == nil {
		return nil, errors.New("invalid value for required argument 'KubernetesToken'")
	}
	var resource GroupCluster
	err := ctx.RegisterResource("gitlab:index/groupCluster:GroupCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupCluster gets an existing GroupCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupClusterState, opts ...pulumi.ResourceOption) (*GroupCluster, error) {
	var resource GroupCluster
	err := ctx.ReadResource("gitlab:index/groupCluster:GroupCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupCluster resources.
type groupClusterState struct {
	// Cluster type.
	ClusterType *string `pulumi:"clusterType"`
	// Create time.
	CreatedAt *string `pulumi:"createdAt"`
	// The base domain of the cluster.
	Domain *string `pulumi:"domain"`
	// Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
	Enabled *bool `pulumi:"enabled"`
	// The associated environment to the cluster. Defaults to `*`.
	EnvironmentScope *string `pulumi:"environmentScope"`
	// The id of the group to add the cluster to.
	Group *string `pulumi:"group"`
	// The URL to access the Kubernetes API.
	KubernetesApiUrl *string `pulumi:"kubernetesApiUrl"`
	// The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
	KubernetesAuthorizationType *string `pulumi:"kubernetesAuthorizationType"`
	// TLS certificate (needed if API is using a self-signed TLS certificate).
	KubernetesCaCert *string `pulumi:"kubernetesCaCert"`
	// The token to authenticate against Kubernetes.
	KubernetesToken *string `pulumi:"kubernetesToken"`
	// Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
	Managed *bool `pulumi:"managed"`
	// The ID of the management project for the cluster.
	ManagementProjectId *string `pulumi:"managementProjectId"`
	// The name of cluster.
	Name *string `pulumi:"name"`
	// Platform type.
	PlatformType *string `pulumi:"platformType"`
	// Provider type.
	ProviderType *string `pulumi:"providerType"`
}

type GroupClusterState struct {
	// Cluster type.
	ClusterType pulumi.StringPtrInput
	// Create time.
	CreatedAt pulumi.StringPtrInput
	// The base domain of the cluster.
	Domain pulumi.StringPtrInput
	// Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
	Enabled pulumi.BoolPtrInput
	// The associated environment to the cluster. Defaults to `*`.
	EnvironmentScope pulumi.StringPtrInput
	// The id of the group to add the cluster to.
	Group pulumi.StringPtrInput
	// The URL to access the Kubernetes API.
	KubernetesApiUrl pulumi.StringPtrInput
	// The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
	KubernetesAuthorizationType pulumi.StringPtrInput
	// TLS certificate (needed if API is using a self-signed TLS certificate).
	KubernetesCaCert pulumi.StringPtrInput
	// The token to authenticate against Kubernetes.
	KubernetesToken pulumi.StringPtrInput
	// Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
	Managed pulumi.BoolPtrInput
	// The ID of the management project for the cluster.
	ManagementProjectId pulumi.StringPtrInput
	// The name of cluster.
	Name pulumi.StringPtrInput
	// Platform type.
	PlatformType pulumi.StringPtrInput
	// Provider type.
	ProviderType pulumi.StringPtrInput
}

func (GroupClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupClusterState)(nil)).Elem()
}

type groupClusterArgs struct {
	// The base domain of the cluster.
	Domain *string `pulumi:"domain"`
	// Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
	Enabled *bool `pulumi:"enabled"`
	// The associated environment to the cluster. Defaults to `*`.
	EnvironmentScope *string `pulumi:"environmentScope"`
	// The id of the group to add the cluster to.
	Group string `pulumi:"group"`
	// The URL to access the Kubernetes API.
	KubernetesApiUrl string `pulumi:"kubernetesApiUrl"`
	// The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
	KubernetesAuthorizationType *string `pulumi:"kubernetesAuthorizationType"`
	// TLS certificate (needed if API is using a self-signed TLS certificate).
	KubernetesCaCert *string `pulumi:"kubernetesCaCert"`
	// The token to authenticate against Kubernetes.
	KubernetesToken string `pulumi:"kubernetesToken"`
	// Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
	Managed *bool `pulumi:"managed"`
	// The ID of the management project for the cluster.
	ManagementProjectId *string `pulumi:"managementProjectId"`
	// The name of cluster.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a GroupCluster resource.
type GroupClusterArgs struct {
	// The base domain of the cluster.
	Domain pulumi.StringPtrInput
	// Determines if cluster is active or not. Defaults to `true`. This attribute cannot be read.
	Enabled pulumi.BoolPtrInput
	// The associated environment to the cluster. Defaults to `*`.
	EnvironmentScope pulumi.StringPtrInput
	// The id of the group to add the cluster to.
	Group pulumi.StringInput
	// The URL to access the Kubernetes API.
	KubernetesApiUrl pulumi.StringInput
	// The cluster authorization type. Valid values are `rbac`, `abac`, `unknown_authorization`. Defaults to `rbac`.
	KubernetesAuthorizationType pulumi.StringPtrInput
	// TLS certificate (needed if API is using a self-signed TLS certificate).
	KubernetesCaCert pulumi.StringPtrInput
	// The token to authenticate against Kubernetes.
	KubernetesToken pulumi.StringInput
	// Determines if cluster is managed by gitlab or not. Defaults to `true`. This attribute cannot be read.
	Managed pulumi.BoolPtrInput
	// The ID of the management project for the cluster.
	ManagementProjectId pulumi.StringPtrInput
	// The name of cluster.
	Name pulumi.StringPtrInput
}

func (GroupClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupClusterArgs)(nil)).Elem()
}

type GroupClusterInput interface {
	pulumi.Input

	ToGroupClusterOutput() GroupClusterOutput
	ToGroupClusterOutputWithContext(ctx context.Context) GroupClusterOutput
}

func (*GroupCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupCluster)(nil)).Elem()
}

func (i *GroupCluster) ToGroupClusterOutput() GroupClusterOutput {
	return i.ToGroupClusterOutputWithContext(context.Background())
}

func (i *GroupCluster) ToGroupClusterOutputWithContext(ctx context.Context) GroupClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupClusterOutput)
}

// GroupClusterArrayInput is an input type that accepts GroupClusterArray and GroupClusterArrayOutput values.
// You can construct a concrete instance of `GroupClusterArrayInput` via:
//
//          GroupClusterArray{ GroupClusterArgs{...} }
type GroupClusterArrayInput interface {
	pulumi.Input

	ToGroupClusterArrayOutput() GroupClusterArrayOutput
	ToGroupClusterArrayOutputWithContext(context.Context) GroupClusterArrayOutput
}

type GroupClusterArray []GroupClusterInput

func (GroupClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupCluster)(nil)).Elem()
}

func (i GroupClusterArray) ToGroupClusterArrayOutput() GroupClusterArrayOutput {
	return i.ToGroupClusterArrayOutputWithContext(context.Background())
}

func (i GroupClusterArray) ToGroupClusterArrayOutputWithContext(ctx context.Context) GroupClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupClusterArrayOutput)
}

// GroupClusterMapInput is an input type that accepts GroupClusterMap and GroupClusterMapOutput values.
// You can construct a concrete instance of `GroupClusterMapInput` via:
//
//          GroupClusterMap{ "key": GroupClusterArgs{...} }
type GroupClusterMapInput interface {
	pulumi.Input

	ToGroupClusterMapOutput() GroupClusterMapOutput
	ToGroupClusterMapOutputWithContext(context.Context) GroupClusterMapOutput
}

type GroupClusterMap map[string]GroupClusterInput

func (GroupClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupCluster)(nil)).Elem()
}

func (i GroupClusterMap) ToGroupClusterMapOutput() GroupClusterMapOutput {
	return i.ToGroupClusterMapOutputWithContext(context.Background())
}

func (i GroupClusterMap) ToGroupClusterMapOutputWithContext(ctx context.Context) GroupClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupClusterMapOutput)
}

type GroupClusterOutput struct{ *pulumi.OutputState }

func (GroupClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupCluster)(nil)).Elem()
}

func (o GroupClusterOutput) ToGroupClusterOutput() GroupClusterOutput {
	return o
}

func (o GroupClusterOutput) ToGroupClusterOutputWithContext(ctx context.Context) GroupClusterOutput {
	return o
}

type GroupClusterArrayOutput struct{ *pulumi.OutputState }

func (GroupClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupCluster)(nil)).Elem()
}

func (o GroupClusterArrayOutput) ToGroupClusterArrayOutput() GroupClusterArrayOutput {
	return o
}

func (o GroupClusterArrayOutput) ToGroupClusterArrayOutputWithContext(ctx context.Context) GroupClusterArrayOutput {
	return o
}

func (o GroupClusterArrayOutput) Index(i pulumi.IntInput) GroupClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GroupCluster {
		return vs[0].([]*GroupCluster)[vs[1].(int)]
	}).(GroupClusterOutput)
}

type GroupClusterMapOutput struct{ *pulumi.OutputState }

func (GroupClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupCluster)(nil)).Elem()
}

func (o GroupClusterMapOutput) ToGroupClusterMapOutput() GroupClusterMapOutput {
	return o
}

func (o GroupClusterMapOutput) ToGroupClusterMapOutputWithContext(ctx context.Context) GroupClusterMapOutput {
	return o
}

func (o GroupClusterMapOutput) MapIndex(k pulumi.StringInput) GroupClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GroupCluster {
		return vs[0].(map[string]*GroupCluster)[vs[1].(string)]
	}).(GroupClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupClusterInput)(nil)).Elem(), &GroupCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupClusterArrayInput)(nil)).Elem(), GroupClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupClusterMapInput)(nil)).Elem(), GroupClusterMap{})
	pulumi.RegisterOutputType(GroupClusterOutput{})
	pulumi.RegisterOutputType(GroupClusterArrayOutput{})
	pulumi.RegisterOutputType(GroupClusterMapOutput{})
}
