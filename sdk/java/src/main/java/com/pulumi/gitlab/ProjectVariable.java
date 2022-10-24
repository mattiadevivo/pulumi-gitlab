// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.ProjectVariableArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.ProjectVariableState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `gitlab.ProjectVariable` resource allows to manage the lifecycle of a CI/CD variable for a project.
 * 
 * &gt; **Important:** If your GitLab version is older than 13.4, you may see nondeterministic behavior when updating or deleting gitlab.ProjectVariable resources with non-unique keys, for example if there is another variable with the same key and different environment scope. See [this GitLab issue](https://gitlab.com/gitlab-org/gitlab/-/issues/9912).
 * 
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/project_level_variables.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gitlab.ProjectVariable;
 * import com.pulumi.gitlab.ProjectVariableArgs;
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
 *         var example = new ProjectVariable(&#34;example&#34;, ProjectVariableArgs.builder()        
 *             .key(&#34;project_variable_key&#34;)
 *             .project(&#34;12345&#34;)
 *             .protected_(false)
 *             .value(&#34;project_variable_value&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * GitLab project variables can be imported using an id made up of `project:key:environment_scope`, e.g.
 * 
 * ```sh
 *  $ pulumi import gitlab:index/projectVariable:ProjectVariable example &#39;12345:project_variable_key:*&#39;
 * ```
 * 
 */
@ResourceType(type="gitlab:index/projectVariable:ProjectVariable")
public class ProjectVariable extends com.pulumi.resources.CustomResource {
    /**
     * The environment scope of the variable. Defaults to all environment (`*`). Note that in Community Editions of Gitlab, values other than `*` will cause inconsistent plans.
     * 
     */
    @Export(name="environmentScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentScope;

    /**
     * @return The environment scope of the variable. Defaults to all environment (`*`). Note that in Community Editions of Gitlab, values other than `*` will cause inconsistent plans.
     * 
     */
    public Output<Optional<String>> environmentScope() {
        return Codegen.optional(this.environmentScope);
    }
    /**
     * The name of the variable.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The name of the variable.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
     * 
     */
    @Export(name="masked", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> masked;

    /**
     * @return If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> masked() {
        return Codegen.optional(this.masked);
    }
    /**
     * The name or id of the project.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The name or id of the project.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
     * 
     */
    @Export(name="protected", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> protected_;

    /**
     * @return If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> protected_() {
        return Codegen.optional(this.protected_);
    }
    /**
     * The value of the variable.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The value of the variable.
     * 
     */
    public Output<String> value() {
        return this.value;
    }
    /**
     * The type of a variable. Valid values are: `env_var`, `file`. Default is `env_var`.
     * 
     */
    @Export(name="variableType", type=String.class, parameters={})
    private Output</* @Nullable */ String> variableType;

    /**
     * @return The type of a variable. Valid values are: `env_var`, `file`. Default is `env_var`.
     * 
     */
    public Output<Optional<String>> variableType() {
        return Codegen.optional(this.variableType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectVariable(String name) {
        this(name, ProjectVariableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectVariable(String name, ProjectVariableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectVariable(String name, ProjectVariableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectVariable:ProjectVariable", name, args == null ? ProjectVariableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectVariable(String name, Output<String> id, @Nullable ProjectVariableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectVariable:ProjectVariable", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
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
    public static ProjectVariable get(String name, Output<String> id, @Nullable ProjectVariableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectVariable(name, id, state, options);
    }
}
