package com.glory.service.study.designpattern.builder;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class Client {
    public static void main(String[] args) {
        Builder fatBuilder = new FatBuilder();
        Director director = new Director(fatBuilder);
        director.construct();
        Product product = fatBuilder.getProduct();
        System.out.println(product.getHand());
    }
}
