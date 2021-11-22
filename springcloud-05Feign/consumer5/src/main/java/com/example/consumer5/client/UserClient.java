package com.example.consumer5.client;

import com.example.consumer5.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("user/{id}")
    public User queryById(@PathVariable("id") Long id);
}
