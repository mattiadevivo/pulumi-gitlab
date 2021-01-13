// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState, opts?: pulumi.CustomResourceOptions): Group {
        return new Group(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/group:Group';

    /**
     * Returns true if the given object is an instance of Group.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Group {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Group.__pulumiType;
    }

    /**
     * Boolean, defaults to false.  Default to Auto
     * DevOps pipeline for all projects within this group.
     */
    public readonly autoDevopsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The description of the group.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Boolean, defaults to false.  Disable email notifications
     */
    public readonly emailsDisabled!: pulumi.Output<boolean | undefined>;
    /**
     * The full name of the group.
     */
    public /*out*/ readonly fullName!: pulumi.Output<string>;
    /**
     * The full path of the group.
     */
    public /*out*/ readonly fullPath!: pulumi.Output<string>;
    /**
     * Boolean, defaults to true.  Whether to enable LFS
     * support for projects in this group.
     */
    public readonly lfsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Boolean, defaults to false.  Disable the capability
     * of a group from getting mentioned
     */
    public readonly mentionsDisabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of this group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Integer, id of the parent group (creates a nested group).
     */
    public readonly parentId!: pulumi.Output<number | undefined>;
    /**
     * The path of the group.
     */
    public readonly path!: pulumi.Output<string>;
    /**
     * , defaults to Maintainer.
     * Determine if developers can create projects
     * in the group. Can be noone (No one), maintainer (Maintainers),
     * or developer (Developers + Maintainers).
     */
    public readonly projectCreationLevel!: pulumi.Output<string | undefined>;
    /**
     * Boolean, defaults to false.  Whether to
     * enable users to request access to the group.
     */
    public readonly requestAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Boolean, defaults to false.
     * equire all users in this group to setup Two-factor authentication.
     */
    public readonly requireTwoFactorAuthentication!: pulumi.Output<boolean | undefined>;
    /**
     * The group level registration token to use during runner setup.
     */
    public /*out*/ readonly runnersToken!: pulumi.Output<string>;
    /**
     * Boolean, defaults to false.  Prevent sharing
     * a project with another group within this group.
     */
    public readonly shareWithGroupLock!: pulumi.Output<boolean | undefined>;
    /**
     * , defaults to Owner.
     * Allowed to create subgroups.
     * Can be owner (Owners), or maintainer (Maintainers).
     */
    public readonly subgroupCreationLevel!: pulumi.Output<string | undefined>;
    /**
     * Int, defaults to 48.
     * Time before Two-factor authentication is enforced (in hours).
     */
    public readonly twoFactorGracePeriod!: pulumi.Output<number | undefined>;
    /**
     * The group's visibility. Can be `private`, `internal`, or `public`.
     */
    public readonly visibilityLevel!: pulumi.Output<string>;
    /**
     * Web URL of the group.
     */
    public /*out*/ readonly webUrl!: pulumi.Output<string>;

    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupArgs | GroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as GroupState | undefined;
            inputs["autoDevopsEnabled"] = state ? state.autoDevopsEnabled : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["emailsDisabled"] = state ? state.emailsDisabled : undefined;
            inputs["fullName"] = state ? state.fullName : undefined;
            inputs["fullPath"] = state ? state.fullPath : undefined;
            inputs["lfsEnabled"] = state ? state.lfsEnabled : undefined;
            inputs["mentionsDisabled"] = state ? state.mentionsDisabled : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["parentId"] = state ? state.parentId : undefined;
            inputs["path"] = state ? state.path : undefined;
            inputs["projectCreationLevel"] = state ? state.projectCreationLevel : undefined;
            inputs["requestAccessEnabled"] = state ? state.requestAccessEnabled : undefined;
            inputs["requireTwoFactorAuthentication"] = state ? state.requireTwoFactorAuthentication : undefined;
            inputs["runnersToken"] = state ? state.runnersToken : undefined;
            inputs["shareWithGroupLock"] = state ? state.shareWithGroupLock : undefined;
            inputs["subgroupCreationLevel"] = state ? state.subgroupCreationLevel : undefined;
            inputs["twoFactorGracePeriod"] = state ? state.twoFactorGracePeriod : undefined;
            inputs["visibilityLevel"] = state ? state.visibilityLevel : undefined;
            inputs["webUrl"] = state ? state.webUrl : undefined;
        } else {
            const args = argsOrState as GroupArgs | undefined;
            if ((!args || args.path === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'path'");
            }
            inputs["autoDevopsEnabled"] = args ? args.autoDevopsEnabled : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["emailsDisabled"] = args ? args.emailsDisabled : undefined;
            inputs["lfsEnabled"] = args ? args.lfsEnabled : undefined;
            inputs["mentionsDisabled"] = args ? args.mentionsDisabled : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["parentId"] = args ? args.parentId : undefined;
            inputs["path"] = args ? args.path : undefined;
            inputs["projectCreationLevel"] = args ? args.projectCreationLevel : undefined;
            inputs["requestAccessEnabled"] = args ? args.requestAccessEnabled : undefined;
            inputs["requireTwoFactorAuthentication"] = args ? args.requireTwoFactorAuthentication : undefined;
            inputs["shareWithGroupLock"] = args ? args.shareWithGroupLock : undefined;
            inputs["subgroupCreationLevel"] = args ? args.subgroupCreationLevel : undefined;
            inputs["twoFactorGracePeriod"] = args ? args.twoFactorGracePeriod : undefined;
            inputs["visibilityLevel"] = args ? args.visibilityLevel : undefined;
            inputs["fullName"] = undefined /*out*/;
            inputs["fullPath"] = undefined /*out*/;
            inputs["runnersToken"] = undefined /*out*/;
            inputs["webUrl"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Group.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    /**
     * Boolean, defaults to false.  Default to Auto
     * DevOps pipeline for all projects within this group.
     */
    readonly autoDevopsEnabled?: pulumi.Input<boolean>;
    /**
     * The description of the group.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Boolean, defaults to false.  Disable email notifications
     */
    readonly emailsDisabled?: pulumi.Input<boolean>;
    /**
     * The full name of the group.
     */
    readonly fullName?: pulumi.Input<string>;
    /**
     * The full path of the group.
     */
    readonly fullPath?: pulumi.Input<string>;
    /**
     * Boolean, defaults to true.  Whether to enable LFS
     * support for projects in this group.
     */
    readonly lfsEnabled?: pulumi.Input<boolean>;
    /**
     * Boolean, defaults to false.  Disable the capability
     * of a group from getting mentioned
     */
    readonly mentionsDisabled?: pulumi.Input<boolean>;
    /**
     * The name of this group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Integer, id of the parent group (creates a nested group).
     */
    readonly parentId?: pulumi.Input<number>;
    /**
     * The path of the group.
     */
    readonly path?: pulumi.Input<string>;
    /**
     * , defaults to Maintainer.
     * Determine if developers can create projects
     * in the group. Can be noone (No one), maintainer (Maintainers),
     * or developer (Developers + Maintainers).
     */
    readonly projectCreationLevel?: pulumi.Input<string>;
    /**
     * Boolean, defaults to false.  Whether to
     * enable users to request access to the group.
     */
    readonly requestAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Boolean, defaults to false.
     * equire all users in this group to setup Two-factor authentication.
     */
    readonly requireTwoFactorAuthentication?: pulumi.Input<boolean>;
    /**
     * The group level registration token to use during runner setup.
     */
    readonly runnersToken?: pulumi.Input<string>;
    /**
     * Boolean, defaults to false.  Prevent sharing
     * a project with another group within this group.
     */
    readonly shareWithGroupLock?: pulumi.Input<boolean>;
    /**
     * , defaults to Owner.
     * Allowed to create subgroups.
     * Can be owner (Owners), or maintainer (Maintainers).
     */
    readonly subgroupCreationLevel?: pulumi.Input<string>;
    /**
     * Int, defaults to 48.
     * Time before Two-factor authentication is enforced (in hours).
     */
    readonly twoFactorGracePeriod?: pulumi.Input<number>;
    /**
     * The group's visibility. Can be `private`, `internal`, or `public`.
     */
    readonly visibilityLevel?: pulumi.Input<string>;
    /**
     * Web URL of the group.
     */
    readonly webUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * Boolean, defaults to false.  Default to Auto
     * DevOps pipeline for all projects within this group.
     */
    readonly autoDevopsEnabled?: pulumi.Input<boolean>;
    /**
     * The description of the group.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Boolean, defaults to false.  Disable email notifications
     */
    readonly emailsDisabled?: pulumi.Input<boolean>;
    /**
     * Boolean, defaults to true.  Whether to enable LFS
     * support for projects in this group.
     */
    readonly lfsEnabled?: pulumi.Input<boolean>;
    /**
     * Boolean, defaults to false.  Disable the capability
     * of a group from getting mentioned
     */
    readonly mentionsDisabled?: pulumi.Input<boolean>;
    /**
     * The name of this group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Integer, id of the parent group (creates a nested group).
     */
    readonly parentId?: pulumi.Input<number>;
    /**
     * The path of the group.
     */
    readonly path: pulumi.Input<string>;
    /**
     * , defaults to Maintainer.
     * Determine if developers can create projects
     * in the group. Can be noone (No one), maintainer (Maintainers),
     * or developer (Developers + Maintainers).
     */
    readonly projectCreationLevel?: pulumi.Input<string>;
    /**
     * Boolean, defaults to false.  Whether to
     * enable users to request access to the group.
     */
    readonly requestAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Boolean, defaults to false.
     * equire all users in this group to setup Two-factor authentication.
     */
    readonly requireTwoFactorAuthentication?: pulumi.Input<boolean>;
    /**
     * Boolean, defaults to false.  Prevent sharing
     * a project with another group within this group.
     */
    readonly shareWithGroupLock?: pulumi.Input<boolean>;
    /**
     * , defaults to Owner.
     * Allowed to create subgroups.
     * Can be owner (Owners), or maintainer (Maintainers).
     */
    readonly subgroupCreationLevel?: pulumi.Input<string>;
    /**
     * Int, defaults to 48.
     * Time before Two-factor authentication is enforced (in hours).
     */
    readonly twoFactorGracePeriod?: pulumi.Input<number>;
    /**
     * The group's visibility. Can be `private`, `internal`, or `public`.
     */
    readonly visibilityLevel?: pulumi.Input<string>;
}
