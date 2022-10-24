// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProjectsProjectPermissions {
    private Map<String,Integer> groupAccess;
    private Map<String,Integer> projectAccess;

    private GetProjectsProjectPermissions() {}
    public Map<String,Integer> groupAccess() {
        return this.groupAccess;
    }
    public Map<String,Integer> projectAccess() {
        return this.projectAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectsProjectPermissions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Integer> groupAccess;
        private Map<String,Integer> projectAccess;
        public Builder() {}
        public Builder(GetProjectsProjectPermissions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupAccess = defaults.groupAccess;
    	      this.projectAccess = defaults.projectAccess;
        }

        @CustomType.Setter
        public Builder groupAccess(Map<String,Integer> groupAccess) {
            this.groupAccess = Objects.requireNonNull(groupAccess);
            return this;
        }
        @CustomType.Setter
        public Builder projectAccess(Map<String,Integer> projectAccess) {
            this.projectAccess = Objects.requireNonNull(projectAccess);
            return this;
        }
        public GetProjectsProjectPermissions build() {
            final var o = new GetProjectsProjectPermissions();
            o.groupAccess = groupAccess;
            o.projectAccess = projectAccess;
            return o;
        }
    }
}
