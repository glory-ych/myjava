package com.glory.service.study.designpattern.mediator;

/**
 * Created by yangch on 2017/4/11 0011.
 */
public class PlaneDispatcher extends Dispatcher {
    private NFPlane nfPlane;
    private BFPlane bfPlane;

    @Override
    void dispatch(String message, Plane plane) {
        System.out.println("控制台得到消息..." + message);
        if (plane == nfPlane) {
            bfPlane.avoid();
        } else if (plane == bfPlane) {
            nfPlane.avoid();
        }
    }

    public NFPlane getNfPlane() {
        return nfPlane;
    }

    public void setNfPlane(NFPlane nfPlane) {
        this.nfPlane = nfPlane;
    }

    public BFPlane getBfPlane() {
        return bfPlane;
    }

    public void setBfPlane(BFPlane bfPlane) {
        this.bfPlane = bfPlane;
    }
}
