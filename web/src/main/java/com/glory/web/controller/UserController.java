package com.glory.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yangch on 2017/1/6 0006.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(String name) {
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.error("error");
        logger.error("error");
        logger.error("error");
        logger.error("error");


        System.out.println("hello,world..." + name);
        return name;
    }
}
