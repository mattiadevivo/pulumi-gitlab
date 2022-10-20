// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `GroupMembership` data source allows to list and filter all members of a group specified by either its id or full path.
//
// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/members.html#list-all-members-of-a-group-or-project)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gitlab/sdk/v4/go/gitlab"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = gitlab.LookupGroupMembership(ctx, &GetGroupMembershipArgs{
//				FullPath: pulumi.StringRef("foo/bar"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupGroupMembership(ctx *pulumi.Context, args *LookupGroupMembershipArgs, opts ...pulumi.InvokeOption) (*LookupGroupMembershipResult, error) {
	var rv LookupGroupMembershipResult
	err := ctx.Invoke("gitlab:index/getGroupMembership:getGroupMembership", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGroupMembership.
type LookupGroupMembershipArgs struct {
	// Only return members with the desired access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
	AccessLevel *string `pulumi:"accessLevel"`
	// The full path of the group.
	FullPath *string `pulumi:"fullPath"`
	// The ID of the group.
	GroupId *int `pulumi:"groupId"`
}

// A collection of values returned by getGroupMembership.
type LookupGroupMembershipResult struct {
	// Only return members with the desired access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
	AccessLevel string `pulumi:"accessLevel"`
	// The full path of the group.
	FullPath string `pulumi:"fullPath"`
	// The ID of the group.
	GroupId int `pulumi:"groupId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of group members.
	Members []GetGroupMembershipMember `pulumi:"members"`
}

func LookupGroupMembershipOutput(ctx *pulumi.Context, args LookupGroupMembershipOutputArgs, opts ...pulumi.InvokeOption) LookupGroupMembershipResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGroupMembershipResult, error) {
			args := v.(LookupGroupMembershipArgs)
			r, err := LookupGroupMembership(ctx, &args, opts...)
			var s LookupGroupMembershipResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGroupMembershipResultOutput)
}

// A collection of arguments for invoking getGroupMembership.
type LookupGroupMembershipOutputArgs struct {
	// Only return members with the desired access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
	AccessLevel pulumi.StringPtrInput `pulumi:"accessLevel"`
	// The full path of the group.
	FullPath pulumi.StringPtrInput `pulumi:"fullPath"`
	// The ID of the group.
	GroupId pulumi.IntPtrInput `pulumi:"groupId"`
}

func (LookupGroupMembershipOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupMembershipArgs)(nil)).Elem()
}

// A collection of values returned by getGroupMembership.
type LookupGroupMembershipResultOutput struct{ *pulumi.OutputState }

func (LookupGroupMembershipResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupMembershipResult)(nil)).Elem()
}

func (o LookupGroupMembershipResultOutput) ToLookupGroupMembershipResultOutput() LookupGroupMembershipResultOutput {
	return o
}

func (o LookupGroupMembershipResultOutput) ToLookupGroupMembershipResultOutputWithContext(ctx context.Context) LookupGroupMembershipResultOutput {
	return o
}

// Only return members with the desired access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
func (o LookupGroupMembershipResultOutput) AccessLevel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupMembershipResult) string { return v.AccessLevel }).(pulumi.StringOutput)
}

// The full path of the group.
func (o LookupGroupMembershipResultOutput) FullPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupMembershipResult) string { return v.FullPath }).(pulumi.StringOutput)
}

// The ID of the group.
func (o LookupGroupMembershipResultOutput) GroupId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupGroupMembershipResult) int { return v.GroupId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGroupMembershipResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupMembershipResult) string { return v.Id }).(pulumi.StringOutput)
}

// The list of group members.
func (o LookupGroupMembershipResultOutput) Members() GetGroupMembershipMemberArrayOutput {
	return o.ApplyT(func(v LookupGroupMembershipResult) []GetGroupMembershipMember { return v.Members }).(GetGroupMembershipMemberArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGroupMembershipResultOutput{})
}
