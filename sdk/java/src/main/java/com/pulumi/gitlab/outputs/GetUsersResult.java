// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gitlab.outputs.GetUsersUser;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUsersResult {
    /**
     * @return Filter users that are active.
     * 
     */
    private @Nullable Boolean active;
    /**
     * @return Filter users that are blocked.
     * 
     */
    private @Nullable Boolean blocked;
    /**
     * @return Search for users created after a specific date. (Requires administrator privileges)
     * 
     */
    private @Nullable String createdAfter;
    /**
     * @return Search for users created before a specific date. (Requires administrator privileges)
     * 
     */
    private @Nullable String createdBefore;
    /**
     * @return Lookup users by external provider. (Requires administrator privileges)
     * 
     */
    private @Nullable String externProvider;
    /**
     * @return Lookup users by external UID. (Requires administrator privileges)
     * 
     */
    private @Nullable String externUid;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Order the users&#39; list by `id`, `name`, `username`, `created_at` or `updated_at`. (Requires administrator privileges)
     * 
     */
    private @Nullable String orderBy;
    /**
     * @return Search users by username, name or email.
     * 
     */
    private @Nullable String search;
    /**
     * @return Sort users&#39; list in asc or desc order. (Requires administrator privileges)
     * 
     */
    private @Nullable String sort;
    /**
     * @return The list of users.
     * 
     */
    private List<GetUsersUser> users;

    private GetUsersResult() {}
    /**
     * @return Filter users that are active.
     * 
     */
    public Optional<Boolean> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * @return Filter users that are blocked.
     * 
     */
    public Optional<Boolean> blocked() {
        return Optional.ofNullable(this.blocked);
    }
    /**
     * @return Search for users created after a specific date. (Requires administrator privileges)
     * 
     */
    public Optional<String> createdAfter() {
        return Optional.ofNullable(this.createdAfter);
    }
    /**
     * @return Search for users created before a specific date. (Requires administrator privileges)
     * 
     */
    public Optional<String> createdBefore() {
        return Optional.ofNullable(this.createdBefore);
    }
    /**
     * @return Lookup users by external provider. (Requires administrator privileges)
     * 
     */
    public Optional<String> externProvider() {
        return Optional.ofNullable(this.externProvider);
    }
    /**
     * @return Lookup users by external UID. (Requires administrator privileges)
     * 
     */
    public Optional<String> externUid() {
        return Optional.ofNullable(this.externUid);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Order the users&#39; list by `id`, `name`, `username`, `created_at` or `updated_at`. (Requires administrator privileges)
     * 
     */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }
    /**
     * @return Search users by username, name or email.
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }
    /**
     * @return Sort users&#39; list in asc or desc order. (Requires administrator privileges)
     * 
     */
    public Optional<String> sort() {
        return Optional.ofNullable(this.sort);
    }
    /**
     * @return The list of users.
     * 
     */
    public List<GetUsersUser> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean active;
        private @Nullable Boolean blocked;
        private @Nullable String createdAfter;
        private @Nullable String createdBefore;
        private @Nullable String externProvider;
        private @Nullable String externUid;
        private String id;
        private @Nullable String orderBy;
        private @Nullable String search;
        private @Nullable String sort;
        private List<GetUsersUser> users;
        public Builder() {}
        public Builder(GetUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.blocked = defaults.blocked;
    	      this.createdAfter = defaults.createdAfter;
    	      this.createdBefore = defaults.createdBefore;
    	      this.externProvider = defaults.externProvider;
    	      this.externUid = defaults.externUid;
    	      this.id = defaults.id;
    	      this.orderBy = defaults.orderBy;
    	      this.search = defaults.search;
    	      this.sort = defaults.sort;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder active(@Nullable Boolean active) {
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder blocked(@Nullable Boolean blocked) {
            this.blocked = blocked;
            return this;
        }
        @CustomType.Setter
        public Builder createdAfter(@Nullable String createdAfter) {
            this.createdAfter = createdAfter;
            return this;
        }
        @CustomType.Setter
        public Builder createdBefore(@Nullable String createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }
        @CustomType.Setter
        public Builder externProvider(@Nullable String externProvider) {
            this.externProvider = externProvider;
            return this;
        }
        @CustomType.Setter
        public Builder externUid(@Nullable String externUid) {
            this.externUid = externUid;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder orderBy(@Nullable String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        @CustomType.Setter
        public Builder search(@Nullable String search) {
            this.search = search;
            return this;
        }
        @CustomType.Setter
        public Builder sort(@Nullable String sort) {
            this.sort = sort;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<GetUsersUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(GetUsersUser... users) {
            return users(List.of(users));
        }
        public GetUsersResult build() {
            final var o = new GetUsersResult();
            o.active = active;
            o.blocked = blocked;
            o.createdAfter = createdAfter;
            o.createdBefore = createdBefore;
            o.externProvider = externProvider;
            o.externUid = externUid;
            o.id = id;
            o.orderBy = orderBy;
            o.search = search;
            o.sort = sort;
            o.users = users;
            return o;
        }
    }
}
