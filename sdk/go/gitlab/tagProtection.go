// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## # gitlab\_tag\_protection
//
// This resource allows you to protect a specific tag or wildcard by an access level so that the user with less access level cannot Create the tags.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gitlab/sdk/v3/go/gitlab"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := gitlab.NewTagProtection(ctx, "tagProtect", &gitlab.TagProtectionArgs{
// 			CreateAccessLevel: pulumi.String("developer"),
// 			Project:           pulumi.String("12345"),
// 			Tag:               pulumi.String("TagProtected"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type TagProtection struct {
	pulumi.CustomResourceState

	// One of five levels of access to the project.
	CreateAccessLevel pulumi.StringOutput `pulumi:"createAccessLevel"`
	// The id of the project.
	Project pulumi.StringOutput `pulumi:"project"`
	// Name of the tag or wildcard.
	Tag pulumi.StringOutput `pulumi:"tag"`
}

// NewTagProtection registers a new resource with the given unique name, arguments, and options.
func NewTagProtection(ctx *pulumi.Context,
	name string, args *TagProtectionArgs, opts ...pulumi.ResourceOption) (*TagProtection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CreateAccessLevel == nil {
		return nil, errors.New("invalid value for required argument 'CreateAccessLevel'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Tag == nil {
		return nil, errors.New("invalid value for required argument 'Tag'")
	}
	var resource TagProtection
	err := ctx.RegisterResource("gitlab:index/tagProtection:TagProtection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTagProtection gets an existing TagProtection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTagProtection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagProtectionState, opts ...pulumi.ResourceOption) (*TagProtection, error) {
	var resource TagProtection
	err := ctx.ReadResource("gitlab:index/tagProtection:TagProtection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TagProtection resources.
type tagProtectionState struct {
	// One of five levels of access to the project.
	CreateAccessLevel *string `pulumi:"createAccessLevel"`
	// The id of the project.
	Project *string `pulumi:"project"`
	// Name of the tag or wildcard.
	Tag *string `pulumi:"tag"`
}

type TagProtectionState struct {
	// One of five levels of access to the project.
	CreateAccessLevel pulumi.StringPtrInput
	// The id of the project.
	Project pulumi.StringPtrInput
	// Name of the tag or wildcard.
	Tag pulumi.StringPtrInput
}

func (TagProtectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagProtectionState)(nil)).Elem()
}

type tagProtectionArgs struct {
	// One of five levels of access to the project.
	CreateAccessLevel string `pulumi:"createAccessLevel"`
	// The id of the project.
	Project string `pulumi:"project"`
	// Name of the tag or wildcard.
	Tag string `pulumi:"tag"`
}

// The set of arguments for constructing a TagProtection resource.
type TagProtectionArgs struct {
	// One of five levels of access to the project.
	CreateAccessLevel pulumi.StringInput
	// The id of the project.
	Project pulumi.StringInput
	// Name of the tag or wildcard.
	Tag pulumi.StringInput
}

func (TagProtectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagProtectionArgs)(nil)).Elem()
}

type TagProtectionInput interface {
	pulumi.Input

	ToTagProtectionOutput() TagProtectionOutput
	ToTagProtectionOutputWithContext(ctx context.Context) TagProtectionOutput
}

func (TagProtection) ElementType() reflect.Type {
	return reflect.TypeOf((*TagProtection)(nil)).Elem()
}

func (i TagProtection) ToTagProtectionOutput() TagProtectionOutput {
	return i.ToTagProtectionOutputWithContext(context.Background())
}

func (i TagProtection) ToTagProtectionOutputWithContext(ctx context.Context) TagProtectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagProtectionOutput)
}

type TagProtectionOutput struct {
	*pulumi.OutputState
}

func (TagProtectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TagProtectionOutput)(nil)).Elem()
}

func (o TagProtectionOutput) ToTagProtectionOutput() TagProtectionOutput {
	return o
}

func (o TagProtectionOutput) ToTagProtectionOutputWithContext(ctx context.Context) TagProtectionOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(TagProtectionOutput{})
}
