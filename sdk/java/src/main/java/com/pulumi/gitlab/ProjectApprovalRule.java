// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gitlab.ProjectApprovalRuleArgs;
import com.pulumi.gitlab.Utilities;
import com.pulumi.gitlab.inputs.ProjectApprovalRuleState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * GitLab project approval rules can be imported using a key composed of `&lt;project-id&gt;:&lt;rule-id&gt;`, e.g.
 * 
 * ```sh
 *  $ pulumi import gitlab:index/projectApprovalRule:ProjectApprovalRule example &#34;12345:6&#34;
 * ```
 * 
 */
@ResourceType(type="gitlab:index/projectApprovalRule:ProjectApprovalRule")
public class ProjectApprovalRule extends com.pulumi.resources.CustomResource {
    /**
     * The number of approvals required for this rule.
     * 
     */
    @Export(name="approvalsRequired", refs={Integer.class}, tree="[0]")
    private Output<Integer> approvalsRequired;

    /**
     * @return The number of approvals required for this rule.
     * 
     */
    public Output<Integer> approvalsRequired() {
        return this.approvalsRequired;
    }
    /**
     * When this flag is set, the default `any_approver` rule will not be imported if present.
     * 
     */
    @Export(name="disableImportingDefaultAnyApproverRuleOnCreate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableImportingDefaultAnyApproverRuleOnCreate;

    /**
     * @return When this flag is set, the default `any_approver` rule will not be imported if present.
     * 
     */
    public Output<Optional<Boolean>> disableImportingDefaultAnyApproverRuleOnCreate() {
        return Codegen.optional(this.disableImportingDefaultAnyApproverRuleOnCreate);
    }
    /**
     * A list of group IDs whose members can approve of the merge request.
     * 
     */
    @Export(name="groupIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> groupIds;

    /**
     * @return A list of group IDs whose members can approve of the merge request.
     * 
     */
    public Output<Optional<List<Integer>>> groupIds() {
        return Codegen.optional(this.groupIds);
    }
    /**
     * The name of the approval rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the approval rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name or id of the project to add the approval rules.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The name or id of the project to add the approval rules.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * A list of protected branch IDs (not branch names) for which the rule applies.
     * 
     */
    @Export(name="protectedBranchIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> protectedBranchIds;

    /**
     * @return A list of protected branch IDs (not branch names) for which the rule applies.
     * 
     */
    public Output<Optional<List<Integer>>> protectedBranchIds() {
        return Codegen.optional(this.protectedBranchIds);
    }
    /**
     * String, defaults to &#39;regular&#39;. The type of rule. `any_approver` is a pre-configured default rule with `approvals_required` at `0`. Valid values are `regular`, `any_approver`.
     * 
     */
    @Export(name="ruleType", refs={String.class}, tree="[0]")
    private Output<String> ruleType;

    /**
     * @return String, defaults to &#39;regular&#39;. The type of rule. `any_approver` is a pre-configured default rule with `approvals_required` at `0`. Valid values are `regular`, `any_approver`.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }
    /**
     * A list of specific User IDs to add to the list of approvers.
     * 
     */
    @Export(name="userIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> userIds;

    /**
     * @return A list of specific User IDs to add to the list of approvers.
     * 
     */
    public Output<Optional<List<Integer>>> userIds() {
        return Codegen.optional(this.userIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectApprovalRule(String name) {
        this(name, ProjectApprovalRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectApprovalRule(String name, ProjectApprovalRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectApprovalRule(String name, ProjectApprovalRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectApprovalRule:ProjectApprovalRule", name, args == null ? ProjectApprovalRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectApprovalRule(String name, Output<String> id, @Nullable ProjectApprovalRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gitlab:index/projectApprovalRule:ProjectApprovalRule", name, state, makeResourceOptions(options, id));
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
    public static ProjectApprovalRule get(String name, Output<String> id, @Nullable ProjectApprovalRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectApprovalRule(name, id, state, options);
    }
}
