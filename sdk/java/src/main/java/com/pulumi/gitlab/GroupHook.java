// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.GroupHookArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.GroupHookState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `gitlab.GroupHook` resource allows to manage the lifecycle of a group hook.
 * 
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/groups.html#hooks)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gitlab.GroupHook;
 * import com.pulumi.gitlab.GroupHookArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new GroupHook(&#34;example&#34;, GroupHookArgs.builder()        
 *             .group(&#34;example/hooked&#34;)
 *             .mergeRequestsEvents(true)
 *             .url(&#34;https://example.com/hook/example&#34;)
 *             .build());
 * 
 *         var allAttributes = new GroupHook(&#34;allAttributes&#34;, GroupHookArgs.builder()        
 *             .confidentialIssuesEvents(false)
 *             .confidentialNoteEvents(true)
 *             .deploymentEvents(true)
 *             .enableSslVerification(false)
 *             .group(1)
 *             .issuesEvents(false)
 *             .jobEvents(true)
 *             .mergeRequestsEvents(true)
 *             .noteEvents(true)
 *             .pipelineEvents(true)
 *             .pushEvents(true)
 *             .pushEventsBranchFilter(&#34;devel&#34;)
 *             .releasesEvents(true)
 *             .subgroupEvents(true)
 *             .tagPushEvents(true)
 *             .token(&#34;supersecret&#34;)
 *             .url(&#34;http://example.com&#34;)
 *             .wikiPageEvents(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A GitLab Group Hook can be imported using a key composed of `&lt;group-id&gt;:&lt;hook-id&gt;`, e.g.
 * 
 * ```sh
 *  $ pulumi import gitlab:index/groupHook:GroupHook example &#34;12345:1&#34;
 * ```
 * 
 *  NOTEthe `token` resource attribute is not available for imported resources as this information cannot be read from the GitLab API.
 * 
 */
@ResourceType(type="gitlab:index/groupHook:GroupHook")
public class GroupHook extends com.pulumi.resources.CustomResource {
    /**
     * Invoke the hook for confidential issues events.
     * 
     */
    @Export(name="confidentialIssuesEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> confidentialIssuesEvents;

    /**
     * @return Invoke the hook for confidential issues events.
     * 
     */
    public Output<Optional<Boolean>> confidentialIssuesEvents() {
        return Codegen.optional(this.confidentialIssuesEvents);
    }
    /**
     * Invoke the hook for confidential notes events.
     * 
     */
    @Export(name="confidentialNoteEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> confidentialNoteEvents;

    /**
     * @return Invoke the hook for confidential notes events.
     * 
     */
    public Output<Optional<Boolean>> confidentialNoteEvents() {
        return Codegen.optional(this.confidentialNoteEvents);
    }
    /**
     * Invoke the hook for deployment events.
     * 
     */
    @Export(name="deploymentEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deploymentEvents;

    /**
     * @return Invoke the hook for deployment events.
     * 
     */
    public Output<Optional<Boolean>> deploymentEvents() {
        return Codegen.optional(this.deploymentEvents);
    }
    /**
     * Enable ssl verification when invoking the hook.
     * 
     */
    @Export(name="enableSslVerification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableSslVerification;

    /**
     * @return Enable ssl verification when invoking the hook.
     * 
     */
    public Output<Optional<Boolean>> enableSslVerification() {
        return Codegen.optional(this.enableSslVerification);
    }
    /**
     * The ID or full path of the group.
     * 
     */
    @Export(name="group", type=String.class, parameters={})
    private Output<String> group;

    /**
     * @return The ID or full path of the group.
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * The id of the group for the hook.
     * 
     */
    @Export(name="groupId", type=Integer.class, parameters={})
    private Output<Integer> groupId;

    /**
     * @return The id of the group for the hook.
     * 
     */
    public Output<Integer> groupId() {
        return this.groupId;
    }
    /**
     * The id of the group hook.
     * 
     */
    @Export(name="hookId", type=Integer.class, parameters={})
    private Output<Integer> hookId;

    /**
     * @return The id of the group hook.
     * 
     */
    public Output<Integer> hookId() {
        return this.hookId;
    }
    /**
     * Invoke the hook for issues events.
     * 
     */
    @Export(name="issuesEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> issuesEvents;

    /**
     * @return Invoke the hook for issues events.
     * 
     */
    public Output<Optional<Boolean>> issuesEvents() {
        return Codegen.optional(this.issuesEvents);
    }
    /**
     * Invoke the hook for job events.
     * 
     */
    @Export(name="jobEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> jobEvents;

    /**
     * @return Invoke the hook for job events.
     * 
     */
    public Output<Optional<Boolean>> jobEvents() {
        return Codegen.optional(this.jobEvents);
    }
    /**
     * Invoke the hook for merge requests.
     * 
     */
    @Export(name="mergeRequestsEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mergeRequestsEvents;

    /**
     * @return Invoke the hook for merge requests.
     * 
     */
    public Output<Optional<Boolean>> mergeRequestsEvents() {
        return Codegen.optional(this.mergeRequestsEvents);
    }
    /**
     * Invoke the hook for notes events.
     * 
     */
    @Export(name="noteEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noteEvents;

    /**
     * @return Invoke the hook for notes events.
     * 
     */
    public Output<Optional<Boolean>> noteEvents() {
        return Codegen.optional(this.noteEvents);
    }
    /**
     * Invoke the hook for pipeline events.
     * 
     */
    @Export(name="pipelineEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> pipelineEvents;

    /**
     * @return Invoke the hook for pipeline events.
     * 
     */
    public Output<Optional<Boolean>> pipelineEvents() {
        return Codegen.optional(this.pipelineEvents);
    }
    /**
     * Invoke the hook for push events.
     * 
     */
    @Export(name="pushEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> pushEvents;

    /**
     * @return Invoke the hook for push events.
     * 
     */
    public Output<Optional<Boolean>> pushEvents() {
        return Codegen.optional(this.pushEvents);
    }
    /**
     * Invoke the hook for push events on matching branches only.
     * 
     */
    @Export(name="pushEventsBranchFilter", type=String.class, parameters={})
    private Output</* @Nullable */ String> pushEventsBranchFilter;

    /**
     * @return Invoke the hook for push events on matching branches only.
     * 
     */
    public Output<Optional<String>> pushEventsBranchFilter() {
        return Codegen.optional(this.pushEventsBranchFilter);
    }
    /**
     * Invoke the hook for releases events.
     * 
     */
    @Export(name="releasesEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> releasesEvents;

    /**
     * @return Invoke the hook for releases events.
     * 
     */
    public Output<Optional<Boolean>> releasesEvents() {
        return Codegen.optional(this.releasesEvents);
    }
    /**
     * Invoke the hook for subgroup events.
     * 
     */
    @Export(name="subgroupEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> subgroupEvents;

    /**
     * @return Invoke the hook for subgroup events.
     * 
     */
    public Output<Optional<Boolean>> subgroupEvents() {
        return Codegen.optional(this.subgroupEvents);
    }
    /**
     * Invoke the hook for tag push events.
     * 
     */
    @Export(name="tagPushEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tagPushEvents;

    /**
     * @return Invoke the hook for tag push events.
     * 
     */
    public Output<Optional<Boolean>> tagPushEvents() {
        return Codegen.optional(this.tagPushEvents);
    }
    /**
     * A token to present when invoking the hook. The token is not available for imported resources.
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output</* @Nullable */ String> token;

    /**
     * @return A token to present when invoking the hook. The token is not available for imported resources.
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }
    /**
     * The url of the hook to invoke.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The url of the hook to invoke.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * Invoke the hook for wiki page events.
     * 
     */
    @Export(name="wikiPageEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> wikiPageEvents;

    /**
     * @return Invoke the hook for wiki page events.
     * 
     */
    public Output<Optional<Boolean>> wikiPageEvents() {
        return Codegen.optional(this.wikiPageEvents);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupHook(String name) {
        this(name, GroupHookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupHook(String name, GroupHookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupHook(String name, GroupHookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/groupHook:GroupHook", name, args == null ? GroupHookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupHook(String name, Output<String> id, @Nullable GroupHookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/groupHook:GroupHook", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "token"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GroupHook get(String name, Output<String> id, @Nullable GroupHookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupHook(name, id, state, options);
    }
}
