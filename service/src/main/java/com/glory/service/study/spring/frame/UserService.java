package com.glory.service.study.spring.frame;

import org.springframework.stereotype.Service;

/**
 * Created by yangch on 2016/11/7 0007.
 */
@Service
public class UserService implements IUserService {
    public void print(){
        System.out.println("hello...");
    }
}
