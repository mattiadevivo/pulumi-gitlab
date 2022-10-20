// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gitlab.inputs.ProjectProtectedEnvironmentDeployAccessLevelArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectProtectedEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectProtectedEnvironmentArgs Empty = new ProjectProtectedEnvironmentArgs();

    /**
     * Array of access levels allowed to deploy, with each described by a hash.
     * 
     */
    @Import(name="deployAccessLevels", required=true)
    private Output<List<ProjectProtectedEnvironmentDeployAccessLevelArgs>> deployAccessLevels;

    /**
     * @return Array of access levels allowed to deploy, with each described by a hash.
     * 
     */
    public Output<List<ProjectProtectedEnvironmentDeployAccessLevelArgs>> deployAccessLevels() {
        return this.deployAccessLevels;
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="environment", required=true)
    private Output<String> environment;

    /**
     * @return The name of the environment.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }

    /**
     * The ID or full path of the project which the protected environment is created against.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The ID or full path of the project which the protected environment is created against.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * The number of approvals required to deploy to this environment.
     * 
     */
    @Import(name="requiredApprovalCount")
    private @Nullable Output<Integer> requiredApprovalCount;

    /**
     * @return The number of approvals required to deploy to this environment.
     * 
     */
    public Optional<Output<Integer>> requiredApprovalCount() {
        return Optional.ofNullable(this.requiredApprovalCount);
    }

    private ProjectProtectedEnvironmentArgs() {}

    private ProjectProtectedEnvironmentArgs(ProjectProtectedEnvironmentArgs $) {
        this.deployAccessLevels = $.deployAccessLevels;
        this.environment = $.environment;
        this.project = $.project;
        this.requiredApprovalCount = $.requiredApprovalCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectProtectedEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectProtectedEnvironmentArgs $;

        public Builder() {
            $ = new ProjectProtectedEnvironmentArgs();
        }

        public Builder(ProjectProtectedEnvironmentArgs defaults) {
            $ = new ProjectProtectedEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deployAccessLevels Array of access levels allowed to deploy, with each described by a hash.
         * 
         * @return builder
         * 
         */
        public Builder deployAccessLevels(Output<List<ProjectProtectedEnvironmentDeployAccessLevelArgs>> deployAccessLevels) {
            $.deployAccessLevels = deployAccessLevels;
            return this;
        }

        /**
         * @param deployAccessLevels Array of access levels allowed to deploy, with each described by a hash.
         * 
         * @return builder
         * 
         */
        public Builder deployAccessLevels(List<ProjectProtectedEnvironmentDeployAccessLevelArgs> deployAccessLevels) {
            return deployAccessLevels(Output.of(deployAccessLevels));
        }

        /**
         * @param deployAccessLevels Array of access levels allowed to deploy, with each described by a hash.
         * 
         * @return builder
         * 
         */
        public Builder deployAccessLevels(ProjectProtectedEnvironmentDeployAccessLevelArgs... deployAccessLevels) {
            return deployAccessLevels(List.of(deployAccessLevels));
        }

        /**
         * @param environment The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param project The ID or full path of the project which the protected environment is created against.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID or full path of the project which the protected environment is created against.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requiredApprovalCount The number of approvals required to deploy to this environment.
         * 
         * @return builder
         * 
         */
        public Builder requiredApprovalCount(@Nullable Output<Integer> requiredApprovalCount) {
            $.requiredApprovalCount = requiredApprovalCount;
            return this;
        }

        /**
         * @param requiredApprovalCount The number of approvals required to deploy to this environment.
         * 
         * @return builder
         * 
         */
        public Builder requiredApprovalCount(Integer requiredApprovalCount) {
            return requiredApprovalCount(Output.of(requiredApprovalCount));
        }

        public ProjectProtectedEnvironmentArgs build() {
            $.deployAccessLevels = Objects.requireNonNull($.deployAccessLevels, "expected parameter 'deployAccessLevels' to be non-null");
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
