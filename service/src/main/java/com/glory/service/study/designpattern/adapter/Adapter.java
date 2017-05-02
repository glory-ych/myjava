package com.glory.service.study.designpattern.adapter;

/**
 * Created by yangch on 2017/2/24 0024.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void done() {
        super.say();
    }
}
