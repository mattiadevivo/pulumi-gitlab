// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAgentState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAgentState Empty = new ClusterAgentState();

    /**
     * The ID of the agent.
     * 
     */
    @Import(name="agentId")
    private @Nullable Output<Integer> agentId;

    /**
     * @return The ID of the agent.
     * 
     */
    public Optional<Output<Integer>> agentId() {
        return Optional.ofNullable(this.agentId);
    }

    /**
     * The ISO8601 datetime when the agent was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The ISO8601 datetime when the agent was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The ID of the user who created the agent.
     * 
     */
    @Import(name="createdByUserId")
    private @Nullable Output<Integer> createdByUserId;

    /**
     * @return The ID of the user who created the agent.
     * 
     */
    public Optional<Output<Integer>> createdByUserId() {
        return Optional.ofNullable(this.createdByUserId);
    }

    /**
     * The Name of the agent.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name of the agent.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID or full path of the project maintained by the authenticated user.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return ID or full path of the project maintained by the authenticated user.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ClusterAgentState() {}

    private ClusterAgentState(ClusterAgentState $) {
        this.agentId = $.agentId;
        this.createdAt = $.createdAt;
        this.createdByUserId = $.createdByUserId;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAgentState $;

        public Builder() {
            $ = new ClusterAgentState();
        }

        public Builder(ClusterAgentState defaults) {
            $ = new ClusterAgentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentId The ID of the agent.
         * 
         * @return builder
         * 
         */
        public Builder agentId(@Nullable Output<Integer> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId The ID of the agent.
         * 
         * @return builder
         * 
         */
        public Builder agentId(Integer agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param createdAt The ISO8601 datetime when the agent was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The ISO8601 datetime when the agent was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdByUserId The ID of the user who created the agent.
         * 
         * @return builder
         * 
         */
        public Builder createdByUserId(@Nullable Output<Integer> createdByUserId) {
            $.createdByUserId = createdByUserId;
            return this;
        }

        /**
         * @param createdByUserId The ID of the user who created the agent.
         * 
         * @return builder
         * 
         */
        public Builder createdByUserId(Integer createdByUserId) {
            return createdByUserId(Output.of(createdByUserId));
        }

        /**
         * @param name The Name of the agent.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the agent.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project ID or full path of the project maintained by the authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project ID or full path of the project maintained by the authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ClusterAgentState build() {
            return $;
        }
    }

}
