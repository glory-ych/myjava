package com.glory.service.study.spring.frame;

import java.io.Serializable;

/**
 * Created by yangch on 2016/11/7 0007.
 */
public class CouponTempDto implements Serializable {

    private CouponTemp couponTemp;
    private int flag;

    public CouponTemp getCouponTemp() {
        return couponTemp;
    }

    public void setCouponTemp(CouponTemp couponTemp) {
        this.couponTemp = couponTemp;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public CouponTempDto(CouponTemp couponTemp, int flag) {
        this.couponTemp = couponTemp;
        this.flag = flag;
    }

    public CouponTempDto() {
    }
}
