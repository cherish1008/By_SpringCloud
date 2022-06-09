package com.by.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-07 14:47
 */
@RestController
@RequestMapping("/stock")
public class StrockController {
    @GetMapping("/query")
    public Map query() {
        Map map = new HashMap<>();
        map.put("华为手机", "232");
        map.put("stock", 100);
        return map;
    }

    @GetMapping("/update")
    public String update() {
        System.out.println("库存更新 sout");
        return "库存更新return";
    }
}
