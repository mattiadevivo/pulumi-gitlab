// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gitlab

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `getMetadata` data source retrieves the metadata of the GitLab instance.
//
// **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/metadata.html)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gitlab/sdk/v6/go/gitlab"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gitlab.GetMetadata(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetMetadata(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetMetadataResult, error) {
	var rv GetMetadataResult
	err := ctx.Invoke("gitlab:index/getMetadata:getMetadata", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getMetadata.
type GetMetadataResult struct {
	// If the GitLab instance is an enterprise instance or not. Supported for GitLab 15.6 onwards.
	Enterprise bool `pulumi:"enterprise"`
	// The id of the data source. It will always be `1`
	Id string `pulumi:"id"`
	// Metadata about the GitLab agent server for Kubernetes (KAS).
	Kas GetMetadataKas `pulumi:"kas"`
	// Revision of the GitLab instance.
	Revision string `pulumi:"revision"`
	// Version of the GitLab instance.
	Version string `pulumi:"version"`
}
