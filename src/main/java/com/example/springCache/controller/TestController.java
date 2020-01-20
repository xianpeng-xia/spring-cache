package com.example.springCache.controller;

import com.example.springCache.entity.User;
import com.example.springCache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 夏先鹏
 * @date 2020/01/20
 * @time 16:03
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("user")
    public User getUser() {
        User user = userService.getById(1087982257332887553L);
        return user;
    }
}
