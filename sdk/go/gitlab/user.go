// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # gitlab\_user
//
// This resource allows you to create and manage GitLab users.
// Note your provider will need to be configured with admin-level access for this resource to work.
//
// > You must specify either `password` or `resetPassword`.
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
// 		_, err := gitlab.NewUser(ctx, "example", &gitlab.UserArgs{
// 			CanCreateGroup: pulumi.Bool(false),
// 			Email:          pulumi.String("gitlab@user.create"),
// 			IsAdmin:        pulumi.Bool(true),
// 			IsExternal:     pulumi.Bool(true),
// 			Password:       pulumi.String("superPassword"),
// 			ProjectsLimit:  pulumi.Int(4),
// 			ResetPassword:  pulumi.Bool(false),
// 			Username:       pulumi.String("example"),
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
// ```sh
//  $ pulumi import gitlab:index/user:User You can import a user to terraform state using `<resource> <id>`.
// ```
//
//  The `id` must be an integer for the id of the user you want to import, for example
//
// ```sh
//  $ pulumi import gitlab:index/user:User example 42
// ```
type User struct {
	pulumi.CustomResourceState

	// Boolean, defaults to false. Whether to allow the user to create groups.
	CanCreateGroup pulumi.BoolPtrOutput `pulumi:"canCreateGroup"`
	// The e-mail address of the user.
	Email pulumi.StringOutput `pulumi:"email"`
	// Boolean, defaults to false.  Whether to enable administrative privileges
	// for the user.
	IsAdmin pulumi.BoolPtrOutput `pulumi:"isAdmin"`
	// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
	IsExternal pulumi.BoolPtrOutput `pulumi:"isExternal"`
	// The name of the user.
	Name pulumi.StringOutput `pulumi:"name"`
	// The note associated to the user.
	Note pulumi.StringPtrOutput `pulumi:"note"`
	// The password of the user.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Integer, defaults to 0.  Number of projects user can create.
	ProjectsLimit pulumi.IntPtrOutput `pulumi:"projectsLimit"`
	// Boolean, defaults to false. Send user password reset link.
	ResetPassword pulumi.BoolPtrOutput `pulumi:"resetPassword"`
	// Boolean, defaults to true. Whether to skip confirmation.
	SkipConfirmation pulumi.BoolPtrOutput `pulumi:"skipConfirmation"`
	// The username of the user.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource User
	err := ctx.RegisterResource("gitlab:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("gitlab:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// Boolean, defaults to false. Whether to allow the user to create groups.
	CanCreateGroup *bool `pulumi:"canCreateGroup"`
	// The e-mail address of the user.
	Email *string `pulumi:"email"`
	// Boolean, defaults to false.  Whether to enable administrative privileges
	// for the user.
	IsAdmin *bool `pulumi:"isAdmin"`
	// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
	IsExternal *bool `pulumi:"isExternal"`
	// The name of the user.
	Name *string `pulumi:"name"`
	// The note associated to the user.
	Note *string `pulumi:"note"`
	// The password of the user.
	Password *string `pulumi:"password"`
	// Integer, defaults to 0.  Number of projects user can create.
	ProjectsLimit *int `pulumi:"projectsLimit"`
	// Boolean, defaults to false. Send user password reset link.
	ResetPassword *bool `pulumi:"resetPassword"`
	// Boolean, defaults to true. Whether to skip confirmation.
	SkipConfirmation *bool `pulumi:"skipConfirmation"`
	// The username of the user.
	Username *string `pulumi:"username"`
}

type UserState struct {
	// Boolean, defaults to false. Whether to allow the user to create groups.
	CanCreateGroup pulumi.BoolPtrInput
	// The e-mail address of the user.
	Email pulumi.StringPtrInput
	// Boolean, defaults to false.  Whether to enable administrative privileges
	// for the user.
	IsAdmin pulumi.BoolPtrInput
	// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
	IsExternal pulumi.BoolPtrInput
	// The name of the user.
	Name pulumi.StringPtrInput
	// The note associated to the user.
	Note pulumi.StringPtrInput
	// The password of the user.
	Password pulumi.StringPtrInput
	// Integer, defaults to 0.  Number of projects user can create.
	ProjectsLimit pulumi.IntPtrInput
	// Boolean, defaults to false. Send user password reset link.
	ResetPassword pulumi.BoolPtrInput
	// Boolean, defaults to true. Whether to skip confirmation.
	SkipConfirmation pulumi.BoolPtrInput
	// The username of the user.
	Username pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// Boolean, defaults to false. Whether to allow the user to create groups.
	CanCreateGroup *bool `pulumi:"canCreateGroup"`
	// The e-mail address of the user.
	Email string `pulumi:"email"`
	// Boolean, defaults to false.  Whether to enable administrative privileges
	// for the user.
	IsAdmin *bool `pulumi:"isAdmin"`
	// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
	IsExternal *bool `pulumi:"isExternal"`
	// The name of the user.
	Name *string `pulumi:"name"`
	// The note associated to the user.
	Note *string `pulumi:"note"`
	// The password of the user.
	Password *string `pulumi:"password"`
	// Integer, defaults to 0.  Number of projects user can create.
	ProjectsLimit *int `pulumi:"projectsLimit"`
	// Boolean, defaults to false. Send user password reset link.
	ResetPassword *bool `pulumi:"resetPassword"`
	// Boolean, defaults to true. Whether to skip confirmation.
	SkipConfirmation *bool `pulumi:"skipConfirmation"`
	// The username of the user.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// Boolean, defaults to false. Whether to allow the user to create groups.
	CanCreateGroup pulumi.BoolPtrInput
	// The e-mail address of the user.
	Email pulumi.StringInput
	// Boolean, defaults to false.  Whether to enable administrative privileges
	// for the user.
	IsAdmin pulumi.BoolPtrInput
	// Boolean, defaults to false. Whether a user has access only to some internal or private projects. External users can only access projects to which they are explicitly granted access.
	IsExternal pulumi.BoolPtrInput
	// The name of the user.
	Name pulumi.StringPtrInput
	// The note associated to the user.
	Note pulumi.StringPtrInput
	// The password of the user.
	Password pulumi.StringPtrInput
	// Integer, defaults to 0.  Number of projects user can create.
	ProjectsLimit pulumi.IntPtrInput
	// Boolean, defaults to false. Send user password reset link.
	ResetPassword pulumi.BoolPtrInput
	// Boolean, defaults to true. Whether to skip confirmation.
	SkipConfirmation pulumi.BoolPtrInput
	// The username of the user.
	Username pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((*User)(nil))
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

func (i *User) ToUserPtrOutput() UserPtrOutput {
	return i.ToUserPtrOutputWithContext(context.Background())
}

func (i *User) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPtrOutput)
}

type UserPtrInput interface {
	pulumi.Input

	ToUserPtrOutput() UserPtrOutput
	ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput
}

type userPtrType UserArgs

func (*userPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil))
}

func (i *userPtrType) ToUserPtrOutput() UserPtrOutput {
	return i.ToUserPtrOutputWithContext(context.Background())
}

func (i *userPtrType) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPtrOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//          UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//          UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*User)(nil))
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

func (o UserOutput) ToUserPtrOutput() UserPtrOutput {
	return o.ToUserPtrOutputWithContext(context.Background())
}

func (o UserOutput) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v User) *User {
		return &v
	}).(UserPtrOutput)
}

type UserPtrOutput struct{ *pulumi.OutputState }

func (UserPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil))
}

func (o UserPtrOutput) ToUserPtrOutput() UserPtrOutput {
	return o
}

func (o UserPtrOutput) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return o
}

func (o UserPtrOutput) Elem() UserOutput {
	return o.ApplyT(func(v *User) User {
		if v != nil {
			return *v
		}
		var ret User
		return ret
	}).(UserOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]User)(nil))
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) User {
		return vs[0].([]User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]User)(nil))
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) User {
		return vs[0].(map[string]User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPtrInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserPtrOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
