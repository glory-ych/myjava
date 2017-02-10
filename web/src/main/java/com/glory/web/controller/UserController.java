package com.glory.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangch on 2017/1/6 0006.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/say")
    public void say(String name) {
        System.out.println("hello,world..." + name);
    }
}
