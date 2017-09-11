package com.lxhy.user.impl;

import com.lxhy.mapper.UserMapper;
import com.lxhy.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lxhy.pojo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUsername(String username) {

        User user = userMapper.selectUser1(username);

        return user;

    }

}