package com.by.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-07 14:52
 */
@Configuration
public class RestConfig {
    /**
     * @MethodName restTemplate
     * @Description 像容器 注入工具类
     * @return: org.springframework.web.client.RestTemplate
     * @Author cherish
     * @Date 2022/6/7 14:54
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
