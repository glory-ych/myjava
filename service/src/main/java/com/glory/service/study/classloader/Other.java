package com.glory.service.study.classloader;

/**
 * Created by yangch on 2016/11/1 0001.
 */
public class Other {
    public Other(){
        System.out.println("Other is loaded by " + this.getClass().getClassLoader());
    }
}
