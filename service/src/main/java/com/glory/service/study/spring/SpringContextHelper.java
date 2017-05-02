package com.glory.service.study.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by yangch on 2017/3/2 0002.
 */
@Component
public class SpringContextHelper implements ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(SpringContextHelper.class);
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //logger.info("set applicationContext...");
        System.out.println("set applicationContext...");
        this.applicationContext = applicationContext;
    }

    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }
}
