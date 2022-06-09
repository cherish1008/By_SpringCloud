package com.cherish.controller;

import com.cherish.pojo.User;
import com.cherish.remote.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-08 20:36
 */
@RestController
public class UserController {
    @Autowired(required = false)
    UserRemoteClient userRemoteClient;

    @GetMapping("/user/query/{id}")
    public Map queryUser(@PathVariable String id) {
        Map map = new HashMap();
        map.put("plan", "2022");
        map.put("plan-system", userRemoteClient.queryUser(id));
        User user = new User();
        user.setUsername("ying");
        user.setPwd("12");
        userRemoteClient.requestUser(user);
        userRemoteClient.requestMap(map);
        return map;
    }
}
