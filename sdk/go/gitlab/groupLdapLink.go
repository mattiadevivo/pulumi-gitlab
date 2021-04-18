// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # gitlab\_group\_ldap\_link
//
// This resource allows you to add an LDAP link to an existing GitLab group.
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
// 		_, err := gitlab.NewGroupLdapLink(ctx, "test", &gitlab.GroupLdapLinkArgs{
// 			AccessLevel:  pulumi.String("developer"),
// 			Cn:           pulumi.String("testuser"),
// 			GroupId:      pulumi.String("12345"),
// 			LdapProvider: pulumi.String("ldapmain"),
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
// GitLab group ldap links can be imported using an id made up of `ldap_provider:cn`, e.g.
//
// ```sh
//  $ pulumi import gitlab:index/groupLdapLink:GroupLdapLink test "ldapmain:testuser"
// ```
type GroupLdapLink struct {
	pulumi.CustomResourceState

	// Acceptable values are: guest, reporter, developer, maintainer, owner.
	AccessLevel pulumi.StringOutput `pulumi:"accessLevel"`
	// The CN of the LDAP group to link with.
	Cn    pulumi.StringOutput  `pulumi:"cn"`
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// The id of the GitLab group.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The name of the LDAP provider as stored in the GitLab database.
	LdapProvider pulumi.StringOutput `pulumi:"ldapProvider"`
}

// NewGroupLdapLink registers a new resource with the given unique name, arguments, and options.
func NewGroupLdapLink(ctx *pulumi.Context,
	name string, args *GroupLdapLinkArgs, opts ...pulumi.ResourceOption) (*GroupLdapLink, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessLevel == nil {
		return nil, errors.New("invalid value for required argument 'AccessLevel'")
	}
	if args.Cn == nil {
		return nil, errors.New("invalid value for required argument 'Cn'")
	}
	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.LdapProvider == nil {
		return nil, errors.New("invalid value for required argument 'LdapProvider'")
	}
	var resource GroupLdapLink
	err := ctx.RegisterResource("gitlab:index/groupLdapLink:GroupLdapLink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupLdapLink gets an existing GroupLdapLink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupLdapLink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupLdapLinkState, opts ...pulumi.ResourceOption) (*GroupLdapLink, error) {
	var resource GroupLdapLink
	err := ctx.ReadResource("gitlab:index/groupLdapLink:GroupLdapLink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupLdapLink resources.
type groupLdapLinkState struct {
	// Acceptable values are: guest, reporter, developer, maintainer, owner.
	AccessLevel *string `pulumi:"accessLevel"`
	// The CN of the LDAP group to link with.
	Cn    *string `pulumi:"cn"`
	Force *bool   `pulumi:"force"`
	// The id of the GitLab group.
	GroupId *string `pulumi:"groupId"`
	// The name of the LDAP provider as stored in the GitLab database.
	LdapProvider *string `pulumi:"ldapProvider"`
}

type GroupLdapLinkState struct {
	// Acceptable values are: guest, reporter, developer, maintainer, owner.
	AccessLevel pulumi.StringPtrInput
	// The CN of the LDAP group to link with.
	Cn    pulumi.StringPtrInput
	Force pulumi.BoolPtrInput
	// The id of the GitLab group.
	GroupId pulumi.StringPtrInput
	// The name of the LDAP provider as stored in the GitLab database.
	LdapProvider pulumi.StringPtrInput
}

func (GroupLdapLinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupLdapLinkState)(nil)).Elem()
}

type groupLdapLinkArgs struct {
	// Acceptable values are: guest, reporter, developer, maintainer, owner.
	AccessLevel string `pulumi:"accessLevel"`
	// The CN of the LDAP group to link with.
	Cn    string `pulumi:"cn"`
	Force *bool  `pulumi:"force"`
	// The id of the GitLab group.
	GroupId string `pulumi:"groupId"`
	// The name of the LDAP provider as stored in the GitLab database.
	LdapProvider string `pulumi:"ldapProvider"`
}

// The set of arguments for constructing a GroupLdapLink resource.
type GroupLdapLinkArgs struct {
	// Acceptable values are: guest, reporter, developer, maintainer, owner.
	AccessLevel pulumi.StringInput
	// The CN of the LDAP group to link with.
	Cn    pulumi.StringInput
	Force pulumi.BoolPtrInput
	// The id of the GitLab group.
	GroupId pulumi.StringInput
	// The name of the LDAP provider as stored in the GitLab database.
	LdapProvider pulumi.StringInput
}

func (GroupLdapLinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupLdapLinkArgs)(nil)).Elem()
}

type GroupLdapLinkInput interface {
	pulumi.Input

	ToGroupLdapLinkOutput() GroupLdapLinkOutput
	ToGroupLdapLinkOutputWithContext(ctx context.Context) GroupLdapLinkOutput
}

func (*GroupLdapLink) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupLdapLink)(nil))
}

func (i *GroupLdapLink) ToGroupLdapLinkOutput() GroupLdapLinkOutput {
	return i.ToGroupLdapLinkOutputWithContext(context.Background())
}

func (i *GroupLdapLink) ToGroupLdapLinkOutputWithContext(ctx context.Context) GroupLdapLinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupLdapLinkOutput)
}

func (i *GroupLdapLink) ToGroupLdapLinkPtrOutput() GroupLdapLinkPtrOutput {
	return i.ToGroupLdapLinkPtrOutputWithContext(context.Background())
}

func (i *GroupLdapLink) ToGroupLdapLinkPtrOutputWithContext(ctx context.Context) GroupLdapLinkPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupLdapLinkPtrOutput)
}

type GroupLdapLinkPtrInput interface {
	pulumi.Input

	ToGroupLdapLinkPtrOutput() GroupLdapLinkPtrOutput
	ToGroupLdapLinkPtrOutputWithContext(ctx context.Context) GroupLdapLinkPtrOutput
}

type groupLdapLinkPtrType GroupLdapLinkArgs

func (*groupLdapLinkPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupLdapLink)(nil))
}

func (i *groupLdapLinkPtrType) ToGroupLdapLinkPtrOutput() GroupLdapLinkPtrOutput {
	return i.ToGroupLdapLinkPtrOutputWithContext(context.Background())
}

func (i *groupLdapLinkPtrType) ToGroupLdapLinkPtrOutputWithContext(ctx context.Context) GroupLdapLinkPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupLdapLinkPtrOutput)
}

// GroupLdapLinkArrayInput is an input type that accepts GroupLdapLinkArray and GroupLdapLinkArrayOutput values.
// You can construct a concrete instance of `GroupLdapLinkArrayInput` via:
//
//          GroupLdapLinkArray{ GroupLdapLinkArgs{...} }
type GroupLdapLinkArrayInput interface {
	pulumi.Input

	ToGroupLdapLinkArrayOutput() GroupLdapLinkArrayOutput
	ToGroupLdapLinkArrayOutputWithContext(context.Context) GroupLdapLinkArrayOutput
}

type GroupLdapLinkArray []GroupLdapLinkInput

func (GroupLdapLinkArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*GroupLdapLink)(nil))
}

func (i GroupLdapLinkArray) ToGroupLdapLinkArrayOutput() GroupLdapLinkArrayOutput {
	return i.ToGroupLdapLinkArrayOutputWithContext(context.Background())
}

func (i GroupLdapLinkArray) ToGroupLdapLinkArrayOutputWithContext(ctx context.Context) GroupLdapLinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupLdapLinkArrayOutput)
}

// GroupLdapLinkMapInput is an input type that accepts GroupLdapLinkMap and GroupLdapLinkMapOutput values.
// You can construct a concrete instance of `GroupLdapLinkMapInput` via:
//
//          GroupLdapLinkMap{ "key": GroupLdapLinkArgs{...} }
type GroupLdapLinkMapInput interface {
	pulumi.Input

	ToGroupLdapLinkMapOutput() GroupLdapLinkMapOutput
	ToGroupLdapLinkMapOutputWithContext(context.Context) GroupLdapLinkMapOutput
}

type GroupLdapLinkMap map[string]GroupLdapLinkInput

func (GroupLdapLinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*GroupLdapLink)(nil))
}

func (i GroupLdapLinkMap) ToGroupLdapLinkMapOutput() GroupLdapLinkMapOutput {
	return i.ToGroupLdapLinkMapOutputWithContext(context.Background())
}

func (i GroupLdapLinkMap) ToGroupLdapLinkMapOutputWithContext(ctx context.Context) GroupLdapLinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupLdapLinkMapOutput)
}

type GroupLdapLinkOutput struct {
	*pulumi.OutputState
}

func (GroupLdapLinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupLdapLink)(nil))
}

func (o GroupLdapLinkOutput) ToGroupLdapLinkOutput() GroupLdapLinkOutput {
	return o
}

func (o GroupLdapLinkOutput) ToGroupLdapLinkOutputWithContext(ctx context.Context) GroupLdapLinkOutput {
	return o
}

func (o GroupLdapLinkOutput) ToGroupLdapLinkPtrOutput() GroupLdapLinkPtrOutput {
	return o.ToGroupLdapLinkPtrOutputWithContext(context.Background())
}

func (o GroupLdapLinkOutput) ToGroupLdapLinkPtrOutputWithContext(ctx context.Context) GroupLdapLinkPtrOutput {
	return o.ApplyT(func(v GroupLdapLink) *GroupLdapLink {
		return &v
	}).(GroupLdapLinkPtrOutput)
}

type GroupLdapLinkPtrOutput struct {
	*pulumi.OutputState
}

func (GroupLdapLinkPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupLdapLink)(nil))
}

func (o GroupLdapLinkPtrOutput) ToGroupLdapLinkPtrOutput() GroupLdapLinkPtrOutput {
	return o
}

func (o GroupLdapLinkPtrOutput) ToGroupLdapLinkPtrOutputWithContext(ctx context.Context) GroupLdapLinkPtrOutput {
	return o
}

type GroupLdapLinkArrayOutput struct{ *pulumi.OutputState }

func (GroupLdapLinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GroupLdapLink)(nil))
}

func (o GroupLdapLinkArrayOutput) ToGroupLdapLinkArrayOutput() GroupLdapLinkArrayOutput {
	return o
}

func (o GroupLdapLinkArrayOutput) ToGroupLdapLinkArrayOutputWithContext(ctx context.Context) GroupLdapLinkArrayOutput {
	return o
}

func (o GroupLdapLinkArrayOutput) Index(i pulumi.IntInput) GroupLdapLinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GroupLdapLink {
		return vs[0].([]GroupLdapLink)[vs[1].(int)]
	}).(GroupLdapLinkOutput)
}

type GroupLdapLinkMapOutput struct{ *pulumi.OutputState }

func (GroupLdapLinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]GroupLdapLink)(nil))
}

func (o GroupLdapLinkMapOutput) ToGroupLdapLinkMapOutput() GroupLdapLinkMapOutput {
	return o
}

func (o GroupLdapLinkMapOutput) ToGroupLdapLinkMapOutputWithContext(ctx context.Context) GroupLdapLinkMapOutput {
	return o
}

func (o GroupLdapLinkMapOutput) MapIndex(k pulumi.StringInput) GroupLdapLinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) GroupLdapLink {
		return vs[0].(map[string]GroupLdapLink)[vs[1].(string)]
	}).(GroupLdapLinkOutput)
}

func init() {
	pulumi.RegisterOutputType(GroupLdapLinkOutput{})
	pulumi.RegisterOutputType(GroupLdapLinkPtrOutput{})
	pulumi.RegisterOutputType(GroupLdapLinkArrayOutput{})
	pulumi.RegisterOutputType(GroupLdapLinkMapOutput{})
}
