// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemHookArgs Empty = new SystemHookArgs();

    /**
     * Do SSL verification when triggering the hook.
     * 
     */
    @Import(name="enableSslVerification")
    private @Nullable Output<Boolean> enableSslVerification;

    /**
     * @return Do SSL verification when triggering the hook.
     * 
     */
    public Optional<Output<Boolean>> enableSslVerification() {
        return Optional.ofNullable(this.enableSslVerification);
    }

    /**
     * Trigger hook on merge requests events.
     * 
     */
    @Import(name="mergeRequestsEvents")
    private @Nullable Output<Boolean> mergeRequestsEvents;

    /**
     * @return Trigger hook on merge requests events.
     * 
     */
    public Optional<Output<Boolean>> mergeRequestsEvents() {
        return Optional.ofNullable(this.mergeRequestsEvents);
    }

    /**
     * When true, the hook fires on push events.
     * 
     */
    @Import(name="pushEvents")
    private @Nullable Output<Boolean> pushEvents;

    /**
     * @return When true, the hook fires on push events.
     * 
     */
    public Optional<Output<Boolean>> pushEvents() {
        return Optional.ofNullable(this.pushEvents);
    }

    /**
     * Trigger hook on repository update events.
     * 
     */
    @Import(name="repositoryUpdateEvents")
    private @Nullable Output<Boolean> repositoryUpdateEvents;

    /**
     * @return Trigger hook on repository update events.
     * 
     */
    public Optional<Output<Boolean>> repositoryUpdateEvents() {
        return Optional.ofNullable(this.repositoryUpdateEvents);
    }

    /**
     * When true, the hook fires on new tags being pushed.
     * 
     */
    @Import(name="tagPushEvents")
    private @Nullable Output<Boolean> tagPushEvents;

    /**
     * @return When true, the hook fires on new tags being pushed.
     * 
     */
    public Optional<Output<Boolean>> tagPushEvents() {
        return Optional.ofNullable(this.tagPushEvents);
    }

    /**
     * Secret token to validate received payloads; this isn’t returned in the response. This attribute is not available for imported resources.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Secret token to validate received payloads; this isn’t returned in the response. This attribute is not available for imported resources.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * The hook URL.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The hook URL.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private SystemHookArgs() {}

    private SystemHookArgs(SystemHookArgs $) {
        this.enableSslVerification = $.enableSslVerification;
        this.mergeRequestsEvents = $.mergeRequestsEvents;
        this.pushEvents = $.pushEvents;
        this.repositoryUpdateEvents = $.repositoryUpdateEvents;
        this.tagPushEvents = $.tagPushEvents;
        this.token = $.token;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemHookArgs $;

        public Builder() {
            $ = new SystemHookArgs();
        }

        public Builder(SystemHookArgs defaults) {
            $ = new SystemHookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableSslVerification Do SSL verification when triggering the hook.
         * 
         * @return builder
         * 
         */
        public Builder enableSslVerification(@Nullable Output<Boolean> enableSslVerification) {
            $.enableSslVerification = enableSslVerification;
            return this;
        }

        /**
         * @param enableSslVerification Do SSL verification when triggering the hook.
         * 
         * @return builder
         * 
         */
        public Builder enableSslVerification(Boolean enableSslVerification) {
            return enableSslVerification(Output.of(enableSslVerification));
        }

        /**
         * @param mergeRequestsEvents Trigger hook on merge requests events.
         * 
         * @return builder
         * 
         */
        public Builder mergeRequestsEvents(@Nullable Output<Boolean> mergeRequestsEvents) {
            $.mergeRequestsEvents = mergeRequestsEvents;
            return this;
        }

        /**
         * @param mergeRequestsEvents Trigger hook on merge requests events.
         * 
         * @return builder
         * 
         */
        public Builder mergeRequestsEvents(Boolean mergeRequestsEvents) {
            return mergeRequestsEvents(Output.of(mergeRequestsEvents));
        }

        /**
         * @param pushEvents When true, the hook fires on push events.
         * 
         * @return builder
         * 
         */
        public Builder pushEvents(@Nullable Output<Boolean> pushEvents) {
            $.pushEvents = pushEvents;
            return this;
        }

        /**
         * @param pushEvents When true, the hook fires on push events.
         * 
         * @return builder
         * 
         */
        public Builder pushEvents(Boolean pushEvents) {
            return pushEvents(Output.of(pushEvents));
        }

        /**
         * @param repositoryUpdateEvents Trigger hook on repository update events.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUpdateEvents(@Nullable Output<Boolean> repositoryUpdateEvents) {
            $.repositoryUpdateEvents = repositoryUpdateEvents;
            return this;
        }

        /**
         * @param repositoryUpdateEvents Trigger hook on repository update events.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUpdateEvents(Boolean repositoryUpdateEvents) {
            return repositoryUpdateEvents(Output.of(repositoryUpdateEvents));
        }

        /**
         * @param tagPushEvents When true, the hook fires on new tags being pushed.
         * 
         * @return builder
         * 
         */
        public Builder tagPushEvents(@Nullable Output<Boolean> tagPushEvents) {
            $.tagPushEvents = tagPushEvents;
            return this;
        }

        /**
         * @param tagPushEvents When true, the hook fires on new tags being pushed.
         * 
         * @return builder
         * 
         */
        public Builder tagPushEvents(Boolean tagPushEvents) {
            return tagPushEvents(Output.of(tagPushEvents));
        }

        /**
         * @param token Secret token to validate received payloads; this isn’t returned in the response. This attribute is not available for imported resources.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Secret token to validate received payloads; this isn’t returned in the response. This attribute is not available for imported resources.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param url The hook URL.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The hook URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public SystemHookArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
