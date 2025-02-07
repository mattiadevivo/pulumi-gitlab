// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupAccessTokenState extends com.pulumi.resources.ResourceArgs {

    public static final GroupAccessTokenState Empty = new GroupAccessTokenState();

    /**
     * The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable Output<String> accessLevel;

    /**
     * @return The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
     * 
     */
    public Optional<Output<String>> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * True if the token is active.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return True if the token is active.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Time the token has been created, RFC3339 format.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Time the token has been created, RFC3339 format.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD.
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD.
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * The ID or path of the group to add the group access token to.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The ID or path of the group to add the group access token to.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The name of the group access token.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the group access token.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * True if the token is revoked.
     * 
     */
    @Import(name="revoked")
    private @Nullable Output<Boolean> revoked;

    /**
     * @return True if the token is revoked.
     * 
     */
    public Optional<Output<Boolean>> revoked() {
        return Optional.ofNullable(this.revoked);
    }

    /**
     * The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * The user id associated to the token.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<Integer> userId;

    /**
     * @return The user id associated to the token.
     * 
     */
    public Optional<Output<Integer>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private GroupAccessTokenState() {}

    private GroupAccessTokenState(GroupAccessTokenState $) {
        this.accessLevel = $.accessLevel;
        this.active = $.active;
        this.createdAt = $.createdAt;
        this.expiresAt = $.expiresAt;
        this.group = $.group;
        this.name = $.name;
        this.revoked = $.revoked;
        this.scopes = $.scopes;
        this.token = $.token;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupAccessTokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupAccessTokenState $;

        public Builder() {
            $ = new GroupAccessTokenState();
        }

        public Builder(GroupAccessTokenState defaults) {
            $ = new GroupAccessTokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable Output<String> accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param accessLevel The access level for the group access token. Valid values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(String accessLevel) {
            return accessLevel(Output.of(accessLevel));
        }

        /**
         * @param active True if the token is active.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active True if the token is active.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param createdAt Time the token has been created, RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Time the token has been created, RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param expiresAt The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt The token expires at midnight UTC on that date. The date must be in the format YYYY-MM-DD.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param group The ID or path of the group to add the group access token to.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The ID or path of the group to add the group access token to.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param name The name of the group access token.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the group access token.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param revoked True if the token is revoked.
         * 
         * @return builder
         * 
         */
        public Builder revoked(@Nullable Output<Boolean> revoked) {
            $.revoked = revoked;
            return this;
        }

        /**
         * @param revoked True if the token is revoked.
         * 
         * @return builder
         * 
         */
        public Builder revoked(Boolean revoked) {
            return revoked(Output.of(revoked));
        }

        /**
         * @param scopes The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes The scope for the group access token. It determines the actions which can be performed when authenticating with this token. Valid values are: `api`, `read_api`, `read_registry`, `write_registry`, `read_repository`, `write_repository`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param token The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The group access token. This is only populated when creating a new group access token. This attribute is not available for imported resources.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param userId The user id associated to the token.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<Integer> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user id associated to the token.
         * 
         * @return builder
         * 
         */
        public Builder userId(Integer userId) {
            return userId(Output.of(userId));
        }

        public GroupAccessTokenState build() {
            return $;
        }
    }

}
