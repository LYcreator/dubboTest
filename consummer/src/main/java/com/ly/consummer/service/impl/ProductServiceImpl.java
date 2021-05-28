package com.ly.consummer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ly.api.service.DiscountService;
import com.ly.consummer.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author ：LY
 * @date ：2021/4/12 15:36
 * @description ：ProductServiceImpl
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Reference
    private DiscountService discountService;

    @Override
    public Integer getCost(int cost) {
        System.out.println("Consumer购买商品折扣前金额：" + cost);
        return discountService.discount(cost);
    }
}
