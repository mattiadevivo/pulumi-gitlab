// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.ProjectLevelMrApprovalsArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.ProjectLevelMrApprovalsState;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `gitlab_project_level_mr_approval_rule` resource allows to manage the lifecycle of a Merge Request-level approval rule.
 * 
 * &gt; This resource requires a GitLab Enterprise instance.
 * 
 * **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/merge_request_approvals.html#merge-request-level-mr-approvals)
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
 * import com.pulumi.gitlab.ProjectLevelMrApprovals;
 * import com.pulumi.gitlab.ProjectLevelMrApprovalsArgs;
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
 *         var fooProject = new Project(&#34;fooProject&#34;, ProjectArgs.builder()        
 *             .description(&#34;My example project&#34;)
 *             .build());
 * 
 *         var fooProjectLevelMrApprovals = new ProjectLevelMrApprovals(&#34;fooProjectLevelMrApprovals&#34;, ProjectLevelMrApprovalsArgs.builder()        
 *             .projectId(fooProject.id())
 *             .resetApprovalsOnPush(true)
 *             .disableOverridingApproversPerMergeRequest(false)
 *             .mergeRequestsAuthorApproval(false)
 *             .mergeRequestsDisableCommittersApproval(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals You can import an approval configuration state using `&lt;resource&gt; &lt;project_id&gt;`.
 * ```
 * 
 * # For example
 * 
 * ```sh
 *  $ pulumi import gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals foo 1234
 * ```
 * 
 */
@ResourceType(type="gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals")
public class ProjectLevelMrApprovals extends com.pulumi.resources.CustomResource {
    /**
     * By default, users are able to edit the approval rules in merge requests. If set to true,
     * 
     */
    @Export(name="disableOverridingApproversPerMergeRequest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableOverridingApproversPerMergeRequest;

    /**
     * @return By default, users are able to edit the approval rules in merge requests. If set to true,
     * 
     */
    public Output<Optional<Boolean>> disableOverridingApproversPerMergeRequest() {
        return Codegen.optional(this.disableOverridingApproversPerMergeRequest);
    }
    /**
     * Set to `true` if you want to allow merge request authors to self-approve merge requests. Authors
     * 
     */
    @Export(name="mergeRequestsAuthorApproval", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mergeRequestsAuthorApproval;

    /**
     * @return Set to `true` if you want to allow merge request authors to self-approve merge requests. Authors
     * 
     */
    public Output<Optional<Boolean>> mergeRequestsAuthorApproval() {
        return Codegen.optional(this.mergeRequestsAuthorApproval);
    }
    /**
     * Set to `true` if you want to prevent approval of merge requests by merge request committers.
     * 
     */
    @Export(name="mergeRequestsDisableCommittersApproval", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mergeRequestsDisableCommittersApproval;

    /**
     * @return Set to `true` if you want to prevent approval of merge requests by merge request committers.
     * 
     */
    public Output<Optional<Boolean>> mergeRequestsDisableCommittersApproval() {
        return Codegen.optional(this.mergeRequestsDisableCommittersApproval);
    }
    /**
     * The ID of the project to change MR approval configuration.
     * 
     */
    @Export(name="projectId", type=Integer.class, parameters={})
    private Output<Integer> projectId;

    /**
     * @return The ID of the project to change MR approval configuration.
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }
    /**
     * Set to `true` if you want to require authentication when approving a merge request.
     * 
     */
    @Export(name="requirePasswordToApprove", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requirePasswordToApprove;

    /**
     * @return Set to `true` if you want to require authentication when approving a merge request.
     * 
     */
    public Output<Optional<Boolean>> requirePasswordToApprove() {
        return Codegen.optional(this.requirePasswordToApprove);
    }
    /**
     * Set to `true` if you want to remove all approvals in a merge request when new commits are pushed to its source branch. Default is `true`.
     * 
     */
    @Export(name="resetApprovalsOnPush", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> resetApprovalsOnPush;

    /**
     * @return Set to `true` if you want to remove all approvals in a merge request when new commits are pushed to its source branch. Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> resetApprovalsOnPush() {
        return Codegen.optional(this.resetApprovalsOnPush);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectLevelMrApprovals(String name) {
        this(name, ProjectLevelMrApprovalsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectLevelMrApprovals(String name, ProjectLevelMrApprovalsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectLevelMrApprovals(String name, ProjectLevelMrApprovalsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals", name, args == null ? ProjectLevelMrApprovalsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectLevelMrApprovals(String name, Output<String> id, @Nullable ProjectLevelMrApprovalsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectLevelMrApprovals:ProjectLevelMrApprovals", name, state, makeResourceOptions(options, id));
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
    public static ProjectLevelMrApprovals get(String name, Output<String> id, @Nullable ProjectLevelMrApprovalsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectLevelMrApprovals(name, id, state, options);
    }
}
