package com.example.cache.controller;

import com.example.cache.entity.User;
import com.example.cache.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 夏先鹏
 * @date 2020/01/20
 * @time 18:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("getById")
    public User getById(Long id) {
        return userService.get(id);
    }

    @GetMapping("insertUser")
    public void insert(User user) {
        userService.insertUser(user);
    }

    @GetMapping("/updateUser")
    public void update(User user) {
        userService.updateUser(user);
    }

    @GetMapping("/deleteAll1")
    @CacheEvict(value = "user", allEntries = true)
    public void delete1() {
        System.out.println("deleteAll1");
        // userService.deleteAll1();
    }

    @GetMapping("/deleteAll2")
    @CacheEvict(value = "user", beforeInvocation = true)// 方法调用前清空所有缓存
    public void delete2() {
        System.out.println("deleteAll2");
        // userService.deleteAll2();
    }
}
