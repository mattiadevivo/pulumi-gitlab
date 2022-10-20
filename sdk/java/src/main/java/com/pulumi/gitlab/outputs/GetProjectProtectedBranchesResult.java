// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gitlab.outputs.GetProjectProtectedBranchesProtectedBranch;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProjectProtectedBranchesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The integer or path with namespace that uniquely identifies the project.
     * 
     */
    private String projectId;
    /**
     * @return A list of protected branches, as defined below.
     * 
     */
    private List<GetProjectProtectedBranchesProtectedBranch> protectedBranches;

    private GetProjectProtectedBranchesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The integer or path with namespace that uniquely identifies the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return A list of protected branches, as defined below.
     * 
     */
    public List<GetProjectProtectedBranchesProtectedBranch> protectedBranches() {
        return this.protectedBranches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectProtectedBranchesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String projectId;
        private List<GetProjectProtectedBranchesProtectedBranch> protectedBranches;
        public Builder() {}
        public Builder(GetProjectProtectedBranchesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.protectedBranches = defaults.protectedBranches;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder protectedBranches(List<GetProjectProtectedBranchesProtectedBranch> protectedBranches) {
            this.protectedBranches = Objects.requireNonNull(protectedBranches);
            return this;
        }
        public Builder protectedBranches(GetProjectProtectedBranchesProtectedBranch... protectedBranches) {
            return protectedBranches(List.of(protectedBranches));
        }
        public GetProjectProtectedBranchesResult build() {
            final var o = new GetProjectProtectedBranchesResult();
            o.id = id;
            o.projectId = projectId;
            o.protectedBranches = protectedBranches;
            return o;
        }
    }
}
