package com.cherish.remote;

import com.cherish.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-08 20:27
 */
@FeignClient("erp-system")
public interface UserRemoteClient {
    @GetMapping("/user/query/{id}")
    Map queryUser(@PathVariable("id") String id);

    @PostMapping("/user/query/user")
    void requestUser(@RequestBody User user);

    @PostMapping("/user/query/map")
    void requestMap(@RequestBody Map map);

}
