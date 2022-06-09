package com.example.erp_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//开启Eureka服务
public class ErpEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpEurekaApplication.class, args);
    }

}
