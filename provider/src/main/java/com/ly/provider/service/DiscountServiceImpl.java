package com.ly.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ly.api.service.DiscountService;

/**
 * @author ：LY
 * @date ：2021/4/12 14:39
 * @description ：DiscountServiceImpl
 */

@Service
public class DiscountServiceImpl implements DiscountService {
    @Override
    public Integer discount(int count) {
        return count > 100 ? count - 20 : count;
    }
}
