package com.cherish.controller;

import com.cherish.pojo.User;
import com.cherish.remote.UserRemoteClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-08 20:31
 */
@RestController
public class UserController implements UserRemoteClient {
    @Override
    public void requestUser(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPwd());
    }

    @Override
    public void requestMap(Map map) {
        System.out.println(map.toString());
    }

    @Override
    public Map queryUser(String id) {
        Map map = new HashMap();
        map.put("system", id);
        map.put("study", "system202209");
        return map;
    }
}
