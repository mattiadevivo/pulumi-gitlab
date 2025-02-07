// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return Whether developers and maintainers can push to the applicable default branch.
     * 
     */
    private Integer defaultBranchProtection;
    /**
     * @return The description of the group.
     * 
     */
    private String description;
    /**
     * @return Can be set by administrators only. Additional CI/CD minutes for this group.
     * 
     */
    private Integer extraSharedRunnersMinutesLimit;
    /**
     * @return The full name of the group.
     * 
     */
    private String fullName;
    /**
     * @return The full path of the group.
     * 
     */
    private String fullPath;
    /**
     * @return The ID of the group.
     * 
     */
    private Integer groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Boolean, is LFS enabled for projects in this group.
     * 
     */
    private Boolean lfsEnabled;
    /**
     * @return Users cannot be added to projects in this group.
     * 
     */
    private Boolean membershipLock;
    /**
     * @return The name of this group.
     * 
     */
    private String name;
    /**
     * @return Integer, ID of the parent group.
     * 
     */
    private Integer parentId;
    /**
     * @return The path of the group.
     * 
     */
    private String path;
    /**
     * @return When enabled, users can not fork projects from this group to external namespaces.
     * 
     */
    private Boolean preventForkingOutsideGroup;
    /**
     * @return Boolean, is request for access enabled to the group.
     * 
     */
    private Boolean requestAccessEnabled;
    /**
     * @return The group level registration token to use during runner setup.
     * 
     */
    private String runnersToken;
    /**
     * @return Can be set by administrators only. Maximum number of monthly CI/CD minutes for this group. Can be nil (default; inherit system default), 0 (unlimited), or &gt; 0.
     * 
     */
    private Integer sharedRunnersMinutesLimit;
    /**
     * @return Visibility level of the group. Possible values are `private`, `internal`, `public`.
     * 
     */
    private String visibilityLevel;
    /**
     * @return Web URL of the group.
     * 
     */
    private String webUrl;

    private GetGroupResult() {}
    /**
     * @return Whether developers and maintainers can push to the applicable default branch.
     * 
     */
    public Integer defaultBranchProtection() {
        return this.defaultBranchProtection;
    }
    /**
     * @return The description of the group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Can be set by administrators only. Additional CI/CD minutes for this group.
     * 
     */
    public Integer extraSharedRunnersMinutesLimit() {
        return this.extraSharedRunnersMinutesLimit;
    }
    /**
     * @return The full name of the group.
     * 
     */
    public String fullName() {
        return this.fullName;
    }
    /**
     * @return The full path of the group.
     * 
     */
    public String fullPath() {
        return this.fullPath;
    }
    /**
     * @return The ID of the group.
     * 
     */
    public Integer groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Boolean, is LFS enabled for projects in this group.
     * 
     */
    public Boolean lfsEnabled() {
        return this.lfsEnabled;
    }
    /**
     * @return Users cannot be added to projects in this group.
     * 
     */
    public Boolean membershipLock() {
        return this.membershipLock;
    }
    /**
     * @return The name of this group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Integer, ID of the parent group.
     * 
     */
    public Integer parentId() {
        return this.parentId;
    }
    /**
     * @return The path of the group.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return When enabled, users can not fork projects from this group to external namespaces.
     * 
     */
    public Boolean preventForkingOutsideGroup() {
        return this.preventForkingOutsideGroup;
    }
    /**
     * @return Boolean, is request for access enabled to the group.
     * 
     */
    public Boolean requestAccessEnabled() {
        return this.requestAccessEnabled;
    }
    /**
     * @return The group level registration token to use during runner setup.
     * 
     */
    public String runnersToken() {
        return this.runnersToken;
    }
    /**
     * @return Can be set by administrators only. Maximum number of monthly CI/CD minutes for this group. Can be nil (default; inherit system default), 0 (unlimited), or &gt; 0.
     * 
     */
    public Integer sharedRunnersMinutesLimit() {
        return this.sharedRunnersMinutesLimit;
    }
    /**
     * @return Visibility level of the group. Possible values are `private`, `internal`, `public`.
     * 
     */
    public String visibilityLevel() {
        return this.visibilityLevel;
    }
    /**
     * @return Web URL of the group.
     * 
     */
    public String webUrl() {
        return this.webUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer defaultBranchProtection;
        private String description;
        private Integer extraSharedRunnersMinutesLimit;
        private String fullName;
        private String fullPath;
        private Integer groupId;
        private String id;
        private Boolean lfsEnabled;
        private Boolean membershipLock;
        private String name;
        private Integer parentId;
        private String path;
        private Boolean preventForkingOutsideGroup;
        private Boolean requestAccessEnabled;
        private String runnersToken;
        private Integer sharedRunnersMinutesLimit;
        private String visibilityLevel;
        private String webUrl;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBranchProtection = defaults.defaultBranchProtection;
    	      this.description = defaults.description;
    	      this.extraSharedRunnersMinutesLimit = defaults.extraSharedRunnersMinutesLimit;
    	      this.fullName = defaults.fullName;
    	      this.fullPath = defaults.fullPath;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.lfsEnabled = defaults.lfsEnabled;
    	      this.membershipLock = defaults.membershipLock;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.path = defaults.path;
    	      this.preventForkingOutsideGroup = defaults.preventForkingOutsideGroup;
    	      this.requestAccessEnabled = defaults.requestAccessEnabled;
    	      this.runnersToken = defaults.runnersToken;
    	      this.sharedRunnersMinutesLimit = defaults.sharedRunnersMinutesLimit;
    	      this.visibilityLevel = defaults.visibilityLevel;
    	      this.webUrl = defaults.webUrl;
        }

        @CustomType.Setter
        public Builder defaultBranchProtection(Integer defaultBranchProtection) {
            this.defaultBranchProtection = Objects.requireNonNull(defaultBranchProtection);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder extraSharedRunnersMinutesLimit(Integer extraSharedRunnersMinutesLimit) {
            this.extraSharedRunnersMinutesLimit = Objects.requireNonNull(extraSharedRunnersMinutesLimit);
            return this;
        }
        @CustomType.Setter
        public Builder fullName(String fullName) {
            this.fullName = Objects.requireNonNull(fullName);
            return this;
        }
        @CustomType.Setter
        public Builder fullPath(String fullPath) {
            this.fullPath = Objects.requireNonNull(fullPath);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(Integer groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lfsEnabled(Boolean lfsEnabled) {
            this.lfsEnabled = Objects.requireNonNull(lfsEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder membershipLock(Boolean membershipLock) {
            this.membershipLock = Objects.requireNonNull(membershipLock);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder parentId(Integer parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder preventForkingOutsideGroup(Boolean preventForkingOutsideGroup) {
            this.preventForkingOutsideGroup = Objects.requireNonNull(preventForkingOutsideGroup);
            return this;
        }
        @CustomType.Setter
        public Builder requestAccessEnabled(Boolean requestAccessEnabled) {
            this.requestAccessEnabled = Objects.requireNonNull(requestAccessEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder runnersToken(String runnersToken) {
            this.runnersToken = Objects.requireNonNull(runnersToken);
            return this;
        }
        @CustomType.Setter
        public Builder sharedRunnersMinutesLimit(Integer sharedRunnersMinutesLimit) {
            this.sharedRunnersMinutesLimit = Objects.requireNonNull(sharedRunnersMinutesLimit);
            return this;
        }
        @CustomType.Setter
        public Builder visibilityLevel(String visibilityLevel) {
            this.visibilityLevel = Objects.requireNonNull(visibilityLevel);
            return this;
        }
        @CustomType.Setter
        public Builder webUrl(String webUrl) {
            this.webUrl = Objects.requireNonNull(webUrl);
            return this;
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.defaultBranchProtection = defaultBranchProtection;
            o.description = description;
            o.extraSharedRunnersMinutesLimit = extraSharedRunnersMinutesLimit;
            o.fullName = fullName;
            o.fullPath = fullPath;
            o.groupId = groupId;
            o.id = id;
            o.lfsEnabled = lfsEnabled;
            o.membershipLock = membershipLock;
            o.name = name;
            o.parentId = parentId;
            o.path = path;
            o.preventForkingOutsideGroup = preventForkingOutsideGroup;
            o.requestAccessEnabled = requestAccessEnabled;
            o.runnersToken = runnersToken;
            o.sharedRunnersMinutesLimit = sharedRunnersMinutesLimit;
            o.visibilityLevel = visibilityLevel;
            o.webUrl = webUrl;
            return o;
        }
    }
}
