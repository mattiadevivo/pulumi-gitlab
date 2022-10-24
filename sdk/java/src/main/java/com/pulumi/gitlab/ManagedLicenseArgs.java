// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gitlab;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedLicenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedLicenseArgs Empty = new ManagedLicenseArgs();

    /**
     * The approval status of the license. Valid values are: `approved`, `blacklisted`, `allowed`, `denied`. &#34;approved&#34; and &#34;blacklisted&#34;
     * 			have been deprecated in favor of &#34;allowed&#34; and &#34;denied&#34;; use &#34;allowed&#34; and &#34;denied&#34; for GitLab versions 15.0 and higher.
     * 			Prior to version 15.0 and after 14.6, the values are equivalent.
     * 
     */
    @Import(name="approvalStatus", required=true)
    private Output<String> approvalStatus;

    /**
     * @return The approval status of the license. Valid values are: `approved`, `blacklisted`, `allowed`, `denied`. &#34;approved&#34; and &#34;blacklisted&#34;
     * 			have been deprecated in favor of &#34;allowed&#34; and &#34;denied&#34;; use &#34;allowed&#34; and &#34;denied&#34; for GitLab versions 15.0 and higher.
     * 			Prior to version 15.0 and after 14.6, the values are equivalent.
     * 
     */
    public Output<String> approvalStatus() {
        return this.approvalStatus;
    }

    /**
     * The name of the managed license (I.e., &#39;Apache License 2.0&#39; or &#39;MIT license&#39;)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the managed license (I.e., &#39;Apache License 2.0&#39; or &#39;MIT license&#39;)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project under which the managed license will be created.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The ID of the project under which the managed license will be created.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    private ManagedLicenseArgs() {}

    private ManagedLicenseArgs(ManagedLicenseArgs $) {
        this.approvalStatus = $.approvalStatus;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedLicenseArgs $;

        public Builder() {
            $ = new ManagedLicenseArgs();
        }

        public Builder(ManagedLicenseArgs defaults) {
            $ = new ManagedLicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param approvalStatus The approval status of the license. Valid values are: `approved`, `blacklisted`, `allowed`, `denied`. &#34;approved&#34; and &#34;blacklisted&#34;
         * 			have been deprecated in favor of &#34;allowed&#34; and &#34;denied&#34;; use &#34;allowed&#34; and &#34;denied&#34; for GitLab versions 15.0 and higher.
         * 			Prior to version 15.0 and after 14.6, the values are equivalent.
         * 
         * @return builder
         * 
         */
        public Builder approvalStatus(Output<String> approvalStatus) {
            $.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * @param approvalStatus The approval status of the license. Valid values are: `approved`, `blacklisted`, `allowed`, `denied`. &#34;approved&#34; and &#34;blacklisted&#34;
         * 			have been deprecated in favor of &#34;allowed&#34; and &#34;denied&#34;; use &#34;allowed&#34; and &#34;denied&#34; for GitLab versions 15.0 and higher.
         * 			Prior to version 15.0 and after 14.6, the values are equivalent.
         * 
         * @return builder
         * 
         */
        public Builder approvalStatus(String approvalStatus) {
            return approvalStatus(Output.of(approvalStatus));
        }

        /**
         * @param name The name of the managed license (I.e., &#39;Apache License 2.0&#39; or &#39;MIT license&#39;)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the managed license (I.e., &#39;Apache License 2.0&#39; or &#39;MIT license&#39;)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project under which the managed license will be created.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project under which the managed license will be created.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ManagedLicenseArgs build() {
            $.approvalStatus = Objects.requireNonNull($.approvalStatus, "expected parameter 'approvalStatus' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
