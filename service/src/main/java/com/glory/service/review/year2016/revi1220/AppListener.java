package com.glory.service.review.year2016.revi1220;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class AppListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
        applicationContext.publishEvent(null);
        if (event instanceof ContextStoppedEvent) {

        }
    }
}
