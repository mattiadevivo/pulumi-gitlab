// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupVariableResult {
    /**
     * @return The environment scope of the variable. Defaults to all environment (`*`). Note that in Community Editions of Gitlab, values other than `*` will cause inconsistent plans.
     * 
     */
    private String environmentScope;
    /**
     * @return The name or id of the group.
     * 
     */
    private String group;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the variable.
     * 
     */
    private String key;
    /**
     * @return If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
     * 
     */
    private Boolean masked;
    /**
     * @return If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
     * 
     */
    private Boolean protected_;
    /**
     * @return Whether the variable is treated as a raw string. Default: false. When true, variables in the value are not expanded.
     * 
     */
    private Boolean raw;
    /**
     * @return The value of the variable.
     * 
     */
    private String value;
    /**
     * @return The type of a variable. Valid values are: `env_var`, `file`. Default is `env_var`.
     * 
     */
    private String variableType;

    private GetGroupVariableResult() {}
    /**
     * @return The environment scope of the variable. Defaults to all environment (`*`). Note that in Community Editions of Gitlab, values other than `*` will cause inconsistent plans.
     * 
     */
    public String environmentScope() {
        return this.environmentScope;
    }
    /**
     * @return The name or id of the group.
     * 
     */
    public String group() {
        return this.group;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the variable.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return If set to `true`, the value of the variable will be hidden in job logs. The value must meet the [masking requirements](https://docs.gitlab.com/ee/ci/variables/#masked-variables). Defaults to `false`.
     * 
     */
    public Boolean masked() {
        return this.masked;
    }
    /**
     * @return If set to `true`, the variable will be passed only to pipelines running on protected branches and tags. Defaults to `false`.
     * 
     */
    public Boolean protected_() {
        return this.protected_;
    }
    /**
     * @return Whether the variable is treated as a raw string. Default: false. When true, variables in the value are not expanded.
     * 
     */
    public Boolean raw() {
        return this.raw;
    }
    /**
     * @return The value of the variable.
     * 
     */
    public String value() {
        return this.value;
    }
    /**
     * @return The type of a variable. Valid values are: `env_var`, `file`. Default is `env_var`.
     * 
     */
    public String variableType() {
        return this.variableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupVariableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String environmentScope;
        private String group;
        private String id;
        private String key;
        private Boolean masked;
        private Boolean protected_;
        private Boolean raw;
        private String value;
        private String variableType;
        public Builder() {}
        public Builder(GetGroupVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentScope = defaults.environmentScope;
    	      this.group = defaults.group;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.masked = defaults.masked;
    	      this.protected_ = defaults.protected_;
    	      this.raw = defaults.raw;
    	      this.value = defaults.value;
    	      this.variableType = defaults.variableType;
        }

        @CustomType.Setter
        public Builder environmentScope(String environmentScope) {
            this.environmentScope = Objects.requireNonNull(environmentScope);
            return this;
        }
        @CustomType.Setter
        public Builder group(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder masked(Boolean masked) {
            this.masked = Objects.requireNonNull(masked);
            return this;
        }
        @CustomType.Setter("protected")
        public Builder protected_(Boolean protected_) {
            this.protected_ = Objects.requireNonNull(protected_);
            return this;
        }
        @CustomType.Setter
        public Builder raw(Boolean raw) {
            this.raw = Objects.requireNonNull(raw);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        @CustomType.Setter
        public Builder variableType(String variableType) {
            this.variableType = Objects.requireNonNull(variableType);
            return this;
        }
        public GetGroupVariableResult build() {
            final var o = new GetGroupVariableResult();
            o.environmentScope = environmentScope;
            o.group = group;
            o.id = id;
            o.key = key;
            o.masked = masked;
            o.protected_ = protected_;
            o.raw = raw;
            o.value = value;
            o.variableType = variableType;
            return o;
        }
    }
}
