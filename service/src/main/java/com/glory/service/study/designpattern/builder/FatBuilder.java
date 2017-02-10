package com.glory.service.study.designpattern.builder;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class FatBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void builderHead() {
        this.product.setHead("fat head...");
    }

    @Override
    public void builderHand() {
        this.product.setHand("fat hand...");
    }

    @Override
    public void builderFoot() {
        this.product.setFoot("fat foot...");
    }

    public Product getProduct() {
        return this.product;
    }
}
