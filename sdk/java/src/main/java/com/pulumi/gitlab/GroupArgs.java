// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * Defaults to false. Default to Auto DevOps pipeline for all projects within this group.
     * 
     */
    @Import(name="autoDevopsEnabled")
    private @Nullable Output<Boolean> autoDevopsEnabled;

    /**
     * @return Defaults to false. Default to Auto DevOps pipeline for all projects within this group.
     * 
     */
    public Optional<Output<Boolean>> autoDevopsEnabled() {
        return Optional.ofNullable(this.autoDevopsEnabled);
    }

    /**
     * Defaults to 2. See https://docs.gitlab.com/ee/api/groups.html#options-for-default*branch*protection
     * 
     */
    @Import(name="defaultBranchProtection")
    private @Nullable Output<Integer> defaultBranchProtection;

    /**
     * @return Defaults to 2. See https://docs.gitlab.com/ee/api/groups.html#options-for-default*branch*protection
     * 
     */
    public Optional<Output<Integer>> defaultBranchProtection() {
        return Optional.ofNullable(this.defaultBranchProtection);
    }

    /**
     * The description of the group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Defaults to false. Disable email notifications.
     * 
     */
    @Import(name="emailsDisabled")
    private @Nullable Output<Boolean> emailsDisabled;

    /**
     * @return Defaults to false. Disable email notifications.
     * 
     */
    public Optional<Output<Boolean>> emailsDisabled() {
        return Optional.ofNullable(this.emailsDisabled);
    }

    /**
     * Defaults to true. Enable/disable Large File Storage (LFS) for the projects in this group.
     * 
     */
    @Import(name="lfsEnabled")
    private @Nullable Output<Boolean> lfsEnabled;

    /**
     * @return Defaults to true. Enable/disable Large File Storage (LFS) for the projects in this group.
     * 
     */
    public Optional<Output<Boolean>> lfsEnabled() {
        return Optional.ofNullable(this.lfsEnabled);
    }

    /**
     * Defaults to false. Disable the capability of a group from getting mentioned.
     * 
     */
    @Import(name="mentionsDisabled")
    private @Nullable Output<Boolean> mentionsDisabled;

    /**
     * @return Defaults to false. Disable the capability of a group from getting mentioned.
     * 
     */
    public Optional<Output<Boolean>> mentionsDisabled() {
        return Optional.ofNullable(this.mentionsDisabled);
    }

    /**
     * The name of this group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Id of the parent group (creates a nested group).
     * 
     */
    @Import(name="parentId")
    private @Nullable Output<Integer> parentId;

    /**
     * @return Id of the parent group (creates a nested group).
     * 
     */
    public Optional<Output<Integer>> parentId() {
        return Optional.ofNullable(this.parentId);
    }

    /**
     * The path of the group.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path of the group.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * Defaults to false. When enabled, users can not fork projects from this group to external namespaces.
     * 
     */
    @Import(name="preventForkingOutsideGroup")
    private @Nullable Output<Boolean> preventForkingOutsideGroup;

    /**
     * @return Defaults to false. When enabled, users can not fork projects from this group to external namespaces.
     * 
     */
    public Optional<Output<Boolean>> preventForkingOutsideGroup() {
        return Optional.ofNullable(this.preventForkingOutsideGroup);
    }

    /**
     * Defaults to maintainer. Determine if developers can create projects in the group.
     * 
     */
    @Import(name="projectCreationLevel")
    private @Nullable Output<String> projectCreationLevel;

    /**
     * @return Defaults to maintainer. Determine if developers can create projects in the group.
     * 
     */
    public Optional<Output<String>> projectCreationLevel() {
        return Optional.ofNullable(this.projectCreationLevel);
    }

    /**
     * Defaults to false. Allow users to request member access.
     * 
     */
    @Import(name="requestAccessEnabled")
    private @Nullable Output<Boolean> requestAccessEnabled;

    /**
     * @return Defaults to false. Allow users to request member access.
     * 
     */
    public Optional<Output<Boolean>> requestAccessEnabled() {
        return Optional.ofNullable(this.requestAccessEnabled);
    }

    /**
     * Defaults to false. Require all users in this group to setup Two-factor authentication.
     * 
     */
    @Import(name="requireTwoFactorAuthentication")
    private @Nullable Output<Boolean> requireTwoFactorAuthentication;

    /**
     * @return Defaults to false. Require all users in this group to setup Two-factor authentication.
     * 
     */
    public Optional<Output<Boolean>> requireTwoFactorAuthentication() {
        return Optional.ofNullable(this.requireTwoFactorAuthentication);
    }

    /**
     * Defaults to false. Prevent sharing a project with another group within this group.
     * 
     */
    @Import(name="shareWithGroupLock")
    private @Nullable Output<Boolean> shareWithGroupLock;

    /**
     * @return Defaults to false. Prevent sharing a project with another group within this group.
     * 
     */
    public Optional<Output<Boolean>> shareWithGroupLock() {
        return Optional.ofNullable(this.shareWithGroupLock);
    }

    /**
     * Defaults to owner. Allowed to create subgroups.
     * 
     */
    @Import(name="subgroupCreationLevel")
    private @Nullable Output<String> subgroupCreationLevel;

    /**
     * @return Defaults to owner. Allowed to create subgroups.
     * 
     */
    public Optional<Output<String>> subgroupCreationLevel() {
        return Optional.ofNullable(this.subgroupCreationLevel);
    }

    /**
     * Defaults to 48. Time before Two-factor authentication is enforced (in hours).
     * 
     */
    @Import(name="twoFactorGracePeriod")
    private @Nullable Output<Integer> twoFactorGracePeriod;

    /**
     * @return Defaults to 48. Time before Two-factor authentication is enforced (in hours).
     * 
     */
    public Optional<Output<Integer>> twoFactorGracePeriod() {
        return Optional.ofNullable(this.twoFactorGracePeriod);
    }

    /**
     * The group&#39;s visibility. Can be `private`, `internal`, or `public`.
     * 
     */
    @Import(name="visibilityLevel")
    private @Nullable Output<String> visibilityLevel;

    /**
     * @return The group&#39;s visibility. Can be `private`, `internal`, or `public`.
     * 
     */
    public Optional<Output<String>> visibilityLevel() {
        return Optional.ofNullable(this.visibilityLevel);
    }

    private GroupArgs() {}

    private GroupArgs(GroupArgs $) {
        this.autoDevopsEnabled = $.autoDevopsEnabled;
        this.defaultBranchProtection = $.defaultBranchProtection;
        this.description = $.description;
        this.emailsDisabled = $.emailsDisabled;
        this.lfsEnabled = $.lfsEnabled;
        this.mentionsDisabled = $.mentionsDisabled;
        this.name = $.name;
        this.parentId = $.parentId;
        this.path = $.path;
        this.preventForkingOutsideGroup = $.preventForkingOutsideGroup;
        this.projectCreationLevel = $.projectCreationLevel;
        this.requestAccessEnabled = $.requestAccessEnabled;
        this.requireTwoFactorAuthentication = $.requireTwoFactorAuthentication;
        this.shareWithGroupLock = $.shareWithGroupLock;
        this.subgroupCreationLevel = $.subgroupCreationLevel;
        this.twoFactorGracePeriod = $.twoFactorGracePeriod;
        this.visibilityLevel = $.visibilityLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupArgs $;

        public Builder() {
            $ = new GroupArgs();
        }

        public Builder(GroupArgs defaults) {
            $ = new GroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDevopsEnabled Defaults to false. Default to Auto DevOps pipeline for all projects within this group.
         * 
         * @return builder
         * 
         */
        public Builder autoDevopsEnabled(@Nullable Output<Boolean> autoDevopsEnabled) {
            $.autoDevopsEnabled = autoDevopsEnabled;
            return this;
        }

        /**
         * @param autoDevopsEnabled Defaults to false. Default to Auto DevOps pipeline for all projects within this group.
         * 
         * @return builder
         * 
         */
        public Builder autoDevopsEnabled(Boolean autoDevopsEnabled) {
            return autoDevopsEnabled(Output.of(autoDevopsEnabled));
        }

        /**
         * @param defaultBranchProtection Defaults to 2. See https://docs.gitlab.com/ee/api/groups.html#options-for-default*branch*protection
         * 
         * @return builder
         * 
         */
        public Builder defaultBranchProtection(@Nullable Output<Integer> defaultBranchProtection) {
            $.defaultBranchProtection = defaultBranchProtection;
            return this;
        }

        /**
         * @param defaultBranchProtection Defaults to 2. See https://docs.gitlab.com/ee/api/groups.html#options-for-default*branch*protection
         * 
         * @return builder
         * 
         */
        public Builder defaultBranchProtection(Integer defaultBranchProtection) {
            return defaultBranchProtection(Output.of(defaultBranchProtection));
        }

        /**
         * @param description The description of the group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param emailsDisabled Defaults to false. Disable email notifications.
         * 
         * @return builder
         * 
         */
        public Builder emailsDisabled(@Nullable Output<Boolean> emailsDisabled) {
            $.emailsDisabled = emailsDisabled;
            return this;
        }

        /**
         * @param emailsDisabled Defaults to false. Disable email notifications.
         * 
         * @return builder
         * 
         */
        public Builder emailsDisabled(Boolean emailsDisabled) {
            return emailsDisabled(Output.of(emailsDisabled));
        }

        /**
         * @param lfsEnabled Defaults to true. Enable/disable Large File Storage (LFS) for the projects in this group.
         * 
         * @return builder
         * 
         */
        public Builder lfsEnabled(@Nullable Output<Boolean> lfsEnabled) {
            $.lfsEnabled = lfsEnabled;
            return this;
        }

        /**
         * @param lfsEnabled Defaults to true. Enable/disable Large File Storage (LFS) for the projects in this group.
         * 
         * @return builder
         * 
         */
        public Builder lfsEnabled(Boolean lfsEnabled) {
            return lfsEnabled(Output.of(lfsEnabled));
        }

        /**
         * @param mentionsDisabled Defaults to false. Disable the capability of a group from getting mentioned.
         * 
         * @return builder
         * 
         */
        public Builder mentionsDisabled(@Nullable Output<Boolean> mentionsDisabled) {
            $.mentionsDisabled = mentionsDisabled;
            return this;
        }

        /**
         * @param mentionsDisabled Defaults to false. Disable the capability of a group from getting mentioned.
         * 
         * @return builder
         * 
         */
        public Builder mentionsDisabled(Boolean mentionsDisabled) {
            return mentionsDisabled(Output.of(mentionsDisabled));
        }

        /**
         * @param name The name of this group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentId Id of the parent group (creates a nested group).
         * 
         * @return builder
         * 
         */
        public Builder parentId(@Nullable Output<Integer> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId Id of the parent group (creates a nested group).
         * 
         * @return builder
         * 
         */
        public Builder parentId(Integer parentId) {
            return parentId(Output.of(parentId));
        }

        /**
         * @param path The path of the group.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the group.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param preventForkingOutsideGroup Defaults to false. When enabled, users can not fork projects from this group to external namespaces.
         * 
         * @return builder
         * 
         */
        public Builder preventForkingOutsideGroup(@Nullable Output<Boolean> preventForkingOutsideGroup) {
            $.preventForkingOutsideGroup = preventForkingOutsideGroup;
            return this;
        }

        /**
         * @param preventForkingOutsideGroup Defaults to false. When enabled, users can not fork projects from this group to external namespaces.
         * 
         * @return builder
         * 
         */
        public Builder preventForkingOutsideGroup(Boolean preventForkingOutsideGroup) {
            return preventForkingOutsideGroup(Output.of(preventForkingOutsideGroup));
        }

        /**
         * @param projectCreationLevel Defaults to maintainer. Determine if developers can create projects in the group.
         * 
         * @return builder
         * 
         */
        public Builder projectCreationLevel(@Nullable Output<String> projectCreationLevel) {
            $.projectCreationLevel = projectCreationLevel;
            return this;
        }

        /**
         * @param projectCreationLevel Defaults to maintainer. Determine if developers can create projects in the group.
         * 
         * @return builder
         * 
         */
        public Builder projectCreationLevel(String projectCreationLevel) {
            return projectCreationLevel(Output.of(projectCreationLevel));
        }

        /**
         * @param requestAccessEnabled Defaults to false. Allow users to request member access.
         * 
         * @return builder
         * 
         */
        public Builder requestAccessEnabled(@Nullable Output<Boolean> requestAccessEnabled) {
            $.requestAccessEnabled = requestAccessEnabled;
            return this;
        }

        /**
         * @param requestAccessEnabled Defaults to false. Allow users to request member access.
         * 
         * @return builder
         * 
         */
        public Builder requestAccessEnabled(Boolean requestAccessEnabled) {
            return requestAccessEnabled(Output.of(requestAccessEnabled));
        }

        /**
         * @param requireTwoFactorAuthentication Defaults to false. Require all users in this group to setup Two-factor authentication.
         * 
         * @return builder
         * 
         */
        public Builder requireTwoFactorAuthentication(@Nullable Output<Boolean> requireTwoFactorAuthentication) {
            $.requireTwoFactorAuthentication = requireTwoFactorAuthentication;
            return this;
        }

        /**
         * @param requireTwoFactorAuthentication Defaults to false. Require all users in this group to setup Two-factor authentication.
         * 
         * @return builder
         * 
         */
        public Builder requireTwoFactorAuthentication(Boolean requireTwoFactorAuthentication) {
            return requireTwoFactorAuthentication(Output.of(requireTwoFactorAuthentication));
        }

        /**
         * @param shareWithGroupLock Defaults to false. Prevent sharing a project with another group within this group.
         * 
         * @return builder
         * 
         */
        public Builder shareWithGroupLock(@Nullable Output<Boolean> shareWithGroupLock) {
            $.shareWithGroupLock = shareWithGroupLock;
            return this;
        }

        /**
         * @param shareWithGroupLock Defaults to false. Prevent sharing a project with another group within this group.
         * 
         * @return builder
         * 
         */
        public Builder shareWithGroupLock(Boolean shareWithGroupLock) {
            return shareWithGroupLock(Output.of(shareWithGroupLock));
        }

        /**
         * @param subgroupCreationLevel Defaults to owner. Allowed to create subgroups.
         * 
         * @return builder
         * 
         */
        public Builder subgroupCreationLevel(@Nullable Output<String> subgroupCreationLevel) {
            $.subgroupCreationLevel = subgroupCreationLevel;
            return this;
        }

        /**
         * @param subgroupCreationLevel Defaults to owner. Allowed to create subgroups.
         * 
         * @return builder
         * 
         */
        public Builder subgroupCreationLevel(String subgroupCreationLevel) {
            return subgroupCreationLevel(Output.of(subgroupCreationLevel));
        }

        /**
         * @param twoFactorGracePeriod Defaults to 48. Time before Two-factor authentication is enforced (in hours).
         * 
         * @return builder
         * 
         */
        public Builder twoFactorGracePeriod(@Nullable Output<Integer> twoFactorGracePeriod) {
            $.twoFactorGracePeriod = twoFactorGracePeriod;
            return this;
        }

        /**
         * @param twoFactorGracePeriod Defaults to 48. Time before Two-factor authentication is enforced (in hours).
         * 
         * @return builder
         * 
         */
        public Builder twoFactorGracePeriod(Integer twoFactorGracePeriod) {
            return twoFactorGracePeriod(Output.of(twoFactorGracePeriod));
        }

        /**
         * @param visibilityLevel The group&#39;s visibility. Can be `private`, `internal`, or `public`.
         * 
         * @return builder
         * 
         */
        public Builder visibilityLevel(@Nullable Output<String> visibilityLevel) {
            $.visibilityLevel = visibilityLevel;
            return this;
        }

        /**
         * @param visibilityLevel The group&#39;s visibility. Can be `private`, `internal`, or `public`.
         * 
         * @return builder
         * 
         */
        public Builder visibilityLevel(String visibilityLevel) {
            return visibilityLevel(Output.of(visibilityLevel));
        }

        public GroupArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
