// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectFreezePeriodState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectFreezePeriodState Empty = new ProjectFreezePeriodState();

    /**
     * The timezone.
     * 
     */
    @Import(name="cronTimezone")
    private @Nullable Output<String> cronTimezone;

    /**
     * @return The timezone.
     * 
     */
    public Optional<Output<String>> cronTimezone() {
        return Optional.ofNullable(this.cronTimezone);
    }

    /**
     * End of the Freeze Period in cron format (e.g. `0 2 * * *`).
     * 
     */
    @Import(name="freezeEnd")
    private @Nullable Output<String> freezeEnd;

    /**
     * @return End of the Freeze Period in cron format (e.g. `0 2 * * *`).
     * 
     */
    public Optional<Output<String>> freezeEnd() {
        return Optional.ofNullable(this.freezeEnd);
    }

    /**
     * Start of the Freeze Period in cron format (e.g. `0 1 * * *`).
     * 
     */
    @Import(name="freezeStart")
    private @Nullable Output<String> freezeStart;

    /**
     * @return Start of the Freeze Period in cron format (e.g. `0 1 * * *`).
     * 
     */
    public Optional<Output<String>> freezeStart() {
        return Optional.ofNullable(this.freezeStart);
    }

    /**
     * The id of the project to add the schedule to.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The id of the project to add the schedule to.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private ProjectFreezePeriodState() {}

    private ProjectFreezePeriodState(ProjectFreezePeriodState $) {
        this.cronTimezone = $.cronTimezone;
        this.freezeEnd = $.freezeEnd;
        this.freezeStart = $.freezeStart;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectFreezePeriodState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectFreezePeriodState $;

        public Builder() {
            $ = new ProjectFreezePeriodState();
        }

        public Builder(ProjectFreezePeriodState defaults) {
            $ = new ProjectFreezePeriodState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cronTimezone The timezone.
         * 
         * @return builder
         * 
         */
        public Builder cronTimezone(@Nullable Output<String> cronTimezone) {
            $.cronTimezone = cronTimezone;
            return this;
        }

        /**
         * @param cronTimezone The timezone.
         * 
         * @return builder
         * 
         */
        public Builder cronTimezone(String cronTimezone) {
            return cronTimezone(Output.of(cronTimezone));
        }

        /**
         * @param freezeEnd End of the Freeze Period in cron format (e.g. `0 2 * * *`).
         * 
         * @return builder
         * 
         */
        public Builder freezeEnd(@Nullable Output<String> freezeEnd) {
            $.freezeEnd = freezeEnd;
            return this;
        }

        /**
         * @param freezeEnd End of the Freeze Period in cron format (e.g. `0 2 * * *`).
         * 
         * @return builder
         * 
         */
        public Builder freezeEnd(String freezeEnd) {
            return freezeEnd(Output.of(freezeEnd));
        }

        /**
         * @param freezeStart Start of the Freeze Period in cron format (e.g. `0 1 * * *`).
         * 
         * @return builder
         * 
         */
        public Builder freezeStart(@Nullable Output<String> freezeStart) {
            $.freezeStart = freezeStart;
            return this;
        }

        /**
         * @param freezeStart Start of the Freeze Period in cron format (e.g. `0 1 * * *`).
         * 
         * @return builder
         * 
         */
        public Builder freezeStart(String freezeStart) {
            return freezeStart(Output.of(freezeStart));
        }

        /**
         * @param projectId The id of the project to add the schedule to.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The id of the project to add the schedule to.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public ProjectFreezePeriodState build() {
            return $;
        }
    }

}
