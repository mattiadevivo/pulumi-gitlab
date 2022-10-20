// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReleaseLinkResult {
    /**
     * @return Full path for a [Direct Asset link](https://docs.gitlab.com/ee/user/project/releases/index.html#permanent-links-to-release-assets).
     * 
     */
    private String directAssetUrl;
    /**
     * @return External or internal link.
     * 
     */
    private Boolean external;
    /**
     * @return Relative path for a [Direct Asset link](https://docs.gitlab.com/ee/user/project/releases/index.html#permanent-links-to-release-assets).
     * 
     */
    private String filepath;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The ID of the link.
     * 
     */
    private Integer linkId;
    /**
     * @return The type of the link. Valid values are `other`, `runbook`, `image`, `package`. Defaults to other.
     * 
     */
    private String linkType;
    /**
     * @return The name of the link. Link names must be unique within the release.
     * 
     */
    private String name;
    /**
     * @return The ID or [URL-encoded path of the project](https://docs.gitlab.com/ee/api/index.html#namespaced-path-encoding).
     * 
     */
    private String project;
    /**
     * @return The tag associated with the Release.
     * 
     */
    private String tagName;
    /**
     * @return The URL of the link. Link URLs must be unique within the release.
     * 
     */
    private String url;

    private GetReleaseLinkResult() {}
    /**
     * @return Full path for a [Direct Asset link](https://docs.gitlab.com/ee/user/project/releases/index.html#permanent-links-to-release-assets).
     * 
     */
    public String directAssetUrl() {
        return this.directAssetUrl;
    }
    /**
     * @return External or internal link.
     * 
     */
    public Boolean external() {
        return this.external;
    }
    /**
     * @return Relative path for a [Direct Asset link](https://docs.gitlab.com/ee/user/project/releases/index.html#permanent-links-to-release-assets).
     * 
     */
    public String filepath() {
        return this.filepath;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the link.
     * 
     */
    public Integer linkId() {
        return this.linkId;
    }
    /**
     * @return The type of the link. Valid values are `other`, `runbook`, `image`, `package`. Defaults to other.
     * 
     */
    public String linkType() {
        return this.linkType;
    }
    /**
     * @return The name of the link. Link names must be unique within the release.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID or [URL-encoded path of the project](https://docs.gitlab.com/ee/api/index.html#namespaced-path-encoding).
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The tag associated with the Release.
     * 
     */
    public String tagName() {
        return this.tagName;
    }
    /**
     * @return The URL of the link. Link URLs must be unique within the release.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReleaseLinkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String directAssetUrl;
        private Boolean external;
        private String filepath;
        private String id;
        private Integer linkId;
        private String linkType;
        private String name;
        private String project;
        private String tagName;
        private String url;
        public Builder() {}
        public Builder(GetReleaseLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directAssetUrl = defaults.directAssetUrl;
    	      this.external = defaults.external;
    	      this.filepath = defaults.filepath;
    	      this.id = defaults.id;
    	      this.linkId = defaults.linkId;
    	      this.linkType = defaults.linkType;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.tagName = defaults.tagName;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder directAssetUrl(String directAssetUrl) {
            this.directAssetUrl = Objects.requireNonNull(directAssetUrl);
            return this;
        }
        @CustomType.Setter
        public Builder external(Boolean external) {
            this.external = Objects.requireNonNull(external);
            return this;
        }
        @CustomType.Setter
        public Builder filepath(String filepath) {
            this.filepath = Objects.requireNonNull(filepath);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder linkId(Integer linkId) {
            this.linkId = Objects.requireNonNull(linkId);
            return this;
        }
        @CustomType.Setter
        public Builder linkType(String linkType) {
            this.linkType = Objects.requireNonNull(linkType);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetReleaseLinkResult build() {
            final var o = new GetReleaseLinkResult();
            o.directAssetUrl = directAssetUrl;
            o.external = external;
            o.filepath = filepath;
            o.id = id;
            o.linkId = linkId;
            o.linkType = linkType;
            o.name = name;
            o.project = project;
            o.tagName = tagName;
            o.url = url;
            return o;
        }
    }
}
