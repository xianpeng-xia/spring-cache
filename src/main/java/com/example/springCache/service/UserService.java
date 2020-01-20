package com.example.springCache.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springCache.entity.User;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019-08-27 00:23
 */
public interface UserService extends IService<User> {

    List<User> getAll();

    User get(Long id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteAll1();

    void deleteAll2();
}
