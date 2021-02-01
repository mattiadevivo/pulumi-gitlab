// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## # gitlab\_project_mirror
//
// This resource allows you to add a mirror target for the repository, all changes will be synced to the remote target.
//
// > This is for *pushing* changes to a remote repository. *Pull Mirroring* can be configured using a combination of the
// `importUrl`, `mirror`, and `mirrorTriggerBuilds` properties on the `Project` resource.
//
// For further information on mirroring, consult the
// [gitlab documentation](https://docs.gitlab.com/ee/user/project/repository/repository_mirroring.html#repository-mirroring).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gitlab/sdk/v3/go/gitlab/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := gitlab.NewProjectMirror(ctx, "foo", &gitlab.ProjectMirrorArgs{
// 			Project: pulumi.String("1"),
// 			Url:     pulumi.String("https://username:password@github.com/org/repository.git"),
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
// GitLab project mirror can be imported using an id made up of `project_id:mirror_id`, e.g.
//
// ```sh
//  $ pulumi import gitlab:index/projectMirror:ProjectMirror foo "12345:1337"
// ```
type ProjectMirror struct {
	pulumi.CustomResourceState

	// Determines if the mirror is enabled.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Determines if divergent refs are skipped.
	KeepDivergentRefs pulumi.BoolPtrOutput `pulumi:"keepDivergentRefs"`
	MirrorId          pulumi.IntOutput     `pulumi:"mirrorId"`
	// Determines if only protected branches are mirrored.
	OnlyProtectedBranches pulumi.BoolPtrOutput `pulumi:"onlyProtectedBranches"`
	// The id of the project.
	Project pulumi.StringOutput `pulumi:"project"`
	// The URL of the remote repository to be mirrored.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewProjectMirror registers a new resource with the given unique name, arguments, and options.
func NewProjectMirror(ctx *pulumi.Context,
	name string, args *ProjectMirrorArgs, opts ...pulumi.ResourceOption) (*ProjectMirror, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	var resource ProjectMirror
	err := ctx.RegisterResource("gitlab:index/projectMirror:ProjectMirror", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectMirror gets an existing ProjectMirror resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectMirror(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectMirrorState, opts ...pulumi.ResourceOption) (*ProjectMirror, error) {
	var resource ProjectMirror
	err := ctx.ReadResource("gitlab:index/projectMirror:ProjectMirror", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectMirror resources.
type projectMirrorState struct {
	// Determines if the mirror is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Determines if divergent refs are skipped.
	KeepDivergentRefs *bool `pulumi:"keepDivergentRefs"`
	MirrorId          *int  `pulumi:"mirrorId"`
	// Determines if only protected branches are mirrored.
	OnlyProtectedBranches *bool `pulumi:"onlyProtectedBranches"`
	// The id of the project.
	Project *string `pulumi:"project"`
	// The URL of the remote repository to be mirrored.
	Url *string `pulumi:"url"`
}

type ProjectMirrorState struct {
	// Determines if the mirror is enabled.
	Enabled pulumi.BoolPtrInput
	// Determines if divergent refs are skipped.
	KeepDivergentRefs pulumi.BoolPtrInput
	MirrorId          pulumi.IntPtrInput
	// Determines if only protected branches are mirrored.
	OnlyProtectedBranches pulumi.BoolPtrInput
	// The id of the project.
	Project pulumi.StringPtrInput
	// The URL of the remote repository to be mirrored.
	Url pulumi.StringPtrInput
}

func (ProjectMirrorState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectMirrorState)(nil)).Elem()
}

type projectMirrorArgs struct {
	// Determines if the mirror is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Determines if divergent refs are skipped.
	KeepDivergentRefs *bool `pulumi:"keepDivergentRefs"`
	// Determines if only protected branches are mirrored.
	OnlyProtectedBranches *bool `pulumi:"onlyProtectedBranches"`
	// The id of the project.
	Project string `pulumi:"project"`
	// The URL of the remote repository to be mirrored.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a ProjectMirror resource.
type ProjectMirrorArgs struct {
	// Determines if the mirror is enabled.
	Enabled pulumi.BoolPtrInput
	// Determines if divergent refs are skipped.
	KeepDivergentRefs pulumi.BoolPtrInput
	// Determines if only protected branches are mirrored.
	OnlyProtectedBranches pulumi.BoolPtrInput
	// The id of the project.
	Project pulumi.StringInput
	// The URL of the remote repository to be mirrored.
	Url pulumi.StringInput
}

func (ProjectMirrorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectMirrorArgs)(nil)).Elem()
}

type ProjectMirrorInput interface {
	pulumi.Input

	ToProjectMirrorOutput() ProjectMirrorOutput
	ToProjectMirrorOutputWithContext(ctx context.Context) ProjectMirrorOutput
}

func (*ProjectMirror) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectMirror)(nil))
}

func (i *ProjectMirror) ToProjectMirrorOutput() ProjectMirrorOutput {
	return i.ToProjectMirrorOutputWithContext(context.Background())
}

func (i *ProjectMirror) ToProjectMirrorOutputWithContext(ctx context.Context) ProjectMirrorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMirrorOutput)
}

type ProjectMirrorOutput struct {
	*pulumi.OutputState
}

func (ProjectMirrorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectMirror)(nil))
}

func (o ProjectMirrorOutput) ToProjectMirrorOutput() ProjectMirrorOutput {
	return o
}

func (o ProjectMirrorOutput) ToProjectMirrorOutputWithContext(ctx context.Context) ProjectMirrorOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProjectMirrorOutput{})
}
