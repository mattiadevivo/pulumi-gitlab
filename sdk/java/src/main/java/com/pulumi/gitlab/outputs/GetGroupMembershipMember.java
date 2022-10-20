// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupMembershipMember {
    /**
     * @return Only return members with the desired access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
     * 
     */
    private String accessLevel;
    private String avatarUrl;
    private String expiresAt;
    /**
     * @return The ID of this resource.
     * 
     */
    private Integer id;
    private String name;
    private String state;
    private String username;
    private String webUrl;

    private GetGroupMembershipMember() {}
    /**
     * @return Only return members with the desired access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
     * 
     */
    public String accessLevel() {
        return this.accessLevel;
    }
    public String avatarUrl() {
        return this.avatarUrl;
    }
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public Integer id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String state() {
        return this.state;
    }
    public String username() {
        return this.username;
    }
    public String webUrl() {
        return this.webUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMembershipMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessLevel;
        private String avatarUrl;
        private String expiresAt;
        private Integer id;
        private String name;
        private String state;
        private String username;
        private String webUrl;
        public Builder() {}
        public Builder(GetGroupMembershipMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.avatarUrl = defaults.avatarUrl;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.username = defaults.username;
    	      this.webUrl = defaults.webUrl;
        }

        @CustomType.Setter
        public Builder accessLevel(String accessLevel) {
            this.accessLevel = Objects.requireNonNull(accessLevel);
            return this;
        }
        @CustomType.Setter
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = Objects.requireNonNull(avatarUrl);
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        @CustomType.Setter
        public Builder webUrl(String webUrl) {
            this.webUrl = Objects.requireNonNull(webUrl);
            return this;
        }
        public GetGroupMembershipMember build() {
            final var o = new GetGroupMembershipMember();
            o.accessLevel = accessLevel;
            o.avatarUrl = avatarUrl;
            o.expiresAt = expiresAt;
            o.id = id;
            o.name = name;
            o.state = state;
            o.username = username;
            o.webUrl = webUrl;
            return o;
        }
    }
}
