package com.by.controller;

import com.by.remote.StockRemoteClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-08 18:33
 */
@RestController
public class SaleController {
    @Autowired
    StockRemoteClients stockRemoteClients;

    @GetMapping("/sale/query")
    public Map query() {
        Map map = new HashMap();
        Map rs = stockRemoteClients.query();
        map.put("saveNo", "324526");
        map.put("erp_stock", rs);
        return map;
    }
}
