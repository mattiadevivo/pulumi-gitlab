// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.BranchProtectionArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.BranchProtectionState;
import com.pulumi.gitlab.outputs.BranchProtectionAllowedToMerge;
import com.pulumi.gitlab.outputs.BranchProtectionAllowedToPush;
import com.pulumi.gitlab.outputs.BranchProtectionAllowedToUnprotect;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gitlab.BranchProtection;
 * import com.pulumi.gitlab.BranchProtectionArgs;
 * import com.pulumi.gitlab.inputs.BranchProtectionAllowedToPushArgs;
 * import com.pulumi.gitlab.inputs.BranchProtectionAllowedToMergeArgs;
 * import com.pulumi.gitlab.inputs.BranchProtectionAllowedToUnprotectArgs;
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
 *         var branchProtect = new BranchProtection(&#34;branchProtect&#34;, BranchProtectionArgs.builder()        
 *             .project(&#34;12345&#34;)
 *             .branch(&#34;BranchProtected&#34;)
 *             .pushAccessLevel(&#34;developer&#34;)
 *             .mergeAccessLevel(&#34;developer&#34;)
 *             .unprotectAccessLevel(&#34;developer&#34;)
 *             .allowForcePush(true)
 *             .codeOwnerApprovalRequired(true)
 *             .allowedToPushes(            
 *                 BranchProtectionAllowedToPushArgs.builder()
 *                     .userId(5)
 *                     .build(),
 *                 BranchProtectionAllowedToPushArgs.builder()
 *                     .userId(521)
 *                     .build())
 *             .allowedToMerges(            
 *                 BranchProtectionAllowedToMergeArgs.builder()
 *                     .userId(15)
 *                     .build(),
 *                 BranchProtectionAllowedToMergeArgs.builder()
 *                     .userId(37)
 *                     .build())
 *             .allowedToUnprotects(            
 *                 BranchProtectionAllowedToUnprotectArgs.builder()
 *                     .userId(15)
 *                     .build(),
 *                 BranchProtectionAllowedToUnprotectArgs.builder()
 *                     .groupId(42)
 *                     .build())
 *             .build());
 * 
 *         var main = new BranchProtection(&#34;main&#34;, BranchProtectionArgs.builder()        
 *             .project(&#34;12345&#34;)
 *             .branch(&#34;main&#34;)
 *             .pushAccessLevel(&#34;maintainer&#34;)
 *             .mergeAccessLevel(&#34;maintainer&#34;)
 *             .unprotectAccessLevel(&#34;maintainer&#34;)
 *             .dynamic(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Gitlab protected branches can be imported with a key composed of `&lt;project_id&gt;:&lt;branch&gt;`, e.g.
 * 
 * ```sh
 *  $ pulumi import gitlab:index/branchProtection:BranchProtection BranchProtect &#34;12345:main&#34;
 * ```
 * 
 */
@ResourceType(type="gitlab:index/branchProtection:BranchProtection")
public class BranchProtection extends com.pulumi.resources.CustomResource {
    /**
     * Can be set to true to allow users with push access to force push.
     * 
     */
    @Export(name="allowForcePush", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowForcePush;

    /**
     * @return Can be set to true to allow users with push access to force push.
     * 
     */
    public Output<Optional<Boolean>> allowForcePush() {
        return Codegen.optional(this.allowForcePush);
    }
    /**
     * Defines permissions for action.
     * 
     */
    @Export(name="allowedToMerges", type=List.class, parameters={BranchProtectionAllowedToMerge.class})
    private Output</* @Nullable */ List<BranchProtectionAllowedToMerge>> allowedToMerges;

    /**
     * @return Defines permissions for action.
     * 
     */
    public Output<Optional<List<BranchProtectionAllowedToMerge>>> allowedToMerges() {
        return Codegen.optional(this.allowedToMerges);
    }
    /**
     * Defines permissions for action.
     * 
     */
    @Export(name="allowedToPushes", type=List.class, parameters={BranchProtectionAllowedToPush.class})
    private Output</* @Nullable */ List<BranchProtectionAllowedToPush>> allowedToPushes;

    /**
     * @return Defines permissions for action.
     * 
     */
    public Output<Optional<List<BranchProtectionAllowedToPush>>> allowedToPushes() {
        return Codegen.optional(this.allowedToPushes);
    }
    /**
     * Defines permissions for action.
     * 
     */
    @Export(name="allowedToUnprotects", type=List.class, parameters={BranchProtectionAllowedToUnprotect.class})
    private Output</* @Nullable */ List<BranchProtectionAllowedToUnprotect>> allowedToUnprotects;

    /**
     * @return Defines permissions for action.
     * 
     */
    public Output<Optional<List<BranchProtectionAllowedToUnprotect>>> allowedToUnprotects() {
        return Codegen.optional(this.allowedToUnprotects);
    }
    /**
     * Name of the branch.
     * 
     */
    @Export(name="branch", type=String.class, parameters={})
    private Output<String> branch;

    /**
     * @return Name of the branch.
     * 
     */
    public Output<String> branch() {
        return this.branch;
    }
    /**
     * The ID of the branch protection (not the branch name).
     * 
     */
    @Export(name="branchProtectionId", type=Integer.class, parameters={})
    private Output<Integer> branchProtectionId;

    /**
     * @return The ID of the branch protection (not the branch name).
     * 
     */
    public Output<Integer> branchProtectionId() {
        return this.branchProtectionId;
    }
    /**
     * Can be set to true to require code owner approval before merging.
     * 
     */
    @Export(name="codeOwnerApprovalRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> codeOwnerApprovalRequired;

    /**
     * @return Can be set to true to require code owner approval before merging.
     * 
     */
    public Output<Optional<Boolean>> codeOwnerApprovalRequired() {
        return Codegen.optional(this.codeOwnerApprovalRequired);
    }
    /**
     * Access levels allowed to merge. Valid values are: `no one`, `developer`, `maintainer`.
     * 
     */
    @Export(name="mergeAccessLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> mergeAccessLevel;

    /**
     * @return Access levels allowed to merge. Valid values are: `no one`, `developer`, `maintainer`.
     * 
     */
    public Output<Optional<String>> mergeAccessLevel() {
        return Codegen.optional(this.mergeAccessLevel);
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
     * Access levels allowed to push. Valid values are: `no one`, `developer`, `maintainer`.
     * 
     */
    @Export(name="pushAccessLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> pushAccessLevel;

    /**
     * @return Access levels allowed to push. Valid values are: `no one`, `developer`, `maintainer`.
     * 
     */
    public Output<Optional<String>> pushAccessLevel() {
        return Codegen.optional(this.pushAccessLevel);
    }
    /**
     * Access levels allowed to unprotect. Valid values are: `developer`, `maintainer`.
     * 
     */
    @Export(name="unprotectAccessLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> unprotectAccessLevel;

    /**
     * @return Access levels allowed to unprotect. Valid values are: `developer`, `maintainer`.
     * 
     */
    public Output<Optional<String>> unprotectAccessLevel() {
        return Codegen.optional(this.unprotectAccessLevel);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BranchProtection(String name) {
        this(name, BranchProtectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BranchProtection(String name, BranchProtectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BranchProtection(String name, BranchProtectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/branchProtection:BranchProtection", name, args == null ? BranchProtectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BranchProtection(String name, Output<String> id, @Nullable BranchProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/branchProtection:BranchProtection", name, state, makeResourceOptions(options, id));
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
    public static BranchProtection get(String name, Output<String> id, @Nullable BranchProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BranchProtection(name, id, state, options);
    }
}
