// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `ProjectIssue` data source allows to retrieve details about an issue in a project.
//
// **Upstream API:** [GitLab API docs](https://docs.gitlab.com/ee/api/issues.html)
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
// 		opt0 := "foo/bar/baz"
// 		foo, err := gitlab.LookupProject(ctx, &GetProjectArgs{
// 			Id: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = gitlab.LookupProjectIssue(ctx, &GetProjectIssueArgs{
// 			Project: foo.Id,
// 			Iid:     1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("welcomeIssueWebUrl", data.Gitlab_project_issue.Web_url)
// 		return nil
// 	})
// }
// ```
func LookupProjectIssue(ctx *pulumi.Context, args *LookupProjectIssueArgs, opts ...pulumi.InvokeOption) (*LookupProjectIssueResult, error) {
	var rv LookupProjectIssueResult
	err := ctx.Invoke("gitlab:index/getProjectIssue:getProjectIssue", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectIssue.
type LookupProjectIssueArgs struct {
	// The internal ID of the project's issue.
	Iid int `pulumi:"iid"`
	// The name or ID of the project.
	Project string `pulumi:"project"`
}

// A collection of values returned by getProjectIssue.
type LookupProjectIssueResult struct {
	// The IDs of the users to assign the issue to.
	AssigneeIds []int `pulumi:"assigneeIds"`
	// The ID of the author of the issue. Use `User` data source to get more information about the user.
	AuthorId int `pulumi:"authorId"`
	// When the issue was closed. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z.
	ClosedAt string `pulumi:"closedAt"`
	// The ID of the user that closed the issue. Use `User` data source to get more information about the user.
	ClosedByUserId int `pulumi:"closedByUserId"`
	// Set an issue to be confidential.
	Confidential bool `pulumi:"confidential"`
	// When the issue was created. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z. Requires administrator or project/group owner rights.
	CreatedAt string `pulumi:"createdAt"`
	// The description of an issue. Limited to 1,048,576 characters.
	Description string `pulumi:"description"`
	// Whether the issue is locked for discussions or not.
	DiscussionLocked bool `pulumi:"discussionLocked"`
	// The ID of a discussion to resolve. This fills out the issue with a default description and mark the discussion as resolved. Use in combination with merge*request*to*resolve*discussions_of.
	DiscussionToResolve string `pulumi:"discussionToResolve"`
	// The number of downvotes the issue has received.
	Downvotes int `pulumi:"downvotes"`
	// The due date. Date time string in the format YYYY-MM-DD, for example 2016-03-11.
	// **Note:** removing a due date is currently not supported, see https://github.com/xanzy/go-gitlab/issues/1384 for details.
	DueDate string `pulumi:"dueDate"`
	// ID of the epic to add the issue to. Valid values are greater than or equal to 0.
	EpicId int `pulumi:"epicId"`
	// The ID of the epic issue.
	EpicIssueId int `pulumi:"epicIssueId"`
	// The external ID of the issue.
	ExternalId string `pulumi:"externalId"`
	// The human-readable time estimate of the issue.
	HumanTimeEstimate string `pulumi:"humanTimeEstimate"`
	// The human-readable total time spent of the issue.
	HumanTotalTimeSpent string `pulumi:"humanTotalTimeSpent"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The internal ID of the project's issue.
	Iid int `pulumi:"iid"`
	// The instance-wide ID of the issue.
	IssueId int `pulumi:"issueId"`
	// The ID of the issue link.
	IssueLinkId int `pulumi:"issueLinkId"`
	// The type of issue. Valid values are: `issue`, `incident`, `testCase`.
	IssueType string `pulumi:"issueType"`
	// The labels of an issue.
	Labels []string `pulumi:"labels"`
	// The links of the issue.
	Links map[string]string `pulumi:"links"`
	// The IID of a merge request in which to resolve all issues. This fills out the issue with a default description and mark all discussions as resolved. When passing a description or title, these values take precedence over the default values.
	MergeRequestToResolveDiscussionsOf int `pulumi:"mergeRequestToResolveDiscussionsOf"`
	// The number of merge requests associated with the issue.
	MergeRequestsCount int `pulumi:"mergeRequestsCount"`
	// The global ID of a milestone to assign issue. To find the milestoneId associated with a milestone, view an issue with the milestone assigned and use the API to retrieve the issue's details.
	MilestoneId int `pulumi:"milestoneId"`
	// The ID of the issue that was moved to.
	MovedToId int `pulumi:"movedToId"`
	// The name or ID of the project.
	Project string `pulumi:"project"`
	// The references of the issue.
	References map[string]string `pulumi:"references"`
	// The state of the issue. Valid values are: `opened`, `closed`.
	State string `pulumi:"state"`
	// Whether the authenticated user is subscribed to the issue or not.
	Subscribed bool `pulumi:"subscribed"`
	// The task completion status. It's always a one element list.
	TaskCompletionStatuses []GetProjectIssueTaskCompletionStatus `pulumi:"taskCompletionStatuses"`
	// The time estimate of the issue.
	TimeEstimate int `pulumi:"timeEstimate"`
	// The title of the issue.
	Title string `pulumi:"title"`
	// The total time spent of the issue.
	TotalTimeSpent int `pulumi:"totalTimeSpent"`
	// When the issue was updated. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z.
	UpdatedAt string `pulumi:"updatedAt"`
	// The number of upvotes the issue has received.
	Upvotes int `pulumi:"upvotes"`
	// The number of user notes on the issue.
	UserNotesCount int `pulumi:"userNotesCount"`
	// The web URL of the issue.
	WebUrl string `pulumi:"webUrl"`
	// The weight of the issue. Valid values are greater than or equal to 0.
	Weight int `pulumi:"weight"`
}

func LookupProjectIssueOutput(ctx *pulumi.Context, args LookupProjectIssueOutputArgs, opts ...pulumi.InvokeOption) LookupProjectIssueResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectIssueResult, error) {
			args := v.(LookupProjectIssueArgs)
			r, err := LookupProjectIssue(ctx, &args, opts...)
			return *r, err
		}).(LookupProjectIssueResultOutput)
}

// A collection of arguments for invoking getProjectIssue.
type LookupProjectIssueOutputArgs struct {
	// The internal ID of the project's issue.
	Iid pulumi.IntInput `pulumi:"iid"`
	// The name or ID of the project.
	Project pulumi.StringInput `pulumi:"project"`
}

func (LookupProjectIssueOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectIssueArgs)(nil)).Elem()
}

// A collection of values returned by getProjectIssue.
type LookupProjectIssueResultOutput struct{ *pulumi.OutputState }

func (LookupProjectIssueResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectIssueResult)(nil)).Elem()
}

func (o LookupProjectIssueResultOutput) ToLookupProjectIssueResultOutput() LookupProjectIssueResultOutput {
	return o
}

func (o LookupProjectIssueResultOutput) ToLookupProjectIssueResultOutputWithContext(ctx context.Context) LookupProjectIssueResultOutput {
	return o
}

// The IDs of the users to assign the issue to.
func (o LookupProjectIssueResultOutput) AssigneeIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) []int { return v.AssigneeIds }).(pulumi.IntArrayOutput)
}

// The ID of the author of the issue. Use `User` data source to get more information about the user.
func (o LookupProjectIssueResultOutput) AuthorId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.AuthorId }).(pulumi.IntOutput)
}

// When the issue was closed. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z.
func (o LookupProjectIssueResultOutput) ClosedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.ClosedAt }).(pulumi.StringOutput)
}

// The ID of the user that closed the issue. Use `User` data source to get more information about the user.
func (o LookupProjectIssueResultOutput) ClosedByUserId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.ClosedByUserId }).(pulumi.IntOutput)
}

// Set an issue to be confidential.
func (o LookupProjectIssueResultOutput) Confidential() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) bool { return v.Confidential }).(pulumi.BoolOutput)
}

// When the issue was created. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z. Requires administrator or project/group owner rights.
func (o LookupProjectIssueResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The description of an issue. Limited to 1,048,576 characters.
func (o LookupProjectIssueResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.Description }).(pulumi.StringOutput)
}

// Whether the issue is locked for discussions or not.
func (o LookupProjectIssueResultOutput) DiscussionLocked() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) bool { return v.DiscussionLocked }).(pulumi.BoolOutput)
}

// The ID of a discussion to resolve. This fills out the issue with a default description and mark the discussion as resolved. Use in combination with merge*request*to*resolve*discussions_of.
func (o LookupProjectIssueResultOutput) DiscussionToResolve() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.DiscussionToResolve }).(pulumi.StringOutput)
}

// The number of downvotes the issue has received.
func (o LookupProjectIssueResultOutput) Downvotes() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.Downvotes }).(pulumi.IntOutput)
}

// The due date. Date time string in the format YYYY-MM-DD, for example 2016-03-11.
// **Note:** removing a due date is currently not supported, see https://github.com/xanzy/go-gitlab/issues/1384 for details.
func (o LookupProjectIssueResultOutput) DueDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.DueDate }).(pulumi.StringOutput)
}

// ID of the epic to add the issue to. Valid values are greater than or equal to 0.
func (o LookupProjectIssueResultOutput) EpicId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.EpicId }).(pulumi.IntOutput)
}

// The ID of the epic issue.
func (o LookupProjectIssueResultOutput) EpicIssueId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.EpicIssueId }).(pulumi.IntOutput)
}

// The external ID of the issue.
func (o LookupProjectIssueResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

// The human-readable time estimate of the issue.
func (o LookupProjectIssueResultOutput) HumanTimeEstimate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.HumanTimeEstimate }).(pulumi.StringOutput)
}

// The human-readable total time spent of the issue.
func (o LookupProjectIssueResultOutput) HumanTotalTimeSpent() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.HumanTotalTimeSpent }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectIssueResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.Id }).(pulumi.StringOutput)
}

// The internal ID of the project's issue.
func (o LookupProjectIssueResultOutput) Iid() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.Iid }).(pulumi.IntOutput)
}

// The instance-wide ID of the issue.
func (o LookupProjectIssueResultOutput) IssueId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.IssueId }).(pulumi.IntOutput)
}

// The ID of the issue link.
func (o LookupProjectIssueResultOutput) IssueLinkId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.IssueLinkId }).(pulumi.IntOutput)
}

// The type of issue. Valid values are: `issue`, `incident`, `testCase`.
func (o LookupProjectIssueResultOutput) IssueType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.IssueType }).(pulumi.StringOutput)
}

// The labels of an issue.
func (o LookupProjectIssueResultOutput) Labels() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) []string { return v.Labels }).(pulumi.StringArrayOutput)
}

// The links of the issue.
func (o LookupProjectIssueResultOutput) Links() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) map[string]string { return v.Links }).(pulumi.StringMapOutput)
}

// The IID of a merge request in which to resolve all issues. This fills out the issue with a default description and mark all discussions as resolved. When passing a description or title, these values take precedence over the default values.
func (o LookupProjectIssueResultOutput) MergeRequestToResolveDiscussionsOf() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.MergeRequestToResolveDiscussionsOf }).(pulumi.IntOutput)
}

// The number of merge requests associated with the issue.
func (o LookupProjectIssueResultOutput) MergeRequestsCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.MergeRequestsCount }).(pulumi.IntOutput)
}

// The global ID of a milestone to assign issue. To find the milestoneId associated with a milestone, view an issue with the milestone assigned and use the API to retrieve the issue's details.
func (o LookupProjectIssueResultOutput) MilestoneId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.MilestoneId }).(pulumi.IntOutput)
}

// The ID of the issue that was moved to.
func (o LookupProjectIssueResultOutput) MovedToId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.MovedToId }).(pulumi.IntOutput)
}

// The name or ID of the project.
func (o LookupProjectIssueResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.Project }).(pulumi.StringOutput)
}

// The references of the issue.
func (o LookupProjectIssueResultOutput) References() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) map[string]string { return v.References }).(pulumi.StringMapOutput)
}

// The state of the issue. Valid values are: `opened`, `closed`.
func (o LookupProjectIssueResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.State }).(pulumi.StringOutput)
}

// Whether the authenticated user is subscribed to the issue or not.
func (o LookupProjectIssueResultOutput) Subscribed() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) bool { return v.Subscribed }).(pulumi.BoolOutput)
}

// The task completion status. It's always a one element list.
func (o LookupProjectIssueResultOutput) TaskCompletionStatuses() GetProjectIssueTaskCompletionStatusArrayOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) []GetProjectIssueTaskCompletionStatus {
		return v.TaskCompletionStatuses
	}).(GetProjectIssueTaskCompletionStatusArrayOutput)
}

// The time estimate of the issue.
func (o LookupProjectIssueResultOutput) TimeEstimate() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.TimeEstimate }).(pulumi.IntOutput)
}

// The title of the issue.
func (o LookupProjectIssueResultOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.Title }).(pulumi.StringOutput)
}

// The total time spent of the issue.
func (o LookupProjectIssueResultOutput) TotalTimeSpent() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.TotalTimeSpent }).(pulumi.IntOutput)
}

// When the issue was updated. Date time string, ISO 8601 formatted, for example 2016-03-11T03:45:40Z.
func (o LookupProjectIssueResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

// The number of upvotes the issue has received.
func (o LookupProjectIssueResultOutput) Upvotes() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.Upvotes }).(pulumi.IntOutput)
}

// The number of user notes on the issue.
func (o LookupProjectIssueResultOutput) UserNotesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.UserNotesCount }).(pulumi.IntOutput)
}

// The web URL of the issue.
func (o LookupProjectIssueResultOutput) WebUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) string { return v.WebUrl }).(pulumi.StringOutput)
}

// The weight of the issue. Valid values are greater than or equal to 0.
func (o LookupProjectIssueResultOutput) Weight() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectIssueResult) int { return v.Weight }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectIssueResultOutput{})
}
