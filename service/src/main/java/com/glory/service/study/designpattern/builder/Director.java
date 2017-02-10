package com.glory.service.study.designpattern.builder;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.builderHead();
        builder.builderHand();
        builder.builderFoot();
    }
}
