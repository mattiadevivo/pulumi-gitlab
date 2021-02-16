// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## # gitlab\_group\_membership
//
// Provides details about a list of group members in the gitlab provider. The results include id, username, name and more about the requested members.
//
// ## Example Usage
//
// **By group's ID**
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
// 		opt0 := 123
// 		_, err := gitlab.LookupGroupMembership(ctx, &gitlab.LookupGroupMembershipArgs{
// 			GroupId: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// **By group's full path**
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
// 		opt0 := "foo/bar"
// 		_, err := gitlab.LookupGroupMembership(ctx, &gitlab.LookupGroupMembershipArgs{
// 			FullPath: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
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
	// Only return members with the desidered access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
	AccessLevel *string `pulumi:"accessLevel"`
	// The full path of the group.
	FullPath *string `pulumi:"fullPath"`
	// The ID of the group.
	GroupId *int `pulumi:"groupId"`
}

// A collection of values returned by getGroupMembership.
type LookupGroupMembershipResult struct {
	// One of five levels of access to the group.
	AccessLevel string `pulumi:"accessLevel"`
	FullPath    string `pulumi:"fullPath"`
	GroupId     int    `pulumi:"groupId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of group members.
	Members []GetGroupMembershipMember `pulumi:"members"`
}
