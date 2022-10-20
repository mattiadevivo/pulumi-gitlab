// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectMembershipPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectMembershipPlainArgs Empty = new GetProjectMembershipPlainArgs();

    /**
     * The full path of the project.
     * 
     */
    @Import(name="fullPath")
    private @Nullable String fullPath;

    /**
     * @return The full path of the project.
     * 
     */
    public Optional<String> fullPath() {
        return Optional.ofNullable(this.fullPath);
    }

    /**
     * Return all project members including members through ancestor groups
     * 
     */
    @Import(name="inherited")
    private @Nullable Boolean inherited;

    /**
     * @return Return all project members including members through ancestor groups
     * 
     */
    public Optional<Boolean> inherited() {
        return Optional.ofNullable(this.inherited);
    }

    /**
     * The ID of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Integer projectId;

    /**
     * @return The ID of the project.
     * 
     */
    public Optional<Integer> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * A query string to search for members
     * 
     */
    @Import(name="query")
    private @Nullable String query;

    /**
     * @return A query string to search for members
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    private GetProjectMembershipPlainArgs() {}

    private GetProjectMembershipPlainArgs(GetProjectMembershipPlainArgs $) {
        this.fullPath = $.fullPath;
        this.inherited = $.inherited;
        this.projectId = $.projectId;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectMembershipPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectMembershipPlainArgs $;

        public Builder() {
            $ = new GetProjectMembershipPlainArgs();
        }

        public Builder(GetProjectMembershipPlainArgs defaults) {
            $ = new GetProjectMembershipPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullPath The full path of the project.
         * 
         * @return builder
         * 
         */
        public Builder fullPath(@Nullable String fullPath) {
            $.fullPath = fullPath;
            return this;
        }

        /**
         * @param inherited Return all project members including members through ancestor groups
         * 
         * @return builder
         * 
         */
        public Builder inherited(@Nullable Boolean inherited) {
            $.inherited = inherited;
            return this;
        }

        /**
         * @param projectId The ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Integer projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param query A query string to search for members
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable String query) {
            $.query = query;
            return this;
        }

        public GetProjectMembershipPlainArgs build() {
            return $;
        }
    }

}
