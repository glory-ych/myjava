package com.glory.study.spring.po;

/**
 * Created by yangch on 2016/9/9.
 */
public class Project {
    private int id;
    private String name;

    public Project() {
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
