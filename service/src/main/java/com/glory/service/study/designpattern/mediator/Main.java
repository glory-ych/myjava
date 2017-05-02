package com.glory.service.study.designpattern.mediator;

/**
 * Created by yangch on 2017/4/11 0011.
 */
public class Main {
    public static void main(String[] args) {
        PlaneDispatcher planeDispatcher = new PlaneDispatcher();
        BFPlane bfPlane = new BFPlane();
        NFPlane nfPlane = new NFPlane();
        planeDispatcher.setBfPlane(bfPlane);
        planeDispatcher.setNfPlane(nfPlane);
        bfPlane.setDispatcher(planeDispatcher);
        bfPlane.setDispatcher(planeDispatcher);

        bfPlane.down("北方down...");
        //nfPlane.down("北方down...");
    }
}
