package com.by.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("erp-stock")
public interface StockRemoteClients {
    @GetMapping("/stock/query")
    Map query();
}
