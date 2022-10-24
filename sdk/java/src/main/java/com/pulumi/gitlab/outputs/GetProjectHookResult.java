// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProjectHookResult {
    /**
     * @return Invoke the hook for confidential issues events.
     * 
     */
    private Boolean confidentialIssuesEvents;
    /**
     * @return Invoke the hook for confidential notes events.
     * 
     */
    private Boolean confidentialNoteEvents;
    /**
     * @return Invoke the hook for deployment events.
     * 
     */
    private Boolean deploymentEvents;
    /**
     * @return Enable ssl verification when invoking the hook.
     * 
     */
    private Boolean enableSslVerification;
    /**
     * @return The id of the project hook.
     * 
     */
    private Integer hookId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Invoke the hook for issues events.
     * 
     */
    private Boolean issuesEvents;
    /**
     * @return Invoke the hook for job events.
     * 
     */
    private Boolean jobEvents;
    /**
     * @return Invoke the hook for merge requests.
     * 
     */
    private Boolean mergeRequestsEvents;
    /**
     * @return Invoke the hook for notes events.
     * 
     */
    private Boolean noteEvents;
    /**
     * @return Invoke the hook for pipeline events.
     * 
     */
    private Boolean pipelineEvents;
    /**
     * @return The name or id of the project to add the hook to.
     * 
     */
    private String project;
    /**
     * @return The id of the project for the hook.
     * 
     */
    private Integer projectId;
    /**
     * @return Invoke the hook for push events.
     * 
     */
    private Boolean pushEvents;
    /**
     * @return Invoke the hook for push events on matching branches only.
     * 
     */
    private String pushEventsBranchFilter;
    /**
     * @return Invoke the hook for releases events.
     * 
     */
    private Boolean releasesEvents;
    /**
     * @return Invoke the hook for tag push events.
     * 
     */
    private Boolean tagPushEvents;
    /**
     * @return A token to present when invoking the hook. The token is not available for imported resources.
     * 
     */
    private String token;
    /**
     * @return The url of the hook to invoke.
     * 
     */
    private String url;
    /**
     * @return Invoke the hook for wiki page events.
     * 
     */
    private Boolean wikiPageEvents;

    private GetProjectHookResult() {}
    /**
     * @return Invoke the hook for confidential issues events.
     * 
     */
    public Boolean confidentialIssuesEvents() {
        return this.confidentialIssuesEvents;
    }
    /**
     * @return Invoke the hook for confidential notes events.
     * 
     */
    public Boolean confidentialNoteEvents() {
        return this.confidentialNoteEvents;
    }
    /**
     * @return Invoke the hook for deployment events.
     * 
     */
    public Boolean deploymentEvents() {
        return this.deploymentEvents;
    }
    /**
     * @return Enable ssl verification when invoking the hook.
     * 
     */
    public Boolean enableSslVerification() {
        return this.enableSslVerification;
    }
    /**
     * @return The id of the project hook.
     * 
     */
    public Integer hookId() {
        return this.hookId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Invoke the hook for issues events.
     * 
     */
    public Boolean issuesEvents() {
        return this.issuesEvents;
    }
    /**
     * @return Invoke the hook for job events.
     * 
     */
    public Boolean jobEvents() {
        return this.jobEvents;
    }
    /**
     * @return Invoke the hook for merge requests.
     * 
     */
    public Boolean mergeRequestsEvents() {
        return this.mergeRequestsEvents;
    }
    /**
     * @return Invoke the hook for notes events.
     * 
     */
    public Boolean noteEvents() {
        return this.noteEvents;
    }
    /**
     * @return Invoke the hook for pipeline events.
     * 
     */
    public Boolean pipelineEvents() {
        return this.pipelineEvents;
    }
    /**
     * @return The name or id of the project to add the hook to.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The id of the project for the hook.
     * 
     */
    public Integer projectId() {
        return this.projectId;
    }
    /**
     * @return Invoke the hook for push events.
     * 
     */
    public Boolean pushEvents() {
        return this.pushEvents;
    }
    /**
     * @return Invoke the hook for push events on matching branches only.
     * 
     */
    public String pushEventsBranchFilter() {
        return this.pushEventsBranchFilter;
    }
    /**
     * @return Invoke the hook for releases events.
     * 
     */
    public Boolean releasesEvents() {
        return this.releasesEvents;
    }
    /**
     * @return Invoke the hook for tag push events.
     * 
     */
    public Boolean tagPushEvents() {
        return this.tagPushEvents;
    }
    /**
     * @return A token to present when invoking the hook. The token is not available for imported resources.
     * 
     */
    public String token() {
        return this.token;
    }
    /**
     * @return The url of the hook to invoke.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Invoke the hook for wiki page events.
     * 
     */
    public Boolean wikiPageEvents() {
        return this.wikiPageEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectHookResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean confidentialIssuesEvents;
        private Boolean confidentialNoteEvents;
        private Boolean deploymentEvents;
        private Boolean enableSslVerification;
        private Integer hookId;
        private String id;
        private Boolean issuesEvents;
        private Boolean jobEvents;
        private Boolean mergeRequestsEvents;
        private Boolean noteEvents;
        private Boolean pipelineEvents;
        private String project;
        private Integer projectId;
        private Boolean pushEvents;
        private String pushEventsBranchFilter;
        private Boolean releasesEvents;
        private Boolean tagPushEvents;
        private String token;
        private String url;
        private Boolean wikiPageEvents;
        public Builder() {}
        public Builder(GetProjectHookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidentialIssuesEvents = defaults.confidentialIssuesEvents;
    	      this.confidentialNoteEvents = defaults.confidentialNoteEvents;
    	      this.deploymentEvents = defaults.deploymentEvents;
    	      this.enableSslVerification = defaults.enableSslVerification;
    	      this.hookId = defaults.hookId;
    	      this.id = defaults.id;
    	      this.issuesEvents = defaults.issuesEvents;
    	      this.jobEvents = defaults.jobEvents;
    	      this.mergeRequestsEvents = defaults.mergeRequestsEvents;
    	      this.noteEvents = defaults.noteEvents;
    	      this.pipelineEvents = defaults.pipelineEvents;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
    	      this.pushEvents = defaults.pushEvents;
    	      this.pushEventsBranchFilter = defaults.pushEventsBranchFilter;
    	      this.releasesEvents = defaults.releasesEvents;
    	      this.tagPushEvents = defaults.tagPushEvents;
    	      this.token = defaults.token;
    	      this.url = defaults.url;
    	      this.wikiPageEvents = defaults.wikiPageEvents;
        }

        @CustomType.Setter
        public Builder confidentialIssuesEvents(Boolean confidentialIssuesEvents) {
            this.confidentialIssuesEvents = Objects.requireNonNull(confidentialIssuesEvents);
            return this;
        }
        @CustomType.Setter
        public Builder confidentialNoteEvents(Boolean confidentialNoteEvents) {
            this.confidentialNoteEvents = Objects.requireNonNull(confidentialNoteEvents);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentEvents(Boolean deploymentEvents) {
            this.deploymentEvents = Objects.requireNonNull(deploymentEvents);
            return this;
        }
        @CustomType.Setter
        public Builder enableSslVerification(Boolean enableSslVerification) {
            this.enableSslVerification = Objects.requireNonNull(enableSslVerification);
            return this;
        }
        @CustomType.Setter
        public Builder hookId(Integer hookId) {
            this.hookId = Objects.requireNonNull(hookId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder issuesEvents(Boolean issuesEvents) {
            this.issuesEvents = Objects.requireNonNull(issuesEvents);
            return this;
        }
        @CustomType.Setter
        public Builder jobEvents(Boolean jobEvents) {
            this.jobEvents = Objects.requireNonNull(jobEvents);
            return this;
        }
        @CustomType.Setter
        public Builder mergeRequestsEvents(Boolean mergeRequestsEvents) {
            this.mergeRequestsEvents = Objects.requireNonNull(mergeRequestsEvents);
            return this;
        }
        @CustomType.Setter
        public Builder noteEvents(Boolean noteEvents) {
            this.noteEvents = Objects.requireNonNull(noteEvents);
            return this;
        }
        @CustomType.Setter
        public Builder pipelineEvents(Boolean pipelineEvents) {
            this.pipelineEvents = Objects.requireNonNull(pipelineEvents);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(Integer projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder pushEvents(Boolean pushEvents) {
            this.pushEvents = Objects.requireNonNull(pushEvents);
            return this;
        }
        @CustomType.Setter
        public Builder pushEventsBranchFilter(String pushEventsBranchFilter) {
            this.pushEventsBranchFilter = Objects.requireNonNull(pushEventsBranchFilter);
            return this;
        }
        @CustomType.Setter
        public Builder releasesEvents(Boolean releasesEvents) {
            this.releasesEvents = Objects.requireNonNull(releasesEvents);
            return this;
        }
        @CustomType.Setter
        public Builder tagPushEvents(Boolean tagPushEvents) {
            this.tagPushEvents = Objects.requireNonNull(tagPushEvents);
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder wikiPageEvents(Boolean wikiPageEvents) {
            this.wikiPageEvents = Objects.requireNonNull(wikiPageEvents);
            return this;
        }
        public GetProjectHookResult build() {
            final var o = new GetProjectHookResult();
            o.confidentialIssuesEvents = confidentialIssuesEvents;
            o.confidentialNoteEvents = confidentialNoteEvents;
            o.deploymentEvents = deploymentEvents;
            o.enableSslVerification = enableSslVerification;
            o.hookId = hookId;
            o.id = id;
            o.issuesEvents = issuesEvents;
            o.jobEvents = jobEvents;
            o.mergeRequestsEvents = mergeRequestsEvents;
            o.noteEvents = noteEvents;
            o.pipelineEvents = pipelineEvents;
            o.project = project;
            o.projectId = projectId;
            o.pushEvents = pushEvents;
            o.pushEventsBranchFilter = pushEventsBranchFilter;
            o.releasesEvents = releasesEvents;
            o.tagPushEvents = tagPushEvents;
            o.token = token;
            o.url = url;
            o.wikiPageEvents = wikiPageEvents;
            return o;
        }
    }
}
