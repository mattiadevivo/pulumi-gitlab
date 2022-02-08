// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific protected branch in a given project.
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
// 		_, err := gitlab.GetProjectProtectedBranch(ctx, &GetProjectProtectedBranchArgs{
// 			Name:      "main",
// 			ProjectId: "foo/bar/baz",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetProjectProtectedBranch(ctx *pulumi.Context, args *GetProjectProtectedBranchArgs, opts ...pulumi.InvokeOption) (*GetProjectProtectedBranchResult, error) {
	var rv GetProjectProtectedBranchResult
	err := ctx.Invoke("gitlab:index/getProjectProtectedBranch:getProjectProtectedBranch", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectProtectedBranch.
type GetProjectProtectedBranchArgs struct {
	// The name of the protected branch.
	Name string `pulumi:"name"`
	// The integer or path with namespace that uniquely identifies the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getProjectProtectedBranch.
type GetProjectProtectedBranchResult struct {
	// Whether force push is allowed.
	AllowForcePush bool `pulumi:"allowForcePush"`
	// Reject code pushes that change files listed in the CODEOWNERS file.
	CodeOwnerApprovalRequired bool `pulumi:"codeOwnerApprovalRequired"`
	// The ID of this resource.
	Id int `pulumi:"id"`
	// Describes which access levels, users, or groups are allowed to perform the action.
	MergeAccessLevels []GetProjectProtectedBranchMergeAccessLevel `pulumi:"mergeAccessLevels"`
	// The name of the protected branch.
	Name string `pulumi:"name"`
	// The integer or path with namespace that uniquely identifies the project.
	ProjectId string `pulumi:"projectId"`
	// Describes which access levels, users, or groups are allowed to perform the action.
	PushAccessLevels []GetProjectProtectedBranchPushAccessLevel `pulumi:"pushAccessLevels"`
}

func GetProjectProtectedBranchOutput(ctx *pulumi.Context, args GetProjectProtectedBranchOutputArgs, opts ...pulumi.InvokeOption) GetProjectProtectedBranchResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProjectProtectedBranchResult, error) {
			args := v.(GetProjectProtectedBranchArgs)
			r, err := GetProjectProtectedBranch(ctx, &args, opts...)
			return *r, err
		}).(GetProjectProtectedBranchResultOutput)
}

// A collection of arguments for invoking getProjectProtectedBranch.
type GetProjectProtectedBranchOutputArgs struct {
	// The name of the protected branch.
	Name pulumi.StringInput `pulumi:"name"`
	// The integer or path with namespace that uniquely identifies the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (GetProjectProtectedBranchOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectProtectedBranchArgs)(nil)).Elem()
}

// A collection of values returned by getProjectProtectedBranch.
type GetProjectProtectedBranchResultOutput struct{ *pulumi.OutputState }

func (GetProjectProtectedBranchResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectProtectedBranchResult)(nil)).Elem()
}

func (o GetProjectProtectedBranchResultOutput) ToGetProjectProtectedBranchResultOutput() GetProjectProtectedBranchResultOutput {
	return o
}

func (o GetProjectProtectedBranchResultOutput) ToGetProjectProtectedBranchResultOutputWithContext(ctx context.Context) GetProjectProtectedBranchResultOutput {
	return o
}

// Whether force push is allowed.
func (o GetProjectProtectedBranchResultOutput) AllowForcePush() pulumi.BoolOutput {
	return o.ApplyT(func(v GetProjectProtectedBranchResult) bool { return v.AllowForcePush }).(pulumi.BoolOutput)
}

// Reject code pushes that change files listed in the CODEOWNERS file.
func (o GetProjectProtectedBranchResultOutput) CodeOwnerApprovalRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v GetProjectProtectedBranchResult) bool { return v.CodeOwnerApprovalRequired }).(pulumi.BoolOutput)
}

// The ID of this resource.
func (o GetProjectProtectedBranchResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v GetProjectProtectedBranchResult) int { return v.Id }).(pulumi.IntOutput)
}

// Describes which access levels, users, or groups are allowed to perform the action.
func (o GetProjectProtectedBranchResultOutput) MergeAccessLevels() GetProjectProtectedBranchMergeAccessLevelArrayOutput {
	return o.ApplyT(func(v GetProjectProtectedBranchResult) []GetProjectProtectedBranchMergeAccessLevel {
		return v.MergeAccessLevels
	}).(GetProjectProtectedBranchMergeAccessLevelArrayOutput)
}

// The name of the protected branch.
func (o GetProjectProtectedBranchResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectProtectedBranchResult) string { return v.Name }).(pulumi.StringOutput)
}

// The integer or path with namespace that uniquely identifies the project.
func (o GetProjectProtectedBranchResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectProtectedBranchResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Describes which access levels, users, or groups are allowed to perform the action.
func (o GetProjectProtectedBranchResultOutput) PushAccessLevels() GetProjectProtectedBranchPushAccessLevelArrayOutput {
	return o.ApplyT(func(v GetProjectProtectedBranchResult) []GetProjectProtectedBranchPushAccessLevel {
		return v.PushAccessLevels
	}).(GetProjectProtectedBranchPushAccessLevelArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProjectProtectedBranchResultOutput{})
}
