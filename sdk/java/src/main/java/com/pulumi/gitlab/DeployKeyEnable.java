// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.DeployKeyEnableArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.DeployKeyEnableState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `gitlab.DeployKeyEnable` resource allows to enable an already existing deploy key (see `gitlab.DeployKey resource`) for a specific project.
 * 
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/deploy_keys.html#enable-a-deploy-key)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gitlab.Project;
 * import com.pulumi.gitlab.DeployKey;
 * import com.pulumi.gitlab.DeployKeyArgs;
 * import com.pulumi.gitlab.DeployKeyEnable;
 * import com.pulumi.gitlab.DeployKeyEnableArgs;
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
 *         var parentProject = new Project(&#34;parentProject&#34;);
 * 
 *         var fooProject = new Project(&#34;fooProject&#34;);
 * 
 *         var parentDeployKey = new DeployKey(&#34;parentDeployKey&#34;, DeployKeyArgs.builder()        
 *             .project(parentProject.id())
 *             .title(&#34;Example deploy key&#34;)
 *             .key(&#34;ssh-ed25519 AAAA...&#34;)
 *             .build());
 * 
 *         var fooDeployKeyEnable = new DeployKeyEnable(&#34;fooDeployKeyEnable&#34;, DeployKeyEnableArgs.builder()        
 *             .project(fooProject.id())
 *             .keyId(parentDeployKey.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * GitLab enabled deploy keys can be imported using an id made up of `{project_id}:{deploy_key_id}`, e.g. `project_id` can be whatever the [get single project api][get_single_project] takes for its `:id` value, so for example
 * 
 * ```sh
 *  $ pulumi import gitlab:index/deployKeyEnable:DeployKeyEnable example 12345:67890
 * ```
 * 
 * ```sh
 *  $ pulumi import gitlab:index/deployKeyEnable:DeployKeyEnable example richardc/example:67890
 * ```
 * 
 */
@ResourceType(type="gitlab:index/deployKeyEnable:DeployKeyEnable")
public class DeployKeyEnable extends com.pulumi.resources.CustomResource {
    /**
     * Can deploy key push to the project&#39;s repository.
     * 
     */
    @Export(name="canPush", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> canPush;

    /**
     * @return Can deploy key push to the project&#39;s repository.
     * 
     */
    public Output<Optional<Boolean>> canPush() {
        return Codegen.optional(this.canPush);
    }
    /**
     * Deploy key.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Deploy key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The Gitlab key id for the pre-existing deploy key
     * 
     */
    @Export(name="keyId", refs={String.class}, tree="[0]")
    private Output<String> keyId;

    /**
     * @return The Gitlab key id for the pre-existing deploy key
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * The name or id of the project to add the deploy key to.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The name or id of the project to add the deploy key to.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Deploy key&#39;s title.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return Deploy key&#39;s title.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeployKeyEnable(String name) {
        this(name, DeployKeyEnableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeployKeyEnable(String name, DeployKeyEnableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeployKeyEnable(String name, DeployKeyEnableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/deployKeyEnable:DeployKeyEnable", name, args == null ? DeployKeyEnableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeployKeyEnable(String name, Output<String> id, @Nullable DeployKeyEnableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/deployKeyEnable:DeployKeyEnable", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DeployKeyEnable get(String name, Output<String> id, @Nullable DeployKeyEnableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeployKeyEnable(name, id, state, options);
    }
}
