// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gitlab.outputs.GetGroupSubgroupsSubgroup;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupSubgroupsResult {
    /**
     * @return Show all the groups you have access to.
     * 
     */
    private Boolean allAvailable;
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
     * @return Limit to groups where current user has at least this access level.
     * 
     */
    private String minAccessLevel;
    /**
     * @return Order groups by name, path or id.
     * 
     */
    private String orderBy;
    /**
     * @return Limit to groups explicitly owned by the current user.
     * 
     */
    private Boolean owned;
    /**
     * @return Return the list of authorized groups matching the search criteria.
     * 
     */
    private String search;
    /**
     * @return Skip the group IDs passed.
     * 
     */
    private List<Integer> skipGroups;
    /**
     * @return Order groups in asc or desc order.
     * 
     */
    private String sort;
    /**
     * @return Include group statistics (administrators only).
     * 
     */
    private Boolean statistics;
    /**
     * @return Subgroups of the parent group.
     * 
     */
    private List<GetGroupSubgroupsSubgroup> subgroups;
    /**
     * @return Include custom attributes in response (administrators only).
     * 
     */
    private Boolean withCustomAttributes;

    private GetGroupSubgroupsResult() {}
    /**
     * @return Show all the groups you have access to.
     * 
     */
    public Boolean allAvailable() {
        return this.allAvailable;
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
     * @return Limit to groups where current user has at least this access level.
     * 
     */
    public String minAccessLevel() {
        return this.minAccessLevel;
    }
    /**
     * @return Order groups by name, path or id.
     * 
     */
    public String orderBy() {
        return this.orderBy;
    }
    /**
     * @return Limit to groups explicitly owned by the current user.
     * 
     */
    public Boolean owned() {
        return this.owned;
    }
    /**
     * @return Return the list of authorized groups matching the search criteria.
     * 
     */
    public String search() {
        return this.search;
    }
    /**
     * @return Skip the group IDs passed.
     * 
     */
    public List<Integer> skipGroups() {
        return this.skipGroups;
    }
    /**
     * @return Order groups in asc or desc order.
     * 
     */
    public String sort() {
        return this.sort;
    }
    /**
     * @return Include group statistics (administrators only).
     * 
     */
    public Boolean statistics() {
        return this.statistics;
    }
    /**
     * @return Subgroups of the parent group.
     * 
     */
    public List<GetGroupSubgroupsSubgroup> subgroups() {
        return this.subgroups;
    }
    /**
     * @return Include custom attributes in response (administrators only).
     * 
     */
    public Boolean withCustomAttributes() {
        return this.withCustomAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupSubgroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allAvailable;
        private Integer groupId;
        private String id;
        private String minAccessLevel;
        private String orderBy;
        private Boolean owned;
        private String search;
        private List<Integer> skipGroups;
        private String sort;
        private Boolean statistics;
        private List<GetGroupSubgroupsSubgroup> subgroups;
        private Boolean withCustomAttributes;
        public Builder() {}
        public Builder(GetGroupSubgroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAvailable = defaults.allAvailable;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.minAccessLevel = defaults.minAccessLevel;
    	      this.orderBy = defaults.orderBy;
    	      this.owned = defaults.owned;
    	      this.search = defaults.search;
    	      this.skipGroups = defaults.skipGroups;
    	      this.sort = defaults.sort;
    	      this.statistics = defaults.statistics;
    	      this.subgroups = defaults.subgroups;
    	      this.withCustomAttributes = defaults.withCustomAttributes;
        }

        @CustomType.Setter
        public Builder allAvailable(Boolean allAvailable) {
            this.allAvailable = Objects.requireNonNull(allAvailable);
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
        public Builder minAccessLevel(String minAccessLevel) {
            this.minAccessLevel = Objects.requireNonNull(minAccessLevel);
            return this;
        }
        @CustomType.Setter
        public Builder orderBy(String orderBy) {
            this.orderBy = Objects.requireNonNull(orderBy);
            return this;
        }
        @CustomType.Setter
        public Builder owned(Boolean owned) {
            this.owned = Objects.requireNonNull(owned);
            return this;
        }
        @CustomType.Setter
        public Builder search(String search) {
            this.search = Objects.requireNonNull(search);
            return this;
        }
        @CustomType.Setter
        public Builder skipGroups(List<Integer> skipGroups) {
            this.skipGroups = Objects.requireNonNull(skipGroups);
            return this;
        }
        public Builder skipGroups(Integer... skipGroups) {
            return skipGroups(List.of(skipGroups));
        }
        @CustomType.Setter
        public Builder sort(String sort) {
            this.sort = Objects.requireNonNull(sort);
            return this;
        }
        @CustomType.Setter
        public Builder statistics(Boolean statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }
        @CustomType.Setter
        public Builder subgroups(List<GetGroupSubgroupsSubgroup> subgroups) {
            this.subgroups = Objects.requireNonNull(subgroups);
            return this;
        }
        public Builder subgroups(GetGroupSubgroupsSubgroup... subgroups) {
            return subgroups(List.of(subgroups));
        }
        @CustomType.Setter
        public Builder withCustomAttributes(Boolean withCustomAttributes) {
            this.withCustomAttributes = Objects.requireNonNull(withCustomAttributes);
            return this;
        }
        public GetGroupSubgroupsResult build() {
            final var o = new GetGroupSubgroupsResult();
            o.allAvailable = allAvailable;
            o.groupId = groupId;
            o.id = id;
            o.minAccessLevel = minAccessLevel;
            o.orderBy = orderBy;
            o.owned = owned;
            o.search = search;
            o.skipGroups = skipGroups;
            o.sort = sort;
            o.statistics = statistics;
            o.subgroups = subgroups;
            o.withCustomAttributes = withCustomAttributes;
            return o;
        }
    }
}
