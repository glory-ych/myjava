package com.glory.service.study.spring.frame;

import org.apache.ibatis.annotations.Param;

/**
 * Created by yangch on 2016/11/7 0007.
 */
public interface CouponTempMapper {
    CouponTemp get(@Param("id") long id);
}
