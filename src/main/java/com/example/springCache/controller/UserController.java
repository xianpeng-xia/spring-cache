package com.example.springCache.controller;

import com.example.springCache.entity.User;
import com.example.springCache.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void delete1() {
        userService.deleteAll1();
    }

    @GetMapping("/deleteAll2")
    public void delete2() {
        userService.deleteAll2();
    }
}
