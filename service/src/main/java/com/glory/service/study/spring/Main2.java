package com.glory.service.study.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangch on 2017/2/6 0006.
 */
public class Main2 {
    private final Logger logger = LoggerFactory.getLogger(Main2.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("peopleServiceImpl"));
    }
}
