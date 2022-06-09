package com.by;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启服务端
public class ErpStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpStockApplication.class, args);
    }

}
