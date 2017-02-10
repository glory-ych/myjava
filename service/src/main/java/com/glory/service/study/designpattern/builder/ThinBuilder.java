package com.glory.service.study.designpattern.builder;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class ThinBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void builderHead() {
        this.product.setHead("thin head...");
    }

    @Override
    public void builderHand() {
        this.product.setHead("thin hand...");
    }

    @Override
    public void builderFoot() {
        this.product.setHead("thin foot...");
    }

    public Product getProduct() {
        return this.product;
    }
}
