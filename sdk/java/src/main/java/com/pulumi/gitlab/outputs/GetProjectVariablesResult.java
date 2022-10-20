// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gitlab.outputs.GetProjectVariablesVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectVariablesResult {
    /**
     * @return The environment scope of the variable. Defaults to all environment (`*`).
     * 
     */
    private @Nullable String environmentScope;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name or id of the project.
     * 
     */
    private String project;
    /**
     * @return The list of variables returned by the search
     * 
     */
    private List<GetProjectVariablesVariable> variables;

    private GetProjectVariablesResult() {}
    /**
     * @return The environment scope of the variable. Defaults to all environment (`*`).
     * 
     */
    public Optional<String> environmentScope() {
        return Optional.ofNullable(this.environmentScope);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name or id of the project.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The list of variables returned by the search
     * 
     */
    public List<GetProjectVariablesVariable> variables() {
        return this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectVariablesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String environmentScope;
        private String id;
        private String project;
        private List<GetProjectVariablesVariable> variables;
        public Builder() {}
        public Builder(GetProjectVariablesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentScope = defaults.environmentScope;
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder environmentScope(@Nullable String environmentScope) {
            this.environmentScope = environmentScope;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder variables(List<GetProjectVariablesVariable> variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }
        public Builder variables(GetProjectVariablesVariable... variables) {
            return variables(List.of(variables));
        }
        public GetProjectVariablesResult build() {
            final var o = new GetProjectVariablesResult();
            o.environmentScope = environmentScope;
            o.id = id;
            o.project = project;
            o.variables = variables;
            return o;
        }
    }
}
