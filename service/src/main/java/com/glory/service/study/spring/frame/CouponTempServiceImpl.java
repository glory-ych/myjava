package com.glory.service.study.spring.frame;

import org.springframework.stereotype.Service;

/**
 * Created by yangch on 2016/11/7 0007.
 */
@Service
public class CouponTempServiceImpl implements CouponTempService {
    //@Autowired
    //private CouponTempMapper couponTempMapper;

    @Override
    public CouponTempDto get(long id) {
        //CouponTemp couponTemp = couponTempMapper.get(id);
        int flag = 1000;
        return new CouponTempDto(null, flag);
    }



}
