// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides details about a list of users in the gitlab provider. The results include id, username, email, name and more about the requested users. Users can also be sorted and filtered using several options.
// 
// **NOTE**: Some of the available options require administrator privileges. Please visit [Gitlab API documentation][users_for_admins] for more information.
func LookupUsers(ctx *pulumi.Context, args *GetUsersArgs) (*GetUsersResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["active"] = args.Active
		inputs["blocked"] = args.Blocked
		inputs["createdAfter"] = args.CreatedAfter
		inputs["createdBefore"] = args.CreatedBefore
		inputs["externProvider"] = args.ExternProvider
		inputs["externUid"] = args.ExternUid
		inputs["orderBy"] = args.OrderBy
		inputs["search"] = args.Search
		inputs["sort"] = args.Sort
	}
	outputs, err := ctx.Invoke("gitlab:index/getUsers:getUsers", inputs)
	if err != nil {
		return nil, err
	}
	return &GetUsersResult{
		Active: outputs["active"],
		Blocked: outputs["blocked"],
		CreatedAfter: outputs["createdAfter"],
		CreatedBefore: outputs["createdBefore"],
		ExternProvider: outputs["externProvider"],
		ExternUid: outputs["externUid"],
		OrderBy: outputs["orderBy"],
		Search: outputs["search"],
		Sort: outputs["sort"],
		Users: outputs["users"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getUsers.
type GetUsersArgs struct {
	// Filter users that are active.
	Active interface{}
	// Filter users that are blocked.
	Blocked interface{}
	// Search for users created after a specific date. (Requires administrator privileges)
	CreatedAfter interface{}
	// Search for users created before a specific date. (Requires administrator privileges)
	CreatedBefore interface{}
	// Lookup users by external provider. (Requires administrator privileges)
	ExternProvider interface{}
	// Lookup users by external UID. (Requires administrator privileges)
	ExternUid interface{}
	// Order the users' list by `id`, `name`, `username`, `created_at` or `updated_at`. (Requires administrator privileges)
	OrderBy interface{}
	// Search users by username, name or email.
	Search interface{}
	// Sort users' list in asc or desc order. (Requires administrator privileges)
	Sort interface{}
}

// A collection of values returned by getUsers.
type GetUsersResult struct {
	Active interface{}
	Blocked interface{}
	CreatedAfter interface{}
	CreatedBefore interface{}
	ExternProvider interface{}
	// The external UID of the user.
	ExternUid interface{}
	OrderBy interface{}
	Search interface{}
	Sort interface{}
	// The list of users.
	Users interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}
