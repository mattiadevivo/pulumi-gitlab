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


public final class ProjectShareGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectShareGroupState Empty = new ProjectShareGroupState();

    /**
     * The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
     * 
     * @deprecated
     * Use `group_access` instead of the `access_level` attribute.
     * 
     */
    @Deprecated /* Use `group_access` instead of the `access_level` attribute. */
    @Import(name="accessLevel")
    private @Nullable Output<String> accessLevel;

    /**
     * @return The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
     * 
     * @deprecated
     * Use `group_access` instead of the `access_level` attribute.
     * 
     */
    @Deprecated /* Use `group_access` instead of the `access_level` attribute. */
    public Optional<Output<String>> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
     * 
     */
    @Import(name="groupAccess")
    private @Nullable Output<String> groupAccess;

    /**
     * @return The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
     * 
     */
    public Optional<Output<String>> groupAccess() {
        return Optional.ofNullable(this.groupAccess);
    }

    /**
     * The id of the group.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    /**
     * @return The id of the group.
     * 
     */
    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The id of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The id of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private ProjectShareGroupState() {}

    private ProjectShareGroupState(ProjectShareGroupState $) {
        this.accessLevel = $.accessLevel;
        this.groupAccess = $.groupAccess;
        this.groupId = $.groupId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectShareGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectShareGroupState $;

        public Builder() {
            $ = new ProjectShareGroupState();
        }

        public Builder(ProjectShareGroupState defaults) {
            $ = new ProjectShareGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
         * 
         * @return builder
         * 
         * @deprecated
         * Use `group_access` instead of the `access_level` attribute.
         * 
         */
        @Deprecated /* Use `group_access` instead of the `access_level` attribute. */
        public Builder accessLevel(@Nullable Output<String> accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param accessLevel The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
         * 
         * @return builder
         * 
         * @deprecated
         * Use `group_access` instead of the `access_level` attribute.
         * 
         */
        @Deprecated /* Use `group_access` instead of the `access_level` attribute. */
        public Builder accessLevel(String accessLevel) {
            return accessLevel(Output.of(accessLevel));
        }

        /**
         * @param groupAccess The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
         * 
         * @return builder
         * 
         */
        public Builder groupAccess(@Nullable Output<String> groupAccess) {
            $.groupAccess = groupAccess;
            return this;
        }

        /**
         * @param groupAccess The access level to grant the group for the project. Valid values are: `no one`, `minimal`, `guest`, `reporter`, `developer`, `maintainer`, `owner`, `master`
         * 
         * @return builder
         * 
         */
        public Builder groupAccess(String groupAccess) {
            return groupAccess(Output.of(groupAccess));
        }

        /**
         * @param groupId The id of the group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The id of the group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param projectId The id of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The id of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public ProjectShareGroupState build() {
            return $;
        }
    }

}
