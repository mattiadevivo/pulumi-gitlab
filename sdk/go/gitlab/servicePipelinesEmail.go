// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type ServicePipelinesEmail struct {
	pulumi.CustomResourceState

	// Branches to send notifications for. Valid options are `all`, `default`, `protected`, and `defaultAndProtected`. Default is `default`
	BranchesToBeNotified pulumi.StringPtrOutput `pulumi:"branchesToBeNotified"`
	// Notify only broken pipelines. Default is true.
	NotifyOnlyBrokenPipelines pulumi.BoolPtrOutput `pulumi:"notifyOnlyBrokenPipelines"`
	// ID of the project you want to activate integration on.
	Project pulumi.StringOutput `pulumi:"project"`
	// ) email addresses where notifications are sent.
	Recipients pulumi.StringArrayOutput `pulumi:"recipients"`
}

// NewServicePipelinesEmail registers a new resource with the given unique name, arguments, and options.
func NewServicePipelinesEmail(ctx *pulumi.Context,
	name string, args *ServicePipelinesEmailArgs, opts ...pulumi.ResourceOption) (*ServicePipelinesEmail, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Recipients == nil {
		return nil, errors.New("invalid value for required argument 'Recipients'")
	}
	var resource ServicePipelinesEmail
	err := ctx.RegisterResource("gitlab:index/servicePipelinesEmail:ServicePipelinesEmail", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServicePipelinesEmail gets an existing ServicePipelinesEmail resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServicePipelinesEmail(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServicePipelinesEmailState, opts ...pulumi.ResourceOption) (*ServicePipelinesEmail, error) {
	var resource ServicePipelinesEmail
	err := ctx.ReadResource("gitlab:index/servicePipelinesEmail:ServicePipelinesEmail", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServicePipelinesEmail resources.
type servicePipelinesEmailState struct {
	// Branches to send notifications for. Valid options are `all`, `default`, `protected`, and `defaultAndProtected`. Default is `default`
	BranchesToBeNotified *string `pulumi:"branchesToBeNotified"`
	// Notify only broken pipelines. Default is true.
	NotifyOnlyBrokenPipelines *bool `pulumi:"notifyOnlyBrokenPipelines"`
	// ID of the project you want to activate integration on.
	Project *string `pulumi:"project"`
	// ) email addresses where notifications are sent.
	Recipients []string `pulumi:"recipients"`
}

type ServicePipelinesEmailState struct {
	// Branches to send notifications for. Valid options are `all`, `default`, `protected`, and `defaultAndProtected`. Default is `default`
	BranchesToBeNotified pulumi.StringPtrInput
	// Notify only broken pipelines. Default is true.
	NotifyOnlyBrokenPipelines pulumi.BoolPtrInput
	// ID of the project you want to activate integration on.
	Project pulumi.StringPtrInput
	// ) email addresses where notifications are sent.
	Recipients pulumi.StringArrayInput
}

func (ServicePipelinesEmailState) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePipelinesEmailState)(nil)).Elem()
}

type servicePipelinesEmailArgs struct {
	// Branches to send notifications for. Valid options are `all`, `default`, `protected`, and `defaultAndProtected`. Default is `default`
	BranchesToBeNotified *string `pulumi:"branchesToBeNotified"`
	// Notify only broken pipelines. Default is true.
	NotifyOnlyBrokenPipelines *bool `pulumi:"notifyOnlyBrokenPipelines"`
	// ID of the project you want to activate integration on.
	Project string `pulumi:"project"`
	// ) email addresses where notifications are sent.
	Recipients []string `pulumi:"recipients"`
}

// The set of arguments for constructing a ServicePipelinesEmail resource.
type ServicePipelinesEmailArgs struct {
	// Branches to send notifications for. Valid options are `all`, `default`, `protected`, and `defaultAndProtected`. Default is `default`
	BranchesToBeNotified pulumi.StringPtrInput
	// Notify only broken pipelines. Default is true.
	NotifyOnlyBrokenPipelines pulumi.BoolPtrInput
	// ID of the project you want to activate integration on.
	Project pulumi.StringInput
	// ) email addresses where notifications are sent.
	Recipients pulumi.StringArrayInput
}

func (ServicePipelinesEmailArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePipelinesEmailArgs)(nil)).Elem()
}

type ServicePipelinesEmailInput interface {
	pulumi.Input

	ToServicePipelinesEmailOutput() ServicePipelinesEmailOutput
	ToServicePipelinesEmailOutputWithContext(ctx context.Context) ServicePipelinesEmailOutput
}

func (*ServicePipelinesEmail) ElementType() reflect.Type {
	return reflect.TypeOf((*ServicePipelinesEmail)(nil))
}

func (i *ServicePipelinesEmail) ToServicePipelinesEmailOutput() ServicePipelinesEmailOutput {
	return i.ToServicePipelinesEmailOutputWithContext(context.Background())
}

func (i *ServicePipelinesEmail) ToServicePipelinesEmailOutputWithContext(ctx context.Context) ServicePipelinesEmailOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePipelinesEmailOutput)
}

type ServicePipelinesEmailOutput struct {
	*pulumi.OutputState
}

func (ServicePipelinesEmailOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServicePipelinesEmail)(nil))
}

func (o ServicePipelinesEmailOutput) ToServicePipelinesEmailOutput() ServicePipelinesEmailOutput {
	return o
}

func (o ServicePipelinesEmailOutput) ToServicePipelinesEmailOutputWithContext(ctx context.Context) ServicePipelinesEmailOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ServicePipelinesEmailOutput{})
}
