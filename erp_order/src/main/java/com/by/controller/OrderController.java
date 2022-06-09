package com.by.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-07 14:50
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/save")
    public String save() {
        System.out.println("库存保存 ");
        String rs = restTemplate.getForObject("http://erpstock/stock/update", String.class);
        System.out.println("更新结果" + rs);


        return "库存保存-----";
    }
}
