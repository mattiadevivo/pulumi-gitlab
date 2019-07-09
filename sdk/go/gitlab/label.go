// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This resource allows you to create and manage labels for your GitLab projects.
// For further information on labels, consult the [gitlab
// documentation](https://docs.gitlab.com/ee/user/project/labels.htm).
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-gitlab/blob/master/website/docs/r/label.html.markdown.
type Label struct {
	s *pulumi.ResourceState
}

// NewLabel registers a new resource with the given unique name, arguments, and options.
func NewLabel(ctx *pulumi.Context,
	name string, args *LabelArgs, opts ...pulumi.ResourceOpt) (*Label, error) {
	if args == nil || args.Color == nil {
		return nil, errors.New("missing required argument 'Color'")
	}
	if args == nil || args.Project == nil {
		return nil, errors.New("missing required argument 'Project'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["color"] = nil
		inputs["description"] = nil
		inputs["name"] = nil
		inputs["project"] = nil
	} else {
		inputs["color"] = args.Color
		inputs["description"] = args.Description
		inputs["name"] = args.Name
		inputs["project"] = args.Project
	}
	s, err := ctx.RegisterResource("gitlab:index/label:Label", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Label{s: s}, nil
}

// GetLabel gets an existing Label resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLabel(ctx *pulumi.Context,
	name string, id pulumi.ID, state *LabelState, opts ...pulumi.ResourceOpt) (*Label, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["color"] = state.Color
		inputs["description"] = state.Description
		inputs["name"] = state.Name
		inputs["project"] = state.Project
	}
	s, err := ctx.ReadResource("gitlab:index/label:Label", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Label{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Label) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Label) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The color of the label given in 6-digit hex notation with leading '#' sign (e.g. #FFAABB) or one of the [CSS color names](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value#Color_keywords).
func (r *Label) Color() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["color"])
}

// The description of the label.
func (r *Label) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// The name of the label.
func (r *Label) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The name or id of the project to add the label to.
func (r *Label) Project() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["project"])
}

// Input properties used for looking up and filtering Label resources.
type LabelState struct {
	// The color of the label given in 6-digit hex notation with leading '#' sign (e.g. #FFAABB) or one of the [CSS color names](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value#Color_keywords).
	Color interface{}
	// The description of the label.
	Description interface{}
	// The name of the label.
	Name interface{}
	// The name or id of the project to add the label to.
	Project interface{}
}

// The set of arguments for constructing a Label resource.
type LabelArgs struct {
	// The color of the label given in 6-digit hex notation with leading '#' sign (e.g. #FFAABB) or one of the [CSS color names](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value#Color_keywords).
	Color interface{}
	// The description of the label.
	Description interface{}
	// The name of the label.
	Name interface{}
	// The name or id of the project to add the label to.
	Project interface{}
}
