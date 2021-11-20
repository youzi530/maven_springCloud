package com.example.springcloudserviceprovider.service;

import com.example.springcloudserviceprovider.mapper.UserMapper;
import com.example.springcloudserviceprovider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
