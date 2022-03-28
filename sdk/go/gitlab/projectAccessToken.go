// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `ProjectAccessToken` resource allows to manage the lifecycle of a project access token.
//
// **Upstream API**: [GitLab API docs](https://docs.gitlab.com/ee/api/project_access_tokens.html)
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
// 		exampleProjectAccessToken, err := gitlab.NewProjectAccessToken(ctx, "exampleProjectAccessToken", &gitlab.ProjectAccessTokenArgs{
// 			Project:   pulumi.String("25"),
// 			ExpiresAt: pulumi.String("2020-03-14"),
// 			Scopes: pulumi.StringArray{
// 				pulumi.String("api"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = gitlab.NewProjectVariable(ctx, "exampleProjectVariable", &gitlab.ProjectVariableArgs{
// 			Project: pulumi.Any(gitlab_project.Example.Id),
// 			Key:     pulumi.String("pat"),
// 			Value:   exampleProjectAccessToken.Token,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type ProjectAccessToken struct {
	pulumi.CustomResourceState

	// True if the token is active.
	Active pulumi.BoolOutput `pulumi:"active"`
	// Time the token has been created, RFC3339 format.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Time the token will expire it, YYYY-MM-DD format. Will not expire per default.
	ExpiresAt pulumi.StringPtrOutput `pulumi:"expiresAt"`
	// A name to describe the project access token.
	Name pulumi.StringOutput `pulumi:"name"`
	// The id of the project to add the project access token to.
	Project pulumi.StringOutput `pulumi:"project"`
	// True if the token is revoked.
	Revoked pulumi.BoolOutput `pulumi:"revoked"`
	// Valid values: `api`, `readApi`, `readRepository`, `writeRepository`.
	Scopes pulumi.StringArrayOutput `pulumi:"scopes"`
	// The secret token. This is only populated when creating a new project access token.
	Token pulumi.StringOutput `pulumi:"token"`
	// The userId associated to the token.
	UserId pulumi.IntOutput `pulumi:"userId"`
}

// NewProjectAccessToken registers a new resource with the given unique name, arguments, and options.
func NewProjectAccessToken(ctx *pulumi.Context,
	name string, args *ProjectAccessTokenArgs, opts ...pulumi.ResourceOption) (*ProjectAccessToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Scopes == nil {
		return nil, errors.New("invalid value for required argument 'Scopes'")
	}
	var resource ProjectAccessToken
	err := ctx.RegisterResource("gitlab:index/projectAccessToken:ProjectAccessToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectAccessToken gets an existing ProjectAccessToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectAccessToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectAccessTokenState, opts ...pulumi.ResourceOption) (*ProjectAccessToken, error) {
	var resource ProjectAccessToken
	err := ctx.ReadResource("gitlab:index/projectAccessToken:ProjectAccessToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectAccessToken resources.
type projectAccessTokenState struct {
	// True if the token is active.
	Active *bool `pulumi:"active"`
	// Time the token has been created, RFC3339 format.
	CreatedAt *string `pulumi:"createdAt"`
	// Time the token will expire it, YYYY-MM-DD format. Will not expire per default.
	ExpiresAt *string `pulumi:"expiresAt"`
	// A name to describe the project access token.
	Name *string `pulumi:"name"`
	// The id of the project to add the project access token to.
	Project *string `pulumi:"project"`
	// True if the token is revoked.
	Revoked *bool `pulumi:"revoked"`
	// Valid values: `api`, `readApi`, `readRepository`, `writeRepository`.
	Scopes []string `pulumi:"scopes"`
	// The secret token. This is only populated when creating a new project access token.
	Token *string `pulumi:"token"`
	// The userId associated to the token.
	UserId *int `pulumi:"userId"`
}

type ProjectAccessTokenState struct {
	// True if the token is active.
	Active pulumi.BoolPtrInput
	// Time the token has been created, RFC3339 format.
	CreatedAt pulumi.StringPtrInput
	// Time the token will expire it, YYYY-MM-DD format. Will not expire per default.
	ExpiresAt pulumi.StringPtrInput
	// A name to describe the project access token.
	Name pulumi.StringPtrInput
	// The id of the project to add the project access token to.
	Project pulumi.StringPtrInput
	// True if the token is revoked.
	Revoked pulumi.BoolPtrInput
	// Valid values: `api`, `readApi`, `readRepository`, `writeRepository`.
	Scopes pulumi.StringArrayInput
	// The secret token. This is only populated when creating a new project access token.
	Token pulumi.StringPtrInput
	// The userId associated to the token.
	UserId pulumi.IntPtrInput
}

func (ProjectAccessTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectAccessTokenState)(nil)).Elem()
}

type projectAccessTokenArgs struct {
	// Time the token will expire it, YYYY-MM-DD format. Will not expire per default.
	ExpiresAt *string `pulumi:"expiresAt"`
	// A name to describe the project access token.
	Name *string `pulumi:"name"`
	// The id of the project to add the project access token to.
	Project string `pulumi:"project"`
	// Valid values: `api`, `readApi`, `readRepository`, `writeRepository`.
	Scopes []string `pulumi:"scopes"`
}

// The set of arguments for constructing a ProjectAccessToken resource.
type ProjectAccessTokenArgs struct {
	// Time the token will expire it, YYYY-MM-DD format. Will not expire per default.
	ExpiresAt pulumi.StringPtrInput
	// A name to describe the project access token.
	Name pulumi.StringPtrInput
	// The id of the project to add the project access token to.
	Project pulumi.StringInput
	// Valid values: `api`, `readApi`, `readRepository`, `writeRepository`.
	Scopes pulumi.StringArrayInput
}

func (ProjectAccessTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectAccessTokenArgs)(nil)).Elem()
}

type ProjectAccessTokenInput interface {
	pulumi.Input

	ToProjectAccessTokenOutput() ProjectAccessTokenOutput
	ToProjectAccessTokenOutputWithContext(ctx context.Context) ProjectAccessTokenOutput
}

func (*ProjectAccessToken) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectAccessToken)(nil)).Elem()
}

func (i *ProjectAccessToken) ToProjectAccessTokenOutput() ProjectAccessTokenOutput {
	return i.ToProjectAccessTokenOutputWithContext(context.Background())
}

func (i *ProjectAccessToken) ToProjectAccessTokenOutputWithContext(ctx context.Context) ProjectAccessTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAccessTokenOutput)
}

// ProjectAccessTokenArrayInput is an input type that accepts ProjectAccessTokenArray and ProjectAccessTokenArrayOutput values.
// You can construct a concrete instance of `ProjectAccessTokenArrayInput` via:
//
//          ProjectAccessTokenArray{ ProjectAccessTokenArgs{...} }
type ProjectAccessTokenArrayInput interface {
	pulumi.Input

	ToProjectAccessTokenArrayOutput() ProjectAccessTokenArrayOutput
	ToProjectAccessTokenArrayOutputWithContext(context.Context) ProjectAccessTokenArrayOutput
}

type ProjectAccessTokenArray []ProjectAccessTokenInput

func (ProjectAccessTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectAccessToken)(nil)).Elem()
}

func (i ProjectAccessTokenArray) ToProjectAccessTokenArrayOutput() ProjectAccessTokenArrayOutput {
	return i.ToProjectAccessTokenArrayOutputWithContext(context.Background())
}

func (i ProjectAccessTokenArray) ToProjectAccessTokenArrayOutputWithContext(ctx context.Context) ProjectAccessTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAccessTokenArrayOutput)
}

// ProjectAccessTokenMapInput is an input type that accepts ProjectAccessTokenMap and ProjectAccessTokenMapOutput values.
// You can construct a concrete instance of `ProjectAccessTokenMapInput` via:
//
//          ProjectAccessTokenMap{ "key": ProjectAccessTokenArgs{...} }
type ProjectAccessTokenMapInput interface {
	pulumi.Input

	ToProjectAccessTokenMapOutput() ProjectAccessTokenMapOutput
	ToProjectAccessTokenMapOutputWithContext(context.Context) ProjectAccessTokenMapOutput
}

type ProjectAccessTokenMap map[string]ProjectAccessTokenInput

func (ProjectAccessTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectAccessToken)(nil)).Elem()
}

func (i ProjectAccessTokenMap) ToProjectAccessTokenMapOutput() ProjectAccessTokenMapOutput {
	return i.ToProjectAccessTokenMapOutputWithContext(context.Background())
}

func (i ProjectAccessTokenMap) ToProjectAccessTokenMapOutputWithContext(ctx context.Context) ProjectAccessTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAccessTokenMapOutput)
}

type ProjectAccessTokenOutput struct{ *pulumi.OutputState }

func (ProjectAccessTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectAccessToken)(nil)).Elem()
}

func (o ProjectAccessTokenOutput) ToProjectAccessTokenOutput() ProjectAccessTokenOutput {
	return o
}

func (o ProjectAccessTokenOutput) ToProjectAccessTokenOutputWithContext(ctx context.Context) ProjectAccessTokenOutput {
	return o
}

type ProjectAccessTokenArrayOutput struct{ *pulumi.OutputState }

func (ProjectAccessTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectAccessToken)(nil)).Elem()
}

func (o ProjectAccessTokenArrayOutput) ToProjectAccessTokenArrayOutput() ProjectAccessTokenArrayOutput {
	return o
}

func (o ProjectAccessTokenArrayOutput) ToProjectAccessTokenArrayOutputWithContext(ctx context.Context) ProjectAccessTokenArrayOutput {
	return o
}

func (o ProjectAccessTokenArrayOutput) Index(i pulumi.IntInput) ProjectAccessTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectAccessToken {
		return vs[0].([]*ProjectAccessToken)[vs[1].(int)]
	}).(ProjectAccessTokenOutput)
}

type ProjectAccessTokenMapOutput struct{ *pulumi.OutputState }

func (ProjectAccessTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectAccessToken)(nil)).Elem()
}

func (o ProjectAccessTokenMapOutput) ToProjectAccessTokenMapOutput() ProjectAccessTokenMapOutput {
	return o
}

func (o ProjectAccessTokenMapOutput) ToProjectAccessTokenMapOutputWithContext(ctx context.Context) ProjectAccessTokenMapOutput {
	return o
}

func (o ProjectAccessTokenMapOutput) MapIndex(k pulumi.StringInput) ProjectAccessTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectAccessToken {
		return vs[0].(map[string]*ProjectAccessToken)[vs[1].(string)]
	}).(ProjectAccessTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAccessTokenInput)(nil)).Elem(), &ProjectAccessToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAccessTokenArrayInput)(nil)).Elem(), ProjectAccessTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAccessTokenMapInput)(nil)).Elem(), ProjectAccessTokenMap{})
	pulumi.RegisterOutputType(ProjectAccessTokenOutput{})
	pulumi.RegisterOutputType(ProjectAccessTokenArrayOutput{})
	pulumi.RegisterOutputType(ProjectAccessTokenMapOutput{})
}
