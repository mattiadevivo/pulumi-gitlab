// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.ProjectTagArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.ProjectTagState;
import com.pulumi.gitlab.outputs.ProjectTagCommit;
import com.pulumi.gitlab.outputs.ProjectTagRelease;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `gitlab.ProjectTag` resource allows to manage the lifecycle of a tag in a project.
 * 
 * **Upstream API**: [GitLab API docs](https://docs.gitlab.com/ee/api/tags.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gitlab.Project;
 * import com.pulumi.gitlab.ProjectArgs;
 * import com.pulumi.gitlab.ProjectTag;
 * import com.pulumi.gitlab.ProjectTagArgs;
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
 *         var exampleProject = new Project(&#34;exampleProject&#34;, ProjectArgs.builder()        
 *             .description(&#34;An example project&#34;)
 *             .namespaceId(gitlab_group.example().id())
 *             .build());
 * 
 *         var exampleProjectTag = new ProjectTag(&#34;exampleProjectTag&#34;, ProjectTagArgs.builder()        
 *             .ref(&#34;main&#34;)
 *             .project(exampleProject.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Gitlab project tags can be imported with a key composed of `&lt;project_id&gt;:&lt;tag_name&gt;`, e.g.
 * 
 * ```sh
 *  $ pulumi import gitlab:index/projectTag:ProjectTag example &#34;12345:develop&#34;
 * ```
 * 
 *  NOTEthe `ref` attribute won&#39;t be available for imported `gitlab_project_tag` resources.
 * 
 */
@ResourceType(type="gitlab:index/projectTag:ProjectTag")
public class ProjectTag extends com.pulumi.resources.CustomResource {
    /**
     * The commit associated with the tag.
     * 
     */
    @Export(name="commits", refs={List.class,ProjectTagCommit.class}, tree="[0,1]")
    private Output<List<ProjectTagCommit>> commits;

    /**
     * @return The commit associated with the tag.
     * 
     */
    public Output<List<ProjectTagCommit>> commits() {
        return this.commits;
    }
    /**
     * The message of the annotated tag.
     * 
     */
    @Export(name="message", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> message;

    /**
     * @return The message of the annotated tag.
     * 
     */
    public Output<Optional<String>> message() {
        return Codegen.optional(this.message);
    }
    /**
     * The name of a tag.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of a tag.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID or URL-encoded path of the project owned by the authenticated user.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID or URL-encoded path of the project owned by the authenticated user.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Bool, true if tag has tag protection.
     * 
     */
    @Export(name="protected", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> protected_;

    /**
     * @return Bool, true if tag has tag protection.
     * 
     */
    public Output<Boolean> protected_() {
        return this.protected_;
    }
    /**
     * Create tag using commit SHA, another tag name, or branch name. This attribute is not available for imported resources.
     * 
     */
    @Export(name="ref", refs={String.class}, tree="[0]")
    private Output<String> ref;

    /**
     * @return Create tag using commit SHA, another tag name, or branch name. This attribute is not available for imported resources.
     * 
     */
    public Output<String> ref() {
        return this.ref;
    }
    /**
     * The release associated with the tag.
     * 
     */
    @Export(name="releases", refs={List.class,ProjectTagRelease.class}, tree="[0,1]")
    private Output<List<ProjectTagRelease>> releases;

    /**
     * @return The release associated with the tag.
     * 
     */
    public Output<List<ProjectTagRelease>> releases() {
        return this.releases;
    }
    /**
     * The unique id assigned to the commit by Gitlab.
     * 
     */
    @Export(name="target", refs={String.class}, tree="[0]")
    private Output<String> target;

    /**
     * @return The unique id assigned to the commit by Gitlab.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectTag(String name) {
        this(name, ProjectTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectTag(String name, ProjectTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectTag(String name, ProjectTagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectTag:ProjectTag", name, args == null ? ProjectTagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectTag(String name, Output<String> id, @Nullable ProjectTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectTag:ProjectTag", name, state, makeResourceOptions(options, id));
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
    public static ProjectTag get(String name, Output<String> id, @Nullable ProjectTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectTag(name, id, state, options);
    }
}
