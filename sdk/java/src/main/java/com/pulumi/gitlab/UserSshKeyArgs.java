// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserSshKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserSshKeyArgs Empty = new UserSshKeyArgs();

    /**
     * The expiration date of the SSH key in ISO 8601 format (YYYY-MM-DDTHH:MM:SSZ)
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return The expiration date of the SSH key in ISO 8601 format (YYYY-MM-DDTHH:MM:SSZ)
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * The ssh key. The SSH key `comment` (trailing part) is optional and ignored for diffing, because GitLab overrides it with the username and GitLab hostname.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The ssh key. The SSH key `comment` (trailing part) is optional and ignored for diffing, because GitLab overrides it with the username and GitLab hostname.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The title of the ssh key.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return The title of the ssh key.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     * The ID or username of the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<Integer> userId;

    /**
     * @return The ID or username of the user.
     * 
     */
    public Output<Integer> userId() {
        return this.userId;
    }

    private UserSshKeyArgs() {}

    private UserSshKeyArgs(UserSshKeyArgs $) {
        this.expiresAt = $.expiresAt;
        this.key = $.key;
        this.title = $.title;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSshKeyArgs $;

        public Builder() {
            $ = new UserSshKeyArgs();
        }

        public Builder(UserSshKeyArgs defaults) {
            $ = new UserSshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiresAt The expiration date of the SSH key in ISO 8601 format (YYYY-MM-DDTHH:MM:SSZ)
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt The expiration date of the SSH key in ISO 8601 format (YYYY-MM-DDTHH:MM:SSZ)
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param key The ssh key. The SSH key `comment` (trailing part) is optional and ignored for diffing, because GitLab overrides it with the username and GitLab hostname.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The ssh key. The SSH key `comment` (trailing part) is optional and ignored for diffing, because GitLab overrides it with the username and GitLab hostname.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param title The title of the ssh key.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the ssh key.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param userId The ID or username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<Integer> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID or username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Integer userId) {
            return userId(Output.of(userId));
        }

        public UserSshKeyArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
