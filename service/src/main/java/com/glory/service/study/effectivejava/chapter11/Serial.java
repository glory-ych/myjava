package com.glory.service.study.effectivejava.chapter11;

import java.io.Serializable;

/**
 * Created by yangch on 2016/11/11 0011.
 */
public class Serial implements Serializable {
    private static final long serialVersionUID = -8261682293269981933L;
    /**   *   */
    int id;
    String name;
    public Serial(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "DATA: " + id + " " + name;
    }

    public String getThisName(){
        return name;
    }

    public Object print(int i,Object name){
        System.out.println(name);
        return null;
    }
}