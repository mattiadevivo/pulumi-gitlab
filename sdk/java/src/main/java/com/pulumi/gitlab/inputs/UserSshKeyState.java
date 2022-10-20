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


public final class UserSshKeyState extends com.pulumi.resources.ResourceArgs {

    public static final UserSshKeyState Empty = new UserSshKeyState();

    /**
     * The time when this key was created in GitLab.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The time when this key was created in GitLab.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

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
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The ssh key. The SSH key `comment` (trailing part) is optional and ignored for diffing, because GitLab overrides it with the username and GitLab hostname.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The ID of the ssh key.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<Integer> keyId;

    /**
     * @return The ID of the ssh key.
     * 
     */
    public Optional<Output<Integer>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * The title of the ssh key.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the ssh key.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The ID of the user to add the ssh key to.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<Integer> userId;

    /**
     * @return The ID of the user to add the ssh key to.
     * 
     */
    public Optional<Output<Integer>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private UserSshKeyState() {}

    private UserSshKeyState(UserSshKeyState $) {
        this.createdAt = $.createdAt;
        this.expiresAt = $.expiresAt;
        this.key = $.key;
        this.keyId = $.keyId;
        this.title = $.title;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSshKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSshKeyState $;

        public Builder() {
            $ = new UserSshKeyState();
        }

        public Builder(UserSshKeyState defaults) {
            $ = new UserSshKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The time when this key was created in GitLab.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The time when this key was created in GitLab.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
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
        public Builder key(@Nullable Output<String> key) {
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
         * @param keyId The ID of the ssh key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<Integer> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The ID of the ssh key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(Integer keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param title The title of the ssh key.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
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
         * @param userId The ID of the user to add the ssh key to.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<Integer> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the user to add the ssh key to.
         * 
         * @return builder
         * 
         */
        public Builder userId(Integer userId) {
            return userId(Output.of(userId));
        }

        public UserSshKeyState build() {
            return $;
        }
    }

}
