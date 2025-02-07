// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The `gitlab.getGroups` data source allows details of multiple groups to be retrieved given some optional filter criteria.
 *
 * > Some attributes might not be returned depending on if you're an admin or not.
 *
 * > Some available options require administrator privileges.
 *
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#list-groups)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const example = gitlab.getGroups({
 *     orderBy: "name",
 *     sort: "desc",
 * });
 * const example-two = gitlab.getGroups({
 *     search: "GitLab",
 * });
 * ```
 */
export function getGroups(args?: GetGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gitlab:index/getGroups:getGroups", {
        "orderBy": args.orderBy,
        "search": args.search,
        "sort": args.sort,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsArgs {
    /**
     * Order the groups' list by `id`, `name`, `path`, or `similarity`. (Requires administrator privileges)
     */
    orderBy?: string;
    /**
     * Search groups by name or path.
     */
    search?: string;
    /**
     * Sort groups' list in asc or desc order. (Requires administrator privileges)
     */
    sort?: string;
}

/**
 * A collection of values returned by getGroups.
 */
export interface GetGroupsResult {
    /**
     * The list of groups.
     */
    readonly groups: outputs.GetGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Order the groups' list by `id`, `name`, `path`, or `similarity`. (Requires administrator privileges)
     */
    readonly orderBy?: string;
    /**
     * Search groups by name or path.
     */
    readonly search?: string;
    /**
     * Sort groups' list in asc or desc order. (Requires administrator privileges)
     */
    readonly sort?: string;
}
/**
 * The `gitlab.getGroups` data source allows details of multiple groups to be retrieved given some optional filter criteria.
 *
 * > Some attributes might not be returned depending on if you're an admin or not.
 *
 * > Some available options require administrator privileges.
 *
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#list-groups)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gitlab from "@pulumi/gitlab";
 *
 * const example = gitlab.getGroups({
 *     orderBy: "name",
 *     sort: "desc",
 * });
 * const example-two = gitlab.getGroups({
 *     search: "GitLab",
 * });
 * ```
 */
export function getGroupsOutput(args?: GetGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGroupsResult> {
    return pulumi.output(args).apply((a: any) => getGroups(a, opts))
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsOutputArgs {
    /**
     * Order the groups' list by `id`, `name`, `path`, or `similarity`. (Requires administrator privileges)
     */
    orderBy?: pulumi.Input<string>;
    /**
     * Search groups by name or path.
     */
    search?: pulumi.Input<string>;
    /**
     * Sort groups' list in asc or desc order. (Requires administrator privileges)
     */
    sort?: pulumi.Input<string>;
}
