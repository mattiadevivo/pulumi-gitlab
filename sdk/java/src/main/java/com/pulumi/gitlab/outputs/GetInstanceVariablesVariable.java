// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceVariablesVariable {
    private String key;
    private Boolean masked;
    private Boolean protected_;
    private String value;
    private String variableType;

    private GetInstanceVariablesVariable() {}
    public String key() {
        return this.key;
    }
    public Boolean masked() {
        return this.masked;
    }
    public Boolean protected_() {
        return this.protected_;
    }
    public String value() {
        return this.value;
    }
    public String variableType() {
        return this.variableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceVariablesVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private Boolean masked;
        private Boolean protected_;
        private String value;
        private String variableType;
        public Builder() {}
        public Builder(GetInstanceVariablesVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.masked = defaults.masked;
    	      this.protected_ = defaults.protected_;
    	      this.value = defaults.value;
    	      this.variableType = defaults.variableType;
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
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        @CustomType.Setter
        public Builder variableType(String variableType) {
            this.variableType = Objects.requireNonNull(variableType);
            return this;
        }
        public GetInstanceVariablesVariable build() {
            final var o = new GetInstanceVariablesVariable();
            o.key = key;
            o.masked = masked;
            o.protected_ = protected_;
            o.value = value;
            o.variableType = variableType;
            return o;
        }
    }
}
