// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceMicrosoftTeamsState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceMicrosoftTeamsState Empty = new ServiceMicrosoftTeamsState();

    /**
     * Whether the integration is active.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Whether the integration is active.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
     * 
     */
    @Import(name="branchesToBeNotified")
    private @Nullable Output<String> branchesToBeNotified;

    /**
     * @return Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
     * 
     */
    public Optional<Output<String>> branchesToBeNotified() {
        return Optional.ofNullable(this.branchesToBeNotified);
    }

    /**
     * Enable notifications for confidential issue events
     * 
     */
    @Import(name="confidentialIssuesEvents")
    private @Nullable Output<Boolean> confidentialIssuesEvents;

    /**
     * @return Enable notifications for confidential issue events
     * 
     */
    public Optional<Output<Boolean>> confidentialIssuesEvents() {
        return Optional.ofNullable(this.confidentialIssuesEvents);
    }

    /**
     * Enable notifications for confidential note events
     * 
     */
    @Import(name="confidentialNoteEvents")
    private @Nullable Output<Boolean> confidentialNoteEvents;

    /**
     * @return Enable notifications for confidential note events
     * 
     */
    public Optional<Output<Boolean>> confidentialNoteEvents() {
        return Optional.ofNullable(this.confidentialNoteEvents);
    }

    /**
     * Create time.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Create time.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Enable notifications for issue events
     * 
     */
    @Import(name="issuesEvents")
    private @Nullable Output<Boolean> issuesEvents;

    /**
     * @return Enable notifications for issue events
     * 
     */
    public Optional<Output<Boolean>> issuesEvents() {
        return Optional.ofNullable(this.issuesEvents);
    }

    /**
     * Enable notifications for merge request events
     * 
     */
    @Import(name="mergeRequestsEvents")
    private @Nullable Output<Boolean> mergeRequestsEvents;

    /**
     * @return Enable notifications for merge request events
     * 
     */
    public Optional<Output<Boolean>> mergeRequestsEvents() {
        return Optional.ofNullable(this.mergeRequestsEvents);
    }

    /**
     * Enable notifications for note events
     * 
     */
    @Import(name="noteEvents")
    private @Nullable Output<Boolean> noteEvents;

    /**
     * @return Enable notifications for note events
     * 
     */
    public Optional<Output<Boolean>> noteEvents() {
        return Optional.ofNullable(this.noteEvents);
    }

    /**
     * Send notifications for broken pipelines
     * 
     */
    @Import(name="notifyOnlyBrokenPipelines")
    private @Nullable Output<Boolean> notifyOnlyBrokenPipelines;

    /**
     * @return Send notifications for broken pipelines
     * 
     */
    public Optional<Output<Boolean>> notifyOnlyBrokenPipelines() {
        return Optional.ofNullable(this.notifyOnlyBrokenPipelines);
    }

    /**
     * Enable notifications for pipeline events
     * 
     */
    @Import(name="pipelineEvents")
    private @Nullable Output<Boolean> pipelineEvents;

    /**
     * @return Enable notifications for pipeline events
     * 
     */
    public Optional<Output<Boolean>> pipelineEvents() {
        return Optional.ofNullable(this.pipelineEvents);
    }

    /**
     * ID of the project you want to activate integration on.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return ID of the project you want to activate integration on.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Enable notifications for push events
     * 
     */
    @Import(name="pushEvents")
    private @Nullable Output<Boolean> pushEvents;

    /**
     * @return Enable notifications for push events
     * 
     */
    public Optional<Output<Boolean>> pushEvents() {
        return Optional.ofNullable(this.pushEvents);
    }

    /**
     * Enable notifications for tag push events
     * 
     */
    @Import(name="tagPushEvents")
    private @Nullable Output<Boolean> tagPushEvents;

    /**
     * @return Enable notifications for tag push events
     * 
     */
    public Optional<Output<Boolean>> tagPushEvents() {
        return Optional.ofNullable(this.tagPushEvents);
    }

    /**
     * Update time.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return Update time.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
     * 
     */
    @Import(name="webhook")
    private @Nullable Output<String> webhook;

    /**
     * @return The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
     * 
     */
    public Optional<Output<String>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    /**
     * Enable notifications for wiki page events
     * 
     */
    @Import(name="wikiPageEvents")
    private @Nullable Output<Boolean> wikiPageEvents;

    /**
     * @return Enable notifications for wiki page events
     * 
     */
    public Optional<Output<Boolean>> wikiPageEvents() {
        return Optional.ofNullable(this.wikiPageEvents);
    }

    private ServiceMicrosoftTeamsState() {}

    private ServiceMicrosoftTeamsState(ServiceMicrosoftTeamsState $) {
        this.active = $.active;
        this.branchesToBeNotified = $.branchesToBeNotified;
        this.confidentialIssuesEvents = $.confidentialIssuesEvents;
        this.confidentialNoteEvents = $.confidentialNoteEvents;
        this.createdAt = $.createdAt;
        this.issuesEvents = $.issuesEvents;
        this.mergeRequestsEvents = $.mergeRequestsEvents;
        this.noteEvents = $.noteEvents;
        this.notifyOnlyBrokenPipelines = $.notifyOnlyBrokenPipelines;
        this.pipelineEvents = $.pipelineEvents;
        this.project = $.project;
        this.pushEvents = $.pushEvents;
        this.tagPushEvents = $.tagPushEvents;
        this.updatedAt = $.updatedAt;
        this.webhook = $.webhook;
        this.wikiPageEvents = $.wikiPageEvents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMicrosoftTeamsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMicrosoftTeamsState $;

        public Builder() {
            $ = new ServiceMicrosoftTeamsState();
        }

        public Builder(ServiceMicrosoftTeamsState defaults) {
            $ = new ServiceMicrosoftTeamsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Whether the integration is active.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Whether the integration is active.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param branchesToBeNotified Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
         * 
         * @return builder
         * 
         */
        public Builder branchesToBeNotified(@Nullable Output<String> branchesToBeNotified) {
            $.branchesToBeNotified = branchesToBeNotified;
            return this;
        }

        /**
         * @param branchesToBeNotified Branches to send notifications for. Valid options are “all”, “default”, “protected”, and “default*and*protected”. The default value is “default”
         * 
         * @return builder
         * 
         */
        public Builder branchesToBeNotified(String branchesToBeNotified) {
            return branchesToBeNotified(Output.of(branchesToBeNotified));
        }

        /**
         * @param confidentialIssuesEvents Enable notifications for confidential issue events
         * 
         * @return builder
         * 
         */
        public Builder confidentialIssuesEvents(@Nullable Output<Boolean> confidentialIssuesEvents) {
            $.confidentialIssuesEvents = confidentialIssuesEvents;
            return this;
        }

        /**
         * @param confidentialIssuesEvents Enable notifications for confidential issue events
         * 
         * @return builder
         * 
         */
        public Builder confidentialIssuesEvents(Boolean confidentialIssuesEvents) {
            return confidentialIssuesEvents(Output.of(confidentialIssuesEvents));
        }

        /**
         * @param confidentialNoteEvents Enable notifications for confidential note events
         * 
         * @return builder
         * 
         */
        public Builder confidentialNoteEvents(@Nullable Output<Boolean> confidentialNoteEvents) {
            $.confidentialNoteEvents = confidentialNoteEvents;
            return this;
        }

        /**
         * @param confidentialNoteEvents Enable notifications for confidential note events
         * 
         * @return builder
         * 
         */
        public Builder confidentialNoteEvents(Boolean confidentialNoteEvents) {
            return confidentialNoteEvents(Output.of(confidentialNoteEvents));
        }

        /**
         * @param createdAt Create time.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Create time.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param issuesEvents Enable notifications for issue events
         * 
         * @return builder
         * 
         */
        public Builder issuesEvents(@Nullable Output<Boolean> issuesEvents) {
            $.issuesEvents = issuesEvents;
            return this;
        }

        /**
         * @param issuesEvents Enable notifications for issue events
         * 
         * @return builder
         * 
         */
        public Builder issuesEvents(Boolean issuesEvents) {
            return issuesEvents(Output.of(issuesEvents));
        }

        /**
         * @param mergeRequestsEvents Enable notifications for merge request events
         * 
         * @return builder
         * 
         */
        public Builder mergeRequestsEvents(@Nullable Output<Boolean> mergeRequestsEvents) {
            $.mergeRequestsEvents = mergeRequestsEvents;
            return this;
        }

        /**
         * @param mergeRequestsEvents Enable notifications for merge request events
         * 
         * @return builder
         * 
         */
        public Builder mergeRequestsEvents(Boolean mergeRequestsEvents) {
            return mergeRequestsEvents(Output.of(mergeRequestsEvents));
        }

        /**
         * @param noteEvents Enable notifications for note events
         * 
         * @return builder
         * 
         */
        public Builder noteEvents(@Nullable Output<Boolean> noteEvents) {
            $.noteEvents = noteEvents;
            return this;
        }

        /**
         * @param noteEvents Enable notifications for note events
         * 
         * @return builder
         * 
         */
        public Builder noteEvents(Boolean noteEvents) {
            return noteEvents(Output.of(noteEvents));
        }

        /**
         * @param notifyOnlyBrokenPipelines Send notifications for broken pipelines
         * 
         * @return builder
         * 
         */
        public Builder notifyOnlyBrokenPipelines(@Nullable Output<Boolean> notifyOnlyBrokenPipelines) {
            $.notifyOnlyBrokenPipelines = notifyOnlyBrokenPipelines;
            return this;
        }

        /**
         * @param notifyOnlyBrokenPipelines Send notifications for broken pipelines
         * 
         * @return builder
         * 
         */
        public Builder notifyOnlyBrokenPipelines(Boolean notifyOnlyBrokenPipelines) {
            return notifyOnlyBrokenPipelines(Output.of(notifyOnlyBrokenPipelines));
        }

        /**
         * @param pipelineEvents Enable notifications for pipeline events
         * 
         * @return builder
         * 
         */
        public Builder pipelineEvents(@Nullable Output<Boolean> pipelineEvents) {
            $.pipelineEvents = pipelineEvents;
            return this;
        }

        /**
         * @param pipelineEvents Enable notifications for pipeline events
         * 
         * @return builder
         * 
         */
        public Builder pipelineEvents(Boolean pipelineEvents) {
            return pipelineEvents(Output.of(pipelineEvents));
        }

        /**
         * @param project ID of the project you want to activate integration on.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project ID of the project you want to activate integration on.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pushEvents Enable notifications for push events
         * 
         * @return builder
         * 
         */
        public Builder pushEvents(@Nullable Output<Boolean> pushEvents) {
            $.pushEvents = pushEvents;
            return this;
        }

        /**
         * @param pushEvents Enable notifications for push events
         * 
         * @return builder
         * 
         */
        public Builder pushEvents(Boolean pushEvents) {
            return pushEvents(Output.of(pushEvents));
        }

        /**
         * @param tagPushEvents Enable notifications for tag push events
         * 
         * @return builder
         * 
         */
        public Builder tagPushEvents(@Nullable Output<Boolean> tagPushEvents) {
            $.tagPushEvents = tagPushEvents;
            return this;
        }

        /**
         * @param tagPushEvents Enable notifications for tag push events
         * 
         * @return builder
         * 
         */
        public Builder tagPushEvents(Boolean tagPushEvents) {
            return tagPushEvents(Output.of(tagPushEvents));
        }

        /**
         * @param updatedAt Update time.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt Update time.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param webhook The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
         * 
         * @return builder
         * 
         */
        public Builder webhook(@Nullable Output<String> webhook) {
            $.webhook = webhook;
            return this;
        }

        /**
         * @param webhook The Microsoft Teams webhook. For example, https://outlook.office.com/webhook/...
         * 
         * @return builder
         * 
         */
        public Builder webhook(String webhook) {
            return webhook(Output.of(webhook));
        }

        /**
         * @param wikiPageEvents Enable notifications for wiki page events
         * 
         * @return builder
         * 
         */
        public Builder wikiPageEvents(@Nullable Output<Boolean> wikiPageEvents) {
            $.wikiPageEvents = wikiPageEvents;
            return this;
        }

        /**
         * @param wikiPageEvents Enable notifications for wiki page events
         * 
         * @return builder
         * 
         */
        public Builder wikiPageEvents(Boolean wikiPageEvents) {
            return wikiPageEvents(Output.of(wikiPageEvents));
        }

        public ServiceMicrosoftTeamsState build() {
            return $;
        }
    }

}
