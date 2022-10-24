// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `gitlab.Topic` resource allows to manage the lifecycle of topics that are then assignable to projects.
 *
 * > Topics are the successors for project tags. Aside from avoiding terminology collisions with Git tags, they are more descriptive and better searchable.
 *
 * > Deleting a topic was implemented in GitLab 14.9. For older versions of GitLab set `softDestroy = true` to empty out a topic instead of deleting it.
 *
 * **Upstream API**: [GitLab REST API docs for topics](https://docs.gitlab.com/ee/api/topics.html)
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import gitlab:index/topic:Topic You can import a topic to terraform state using `<resource> <id>`.
 * ```
 *
 *  The `id` must be an integer for the id of the topic you want to import, for example
 *
 * ```sh
 *  $ pulumi import gitlab:index/topic:Topic functional_programming 1
 * ```
 */
export class Topic extends pulumi.CustomResource {
    /**
     * Get an existing Topic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicState, opts?: pulumi.CustomResourceOptions): Topic {
        return new Topic(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gitlab:index/topic:Topic';

    /**
     * Returns true if the given object is an instance of Topic.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Topic {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Topic.__pulumiType;
    }

    /**
     * A local path to the avatar image to upload. **Note**: not available for imported resources.
     */
    public readonly avatar!: pulumi.Output<string | undefined>;
    /**
     * The hash of the avatar image. Use `filesha256("path/to/avatar.png")` whenever possible. **Note**: this is used to trigger an update of the avatar. If it's not given, but an avatar is given, the avatar will be updated each time.
     */
    public readonly avatarHash!: pulumi.Output<string>;
    /**
     * The URL of the avatar image.
     */
    public /*out*/ readonly avatarUrl!: pulumi.Output<string>;
    /**
     * A text describing the topic.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The topic's name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Empty the topics fields instead of deleting it.
     *
     * @deprecated GitLab 14.9 introduced the proper deletion of topics. This field is no longer needed.
     */
    public readonly softDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * The topic's description. Requires at least GitLab 15.0 for which it's a required argument.
     */
    public readonly title!: pulumi.Output<string | undefined>;

    /**
     * Create a Topic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TopicArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TopicArgs | TopicState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TopicState | undefined;
            resourceInputs["avatar"] = state ? state.avatar : undefined;
            resourceInputs["avatarHash"] = state ? state.avatarHash : undefined;
            resourceInputs["avatarUrl"] = state ? state.avatarUrl : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["softDestroy"] = state ? state.softDestroy : undefined;
            resourceInputs["title"] = state ? state.title : undefined;
        } else {
            const args = argsOrState as TopicArgs | undefined;
            resourceInputs["avatar"] = args ? args.avatar : undefined;
            resourceInputs["avatarHash"] = args ? args.avatarHash : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["softDestroy"] = args ? args.softDestroy : undefined;
            resourceInputs["title"] = args ? args.title : undefined;
            resourceInputs["avatarUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Topic.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Topic resources.
 */
export interface TopicState {
    /**
     * A local path to the avatar image to upload. **Note**: not available for imported resources.
     */
    avatar?: pulumi.Input<string>;
    /**
     * The hash of the avatar image. Use `filesha256("path/to/avatar.png")` whenever possible. **Note**: this is used to trigger an update of the avatar. If it's not given, but an avatar is given, the avatar will be updated each time.
     */
    avatarHash?: pulumi.Input<string>;
    /**
     * The URL of the avatar image.
     */
    avatarUrl?: pulumi.Input<string>;
    /**
     * A text describing the topic.
     */
    description?: pulumi.Input<string>;
    /**
     * The topic's name.
     */
    name?: pulumi.Input<string>;
    /**
     * Empty the topics fields instead of deleting it.
     *
     * @deprecated GitLab 14.9 introduced the proper deletion of topics. This field is no longer needed.
     */
    softDestroy?: pulumi.Input<boolean>;
    /**
     * The topic's description. Requires at least GitLab 15.0 for which it's a required argument.
     */
    title?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Topic resource.
 */
export interface TopicArgs {
    /**
     * A local path to the avatar image to upload. **Note**: not available for imported resources.
     */
    avatar?: pulumi.Input<string>;
    /**
     * The hash of the avatar image. Use `filesha256("path/to/avatar.png")` whenever possible. **Note**: this is used to trigger an update of the avatar. If it's not given, but an avatar is given, the avatar will be updated each time.
     */
    avatarHash?: pulumi.Input<string>;
    /**
     * A text describing the topic.
     */
    description?: pulumi.Input<string>;
    /**
     * The topic's name.
     */
    name?: pulumi.Input<string>;
    /**
     * Empty the topics fields instead of deleting it.
     *
     * @deprecated GitLab 14.9 introduced the proper deletion of topics. This field is no longer needed.
     */
    softDestroy?: pulumi.Input<boolean>;
    /**
     * The topic's description. Requires at least GitLab 15.0 for which it's a required argument.
     */
    title?: pulumi.Input<string>;
}
