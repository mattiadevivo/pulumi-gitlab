// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This resource allows you to create and manage variables for pipeline schedules.
type PipelineScheduleVariable struct {
	pulumi.CustomResourceState

	// Name of the variable.
	Key pulumi.StringOutput `pulumi:"key"`
	// The id of the pipeline schedule.
	PipelineScheduleId pulumi.IntOutput `pulumi:"pipelineScheduleId"`
	// The id of the project to add the schedule to.
	Project pulumi.StringOutput `pulumi:"project"`
	// Value of the variable.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewPipelineScheduleVariable registers a new resource with the given unique name, arguments, and options.
func NewPipelineScheduleVariable(ctx *pulumi.Context,
	name string, args *PipelineScheduleVariableArgs, opts ...pulumi.ResourceOption) (*PipelineScheduleVariable, error) {
	if args == nil || args.Key == nil {
		return nil, errors.New("missing required argument 'Key'")
	}
	if args == nil || args.PipelineScheduleId == nil {
		return nil, errors.New("missing required argument 'PipelineScheduleId'")
	}
	if args == nil || args.Project == nil {
		return nil, errors.New("missing required argument 'Project'")
	}
	if args == nil || args.Value == nil {
		return nil, errors.New("missing required argument 'Value'")
	}
	if args == nil {
		args = &PipelineScheduleVariableArgs{}
	}
	var resource PipelineScheduleVariable
	err := ctx.RegisterResource("gitlab:index/pipelineScheduleVariable:PipelineScheduleVariable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPipelineScheduleVariable gets an existing PipelineScheduleVariable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPipelineScheduleVariable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PipelineScheduleVariableState, opts ...pulumi.ResourceOption) (*PipelineScheduleVariable, error) {
	var resource PipelineScheduleVariable
	err := ctx.ReadResource("gitlab:index/pipelineScheduleVariable:PipelineScheduleVariable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PipelineScheduleVariable resources.
type pipelineScheduleVariableState struct {
	// Name of the variable.
	Key *string `pulumi:"key"`
	// The id of the pipeline schedule.
	PipelineScheduleId *int `pulumi:"pipelineScheduleId"`
	// The id of the project to add the schedule to.
	Project *string `pulumi:"project"`
	// Value of the variable.
	Value *string `pulumi:"value"`
}

type PipelineScheduleVariableState struct {
	// Name of the variable.
	Key pulumi.StringPtrInput
	// The id of the pipeline schedule.
	PipelineScheduleId pulumi.IntPtrInput
	// The id of the project to add the schedule to.
	Project pulumi.StringPtrInput
	// Value of the variable.
	Value pulumi.StringPtrInput
}

func (PipelineScheduleVariableState) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineScheduleVariableState)(nil)).Elem()
}

type pipelineScheduleVariableArgs struct {
	// Name of the variable.
	Key string `pulumi:"key"`
	// The id of the pipeline schedule.
	PipelineScheduleId int `pulumi:"pipelineScheduleId"`
	// The id of the project to add the schedule to.
	Project string `pulumi:"project"`
	// Value of the variable.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a PipelineScheduleVariable resource.
type PipelineScheduleVariableArgs struct {
	// Name of the variable.
	Key pulumi.StringInput
	// The id of the pipeline schedule.
	PipelineScheduleId pulumi.IntInput
	// The id of the project to add the schedule to.
	Project pulumi.StringInput
	// Value of the variable.
	Value pulumi.StringInput
}

func (PipelineScheduleVariableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineScheduleVariableArgs)(nil)).Elem()
}
