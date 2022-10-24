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


public final class GetProjectsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectsPlainArgs Empty = new GetProjectsPlainArgs();

    /**
     * Limit by archived status.
     * 
     */
    @Import(name="archived")
    private @Nullable Boolean archived;

    /**
     * @return Limit by archived status.
     * 
     */
    public Optional<Boolean> archived() {
        return Optional.ofNullable(this.archived);
    }

    /**
     * The ID of the group owned by the authenticated user to look projects for within. Cannot be used with `min_access_level`, `with_programming_language` or `statistics`.
     * 
     */
    @Import(name="groupId")
    private @Nullable Integer groupId;

    /**
     * @return The ID of the group owned by the authenticated user to look projects for within. Cannot be used with `min_access_level`, `with_programming_language` or `statistics`.
     * 
     */
    public Optional<Integer> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Include projects in subgroups of this group. Default is `false`. Needs `group_id`.
     * 
     */
    @Import(name="includeSubgroups")
    private @Nullable Boolean includeSubgroups;

    /**
     * @return Include projects in subgroups of this group. Default is `false`. Needs `group_id`.
     * 
     */
    public Optional<Boolean> includeSubgroups() {
        return Optional.ofNullable(this.includeSubgroups);
    }

    /**
     * The maximum number of project results pages that may be queried. Prevents overloading your Gitlab instance in case of a misconfiguration.
     * 
     */
    @Import(name="maxQueryablePages")
    private @Nullable Integer maxQueryablePages;

    /**
     * @return The maximum number of project results pages that may be queried. Prevents overloading your Gitlab instance in case of a misconfiguration.
     * 
     */
    public Optional<Integer> maxQueryablePages() {
        return Optional.ofNullable(this.maxQueryablePages);
    }

    /**
     * Limit by projects that the current user is a member of.
     * 
     */
    @Import(name="membership")
    private @Nullable Boolean membership;

    /**
     * @return Limit by projects that the current user is a member of.
     * 
     */
    public Optional<Boolean> membership() {
        return Optional.ofNullable(this.membership);
    }

    /**
     * Limit to projects where current user has at least this access level, refer to the [official documentation](https://docs.gitlab.com/ee/api/members.html) for values. Cannot be used with `group_id`.
     * 
     */
    @Import(name="minAccessLevel")
    private @Nullable Integer minAccessLevel;

    /**
     * @return Limit to projects where current user has at least this access level, refer to the [official documentation](https://docs.gitlab.com/ee/api/members.html) for values. Cannot be used with `group_id`.
     * 
     */
    public Optional<Integer> minAccessLevel() {
        return Optional.ofNullable(this.minAccessLevel);
    }

    /**
     * Return projects ordered by `id`, `name`, `path`, `created_at`, `updated_at`, or `last_activity_at` fields. Default is `created_at`.
     * 
     */
    @Import(name="orderBy")
    private @Nullable String orderBy;

    /**
     * @return Return projects ordered by `id`, `name`, `path`, `created_at`, `updated_at`, or `last_activity_at` fields. Default is `created_at`.
     * 
     */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    /**
     * Limit by projects owned by the current user.
     * 
     */
    @Import(name="owned")
    private @Nullable Boolean owned;

    /**
     * @return Limit by projects owned by the current user.
     * 
     */
    public Optional<Boolean> owned() {
        return Optional.ofNullable(this.owned);
    }

    /**
     * The first page to begin the query on.
     * 
     */
    @Import(name="page")
    private @Nullable Integer page;

    /**
     * @return The first page to begin the query on.
     * 
     */
    public Optional<Integer> page() {
        return Optional.ofNullable(this.page);
    }

    /**
     * The number of results to return per page.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return The number of results to return per page.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * Return list of authorized projects matching the search criteria.
     * 
     */
    @Import(name="search")
    private @Nullable String search;

    /**
     * @return Return list of authorized projects matching the search criteria.
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }

    /**
     * Return only the ID, URL, name, and path of each project.
     * 
     */
    @Import(name="simple")
    private @Nullable Boolean simple;

    /**
     * @return Return only the ID, URL, name, and path of each project.
     * 
     */
    public Optional<Boolean> simple() {
        return Optional.ofNullable(this.simple);
    }

    /**
     * Return projects sorted in `asc` or `desc` order. Default is `desc`.
     * 
     */
    @Import(name="sort")
    private @Nullable String sort;

    /**
     * @return Return projects sorted in `asc` or `desc` order. Default is `desc`.
     * 
     */
    public Optional<String> sort() {
        return Optional.ofNullable(this.sort);
    }

    /**
     * Limit by projects starred by the current user.
     * 
     */
    @Import(name="starred")
    private @Nullable Boolean starred;

    /**
     * @return Limit by projects starred by the current user.
     * 
     */
    public Optional<Boolean> starred() {
        return Optional.ofNullable(this.starred);
    }

    /**
     * Include project statistics. Cannot be used with `group_id`.
     * 
     */
    @Import(name="statistics")
    private @Nullable Boolean statistics;

    /**
     * @return Include project statistics. Cannot be used with `group_id`.
     * 
     */
    public Optional<Boolean> statistics() {
        return Optional.ofNullable(this.statistics);
    }

    /**
     * Limit by visibility `public`, `internal`, or `private`.
     * 
     */
    @Import(name="visibility")
    private @Nullable String visibility;

    /**
     * @return Limit by visibility `public`, `internal`, or `private`.
     * 
     */
    public Optional<String> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    /**
     * Include custom attributes in response *(admins only)*.
     * 
     */
    @Import(name="withCustomAttributes")
    private @Nullable Boolean withCustomAttributes;

    /**
     * @return Include custom attributes in response *(admins only)*.
     * 
     */
    public Optional<Boolean> withCustomAttributes() {
        return Optional.ofNullable(this.withCustomAttributes);
    }

    /**
     * Limit by projects with issues feature enabled. Default is `false`.
     * 
     */
    @Import(name="withIssuesEnabled")
    private @Nullable Boolean withIssuesEnabled;

    /**
     * @return Limit by projects with issues feature enabled. Default is `false`.
     * 
     */
    public Optional<Boolean> withIssuesEnabled() {
        return Optional.ofNullable(this.withIssuesEnabled);
    }

    /**
     * Limit by projects with merge requests feature enabled. Default is `false`.
     * 
     */
    @Import(name="withMergeRequestsEnabled")
    private @Nullable Boolean withMergeRequestsEnabled;

    /**
     * @return Limit by projects with merge requests feature enabled. Default is `false`.
     * 
     */
    public Optional<Boolean> withMergeRequestsEnabled() {
        return Optional.ofNullable(this.withMergeRequestsEnabled);
    }

    /**
     * Limit by projects which use the given programming language. Cannot be used with `group_id`.
     * 
     */
    @Import(name="withProgrammingLanguage")
    private @Nullable String withProgrammingLanguage;

    /**
     * @return Limit by projects which use the given programming language. Cannot be used with `group_id`.
     * 
     */
    public Optional<String> withProgrammingLanguage() {
        return Optional.ofNullable(this.withProgrammingLanguage);
    }

    /**
     * Include projects shared to this group. Default is `true`. Needs `group_id`.
     * 
     */
    @Import(name="withShared")
    private @Nullable Boolean withShared;

    /**
     * @return Include projects shared to this group. Default is `true`. Needs `group_id`.
     * 
     */
    public Optional<Boolean> withShared() {
        return Optional.ofNullable(this.withShared);
    }

    private GetProjectsPlainArgs() {}

    private GetProjectsPlainArgs(GetProjectsPlainArgs $) {
        this.archived = $.archived;
        this.groupId = $.groupId;
        this.includeSubgroups = $.includeSubgroups;
        this.maxQueryablePages = $.maxQueryablePages;
        this.membership = $.membership;
        this.minAccessLevel = $.minAccessLevel;
        this.orderBy = $.orderBy;
        this.owned = $.owned;
        this.page = $.page;
        this.perPage = $.perPage;
        this.search = $.search;
        this.simple = $.simple;
        this.sort = $.sort;
        this.starred = $.starred;
        this.statistics = $.statistics;
        this.visibility = $.visibility;
        this.withCustomAttributes = $.withCustomAttributes;
        this.withIssuesEnabled = $.withIssuesEnabled;
        this.withMergeRequestsEnabled = $.withMergeRequestsEnabled;
        this.withProgrammingLanguage = $.withProgrammingLanguage;
        this.withShared = $.withShared;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectsPlainArgs $;

        public Builder() {
            $ = new GetProjectsPlainArgs();
        }

        public Builder(GetProjectsPlainArgs defaults) {
            $ = new GetProjectsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archived Limit by archived status.
         * 
         * @return builder
         * 
         */
        public Builder archived(@Nullable Boolean archived) {
            $.archived = archived;
            return this;
        }

        /**
         * @param groupId The ID of the group owned by the authenticated user to look projects for within. Cannot be used with `min_access_level`, `with_programming_language` or `statistics`.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Integer groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param includeSubgroups Include projects in subgroups of this group. Default is `false`. Needs `group_id`.
         * 
         * @return builder
         * 
         */
        public Builder includeSubgroups(@Nullable Boolean includeSubgroups) {
            $.includeSubgroups = includeSubgroups;
            return this;
        }

        /**
         * @param maxQueryablePages The maximum number of project results pages that may be queried. Prevents overloading your Gitlab instance in case of a misconfiguration.
         * 
         * @return builder
         * 
         */
        public Builder maxQueryablePages(@Nullable Integer maxQueryablePages) {
            $.maxQueryablePages = maxQueryablePages;
            return this;
        }

        /**
         * @param membership Limit by projects that the current user is a member of.
         * 
         * @return builder
         * 
         */
        public Builder membership(@Nullable Boolean membership) {
            $.membership = membership;
            return this;
        }

        /**
         * @param minAccessLevel Limit to projects where current user has at least this access level, refer to the [official documentation](https://docs.gitlab.com/ee/api/members.html) for values. Cannot be used with `group_id`.
         * 
         * @return builder
         * 
         */
        public Builder minAccessLevel(@Nullable Integer minAccessLevel) {
            $.minAccessLevel = minAccessLevel;
            return this;
        }

        /**
         * @param orderBy Return projects ordered by `id`, `name`, `path`, `created_at`, `updated_at`, or `last_activity_at` fields. Default is `created_at`.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable String orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        /**
         * @param owned Limit by projects owned by the current user.
         * 
         * @return builder
         * 
         */
        public Builder owned(@Nullable Boolean owned) {
            $.owned = owned;
            return this;
        }

        /**
         * @param page The first page to begin the query on.
         * 
         * @return builder
         * 
         */
        public Builder page(@Nullable Integer page) {
            $.page = page;
            return this;
        }

        /**
         * @param perPage The number of results to return per page.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param search Return list of authorized projects matching the search criteria.
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable String search) {
            $.search = search;
            return this;
        }

        /**
         * @param simple Return only the ID, URL, name, and path of each project.
         * 
         * @return builder
         * 
         */
        public Builder simple(@Nullable Boolean simple) {
            $.simple = simple;
            return this;
        }

        /**
         * @param sort Return projects sorted in `asc` or `desc` order. Default is `desc`.
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable String sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param starred Limit by projects starred by the current user.
         * 
         * @return builder
         * 
         */
        public Builder starred(@Nullable Boolean starred) {
            $.starred = starred;
            return this;
        }

        /**
         * @param statistics Include project statistics. Cannot be used with `group_id`.
         * 
         * @return builder
         * 
         */
        public Builder statistics(@Nullable Boolean statistics) {
            $.statistics = statistics;
            return this;
        }

        /**
         * @param visibility Limit by visibility `public`, `internal`, or `private`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable String visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param withCustomAttributes Include custom attributes in response *(admins only)*.
         * 
         * @return builder
         * 
         */
        public Builder withCustomAttributes(@Nullable Boolean withCustomAttributes) {
            $.withCustomAttributes = withCustomAttributes;
            return this;
        }

        /**
         * @param withIssuesEnabled Limit by projects with issues feature enabled. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder withIssuesEnabled(@Nullable Boolean withIssuesEnabled) {
            $.withIssuesEnabled = withIssuesEnabled;
            return this;
        }

        /**
         * @param withMergeRequestsEnabled Limit by projects with merge requests feature enabled. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder withMergeRequestsEnabled(@Nullable Boolean withMergeRequestsEnabled) {
            $.withMergeRequestsEnabled = withMergeRequestsEnabled;
            return this;
        }

        /**
         * @param withProgrammingLanguage Limit by projects which use the given programming language. Cannot be used with `group_id`.
         * 
         * @return builder
         * 
         */
        public Builder withProgrammingLanguage(@Nullable String withProgrammingLanguage) {
            $.withProgrammingLanguage = withProgrammingLanguage;
            return this;
        }

        /**
         * @param withShared Include projects shared to this group. Default is `true`. Needs `group_id`.
         * 
         * @return builder
         * 
         */
        public Builder withShared(@Nullable Boolean withShared) {
            $.withShared = withShared;
            return this;
        }

        public GetProjectsPlainArgs build() {
            return $;
        }
    }

}
