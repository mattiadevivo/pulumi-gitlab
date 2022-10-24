// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.ProjectMirrorArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.ProjectMirrorState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `gitlab.ProjectMirror` resource allows to manage the lifecycle of a project mirror.
 * 
 * This is for *pushing* changes to a remote repository. *Pull Mirroring* can be configured using a combination of the
 * import_url, mirror, and mirror_trigger_builds properties on the gitlab.Project resource.
 * 
 * &gt; **Destroy Behavior** GitLab 14.10 introduced an API endpoint to delete a project mirror.
 *    Therefore, for GitLab 14.10 and newer the project mirror will be destroyed when the resource is destroyed.
 *    For older versions, the mirror will be disabled and the resource will be destroyed.
 * 
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/remote_mirrors.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gitlab.ProjectMirror;
 * import com.pulumi.gitlab.ProjectMirrorArgs;
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
 *         var foo = new ProjectMirror(&#34;foo&#34;, ProjectMirrorArgs.builder()        
 *             .project(&#34;1&#34;)
 *             .url(&#34;https://username:password@github.com/org/repository.git&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * GitLab project mirror can be imported using an id made up of `project_id:mirror_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import gitlab:index/projectMirror:ProjectMirror foo &#34;12345:1337&#34;
 * ```
 * 
 */
@ResourceType(type="gitlab:index/projectMirror:ProjectMirror")
public class ProjectMirror extends com.pulumi.resources.CustomResource {
    /**
     * Determines if the mirror is enabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Determines if the mirror is enabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Determines if divergent refs are skipped.
     * 
     */
    @Export(name="keepDivergentRefs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> keepDivergentRefs;

    /**
     * @return Determines if divergent refs are skipped.
     * 
     */
    public Output<Optional<Boolean>> keepDivergentRefs() {
        return Codegen.optional(this.keepDivergentRefs);
    }
    /**
     * Mirror ID.
     * 
     */
    @Export(name="mirrorId", type=Integer.class, parameters={})
    private Output<Integer> mirrorId;

    /**
     * @return Mirror ID.
     * 
     */
    public Output<Integer> mirrorId() {
        return this.mirrorId;
    }
    /**
     * Determines if only protected branches are mirrored.
     * 
     */
    @Export(name="onlyProtectedBranches", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onlyProtectedBranches;

    /**
     * @return Determines if only protected branches are mirrored.
     * 
     */
    public Output<Optional<Boolean>> onlyProtectedBranches() {
        return Codegen.optional(this.onlyProtectedBranches);
    }
    /**
     * The id of the project.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The id of the project.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The URL of the remote repository to be mirrored.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL of the remote repository to be mirrored.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectMirror(String name) {
        this(name, ProjectMirrorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectMirror(String name, ProjectMirrorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectMirror(String name, ProjectMirrorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectMirror:ProjectMirror", name, args == null ? ProjectMirrorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectMirror(String name, Output<String> id, @Nullable ProjectMirrorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectMirror:ProjectMirror", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "url"
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
    public static ProjectMirror get(String name, Output<String> id, @Nullable ProjectMirrorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectMirror(name, id, state, options);
    }
}
