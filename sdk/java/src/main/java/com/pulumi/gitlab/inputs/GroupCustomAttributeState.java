// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupCustomAttributeState extends com.pulumi.resources.ResourceArgs {

    public static final GroupCustomAttributeState Empty = new GroupCustomAttributeState();

    /**
     * The id of the group.
     * 
     */
    @Import(name="group")
    private @Nullable Output<Integer> group;

    /**
     * @return The id of the group.
     * 
     */
    public Optional<Output<Integer>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * Key for the Custom Attribute.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key for the Custom Attribute.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Value for the Custom Attribute.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value for the Custom Attribute.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GroupCustomAttributeState() {}

    private GroupCustomAttributeState(GroupCustomAttributeState $) {
        this.group = $.group;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupCustomAttributeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupCustomAttributeState $;

        public Builder() {
            $ = new GroupCustomAttributeState();
        }

        public Builder(GroupCustomAttributeState defaults) {
            $ = new GroupCustomAttributeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The id of the group.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<Integer> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The id of the group.
         * 
         * @return builder
         * 
         */
        public Builder group(Integer group) {
            return group(Output.of(group));
        }

        /**
         * @param key Key for the Custom Attribute.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key for the Custom Attribute.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value for the Custom Attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value for the Custom Attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GroupCustomAttributeState build() {
            return $;
        }
    }

}
