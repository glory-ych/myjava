package com.glory.service.study.myenum;

/**
 * Created by yangch on 2016/11/16 0016.
 */
public enum CouponTemplateStatus {
    RECEIVING(0), FORBID(1), EXPIRED(2), INVALIDED(3);

    CouponTemplateStatus(int value) {
        this.value = value;
    }

    private int value;


}
