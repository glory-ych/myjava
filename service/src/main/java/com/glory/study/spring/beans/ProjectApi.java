package com.glory.study.spring.beans;

import com.glory.study.annotation.MyResource;
import com.glory.study.spring.po.Project;

/**
 * Created by yangch on 2016/9/12.
 */
public class ProjectApi {
    @MyResource
    private ProjectService projectService;
    public ProjectService getProjectService() {
        return projectService;
    }

    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    public Project get(int id) {
        return projectService.get(id);
    }
}
