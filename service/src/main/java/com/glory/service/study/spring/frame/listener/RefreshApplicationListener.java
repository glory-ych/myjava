package com.glory.service.study.spring.frame.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by yangch on 2016/11/8 0008.
 */
public class RefreshApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("application..." + event.getApplicationContext().getDisplayName());
    }
}
