package com.example.springCache.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springCache.entity.User;
import com.example.springCache.mapper.UserMapper;
import com.example.springCache.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by xianpeng.xia
 * on 2019-08-27 00:24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
