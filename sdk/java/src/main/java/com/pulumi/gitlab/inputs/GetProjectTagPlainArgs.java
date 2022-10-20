// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectTagPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectTagPlainArgs Empty = new GetProjectTagPlainArgs();

    /**
     * The name of a tag.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of a tag.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID or URL-encoded path of the project owned by the authenticated user.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The ID or URL-encoded path of the project owned by the authenticated user.
     * 
     */
    public String project() {
        return this.project;
    }

    private GetProjectTagPlainArgs() {}

    private GetProjectTagPlainArgs(GetProjectTagPlainArgs $) {
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectTagPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectTagPlainArgs $;

        public Builder() {
            $ = new GetProjectTagPlainArgs();
        }

        public Builder(GetProjectTagPlainArgs defaults) {
            $ = new GetProjectTagPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of a tag.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID or URL-encoded path of the project owned by the authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public GetProjectTagPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
