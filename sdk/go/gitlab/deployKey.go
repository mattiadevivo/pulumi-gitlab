// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `DeployKey` resource allows to manage the lifecycle of a deploy key.
//
// > To enable an already existing deploy key for another project use the `gitlabProjectDeployKey` resource.
//
// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/deploy_keys.html)
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
// 		_, err := gitlab.NewDeployKey(ctx, "example", &gitlab.DeployKeyArgs{
// 			Key:     pulumi.String("ssh-rsa AAAA..."),
// 			Project: pulumi.String("example/deploying"),
// 			Title:   pulumi.String("Example deploy key"),
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
// # GitLab deploy keys can be imported using an id made up of `{project_id}:{deploy_key_id}`, e.g.
//
// ```sh
//  $ pulumi import gitlab:index/deployKey:DeployKey test 1:3
// ```
type DeployKey struct {
	pulumi.CustomResourceState

	// Allow this deploy key to be used to push changes to the project. Defaults to `false`. **NOTE::** this cannot currently
	// be managed.
	CanPush pulumi.BoolPtrOutput `pulumi:"canPush"`
	// The public ssh key body.
	Key pulumi.StringOutput `pulumi:"key"`
	// The name or id of the project to add the deploy key to.
	Project pulumi.StringOutput `pulumi:"project"`
	// A title to describe the deploy key with.
	Title pulumi.StringOutput `pulumi:"title"`
}

// NewDeployKey registers a new resource with the given unique name, arguments, and options.
func NewDeployKey(ctx *pulumi.Context,
	name string, args *DeployKeyArgs, opts ...pulumi.ResourceOption) (*DeployKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	var resource DeployKey
	err := ctx.RegisterResource("gitlab:index/deployKey:DeployKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeployKey gets an existing DeployKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeployKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeployKeyState, opts ...pulumi.ResourceOption) (*DeployKey, error) {
	var resource DeployKey
	err := ctx.ReadResource("gitlab:index/deployKey:DeployKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeployKey resources.
type deployKeyState struct {
	// Allow this deploy key to be used to push changes to the project. Defaults to `false`. **NOTE::** this cannot currently
	// be managed.
	CanPush *bool `pulumi:"canPush"`
	// The public ssh key body.
	Key *string `pulumi:"key"`
	// The name or id of the project to add the deploy key to.
	Project *string `pulumi:"project"`
	// A title to describe the deploy key with.
	Title *string `pulumi:"title"`
}

type DeployKeyState struct {
	// Allow this deploy key to be used to push changes to the project. Defaults to `false`. **NOTE::** this cannot currently
	// be managed.
	CanPush pulumi.BoolPtrInput
	// The public ssh key body.
	Key pulumi.StringPtrInput
	// The name or id of the project to add the deploy key to.
	Project pulumi.StringPtrInput
	// A title to describe the deploy key with.
	Title pulumi.StringPtrInput
}

func (DeployKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*deployKeyState)(nil)).Elem()
}

type deployKeyArgs struct {
	// Allow this deploy key to be used to push changes to the project. Defaults to `false`. **NOTE::** this cannot currently
	// be managed.
	CanPush *bool `pulumi:"canPush"`
	// The public ssh key body.
	Key string `pulumi:"key"`
	// The name or id of the project to add the deploy key to.
	Project string `pulumi:"project"`
	// A title to describe the deploy key with.
	Title string `pulumi:"title"`
}

// The set of arguments for constructing a DeployKey resource.
type DeployKeyArgs struct {
	// Allow this deploy key to be used to push changes to the project. Defaults to `false`. **NOTE::** this cannot currently
	// be managed.
	CanPush pulumi.BoolPtrInput
	// The public ssh key body.
	Key pulumi.StringInput
	// The name or id of the project to add the deploy key to.
	Project pulumi.StringInput
	// A title to describe the deploy key with.
	Title pulumi.StringInput
}

func (DeployKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deployKeyArgs)(nil)).Elem()
}

type DeployKeyInput interface {
	pulumi.Input

	ToDeployKeyOutput() DeployKeyOutput
	ToDeployKeyOutputWithContext(ctx context.Context) DeployKeyOutput
}

func (*DeployKey) ElementType() reflect.Type {
	return reflect.TypeOf((**DeployKey)(nil)).Elem()
}

func (i *DeployKey) ToDeployKeyOutput() DeployKeyOutput {
	return i.ToDeployKeyOutputWithContext(context.Background())
}

func (i *DeployKey) ToDeployKeyOutputWithContext(ctx context.Context) DeployKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeployKeyOutput)
}

// DeployKeyArrayInput is an input type that accepts DeployKeyArray and DeployKeyArrayOutput values.
// You can construct a concrete instance of `DeployKeyArrayInput` via:
//
//          DeployKeyArray{ DeployKeyArgs{...} }
type DeployKeyArrayInput interface {
	pulumi.Input

	ToDeployKeyArrayOutput() DeployKeyArrayOutput
	ToDeployKeyArrayOutputWithContext(context.Context) DeployKeyArrayOutput
}

type DeployKeyArray []DeployKeyInput

func (DeployKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeployKey)(nil)).Elem()
}

func (i DeployKeyArray) ToDeployKeyArrayOutput() DeployKeyArrayOutput {
	return i.ToDeployKeyArrayOutputWithContext(context.Background())
}

func (i DeployKeyArray) ToDeployKeyArrayOutputWithContext(ctx context.Context) DeployKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeployKeyArrayOutput)
}

// DeployKeyMapInput is an input type that accepts DeployKeyMap and DeployKeyMapOutput values.
// You can construct a concrete instance of `DeployKeyMapInput` via:
//
//          DeployKeyMap{ "key": DeployKeyArgs{...} }
type DeployKeyMapInput interface {
	pulumi.Input

	ToDeployKeyMapOutput() DeployKeyMapOutput
	ToDeployKeyMapOutputWithContext(context.Context) DeployKeyMapOutput
}

type DeployKeyMap map[string]DeployKeyInput

func (DeployKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeployKey)(nil)).Elem()
}

func (i DeployKeyMap) ToDeployKeyMapOutput() DeployKeyMapOutput {
	return i.ToDeployKeyMapOutputWithContext(context.Background())
}

func (i DeployKeyMap) ToDeployKeyMapOutputWithContext(ctx context.Context) DeployKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeployKeyMapOutput)
}

type DeployKeyOutput struct{ *pulumi.OutputState }

func (DeployKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeployKey)(nil)).Elem()
}

func (o DeployKeyOutput) ToDeployKeyOutput() DeployKeyOutput {
	return o
}

func (o DeployKeyOutput) ToDeployKeyOutputWithContext(ctx context.Context) DeployKeyOutput {
	return o
}

type DeployKeyArrayOutput struct{ *pulumi.OutputState }

func (DeployKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeployKey)(nil)).Elem()
}

func (o DeployKeyArrayOutput) ToDeployKeyArrayOutput() DeployKeyArrayOutput {
	return o
}

func (o DeployKeyArrayOutput) ToDeployKeyArrayOutputWithContext(ctx context.Context) DeployKeyArrayOutput {
	return o
}

func (o DeployKeyArrayOutput) Index(i pulumi.IntInput) DeployKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeployKey {
		return vs[0].([]*DeployKey)[vs[1].(int)]
	}).(DeployKeyOutput)
}

type DeployKeyMapOutput struct{ *pulumi.OutputState }

func (DeployKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeployKey)(nil)).Elem()
}

func (o DeployKeyMapOutput) ToDeployKeyMapOutput() DeployKeyMapOutput {
	return o
}

func (o DeployKeyMapOutput) ToDeployKeyMapOutputWithContext(ctx context.Context) DeployKeyMapOutput {
	return o
}

func (o DeployKeyMapOutput) MapIndex(k pulumi.StringInput) DeployKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeployKey {
		return vs[0].(map[string]*DeployKey)[vs[1].(string)]
	}).(DeployKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeployKeyInput)(nil)).Elem(), &DeployKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeployKeyArrayInput)(nil)).Elem(), DeployKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeployKeyMapInput)(nil)).Elem(), DeployKeyMap{})
	pulumi.RegisterOutputType(DeployKeyOutput{})
	pulumi.RegisterOutputType(DeployKeyArrayOutput{})
	pulumi.RegisterOutputType(DeployKeyMapOutput{})
}
