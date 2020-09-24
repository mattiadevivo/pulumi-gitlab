// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface GetGroupMembershipMember {
    /**
     * Only return members with the desidered access level. Acceptable values are: `guest`, `reporter`, `developer`, `maintainer`, `owner`.
     */
    accessLevel: string;
    /**
     * The avatar URL of the user.
     */
    avatarUrl: string;
    /**
     * Expiration date for the group membership.
     */
    expiresAt: string;
    /**
     * The unique id assigned to the user by the gitlab server.
     */
    id: number;
    /**
     * The name of the user.
     */
    name: string;
    /**
     * Whether the user is active or blocked.
     */
    state: string;
    /**
     * The username of the user.
     */
    username: string;
    /**
     * User's website URL.
     */
    webUrl: string;
}

export interface GetProjectPushRules {
    /**
     * All commit author emails must match this regex, e.g. `@my-company.com$`.
     */
    authorEmailRegex: string;
    /**
     * All branch names must match this regex, e.g. `(feature|hotfix)\/*`.
     */
    branchNameRegex: string;
    /**
     * Users can only push commits to this repository that were committed with one of their own verified emails.
     */
    commitCommitterCheck: boolean;
    /**
     * No commit message is allowed to match this regex, for example `ssh\:\/\/`.
     */
    commitMessageNegativeRegex: string;
    /**
     * All commit messages must match this regex, e.g. `Fixed \d+\..*`.
     */
    commitMessageRegex: string;
    /**
     * Deny deleting a tag.
     */
    denyDeleteTag: boolean;
    /**
     * All commited filenames must not match this regex, e.g. `(jar|exe)$`.
     */
    fileNameRegex: string;
    /**
     * Maximum file size (MB).
     */
    maxFileSize: number;
    /**
     * Restrict commits by author (email) to existing GitLab users.
     */
    memberCheck: boolean;
    /**
     * GitLab will reject any files that are likely to contain secrets.
     */
    preventSecrets: boolean;
    /**
     * Reject commit when it’s not signed through GPG.
     */
    rejectUnsignedCommits: boolean;
}

export interface GetProjectsProject {
    _links: {[key: string]: string};
    /**
     * The numbers of approvals needed in a merge requests.
     */
    approvalsBeforeMerge: number;
    /**
     * Limit by archived status.
     */
    archived: boolean;
    avatarUrl: string;
    ciConfigPath: string;
    containerRegistryEnabled: boolean;
    createdAt: string;
    creatorId: number;
    customAttributes: {[key: string]: any}[];
    defaultBranch: string;
    description: string;
    forkedFromProject: outputs.GetProjectsProjectForkedFromProject;
    forksCount: number;
    /**
     * The HTTP clone URL of the project.
     */
    httpUrlToRepo: string;
    /**
     * The ID of the project.
     */
    id: number;
    importError: string;
    importStatus: string;
    issuesEnabled: boolean;
    /**
     * Whether pipelines are enabled for the project.
     */
    jobsEnabled: boolean;
    lastActivityAt: string;
    lfsEnabled: boolean;
    mergeMethod: string;
    mergeRequestsEnabled: boolean;
    mirror: boolean;
    mirrorOverwritesDivergedBranches: boolean;
    mirrorTriggerBuilds: boolean;
    mirrorUserId: number;
    /**
     * The name of the project.
     */
    name: string;
    /**
     * In `group / subgroup / project` or `user / project` format.
     */
    nameWithNamespace: string;
    namespace: outputs.GetProjectsProjectNamespace;
    onlyAllowMergeIfAllDiscussionsAreResolved: boolean;
    onlyAllowMergeIfPipelineSucceeds: boolean;
    onlyMirrorProtectedBranches: boolean;
    openIssuesCount: number;
    owner: outputs.GetProjectsProjectOwner;
    packagesEnabled: boolean;
    path: string;
    /**
     * In `group/subgroup/project` or `user/project` format.
     */
    pathWithNamespace: string;
    permissions: outputs.GetProjectsProjectPermissions;
    /**
     * Whether the project is public.
     */
    public: boolean;
    publicBuilds: boolean;
    readmeUrl: string;
    requestAccessEnabled: boolean;
    resolveOutdatedDiffDiscussions: boolean;
    runnersToken: string;
    sharedRunnersEnabled: boolean;
    sharedWithGroups: outputs.GetProjectsProjectSharedWithGroup[];
    snippetsEnabled: boolean;
    /**
     * The SSH clone URL of the project.
     */
    sshUrlToRepo: string;
    starCount: number;
    /**
     * Include project statistics. Cannot be used with `groupId`.
     */
    statistics: {[key: string]: number};
    /**
     * A set of the project topics (formerly called "project tags").
     */
    tagLists: string[];
    /**
     * Limit by visibility `public`, `internal`, or `private`.
     */
    visibility: string;
    webUrl: string;
    wikiEnabled: boolean;
}

export interface GetProjectsProjectForkedFromProject {
    /**
     * The HTTP clone URL of the project.
     */
    httpUrlToRepo: string;
    /**
     * The ID of the project.
     */
    id: number;
    /**
     * The name of the project.
     */
    name: string;
    /**
     * In `group / subgroup / project` or `user / project` format.
     */
    nameWithNamespace: string;
    path: string;
    /**
     * In `group/subgroup/project` or `user/project` format.
     */
    pathWithNamespace: string;
    webUrl: string;
}

export interface GetProjectsProjectNamespace {
    fullPath: string;
    /**
     * The ID of the project.
     */
    id: number;
    kind: string;
    /**
     * The name of the project.
     */
    name: string;
    path: string;
}

export interface GetProjectsProjectOwner {
    avatarUrl: string;
    /**
     * The ID of the project.
     */
    id: number;
    /**
     * The name of the project.
     */
    name: string;
    state: string;
    username: string;
    websiteUrl: string;
}

export interface GetProjectsProjectPermissions {
    groupAccess: {[key: string]: number};
    projectAccess: {[key: string]: number};
}

export interface GetProjectsProjectSharedWithGroup {
    groupAccessLevel: string;
    /**
     * The ID of the group owned by the authenticated user to look projects for within. Cannot be used with `minAccessLevel`, `withProgrammingLanguage` or `statistics`.
     */
    groupId: number;
    groupName: string;
}

export interface GetUsersUser {
    /**
     * The avatar URL of the user.
     */
    avatarUrl: string;
    /**
     * The bio of the user.
     */
    bio: string;
    /**
     * Whether the user can create groups.
     */
    canCreateGroup: boolean;
    /**
     * Whether the user can create projects.
     */
    canCreateProject: boolean;
    /**
     * User's color scheme ID.
     */
    colorSchemeId: number;
    /**
     * Date the user was created at.
     */
    createdAt: string;
    /**
     * Current user's sign-in date.
     */
    currentSignInAt: string;
    /**
     * The e-mail address of the user.
     */
    email: string;
    /**
     * Lookup users by external UID. (Requires administrator privileges)
     */
    externUid: string;
    /**
     * Whether the user is external.
     */
    external: boolean;
    /**
     * The unique id assigned to the user by the gitlab server.
     */
    id: number;
    /**
     * Whether the user is an admin.
     */
    isAdmin: boolean;
    /**
     * Last user's sign-in date.
     */
    lastSignInAt: string;
    /**
     * Linkedin profile of the user.
     */
    linkedin: string;
    /**
     * The location of the user.
     */
    location: string;
    /**
     * The name of the user.
     */
    name: string;
    /**
     * The organization of the user.
     */
    organization: string;
    /**
     * Number of projects the user can create.
     */
    projectsLimit: number;
    /**
     * The UID provider of the user.
     */
    provider: string;
    /**
     * Skype username of the user.
     */
    skype: string;
    /**
     * Whether the user is active or blocked.
     */
    state: string;
    /**
     * User's theme ID.
     */
    themeId: number;
    /**
     * Twitter username of the user.
     */
    twitter: string;
    /**
     * Whether user's two factor auth is enabled.
     */
    twoFactorEnabled: boolean;
    /**
     * The username of the user.
     */
    username: string;
    /**
     * User's website URL.
     */
    websiteUrl: string;
}

export interface ProjectPushRules {
    /**
     * All commit author emails must match this regex, e.g. `@my-company.com$`.
     */
    authorEmailRegex?: string;
    /**
     * All branch names must match this regex, e.g. `(feature|hotfix)\/*`.
     */
    branchNameRegex?: string;
    /**
     * Users can only push commits to this repository that were committed with one of their own verified emails.
     */
    commitCommitterCheck?: boolean;
    /**
     * No commit message is allowed to match this regex, for example `ssh\:\/\/`.
     */
    commitMessageNegativeRegex?: string;
    /**
     * All commit messages must match this regex, e.g. `Fixed \d+\..*`.
     */
    commitMessageRegex?: string;
    /**
     * Deny deleting a tag.
     */
    denyDeleteTag?: boolean;
    /**
     * All commited filenames must not match this regex, e.g. `(jar|exe)$`.
     */
    fileNameRegex?: string;
    /**
     * Maximum file size (MB).
     */
    maxFileSize?: number;
    /**
     * Restrict commits by author (email) to existing GitLab users.
     */
    memberCheck?: boolean;
    /**
     * GitLab will reject any files that are likely to contain secrets.
     */
    preventSecrets?: boolean;
    /**
     * Reject commit when it’s not signed through GPG.
     */
    rejectUnsignedCommits?: boolean;
}
