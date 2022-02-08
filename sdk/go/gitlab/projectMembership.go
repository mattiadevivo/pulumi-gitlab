// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to add a current user to an existing project with a set access level.
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
// 		_, err := gitlab.NewProjectMembership(ctx, "test", &gitlab.ProjectMembershipArgs{
// 			AccessLevel: pulumi.String("guest"),
// 			ProjectId:   pulumi.String("12345"),
// 			UserId:      pulumi.Int(1337),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = gitlab.NewProjectMembership(ctx, "example", &gitlab.ProjectMembershipArgs{
// 			AccessLevel: pulumi.String("guest"),
// 			ProjectId:   pulumi.String("67890"),
// 			UserId:      pulumi.Int(1234),
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
// # GitLab project membership can be imported using an id made up of `project_id:user_id`, e.g.
//
// ```sh
//  $ pulumi import gitlab:index/projectMembership:ProjectMembership test "12345:1337"
// ```
type ProjectMembership struct {
	pulumi.CustomResourceState

	// The access level for the member. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `master`
	AccessLevel pulumi.StringOutput `pulumi:"accessLevel"`
	// The id of the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The id of the user.
	UserId pulumi.IntOutput `pulumi:"userId"`
}

// NewProjectMembership registers a new resource with the given unique name, arguments, and options.
func NewProjectMembership(ctx *pulumi.Context,
	name string, args *ProjectMembershipArgs, opts ...pulumi.ResourceOption) (*ProjectMembership, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessLevel == nil {
		return nil, errors.New("invalid value for required argument 'AccessLevel'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	var resource ProjectMembership
	err := ctx.RegisterResource("gitlab:index/projectMembership:ProjectMembership", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectMembership gets an existing ProjectMembership resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectMembership(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectMembershipState, opts ...pulumi.ResourceOption) (*ProjectMembership, error) {
	var resource ProjectMembership
	err := ctx.ReadResource("gitlab:index/projectMembership:ProjectMembership", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectMembership resources.
type projectMembershipState struct {
	// The access level for the member. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `master`
	AccessLevel *string `pulumi:"accessLevel"`
	// The id of the project.
	ProjectId *string `pulumi:"projectId"`
	// The id of the user.
	UserId *int `pulumi:"userId"`
}

type ProjectMembershipState struct {
	// The access level for the member. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `master`
	AccessLevel pulumi.StringPtrInput
	// The id of the project.
	ProjectId pulumi.StringPtrInput
	// The id of the user.
	UserId pulumi.IntPtrInput
}

func (ProjectMembershipState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectMembershipState)(nil)).Elem()
}

type projectMembershipArgs struct {
	// The access level for the member. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `master`
	AccessLevel string `pulumi:"accessLevel"`
	// The id of the project.
	ProjectId string `pulumi:"projectId"`
	// The id of the user.
	UserId int `pulumi:"userId"`
}

// The set of arguments for constructing a ProjectMembership resource.
type ProjectMembershipArgs struct {
	// The access level for the member. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `master`
	AccessLevel pulumi.StringInput
	// The id of the project.
	ProjectId pulumi.StringInput
	// The id of the user.
	UserId pulumi.IntInput
}

func (ProjectMembershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectMembershipArgs)(nil)).Elem()
}

type ProjectMembershipInput interface {
	pulumi.Input

	ToProjectMembershipOutput() ProjectMembershipOutput
	ToProjectMembershipOutputWithContext(ctx context.Context) ProjectMembershipOutput
}

func (*ProjectMembership) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectMembership)(nil)).Elem()
}

func (i *ProjectMembership) ToProjectMembershipOutput() ProjectMembershipOutput {
	return i.ToProjectMembershipOutputWithContext(context.Background())
}

func (i *ProjectMembership) ToProjectMembershipOutputWithContext(ctx context.Context) ProjectMembershipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMembershipOutput)
}

// ProjectMembershipArrayInput is an input type that accepts ProjectMembershipArray and ProjectMembershipArrayOutput values.
// You can construct a concrete instance of `ProjectMembershipArrayInput` via:
//
//          ProjectMembershipArray{ ProjectMembershipArgs{...} }
type ProjectMembershipArrayInput interface {
	pulumi.Input

	ToProjectMembershipArrayOutput() ProjectMembershipArrayOutput
	ToProjectMembershipArrayOutputWithContext(context.Context) ProjectMembershipArrayOutput
}

type ProjectMembershipArray []ProjectMembershipInput

func (ProjectMembershipArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectMembership)(nil)).Elem()
}

func (i ProjectMembershipArray) ToProjectMembershipArrayOutput() ProjectMembershipArrayOutput {
	return i.ToProjectMembershipArrayOutputWithContext(context.Background())
}

func (i ProjectMembershipArray) ToProjectMembershipArrayOutputWithContext(ctx context.Context) ProjectMembershipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMembershipArrayOutput)
}

// ProjectMembershipMapInput is an input type that accepts ProjectMembershipMap and ProjectMembershipMapOutput values.
// You can construct a concrete instance of `ProjectMembershipMapInput` via:
//
//          ProjectMembershipMap{ "key": ProjectMembershipArgs{...} }
type ProjectMembershipMapInput interface {
	pulumi.Input

	ToProjectMembershipMapOutput() ProjectMembershipMapOutput
	ToProjectMembershipMapOutputWithContext(context.Context) ProjectMembershipMapOutput
}

type ProjectMembershipMap map[string]ProjectMembershipInput

func (ProjectMembershipMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectMembership)(nil)).Elem()
}

func (i ProjectMembershipMap) ToProjectMembershipMapOutput() ProjectMembershipMapOutput {
	return i.ToProjectMembershipMapOutputWithContext(context.Background())
}

func (i ProjectMembershipMap) ToProjectMembershipMapOutputWithContext(ctx context.Context) ProjectMembershipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMembershipMapOutput)
}

type ProjectMembershipOutput struct{ *pulumi.OutputState }

func (ProjectMembershipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectMembership)(nil)).Elem()
}

func (o ProjectMembershipOutput) ToProjectMembershipOutput() ProjectMembershipOutput {
	return o
}

func (o ProjectMembershipOutput) ToProjectMembershipOutputWithContext(ctx context.Context) ProjectMembershipOutput {
	return o
}

type ProjectMembershipArrayOutput struct{ *pulumi.OutputState }

func (ProjectMembershipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectMembership)(nil)).Elem()
}

func (o ProjectMembershipArrayOutput) ToProjectMembershipArrayOutput() ProjectMembershipArrayOutput {
	return o
}

func (o ProjectMembershipArrayOutput) ToProjectMembershipArrayOutputWithContext(ctx context.Context) ProjectMembershipArrayOutput {
	return o
}

func (o ProjectMembershipArrayOutput) Index(i pulumi.IntInput) ProjectMembershipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectMembership {
		return vs[0].([]*ProjectMembership)[vs[1].(int)]
	}).(ProjectMembershipOutput)
}

type ProjectMembershipMapOutput struct{ *pulumi.OutputState }

func (ProjectMembershipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectMembership)(nil)).Elem()
}

func (o ProjectMembershipMapOutput) ToProjectMembershipMapOutput() ProjectMembershipMapOutput {
	return o
}

func (o ProjectMembershipMapOutput) ToProjectMembershipMapOutputWithContext(ctx context.Context) ProjectMembershipMapOutput {
	return o
}

func (o ProjectMembershipMapOutput) MapIndex(k pulumi.StringInput) ProjectMembershipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectMembership {
		return vs[0].(map[string]*ProjectMembership)[vs[1].(string)]
	}).(ProjectMembershipOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMembershipInput)(nil)).Elem(), &ProjectMembership{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMembershipArrayInput)(nil)).Elem(), ProjectMembershipArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMembershipMapInput)(nil)).Elem(), ProjectMembershipMap{})
	pulumi.RegisterOutputType(ProjectMembershipOutput{})
	pulumi.RegisterOutputType(ProjectMembershipArrayOutput{})
	pulumi.RegisterOutputType(ProjectMembershipMapOutput{})
}
