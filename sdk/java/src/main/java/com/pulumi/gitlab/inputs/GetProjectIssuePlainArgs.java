// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetProjectIssuePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectIssuePlainArgs Empty = new GetProjectIssuePlainArgs();

    /**
     * The internal ID of the project&#39;s issue.
     * 
     */
    @Import(name="iid", required=true)
    private Integer iid;

    /**
     * @return The internal ID of the project&#39;s issue.
     * 
     */
    public Integer iid() {
        return this.iid;
    }

    /**
     * The name or ID of the project.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The name or ID of the project.
     * 
     */
    public String project() {
        return this.project;
    }

    private GetProjectIssuePlainArgs() {}

    private GetProjectIssuePlainArgs(GetProjectIssuePlainArgs $) {
        this.iid = $.iid;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectIssuePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectIssuePlainArgs $;

        public Builder() {
            $ = new GetProjectIssuePlainArgs();
        }

        public Builder(GetProjectIssuePlainArgs defaults) {
            $ = new GetProjectIssuePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iid The internal ID of the project&#39;s issue.
         * 
         * @return builder
         * 
         */
        public Builder iid(Integer iid) {
            $.iid = iid;
            return this;
        }

        /**
         * @param project The name or ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public GetProjectIssuePlainArgs build() {
            $.iid = Objects.requireNonNull($.iid, "expected parameter 'iid' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
