// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.GitLab
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("gitlab");

        private static readonly __Value<string?> _baseUrl = new __Value<string?>(() => __config.Get("baseUrl"));
        /// <summary>
        /// This is the target GitLab base API endpoint. Providing a value is a requirement when working with GitLab CE or GitLab
        /// Enterprise e.g. `https://my.gitlab.server/api/v4/`. It is optional to provide this value and it can also be sourced from
        /// the `GITLAB_BASE_URL` environment variable. The value must end with a slash.
        /// </summary>
        public static string? BaseUrl
        {
            get => _baseUrl.Get();
            set => _baseUrl.Set(value);
        }

        private static readonly __Value<string?> _cacertFile = new __Value<string?>(() => __config.Get("cacertFile"));
        /// <summary>
        /// This is a file containing the ca cert to verify the gitlab instance. This is available for use when working with GitLab
        /// CE or Gitlab Enterprise with a locally-issued or self-signed certificate chain.
        /// </summary>
        public static string? CacertFile
        {
            get => _cacertFile.Get();
            set => _cacertFile.Set(value);
        }

        private static readonly __Value<string?> _clientCert = new __Value<string?>(() => __config.Get("clientCert"));
        /// <summary>
        /// File path to client certificate when GitLab instance is behind company proxy. File must contain PEM encoded data.
        /// </summary>
        public static string? ClientCert
        {
            get => _clientCert.Get();
            set => _clientCert.Set(value);
        }

        private static readonly __Value<string?> _clientKey = new __Value<string?>(() => __config.Get("clientKey"));
        /// <summary>
        /// File path to client key when GitLab instance is behind company proxy. File must contain PEM encoded data. Required when
        /// `client_cert` is set.
        /// </summary>
        public static string? ClientKey
        {
            get => _clientKey.Get();
            set => _clientKey.Set(value);
        }

        private static readonly __Value<bool?> _earlyAuthCheck = new __Value<bool?>(() => __config.GetBoolean("earlyAuthCheck"));
        /// <summary>
        /// (Experimental) By default the provider does a dummy request to get the current user in order to verify that the provider
        /// configuration is correct and the GitLab API is reachable. Turn it off, to skip this check. This may be useful if the
        /// GitLab instance does not yet exist and is created within the same terraform module. This is an experimental feature and
        /// may change in the future. Please make sure to always keep backups of your state.
        /// </summary>
        public static bool? EarlyAuthCheck
        {
            get => _earlyAuthCheck.Get();
            set => _earlyAuthCheck.Set(value);
        }

        private static readonly __Value<bool?> _insecure = new __Value<bool?>(() => __config.GetBoolean("insecure"));
        /// <summary>
        /// When set to true this disables SSL verification of the connection to the GitLab instance.
        /// </summary>
        public static bool? Insecure
        {
            get => _insecure.Get();
            set => _insecure.Set(value);
        }

        private static readonly __Value<string?> _token = new __Value<string?>(() => __config.Get("token"));
        /// <summary>
        /// The OAuth2 Token, Project, Group, Personal Access Token or CI Job Token used to connect to GitLab. The OAuth method is
        /// used in this provider for authentication (using Bearer authorization token). See
        /// https://docs.gitlab.com/ee/api/#authentication for details. It may be sourced from the `GITLAB_TOKEN` environment
        /// variable.
        /// </summary>
        public static string? Token
        {
            get => _token.Get();
            set => _token.Set(value);
        }

    }
}
