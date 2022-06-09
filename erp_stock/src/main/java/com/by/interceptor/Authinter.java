package com.by.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-08 19:34
 */
public class Authinter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String s = headerNames.nextElement().toString();
            System.out.println(s + "---------" + request.getHeader(s));
        }
        System.out.println("-----");
        return true;
    }
}
