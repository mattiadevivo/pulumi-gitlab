// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `ProjectHook` resource allows to manage the lifecycle of a project hook.
//
// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/projects.html#hooks)
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
// 		_, err := gitlab.NewProjectHook(ctx, "example", &gitlab.ProjectHookArgs{
// 			MergeRequestsEvents: pulumi.Bool(true),
// 			Project:             pulumi.String("example/hooked"),
// 			Url:                 pulumi.String("https://example.com/hook/example"),
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
// # A GitLab Project Hook can be imported using a key composed of `<project-id>:<hook-id>`, e.g.
//
// ```sh
//  $ pulumi import gitlab:index/projectHook:ProjectHook example "12345:1"
// ```
//
// # NOTEthe `token` resource attribute is not available for imported resources as this information cannot be read from the GitLab API.
type ProjectHook struct {
	pulumi.CustomResourceState

	// Invoke the hook for confidential issues events.
	ConfidentialIssuesEvents pulumi.BoolPtrOutput `pulumi:"confidentialIssuesEvents"`
	// Invoke the hook for confidential notes events.
	ConfidentialNoteEvents pulumi.BoolPtrOutput `pulumi:"confidentialNoteEvents"`
	// Invoke the hook for deployment events.
	DeploymentEvents pulumi.BoolPtrOutput `pulumi:"deploymentEvents"`
	// Enable ssl verification when invoking the hook.
	EnableSslVerification pulumi.BoolPtrOutput `pulumi:"enableSslVerification"`
	// Invoke the hook for issues events.
	IssuesEvents pulumi.BoolPtrOutput `pulumi:"issuesEvents"`
	// Invoke the hook for job events.
	JobEvents pulumi.BoolPtrOutput `pulumi:"jobEvents"`
	// Invoke the hook for merge requests.
	MergeRequestsEvents pulumi.BoolPtrOutput `pulumi:"mergeRequestsEvents"`
	// Invoke the hook for notes events.
	NoteEvents pulumi.BoolPtrOutput `pulumi:"noteEvents"`
	// Invoke the hook for pipeline events.
	PipelineEvents pulumi.BoolPtrOutput `pulumi:"pipelineEvents"`
	// The name or id of the project to add the hook to.
	Project pulumi.StringOutput `pulumi:"project"`
	// Invoke the hook for push events.
	PushEvents pulumi.BoolPtrOutput `pulumi:"pushEvents"`
	// Invoke the hook for push events on matching branches only.
	PushEventsBranchFilter pulumi.StringPtrOutput `pulumi:"pushEventsBranchFilter"`
	// Invoke the hook for releases events.
	ReleasesEvents pulumi.BoolPtrOutput `pulumi:"releasesEvents"`
	// Invoke the hook for tag push events.
	TagPushEvents pulumi.BoolPtrOutput `pulumi:"tagPushEvents"`
	// A token to present when invoking the hook. The token is not available for imported resources.
	Token pulumi.StringPtrOutput `pulumi:"token"`
	// The url of the hook to invoke.
	Url pulumi.StringOutput `pulumi:"url"`
	// Invoke the hook for wiki page events.
	WikiPageEvents pulumi.BoolPtrOutput `pulumi:"wikiPageEvents"`
}

// NewProjectHook registers a new resource with the given unique name, arguments, and options.
func NewProjectHook(ctx *pulumi.Context,
	name string, args *ProjectHookArgs, opts ...pulumi.ResourceOption) (*ProjectHook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	var resource ProjectHook
	err := ctx.RegisterResource("gitlab:index/projectHook:ProjectHook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectHook gets an existing ProjectHook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectHook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectHookState, opts ...pulumi.ResourceOption) (*ProjectHook, error) {
	var resource ProjectHook
	err := ctx.ReadResource("gitlab:index/projectHook:ProjectHook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectHook resources.
type projectHookState struct {
	// Invoke the hook for confidential issues events.
	ConfidentialIssuesEvents *bool `pulumi:"confidentialIssuesEvents"`
	// Invoke the hook for confidential notes events.
	ConfidentialNoteEvents *bool `pulumi:"confidentialNoteEvents"`
	// Invoke the hook for deployment events.
	DeploymentEvents *bool `pulumi:"deploymentEvents"`
	// Enable ssl verification when invoking the hook.
	EnableSslVerification *bool `pulumi:"enableSslVerification"`
	// Invoke the hook for issues events.
	IssuesEvents *bool `pulumi:"issuesEvents"`
	// Invoke the hook for job events.
	JobEvents *bool `pulumi:"jobEvents"`
	// Invoke the hook for merge requests.
	MergeRequestsEvents *bool `pulumi:"mergeRequestsEvents"`
	// Invoke the hook for notes events.
	NoteEvents *bool `pulumi:"noteEvents"`
	// Invoke the hook for pipeline events.
	PipelineEvents *bool `pulumi:"pipelineEvents"`
	// The name or id of the project to add the hook to.
	Project *string `pulumi:"project"`
	// Invoke the hook for push events.
	PushEvents *bool `pulumi:"pushEvents"`
	// Invoke the hook for push events on matching branches only.
	PushEventsBranchFilter *string `pulumi:"pushEventsBranchFilter"`
	// Invoke the hook for releases events.
	ReleasesEvents *bool `pulumi:"releasesEvents"`
	// Invoke the hook for tag push events.
	TagPushEvents *bool `pulumi:"tagPushEvents"`
	// A token to present when invoking the hook. The token is not available for imported resources.
	Token *string `pulumi:"token"`
	// The url of the hook to invoke.
	Url *string `pulumi:"url"`
	// Invoke the hook for wiki page events.
	WikiPageEvents *bool `pulumi:"wikiPageEvents"`
}

type ProjectHookState struct {
	// Invoke the hook for confidential issues events.
	ConfidentialIssuesEvents pulumi.BoolPtrInput
	// Invoke the hook for confidential notes events.
	ConfidentialNoteEvents pulumi.BoolPtrInput
	// Invoke the hook for deployment events.
	DeploymentEvents pulumi.BoolPtrInput
	// Enable ssl verification when invoking the hook.
	EnableSslVerification pulumi.BoolPtrInput
	// Invoke the hook for issues events.
	IssuesEvents pulumi.BoolPtrInput
	// Invoke the hook for job events.
	JobEvents pulumi.BoolPtrInput
	// Invoke the hook for merge requests.
	MergeRequestsEvents pulumi.BoolPtrInput
	// Invoke the hook for notes events.
	NoteEvents pulumi.BoolPtrInput
	// Invoke the hook for pipeline events.
	PipelineEvents pulumi.BoolPtrInput
	// The name or id of the project to add the hook to.
	Project pulumi.StringPtrInput
	// Invoke the hook for push events.
	PushEvents pulumi.BoolPtrInput
	// Invoke the hook for push events on matching branches only.
	PushEventsBranchFilter pulumi.StringPtrInput
	// Invoke the hook for releases events.
	ReleasesEvents pulumi.BoolPtrInput
	// Invoke the hook for tag push events.
	TagPushEvents pulumi.BoolPtrInput
	// A token to present when invoking the hook. The token is not available for imported resources.
	Token pulumi.StringPtrInput
	// The url of the hook to invoke.
	Url pulumi.StringPtrInput
	// Invoke the hook for wiki page events.
	WikiPageEvents pulumi.BoolPtrInput
}

func (ProjectHookState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectHookState)(nil)).Elem()
}

type projectHookArgs struct {
	// Invoke the hook for confidential issues events.
	ConfidentialIssuesEvents *bool `pulumi:"confidentialIssuesEvents"`
	// Invoke the hook for confidential notes events.
	ConfidentialNoteEvents *bool `pulumi:"confidentialNoteEvents"`
	// Invoke the hook for deployment events.
	DeploymentEvents *bool `pulumi:"deploymentEvents"`
	// Enable ssl verification when invoking the hook.
	EnableSslVerification *bool `pulumi:"enableSslVerification"`
	// Invoke the hook for issues events.
	IssuesEvents *bool `pulumi:"issuesEvents"`
	// Invoke the hook for job events.
	JobEvents *bool `pulumi:"jobEvents"`
	// Invoke the hook for merge requests.
	MergeRequestsEvents *bool `pulumi:"mergeRequestsEvents"`
	// Invoke the hook for notes events.
	NoteEvents *bool `pulumi:"noteEvents"`
	// Invoke the hook for pipeline events.
	PipelineEvents *bool `pulumi:"pipelineEvents"`
	// The name or id of the project to add the hook to.
	Project string `pulumi:"project"`
	// Invoke the hook for push events.
	PushEvents *bool `pulumi:"pushEvents"`
	// Invoke the hook for push events on matching branches only.
	PushEventsBranchFilter *string `pulumi:"pushEventsBranchFilter"`
	// Invoke the hook for releases events.
	ReleasesEvents *bool `pulumi:"releasesEvents"`
	// Invoke the hook for tag push events.
	TagPushEvents *bool `pulumi:"tagPushEvents"`
	// A token to present when invoking the hook. The token is not available for imported resources.
	Token *string `pulumi:"token"`
	// The url of the hook to invoke.
	Url string `pulumi:"url"`
	// Invoke the hook for wiki page events.
	WikiPageEvents *bool `pulumi:"wikiPageEvents"`
}

// The set of arguments for constructing a ProjectHook resource.
type ProjectHookArgs struct {
	// Invoke the hook for confidential issues events.
	ConfidentialIssuesEvents pulumi.BoolPtrInput
	// Invoke the hook for confidential notes events.
	ConfidentialNoteEvents pulumi.BoolPtrInput
	// Invoke the hook for deployment events.
	DeploymentEvents pulumi.BoolPtrInput
	// Enable ssl verification when invoking the hook.
	EnableSslVerification pulumi.BoolPtrInput
	// Invoke the hook for issues events.
	IssuesEvents pulumi.BoolPtrInput
	// Invoke the hook for job events.
	JobEvents pulumi.BoolPtrInput
	// Invoke the hook for merge requests.
	MergeRequestsEvents pulumi.BoolPtrInput
	// Invoke the hook for notes events.
	NoteEvents pulumi.BoolPtrInput
	// Invoke the hook for pipeline events.
	PipelineEvents pulumi.BoolPtrInput
	// The name or id of the project to add the hook to.
	Project pulumi.StringInput
	// Invoke the hook for push events.
	PushEvents pulumi.BoolPtrInput
	// Invoke the hook for push events on matching branches only.
	PushEventsBranchFilter pulumi.StringPtrInput
	// Invoke the hook for releases events.
	ReleasesEvents pulumi.BoolPtrInput
	// Invoke the hook for tag push events.
	TagPushEvents pulumi.BoolPtrInput
	// A token to present when invoking the hook. The token is not available for imported resources.
	Token pulumi.StringPtrInput
	// The url of the hook to invoke.
	Url pulumi.StringInput
	// Invoke the hook for wiki page events.
	WikiPageEvents pulumi.BoolPtrInput
}

func (ProjectHookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectHookArgs)(nil)).Elem()
}

type ProjectHookInput interface {
	pulumi.Input

	ToProjectHookOutput() ProjectHookOutput
	ToProjectHookOutputWithContext(ctx context.Context) ProjectHookOutput
}

func (*ProjectHook) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectHook)(nil)).Elem()
}

func (i *ProjectHook) ToProjectHookOutput() ProjectHookOutput {
	return i.ToProjectHookOutputWithContext(context.Background())
}

func (i *ProjectHook) ToProjectHookOutputWithContext(ctx context.Context) ProjectHookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectHookOutput)
}

// ProjectHookArrayInput is an input type that accepts ProjectHookArray and ProjectHookArrayOutput values.
// You can construct a concrete instance of `ProjectHookArrayInput` via:
//
//          ProjectHookArray{ ProjectHookArgs{...} }
type ProjectHookArrayInput interface {
	pulumi.Input

	ToProjectHookArrayOutput() ProjectHookArrayOutput
	ToProjectHookArrayOutputWithContext(context.Context) ProjectHookArrayOutput
}

type ProjectHookArray []ProjectHookInput

func (ProjectHookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectHook)(nil)).Elem()
}

func (i ProjectHookArray) ToProjectHookArrayOutput() ProjectHookArrayOutput {
	return i.ToProjectHookArrayOutputWithContext(context.Background())
}

func (i ProjectHookArray) ToProjectHookArrayOutputWithContext(ctx context.Context) ProjectHookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectHookArrayOutput)
}

// ProjectHookMapInput is an input type that accepts ProjectHookMap and ProjectHookMapOutput values.
// You can construct a concrete instance of `ProjectHookMapInput` via:
//
//          ProjectHookMap{ "key": ProjectHookArgs{...} }
type ProjectHookMapInput interface {
	pulumi.Input

	ToProjectHookMapOutput() ProjectHookMapOutput
	ToProjectHookMapOutputWithContext(context.Context) ProjectHookMapOutput
}

type ProjectHookMap map[string]ProjectHookInput

func (ProjectHookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectHook)(nil)).Elem()
}

func (i ProjectHookMap) ToProjectHookMapOutput() ProjectHookMapOutput {
	return i.ToProjectHookMapOutputWithContext(context.Background())
}

func (i ProjectHookMap) ToProjectHookMapOutputWithContext(ctx context.Context) ProjectHookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectHookMapOutput)
}

type ProjectHookOutput struct{ *pulumi.OutputState }

func (ProjectHookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectHook)(nil)).Elem()
}

func (o ProjectHookOutput) ToProjectHookOutput() ProjectHookOutput {
	return o
}

func (o ProjectHookOutput) ToProjectHookOutputWithContext(ctx context.Context) ProjectHookOutput {
	return o
}

// Invoke the hook for confidential issues events.
func (o ProjectHookOutput) ConfidentialIssuesEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.ConfidentialIssuesEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for confidential notes events.
func (o ProjectHookOutput) ConfidentialNoteEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.ConfidentialNoteEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for deployment events.
func (o ProjectHookOutput) DeploymentEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.DeploymentEvents }).(pulumi.BoolPtrOutput)
}

// Enable ssl verification when invoking the hook.
func (o ProjectHookOutput) EnableSslVerification() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.EnableSslVerification }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for issues events.
func (o ProjectHookOutput) IssuesEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.IssuesEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for job events.
func (o ProjectHookOutput) JobEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.JobEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for merge requests.
func (o ProjectHookOutput) MergeRequestsEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.MergeRequestsEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for notes events.
func (o ProjectHookOutput) NoteEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.NoteEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for pipeline events.
func (o ProjectHookOutput) PipelineEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.PipelineEvents }).(pulumi.BoolPtrOutput)
}

// The name or id of the project to add the hook to.
func (o ProjectHookOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Invoke the hook for push events.
func (o ProjectHookOutput) PushEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.PushEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for push events on matching branches only.
func (o ProjectHookOutput) PushEventsBranchFilter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.StringPtrOutput { return v.PushEventsBranchFilter }).(pulumi.StringPtrOutput)
}

// Invoke the hook for releases events.
func (o ProjectHookOutput) ReleasesEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.ReleasesEvents }).(pulumi.BoolPtrOutput)
}

// Invoke the hook for tag push events.
func (o ProjectHookOutput) TagPushEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.TagPushEvents }).(pulumi.BoolPtrOutput)
}

// A token to present when invoking the hook. The token is not available for imported resources.
func (o ProjectHookOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.StringPtrOutput { return v.Token }).(pulumi.StringPtrOutput)
}

// The url of the hook to invoke.
func (o ProjectHookOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Invoke the hook for wiki page events.
func (o ProjectHookOutput) WikiPageEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectHook) pulumi.BoolPtrOutput { return v.WikiPageEvents }).(pulumi.BoolPtrOutput)
}

type ProjectHookArrayOutput struct{ *pulumi.OutputState }

func (ProjectHookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectHook)(nil)).Elem()
}

func (o ProjectHookArrayOutput) ToProjectHookArrayOutput() ProjectHookArrayOutput {
	return o
}

func (o ProjectHookArrayOutput) ToProjectHookArrayOutputWithContext(ctx context.Context) ProjectHookArrayOutput {
	return o
}

func (o ProjectHookArrayOutput) Index(i pulumi.IntInput) ProjectHookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectHook {
		return vs[0].([]*ProjectHook)[vs[1].(int)]
	}).(ProjectHookOutput)
}

type ProjectHookMapOutput struct{ *pulumi.OutputState }

func (ProjectHookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectHook)(nil)).Elem()
}

func (o ProjectHookMapOutput) ToProjectHookMapOutput() ProjectHookMapOutput {
	return o
}

func (o ProjectHookMapOutput) ToProjectHookMapOutputWithContext(ctx context.Context) ProjectHookMapOutput {
	return o
}

func (o ProjectHookMapOutput) MapIndex(k pulumi.StringInput) ProjectHookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectHook {
		return vs[0].(map[string]*ProjectHook)[vs[1].(string)]
	}).(ProjectHookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectHookInput)(nil)).Elem(), &ProjectHook{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectHookArrayInput)(nil)).Elem(), ProjectHookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectHookMapInput)(nil)).Elem(), ProjectHookMap{})
	pulumi.RegisterOutputType(ProjectHookOutput{})
	pulumi.RegisterOutputType(ProjectHookArrayOutput{})
	pulumi.RegisterOutputType(ProjectHookMapOutput{})
}
