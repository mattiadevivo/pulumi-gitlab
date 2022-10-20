// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gitlab.outputs.GetProjectTagsTagCommit;
import com.pulumi.gitlab.outputs.GetProjectTagsTagRelease;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProjectTagsTag {
    private List<GetProjectTagsTagCommit> commits;
    private String message;
    private String name;
    private Boolean protected_;
    private List<GetProjectTagsTagRelease> releases;
    private String target;

    private GetProjectTagsTag() {}
    public List<GetProjectTagsTagCommit> commits() {
        return this.commits;
    }
    public String message() {
        return this.message;
    }
    public String name() {
        return this.name;
    }
    public Boolean protected_() {
        return this.protected_;
    }
    public List<GetProjectTagsTagRelease> releases() {
        return this.releases;
    }
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectTagsTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetProjectTagsTagCommit> commits;
        private String message;
        private String name;
        private Boolean protected_;
        private List<GetProjectTagsTagRelease> releases;
        private String target;
        public Builder() {}
        public Builder(GetProjectTagsTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commits = defaults.commits;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.protected_ = defaults.protected_;
    	      this.releases = defaults.releases;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder commits(List<GetProjectTagsTagCommit> commits) {
            this.commits = Objects.requireNonNull(commits);
            return this;
        }
        public Builder commits(GetProjectTagsTagCommit... commits) {
            return commits(List.of(commits));
        }
        @CustomType.Setter
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter("protected")
        public Builder protected_(Boolean protected_) {
            this.protected_ = Objects.requireNonNull(protected_);
            return this;
        }
        @CustomType.Setter
        public Builder releases(List<GetProjectTagsTagRelease> releases) {
            this.releases = Objects.requireNonNull(releases);
            return this;
        }
        public Builder releases(GetProjectTagsTagRelease... releases) {
            return releases(List.of(releases));
        }
        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public GetProjectTagsTag build() {
            final var o = new GetProjectTagsTag();
            o.commits = commits;
            o.message = message;
            o.name = name;
            o.protected_ = protected_;
            o.releases = releases;
            o.target = target;
            return o;
        }
    }
}
