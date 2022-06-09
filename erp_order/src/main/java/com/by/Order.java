package com.by;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-07 14:43
 */
@SpringBootApplication
@EnableEurekaClient
public class Order {
    public static void main(String[] args) {
        SpringApplication.run(Order.class, args);
    }
}
