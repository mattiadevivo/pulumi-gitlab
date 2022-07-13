# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetClusterAgentResult',
    'AwaitableGetClusterAgentResult',
    'get_cluster_agent',
    'get_cluster_agent_output',
]

@pulumi.output_type
class GetClusterAgentResult:
    """
    A collection of values returned by getClusterAgent.
    """
    def __init__(__self__, agent_id=None, created_at=None, created_by_user_id=None, id=None, name=None, project=None):
        if agent_id and not isinstance(agent_id, int):
            raise TypeError("Expected argument 'agent_id' to be a int")
        pulumi.set(__self__, "agent_id", agent_id)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if created_by_user_id and not isinstance(created_by_user_id, int):
            raise TypeError("Expected argument 'created_by_user_id' to be a int")
        pulumi.set(__self__, "created_by_user_id", created_by_user_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> int:
        return pulumi.get(self, "agent_id")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="createdByUserId")
    def created_by_user_id(self) -> int:
        return pulumi.get(self, "created_by_user_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")


class AwaitableGetClusterAgentResult(GetClusterAgentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterAgentResult(
            agent_id=self.agent_id,
            created_at=self.created_at,
            created_by_user_id=self.created_by_user_id,
            id=self.id,
            name=self.name,
            project=self.project)


def get_cluster_agent(agent_id: Optional[int] = None,
                      project: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterAgentResult:
    """
    The `ClusterAgent` data source allows to retrieve details about a GitLab Agent for Kubernetes.

    > Requires at least GitLab 14.10

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/cluster_agents.html)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_cluster_agent(agent_id=1,
        project="12345")
    ```
    """
    __args__ = dict()
    __args__['agentId'] = agent_id
    __args__['project'] = project
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('gitlab:index/getClusterAgent:getClusterAgent', __args__, opts=opts, typ=GetClusterAgentResult).value

    return AwaitableGetClusterAgentResult(
        agent_id=__ret__.agent_id,
        created_at=__ret__.created_at,
        created_by_user_id=__ret__.created_by_user_id,
        id=__ret__.id,
        name=__ret__.name,
        project=__ret__.project)


@_utilities.lift_output_func(get_cluster_agent)
def get_cluster_agent_output(agent_id: Optional[pulumi.Input[int]] = None,
                             project: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterAgentResult]:
    """
    The `ClusterAgent` data source allows to retrieve details about a GitLab Agent for Kubernetes.

    > Requires at least GitLab 14.10

    **Upstream API**: [GitLab REST API docs](https://docs.gitlab.com/ee/api/cluster_agents.html)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gitlab as gitlab

    example = gitlab.get_cluster_agent(agent_id=1,
        project="12345")
    ```
    """
    ...
