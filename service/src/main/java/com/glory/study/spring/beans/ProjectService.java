package com.glory.study.spring.beans;

import com.glory.study.spring.po.Project;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangch on 2016/9/9.
 */
public class ProjectService extends ProjectApi implements IProject {
    private Map<Integer, Project> map = new HashMap<Integer, Project>();

    {
        map.put(1, new Project(1, "one"));
        map.put(2, new Project(2, "two"));
    }

    public Project get(int id) {
        return map.get(id);
    }

    public void print() {

    }

}
