// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `getProjectTags` data source allows details of project tags to be retrieved by some search criteria.
//
// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/tags.html#list-project-repository-tags)
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
//			_, err := gitlab.GetProjectTags(ctx, &gitlab.GetProjectTagsArgs{
//				Project: "foo/bar",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetProjectTags(ctx *pulumi.Context, args *GetProjectTagsArgs, opts ...pulumi.InvokeOption) (*GetProjectTagsResult, error) {
	var rv GetProjectTagsResult
	err := ctx.Invoke("gitlab:index/getProjectTags:getProjectTags", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectTags.
type GetProjectTagsArgs struct {
	// Return tags ordered by `name` or `updated` fields. Default is `updated`.
	OrderBy *string `pulumi:"orderBy"`
	// The ID or URL-encoded path of the project owned by the authenticated user.
	Project string `pulumi:"project"`
	// Return list of tags matching the search criteria. You can use `^term` and `term$` to find tags that begin and end with `term` respectively. No other regular expressions are supported.
	Search *string `pulumi:"search"`
	// Return tags sorted in `asc` or `desc` order. Default is `desc`.
	Sort *string `pulumi:"sort"`
}

// A collection of values returned by getProjectTags.
type GetProjectTagsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Return tags ordered by `name` or `updated` fields. Default is `updated`.
	OrderBy *string `pulumi:"orderBy"`
	// The ID or URL-encoded path of the project owned by the authenticated user.
	Project string `pulumi:"project"`
	// Return list of tags matching the search criteria. You can use `^term` and `term$` to find tags that begin and end with `term` respectively. No other regular expressions are supported.
	Search *string `pulumi:"search"`
	// Return tags sorted in `asc` or `desc` order. Default is `desc`.
	Sort *string `pulumi:"sort"`
	// List of repository tags from a project.
	Tags []GetProjectTagsTag `pulumi:"tags"`
}

func GetProjectTagsOutput(ctx *pulumi.Context, args GetProjectTagsOutputArgs, opts ...pulumi.InvokeOption) GetProjectTagsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProjectTagsResult, error) {
			args := v.(GetProjectTagsArgs)
			r, err := GetProjectTags(ctx, &args, opts...)
			var s GetProjectTagsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProjectTagsResultOutput)
}

// A collection of arguments for invoking getProjectTags.
type GetProjectTagsOutputArgs struct {
	// Return tags ordered by `name` or `updated` fields. Default is `updated`.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
	// The ID or URL-encoded path of the project owned by the authenticated user.
	Project pulumi.StringInput `pulumi:"project"`
	// Return list of tags matching the search criteria. You can use `^term` and `term$` to find tags that begin and end with `term` respectively. No other regular expressions are supported.
	Search pulumi.StringPtrInput `pulumi:"search"`
	// Return tags sorted in `asc` or `desc` order. Default is `desc`.
	Sort pulumi.StringPtrInput `pulumi:"sort"`
}

func (GetProjectTagsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectTagsArgs)(nil)).Elem()
}

// A collection of values returned by getProjectTags.
type GetProjectTagsResultOutput struct{ *pulumi.OutputState }

func (GetProjectTagsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectTagsResult)(nil)).Elem()
}

func (o GetProjectTagsResultOutput) ToGetProjectTagsResultOutput() GetProjectTagsResultOutput {
	return o
}

func (o GetProjectTagsResultOutput) ToGetProjectTagsResultOutputWithContext(ctx context.Context) GetProjectTagsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetProjectTagsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectTagsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Return tags ordered by `name` or `updated` fields. Default is `updated`.
func (o GetProjectTagsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProjectTagsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

// The ID or URL-encoded path of the project owned by the authenticated user.
func (o GetProjectTagsResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectTagsResult) string { return v.Project }).(pulumi.StringOutput)
}

// Return list of tags matching the search criteria. You can use `^term` and `term$` to find tags that begin and end with `term` respectively. No other regular expressions are supported.
func (o GetProjectTagsResultOutput) Search() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProjectTagsResult) *string { return v.Search }).(pulumi.StringPtrOutput)
}

// Return tags sorted in `asc` or `desc` order. Default is `desc`.
func (o GetProjectTagsResultOutput) Sort() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProjectTagsResult) *string { return v.Sort }).(pulumi.StringPtrOutput)
}

// List of repository tags from a project.
func (o GetProjectTagsResultOutput) Tags() GetProjectTagsTagArrayOutput {
	return o.ApplyT(func(v GetProjectTagsResult) []GetProjectTagsTag { return v.Tags }).(GetProjectTagsTagArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProjectTagsResultOutput{})
}
