package com.glory.service.study.classloader;

/**
 * Created by yangch on 2016/11/1 0001.
 */
public class Sample {
    public Sample(){
        System.out.println("Sample is loaded by " + this.getClass().getClassLoader());
        new Other();
    }
}
