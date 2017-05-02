package com.glory.service.study.spring;

import com.glory.service.study.spring.service.impl.PeopleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangch on 2017/2/6 0006.
 */
public class Main2 {
    private static final Logger logger = LoggerFactory.getLogger(Main2.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PeopleServiceImpl peopleServiceImpl = (PeopleServiceImpl) SpringContextHelper.getBean("peopleServiceImpl");
        logger.info("peopleServiceImpl..." + peopleServiceImpl);
//        System.out.println(applicationContext.getBean("peopleServiceImpl"));

    }
}
