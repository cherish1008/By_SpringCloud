package com.by.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-08 19:07
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level level() {
        return Logger.Level.BASIC;
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "1008");
    }
}
