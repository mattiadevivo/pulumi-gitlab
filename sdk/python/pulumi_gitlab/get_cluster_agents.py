# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetClusterAgentsResult',
    'AwaitableGetClusterAgentsResult',
    'get_cluster_agents',
    'get_cluster_agents_output',
]

@pulumi.output_type
class GetClusterAgentsResult:
    """
    A collection of values returned by getClusterAgents.
    """
    def __init__(__self__, cluster_agents=None, id=None, project=None):
        if cluster_agents and not isinstance(cluster_agents, list):
            raise TypeError("Expected argument 'cluster_agents' to be a list")
        pulumi.set(__self__, "cluster_agents", cluster_agents)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="clusterAgents")
    def cluster_agents(self) -> Sequence['outputs.GetClusterAgentsClusterAgentResult']:
        return pulumi.get(self, "cluster_agents")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")


class AwaitableGetClusterAgentsResult(GetClusterAgentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterAgentsResult(
            cluster_agents=self.cluster_agents,
            id=self.id,
            project=self.project)


def get_cluster_agents(project: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterAgentsResult:
    """
    The `get_cluster_agents` data source allows details of GitLab Agents for Kubernetes in a project.

    > Requires at least GitLab 14.10

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/cluster_agents.html)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    agents = gitlab.get_cluster_agents(project="12345")
    ```
    """
    __args__ = dict()
    __args__['project'] = project
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('gitlab:index/getClusterAgents:getClusterAgents', __args__, opts=opts, typ=GetClusterAgentsResult).value

    return AwaitableGetClusterAgentsResult(
        cluster_agents=__ret__.cluster_agents,
        id=__ret__.id,
        project=__ret__.project)


@_utilities.lift_output_func(get_cluster_agents)
def get_cluster_agents_output(project: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterAgentsResult]:
    """
    The `get_cluster_agents` data source allows details of GitLab Agents for Kubernetes in a project.

    > Requires at least GitLab 14.10

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/cluster_agents.html)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    agents = gitlab.get_cluster_agents(project="12345")
    ```
    """
    ...
