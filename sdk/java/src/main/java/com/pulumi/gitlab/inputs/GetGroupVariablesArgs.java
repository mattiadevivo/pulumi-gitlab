// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupVariablesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupVariablesArgs Empty = new GetGroupVariablesArgs();

    /**
     * The environment scope of the variable. Defaults to all environment (`*`).
     * 
     */
    @Import(name="environmentScope")
    private @Nullable Output<String> environmentScope;

    /**
     * @return The environment scope of the variable. Defaults to all environment (`*`).
     * 
     */
    public Optional<Output<String>> environmentScope() {
        return Optional.ofNullable(this.environmentScope);
    }

    /**
     * The name or id of the group.
     * 
     */
    @Import(name="group", required=true)
    private Output<String> group;

    /**
     * @return The name or id of the group.
     * 
     */
    public Output<String> group() {
        return this.group;
    }

    private GetGroupVariablesArgs() {}

    private GetGroupVariablesArgs(GetGroupVariablesArgs $) {
        this.environmentScope = $.environmentScope;
        this.group = $.group;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupVariablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupVariablesArgs $;

        public Builder() {
            $ = new GetGroupVariablesArgs();
        }

        public Builder(GetGroupVariablesArgs defaults) {
            $ = new GetGroupVariablesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentScope The environment scope of the variable. Defaults to all environment (`*`).
         * 
         * @return builder
         * 
         */
        public Builder environmentScope(@Nullable Output<String> environmentScope) {
            $.environmentScope = environmentScope;
            return this;
        }

        /**
         * @param environmentScope The environment scope of the variable. Defaults to all environment (`*`).
         * 
         * @return builder
         * 
         */
        public Builder environmentScope(String environmentScope) {
            return environmentScope(Output.of(environmentScope));
        }

        /**
         * @param group The name or id of the group.
         * 
         * @return builder
         * 
         */
        public Builder group(Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The name or id of the group.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        public GetGroupVariablesArgs build() {
            $.group = Objects.requireNonNull($.group, "expected parameter 'group' to be non-null");
            return $;
        }
    }

}
