package com.example.consumer5.client;

import com.example.consumer5.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient{
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setUserName("服务器正忙，请稍后再试。");
        return user;
    }
}
