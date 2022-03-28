// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `ProjectCustomAttribute` resource allows to manage custom attributes for a project.
//
// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/custom_attributes.html)
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
// 		_, err := gitlab.NewProjectCustomAttribute(ctx, "attr", &gitlab.ProjectCustomAttributeArgs{
// 			Key:     pulumi.String("location"),
// 			Project: pulumi.Int(42),
// 			Value:   pulumi.String("Greenland"),
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
// # You can import a project custom attribute using an id made up of `{project-id}:{key}`, e.g.
//
// ```sh
//  $ pulumi import gitlab:index/projectCustomAttribute:ProjectCustomAttribute attr 42:location
// ```
type ProjectCustomAttribute struct {
	pulumi.CustomResourceState

	// Key for the Custom Attribute.
	Key pulumi.StringOutput `pulumi:"key"`
	// The id of the project.
	Project pulumi.IntOutput `pulumi:"project"`
	// Value for the Custom Attribute.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewProjectCustomAttribute registers a new resource with the given unique name, arguments, and options.
func NewProjectCustomAttribute(ctx *pulumi.Context,
	name string, args *ProjectCustomAttributeArgs, opts ...pulumi.ResourceOption) (*ProjectCustomAttribute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	var resource ProjectCustomAttribute
	err := ctx.RegisterResource("gitlab:index/projectCustomAttribute:ProjectCustomAttribute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectCustomAttribute gets an existing ProjectCustomAttribute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectCustomAttribute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectCustomAttributeState, opts ...pulumi.ResourceOption) (*ProjectCustomAttribute, error) {
	var resource ProjectCustomAttribute
	err := ctx.ReadResource("gitlab:index/projectCustomAttribute:ProjectCustomAttribute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectCustomAttribute resources.
type projectCustomAttributeState struct {
	// Key for the Custom Attribute.
	Key *string `pulumi:"key"`
	// The id of the project.
	Project *int `pulumi:"project"`
	// Value for the Custom Attribute.
	Value *string `pulumi:"value"`
}

type ProjectCustomAttributeState struct {
	// Key for the Custom Attribute.
	Key pulumi.StringPtrInput
	// The id of the project.
	Project pulumi.IntPtrInput
	// Value for the Custom Attribute.
	Value pulumi.StringPtrInput
}

func (ProjectCustomAttributeState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectCustomAttributeState)(nil)).Elem()
}

type projectCustomAttributeArgs struct {
	// Key for the Custom Attribute.
	Key string `pulumi:"key"`
	// The id of the project.
	Project int `pulumi:"project"`
	// Value for the Custom Attribute.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a ProjectCustomAttribute resource.
type ProjectCustomAttributeArgs struct {
	// Key for the Custom Attribute.
	Key pulumi.StringInput
	// The id of the project.
	Project pulumi.IntInput
	// Value for the Custom Attribute.
	Value pulumi.StringInput
}

func (ProjectCustomAttributeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectCustomAttributeArgs)(nil)).Elem()
}

type ProjectCustomAttributeInput interface {
	pulumi.Input

	ToProjectCustomAttributeOutput() ProjectCustomAttributeOutput
	ToProjectCustomAttributeOutputWithContext(ctx context.Context) ProjectCustomAttributeOutput
}

func (*ProjectCustomAttribute) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCustomAttribute)(nil)).Elem()
}

func (i *ProjectCustomAttribute) ToProjectCustomAttributeOutput() ProjectCustomAttributeOutput {
	return i.ToProjectCustomAttributeOutputWithContext(context.Background())
}

func (i *ProjectCustomAttribute) ToProjectCustomAttributeOutputWithContext(ctx context.Context) ProjectCustomAttributeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCustomAttributeOutput)
}

// ProjectCustomAttributeArrayInput is an input type that accepts ProjectCustomAttributeArray and ProjectCustomAttributeArrayOutput values.
// You can construct a concrete instance of `ProjectCustomAttributeArrayInput` via:
//
//          ProjectCustomAttributeArray{ ProjectCustomAttributeArgs{...} }
type ProjectCustomAttributeArrayInput interface {
	pulumi.Input

	ToProjectCustomAttributeArrayOutput() ProjectCustomAttributeArrayOutput
	ToProjectCustomAttributeArrayOutputWithContext(context.Context) ProjectCustomAttributeArrayOutput
}

type ProjectCustomAttributeArray []ProjectCustomAttributeInput

func (ProjectCustomAttributeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectCustomAttribute)(nil)).Elem()
}

func (i ProjectCustomAttributeArray) ToProjectCustomAttributeArrayOutput() ProjectCustomAttributeArrayOutput {
	return i.ToProjectCustomAttributeArrayOutputWithContext(context.Background())
}

func (i ProjectCustomAttributeArray) ToProjectCustomAttributeArrayOutputWithContext(ctx context.Context) ProjectCustomAttributeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCustomAttributeArrayOutput)
}

// ProjectCustomAttributeMapInput is an input type that accepts ProjectCustomAttributeMap and ProjectCustomAttributeMapOutput values.
// You can construct a concrete instance of `ProjectCustomAttributeMapInput` via:
//
//          ProjectCustomAttributeMap{ "key": ProjectCustomAttributeArgs{...} }
type ProjectCustomAttributeMapInput interface {
	pulumi.Input

	ToProjectCustomAttributeMapOutput() ProjectCustomAttributeMapOutput
	ToProjectCustomAttributeMapOutputWithContext(context.Context) ProjectCustomAttributeMapOutput
}

type ProjectCustomAttributeMap map[string]ProjectCustomAttributeInput

func (ProjectCustomAttributeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectCustomAttribute)(nil)).Elem()
}

func (i ProjectCustomAttributeMap) ToProjectCustomAttributeMapOutput() ProjectCustomAttributeMapOutput {
	return i.ToProjectCustomAttributeMapOutputWithContext(context.Background())
}

func (i ProjectCustomAttributeMap) ToProjectCustomAttributeMapOutputWithContext(ctx context.Context) ProjectCustomAttributeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCustomAttributeMapOutput)
}

type ProjectCustomAttributeOutput struct{ *pulumi.OutputState }

func (ProjectCustomAttributeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCustomAttribute)(nil)).Elem()
}

func (o ProjectCustomAttributeOutput) ToProjectCustomAttributeOutput() ProjectCustomAttributeOutput {
	return o
}

func (o ProjectCustomAttributeOutput) ToProjectCustomAttributeOutputWithContext(ctx context.Context) ProjectCustomAttributeOutput {
	return o
}

type ProjectCustomAttributeArrayOutput struct{ *pulumi.OutputState }

func (ProjectCustomAttributeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectCustomAttribute)(nil)).Elem()
}

func (o ProjectCustomAttributeArrayOutput) ToProjectCustomAttributeArrayOutput() ProjectCustomAttributeArrayOutput {
	return o
}

func (o ProjectCustomAttributeArrayOutput) ToProjectCustomAttributeArrayOutputWithContext(ctx context.Context) ProjectCustomAttributeArrayOutput {
	return o
}

func (o ProjectCustomAttributeArrayOutput) Index(i pulumi.IntInput) ProjectCustomAttributeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectCustomAttribute {
		return vs[0].([]*ProjectCustomAttribute)[vs[1].(int)]
	}).(ProjectCustomAttributeOutput)
}

type ProjectCustomAttributeMapOutput struct{ *pulumi.OutputState }

func (ProjectCustomAttributeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectCustomAttribute)(nil)).Elem()
}

func (o ProjectCustomAttributeMapOutput) ToProjectCustomAttributeMapOutput() ProjectCustomAttributeMapOutput {
	return o
}

func (o ProjectCustomAttributeMapOutput) ToProjectCustomAttributeMapOutputWithContext(ctx context.Context) ProjectCustomAttributeMapOutput {
	return o
}

func (o ProjectCustomAttributeMapOutput) MapIndex(k pulumi.StringInput) ProjectCustomAttributeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectCustomAttribute {
		return vs[0].(map[string]*ProjectCustomAttribute)[vs[1].(string)]
	}).(ProjectCustomAttributeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCustomAttributeInput)(nil)).Elem(), &ProjectCustomAttribute{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCustomAttributeArrayInput)(nil)).Elem(), ProjectCustomAttributeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCustomAttributeMapInput)(nil)).Elem(), ProjectCustomAttributeMap{})
	pulumi.RegisterOutputType(ProjectCustomAttributeOutput{})
	pulumi.RegisterOutputType(ProjectCustomAttributeArrayOutput{})
	pulumi.RegisterOutputType(ProjectCustomAttributeMapOutput{})
}
