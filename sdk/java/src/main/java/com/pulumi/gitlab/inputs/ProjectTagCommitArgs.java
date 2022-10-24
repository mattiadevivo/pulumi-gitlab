// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectTagCommitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectTagCommitArgs Empty = new ProjectTagCommitArgs();

    @Import(name="authorEmail")
    private @Nullable Output<String> authorEmail;

    public Optional<Output<String>> authorEmail() {
        return Optional.ofNullable(this.authorEmail);
    }

    @Import(name="authorName")
    private @Nullable Output<String> authorName;

    public Optional<Output<String>> authorName() {
        return Optional.ofNullable(this.authorName);
    }

    @Import(name="authoredDate")
    private @Nullable Output<String> authoredDate;

    public Optional<Output<String>> authoredDate() {
        return Optional.ofNullable(this.authoredDate);
    }

    @Import(name="committedDate")
    private @Nullable Output<String> committedDate;

    public Optional<Output<String>> committedDate() {
        return Optional.ofNullable(this.committedDate);
    }

    @Import(name="committerEmail")
    private @Nullable Output<String> committerEmail;

    public Optional<Output<String>> committerEmail() {
        return Optional.ofNullable(this.committerEmail);
    }

    @Import(name="committerName")
    private @Nullable Output<String> committerName;

    public Optional<Output<String>> committerName() {
        return Optional.ofNullable(this.committerName);
    }

    /**
     * The ID of this resource.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of this resource.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The message of the annotated tag.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return The message of the annotated tag.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="parentIds")
    private @Nullable Output<List<String>> parentIds;

    public Optional<Output<List<String>>> parentIds() {
        return Optional.ofNullable(this.parentIds);
    }

    @Import(name="shortId")
    private @Nullable Output<String> shortId;

    public Optional<Output<String>> shortId() {
        return Optional.ofNullable(this.shortId);
    }

    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private ProjectTagCommitArgs() {}

    private ProjectTagCommitArgs(ProjectTagCommitArgs $) {
        this.authorEmail = $.authorEmail;
        this.authorName = $.authorName;
        this.authoredDate = $.authoredDate;
        this.committedDate = $.committedDate;
        this.committerEmail = $.committerEmail;
        this.committerName = $.committerName;
        this.id = $.id;
        this.message = $.message;
        this.parentIds = $.parentIds;
        this.shortId = $.shortId;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectTagCommitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectTagCommitArgs $;

        public Builder() {
            $ = new ProjectTagCommitArgs();
        }

        public Builder(ProjectTagCommitArgs defaults) {
            $ = new ProjectTagCommitArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorEmail(@Nullable Output<String> authorEmail) {
            $.authorEmail = authorEmail;
            return this;
        }

        public Builder authorEmail(String authorEmail) {
            return authorEmail(Output.of(authorEmail));
        }

        public Builder authorName(@Nullable Output<String> authorName) {
            $.authorName = authorName;
            return this;
        }

        public Builder authorName(String authorName) {
            return authorName(Output.of(authorName));
        }

        public Builder authoredDate(@Nullable Output<String> authoredDate) {
            $.authoredDate = authoredDate;
            return this;
        }

        public Builder authoredDate(String authoredDate) {
            return authoredDate(Output.of(authoredDate));
        }

        public Builder committedDate(@Nullable Output<String> committedDate) {
            $.committedDate = committedDate;
            return this;
        }

        public Builder committedDate(String committedDate) {
            return committedDate(Output.of(committedDate));
        }

        public Builder committerEmail(@Nullable Output<String> committerEmail) {
            $.committerEmail = committerEmail;
            return this;
        }

        public Builder committerEmail(String committerEmail) {
            return committerEmail(Output.of(committerEmail));
        }

        public Builder committerName(@Nullable Output<String> committerName) {
            $.committerName = committerName;
            return this;
        }

        public Builder committerName(String committerName) {
            return committerName(Output.of(committerName));
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param message The message of the annotated tag.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The message of the annotated tag.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder parentIds(@Nullable Output<List<String>> parentIds) {
            $.parentIds = parentIds;
            return this;
        }

        public Builder parentIds(List<String> parentIds) {
            return parentIds(Output.of(parentIds));
        }

        public Builder parentIds(String... parentIds) {
            return parentIds(List.of(parentIds));
        }

        public Builder shortId(@Nullable Output<String> shortId) {
            $.shortId = shortId;
            return this;
        }

        public Builder shortId(String shortId) {
            return shortId(Output.of(shortId));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public ProjectTagCommitArgs build() {
            return $;
        }
    }

}
