// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationResult {
    /**
     * @return Internal GitLab application id.
     * 
     */
    private String applicationId;
    /**
     * @return Indicates if the application is kept confidential.
     * 
     */
    private Boolean confidential;
    private String id;
    /**
     * @return The name of the GitLab application.
     * 
     */
    private String name;
    /**
     * @return The redirect url of the application.
     * 
     */
    private String redirectUrl;

    private GetApplicationResult() {}
    /**
     * @return Internal GitLab application id.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return Indicates if the application is kept confidential.
     * 
     */
    public Boolean confidential() {
        return this.confidential;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the GitLab application.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The redirect url of the application.
     * 
     */
    public String redirectUrl() {
        return this.redirectUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationId;
        private Boolean confidential;
        private String id;
        private String name;
        private String redirectUrl;
        public Builder() {}
        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.confidential = defaults.confidential;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.redirectUrl = defaults.redirectUrl;
        }

        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        @CustomType.Setter
        public Builder confidential(Boolean confidential) {
            this.confidential = Objects.requireNonNull(confidential);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = Objects.requireNonNull(redirectUrl);
            return this;
        }
        public GetApplicationResult build() {
            final var o = new GetApplicationResult();
            o.applicationId = applicationId;
            o.confidential = confidential;
            o.id = id;
            o.name = name;
            o.redirectUrl = redirectUrl;
            return o;
        }
    }
}
