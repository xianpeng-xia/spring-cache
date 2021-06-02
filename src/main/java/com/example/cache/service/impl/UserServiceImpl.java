package com.example.cache.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cache.entity.User;
import com.example.cache.mapper.UserMapper;
import com.example.cache.service.UserService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by xianpeng.xia
 * on 2019-08-27 00:24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @Cacheable(cacheNames = {"userList"})
    public List<User> getAll() {
        System.out.println("缓存不存在，执行方法");
        return userMapper.selectList(null);
    }

    @Override
    @Cacheable(cacheNames = {"user"}, key = "#id")
    public User get(Long id) {
        System.out.println("缓存不存在，执行方法");
        return userMapper.selectById(id);
    }

    @Override
    @CachePut(cacheNames = {"user"}, key = "#user.id")
    public void insertUser(User user) {
        System.out.println("写入缓存");
        userMapper.insert(user);
    }

    @Override
    @CacheEvict(cacheNames = {"user"}, key = "#user.id")
    public void updateUser(User user) {
        System.out.println("清除缓存");
        userMapper.updateById(user);
    }

    @Override
    //@CacheEvict(value = "user", allEntries = true)//方法调用后清空所有缓存
    public void deleteAll1() {

    }

    @Override
    //@CacheEvict(value = "user", beforeInvocation = true)// 方法调用前清空所有缓存
    public void deleteAll2() {

    }
}
