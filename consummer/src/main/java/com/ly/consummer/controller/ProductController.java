package com.ly.consummer.controller;

import com.ly.consummer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：LY
 * @date ：2021/4/12 15:50
 * @description ：ProductController
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/cost")
    public String getCost(@RequestParam int cost) {
//        int cost = 130;
        return "折扣后共计" + productService.getCost(cost) + "元";
    }
}
