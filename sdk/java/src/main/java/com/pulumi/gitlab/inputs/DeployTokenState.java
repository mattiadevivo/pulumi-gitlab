// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeployTokenState extends com.pulumi.resources.ResourceArgs {

    public static final DeployTokenState Empty = new DeployTokenState();

    /**
     * Time the token will expire it, RFC3339 format. Will not expire per default.
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return Time the token will expire it, RFC3339 format. Will not expire per default.
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * The name or id of the group to add the deploy token to.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The name or id of the group to add the deploy token to.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * A name to describe the deploy token with.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name to describe the deploy token with.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name or id of the project to add the deploy token to.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The name or id of the project to add the deploy token to.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * The secret token. This is only populated when creating a new deploy token. **Note**: The token is not available for imported resources.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The secret token. This is only populated when creating a new deploy token. **Note**: The token is not available for imported resources.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * A username for the deploy token. Default is `gitlab+deploy-token-{n}`.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return A username for the deploy token. Default is `gitlab+deploy-token-{n}`.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private DeployTokenState() {}

    private DeployTokenState(DeployTokenState $) {
        this.expiresAt = $.expiresAt;
        this.group = $.group;
        this.name = $.name;
        this.project = $.project;
        this.scopes = $.scopes;
        this.token = $.token;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeployTokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeployTokenState $;

        public Builder() {
            $ = new DeployTokenState();
        }

        public Builder(DeployTokenState defaults) {
            $ = new DeployTokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiresAt Time the token will expire it, RFC3339 format. Will not expire per default.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt Time the token will expire it, RFC3339 format. Will not expire per default.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param group The name or id of the group to add the deploy token to.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The name or id of the group to add the deploy token to.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param name A name to describe the deploy token with.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name to describe the deploy token with.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The name or id of the project to add the deploy token to.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name or id of the project to add the deploy token to.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param scopes Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Valid values: `read_repository`, `read_registry`, `read_package_registry`, `write_registry`, `write_package_registry`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param token The secret token. This is only populated when creating a new deploy token. **Note**: The token is not available for imported resources.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The secret token. This is only populated when creating a new deploy token. **Note**: The token is not available for imported resources.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param username A username for the deploy token. Default is `gitlab+deploy-token-{n}`.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username A username for the deploy token. Default is `gitlab+deploy-token-{n}`.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public DeployTokenState build() {
            return $;
        }
    }

}
