package com.glory.service.study.other;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by yangch on 2016/12/14 0014.
 */
public class SystemDemo {

    @Test
    public void demo01() throws Exception {
        //System.out.println(System.getProperty("java.class.version2","version"));
        //System.setProperty("ych.name","ych");
        //System.getProperties().set
        //System.out.println(System.getProperty("name"));
        //System.out.println(System.getProperties().toString());
        InputStream in = SystemDemo.class.getResourceAsStream("resources/pig.com.glory.study.properties");
        System.out.println(in == null);
        InputStream in2 = new FileInputStream("src/resources/pig.com.glory.study.properties");
        System.out.println(in2);
        System.getProperties().load(in);
        System.out.println(System.getProperty("pig.name"));
    }
}
