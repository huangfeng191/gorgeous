package com.fengfeng.dbtest.service.impl;

import com.fengfeng.dbtest.entity.User;
import com.fengfeng.dbtest.mapper.UserMapper;
import com.fengfeng.dbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
