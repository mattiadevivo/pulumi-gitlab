// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * The `gitlab.GroupMembership` data source allows to list and filter all members of a group specified by either its id or full path.
 *
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/members.html#list-all-members-of-a-group-or-project)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * // By group's full path
 * const example = pulumi.output(gitlab.getGroupMembership({
 *     fullPath: "foo/bar",
 * }));
 * ```
 */
export function getGroupMembership(args?: GetGroupMembershipArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupMembershipResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("gitlab:index/getGroupMembership:getGroupMembership", {
        "accessLevel": args.accessLevel,
        "fullPath": args.fullPath,
        "groupId": args.groupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroupMembership.
 */
export interface GetGroupMembershipArgs {
    accessLevel?: string;
    fullPath?: string;
    groupId?: number;
}

/**
 * A collection of values returned by getGroupMembership.
 */
export interface GetGroupMembershipResult {
    readonly accessLevel: string;
    readonly fullPath: string;
    readonly groupId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly members: outputs.GetGroupMembershipMember[];
}

export function getGroupMembershipOutput(args?: GetGroupMembershipOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGroupMembershipResult> {
    return pulumi.output(args).apply(a => getGroupMembership(a, opts))
}

/**
 * A collection of arguments for invoking getGroupMembership.
 */
export interface GetGroupMembershipOutputArgs {
    accessLevel?: pulumi.Input<string>;
    fullPath?: pulumi.Input<string>;
    groupId?: pulumi.Input<number>;
}
