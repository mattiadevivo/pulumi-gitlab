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


public final class ProjectEnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentState Empty = new ProjectEnvironmentState();

    /**
     * The ISO8601 date/time that this environment was created at in UTC.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The ISO8601 date/time that this environment was created at in UTC.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Place to link to for this environment.
     * 
     */
    @Import(name="externalUrl")
    private @Nullable Output<String> externalUrl;

    /**
     * @return Place to link to for this environment.
     * 
     */
    public Optional<Output<String>> externalUrl() {
        return Optional.ofNullable(this.externalUrl);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID or full path of the project to environment is created for.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID or full path of the project to environment is created for.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -. No leading / trailing -. Use in URLs, host names and domain names.
     * 
     */
    @Import(name="slug")
    private @Nullable Output<String> slug;

    /**
     * @return The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -. No leading / trailing -. Use in URLs, host names and domain names.
     * 
     */
    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    /**
     * State the environment is in. Valid values are `available`, `stopped`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State the environment is in. Valid values are `available`, `stopped`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Determines whether the environment is attempted to be stopped before the environment is deleted.
     * 
     */
    @Import(name="stopBeforeDestroy")
    private @Nullable Output<Boolean> stopBeforeDestroy;

    /**
     * @return Determines whether the environment is attempted to be stopped before the environment is deleted.
     * 
     */
    public Optional<Output<Boolean>> stopBeforeDestroy() {
        return Optional.ofNullable(this.stopBeforeDestroy);
    }

    /**
     * The ISO8601 date/time that this environment was last updated at in UTC.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The ISO8601 date/time that this environment was last updated at in UTC.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private ProjectEnvironmentState() {}

    private ProjectEnvironmentState(ProjectEnvironmentState $) {
        this.createdAt = $.createdAt;
        this.externalUrl = $.externalUrl;
        this.name = $.name;
        this.project = $.project;
        this.slug = $.slug;
        this.state = $.state;
        this.stopBeforeDestroy = $.stopBeforeDestroy;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectEnvironmentState $;

        public Builder() {
            $ = new ProjectEnvironmentState();
        }

        public Builder(ProjectEnvironmentState defaults) {
            $ = new ProjectEnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The ISO8601 date/time that this environment was created at in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The ISO8601 date/time that this environment was created at in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param externalUrl Place to link to for this environment.
         * 
         * @return builder
         * 
         */
        public Builder externalUrl(@Nullable Output<String> externalUrl) {
            $.externalUrl = externalUrl;
            return this;
        }

        /**
         * @param externalUrl Place to link to for this environment.
         * 
         * @return builder
         * 
         */
        public Builder externalUrl(String externalUrl) {
            return externalUrl(Output.of(externalUrl));
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID or full path of the project to environment is created for.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID or full path of the project to environment is created for.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param slug The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -. No leading / trailing -. Use in URLs, host names and domain names.
         * 
         * @return builder
         * 
         */
        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        /**
         * @param slug The name of the environment in lowercase, shortened to 63 bytes, and with everything except 0-9 and a-z replaced with -. No leading / trailing -. Use in URLs, host names and domain names.
         * 
         * @return builder
         * 
         */
        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        /**
         * @param state State the environment is in. Valid values are `available`, `stopped`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State the environment is in. Valid values are `available`, `stopped`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stopBeforeDestroy Determines whether the environment is attempted to be stopped before the environment is deleted.
         * 
         * @return builder
         * 
         */
        public Builder stopBeforeDestroy(@Nullable Output<Boolean> stopBeforeDestroy) {
            $.stopBeforeDestroy = stopBeforeDestroy;
            return this;
        }

        /**
         * @param stopBeforeDestroy Determines whether the environment is attempted to be stopped before the environment is deleted.
         * 
         * @return builder
         * 
         */
        public Builder stopBeforeDestroy(Boolean stopBeforeDestroy) {
            return stopBeforeDestroy(Output.of(stopBeforeDestroy));
        }

        /**
         * @param updatedAt The ISO8601 date/time that this environment was last updated at in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The ISO8601 date/time that this environment was last updated at in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public ProjectEnvironmentState build() {
            return $;
        }
    }

}
