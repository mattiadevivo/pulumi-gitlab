// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterAgentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterAgentsPlainArgs Empty = new GetClusterAgentsPlainArgs();

    /**
     * The ID or full path of the project owned by the authenticated user.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The ID or full path of the project owned by the authenticated user.
     * 
     */
    public String project() {
        return this.project;
    }

    private GetClusterAgentsPlainArgs() {}

    private GetClusterAgentsPlainArgs(GetClusterAgentsPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterAgentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterAgentsPlainArgs $;

        public Builder() {
            $ = new GetClusterAgentsPlainArgs();
        }

        public Builder(GetClusterAgentsPlainArgs defaults) {
            $ = new GetClusterAgentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID or full path of the project owned by the authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public GetClusterAgentsPlainArgs build() {
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
