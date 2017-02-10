package com.glory.service.study.designpattern.builder;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public abstract class Builder {
    public abstract void builderHead();

    public abstract void builderHand();

    public abstract void builderFoot();

    public abstract Product getProduct();
}
