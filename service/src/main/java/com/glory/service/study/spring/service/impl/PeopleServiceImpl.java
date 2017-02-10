package com.glory.service.study.spring.service.impl;

import com.glory.service.study.spring.po.People;
import com.glory.service.study.spring.service.PeopleService;
import org.springframework.stereotype.Service;

/**
 * Created by yangch on 2017/2/6 0006.
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public String info(People people) {
        return people.toString();
    }
}
