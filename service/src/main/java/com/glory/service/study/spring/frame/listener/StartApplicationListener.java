package com.glory.service.study.spring.frame.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by yangch on 2016/11/8 0008.
 */
public class StartApplicationListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("application start..." + event.getApplicationContext().getDisplayName());
    }
}
