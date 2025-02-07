// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRepositoryFilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryFilePlainArgs Empty = new GetRepositoryFilePlainArgs();

    /**
     * The full path of the file. It must be relative to the root of the project without a leading slash `/` or `./`.
     * 
     */
    @Import(name="filePath", required=true)
    private String filePath;

    /**
     * @return The full path of the file. It must be relative to the root of the project without a leading slash `/` or `./`.
     * 
     */
    public String filePath() {
        return this.filePath;
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

    /**
     * The name of branch, tag or commit.
     * 
     */
    @Import(name="ref", required=true)
    private String ref;

    /**
     * @return The name of branch, tag or commit.
     * 
     */
    public String ref() {
        return this.ref;
    }

    private GetRepositoryFilePlainArgs() {}

    private GetRepositoryFilePlainArgs(GetRepositoryFilePlainArgs $) {
        this.filePath = $.filePath;
        this.project = $.project;
        this.ref = $.ref;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryFilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryFilePlainArgs $;

        public Builder() {
            $ = new GetRepositoryFilePlainArgs();
        }

        public Builder(GetRepositoryFilePlainArgs defaults) {
            $ = new GetRepositoryFilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filePath The full path of the file. It must be relative to the root of the project without a leading slash `/` or `./`.
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            $.filePath = filePath;
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

        /**
         * @param ref The name of branch, tag or commit.
         * 
         * @return builder
         * 
         */
        public Builder ref(String ref) {
            $.ref = ref;
            return this;
        }

        public GetRepositoryFilePlainArgs build() {
            $.filePath = Objects.requireNonNull($.filePath, "expected parameter 'filePath' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.ref = Objects.requireNonNull($.ref, "expected parameter 'ref' to be non-null");
            return $;
        }
    }

}
