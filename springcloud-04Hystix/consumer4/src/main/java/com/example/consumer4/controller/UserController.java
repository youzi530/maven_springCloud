package com.example.consumer4.controller;

import com.example.consumer4.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("consumer/user")
@DefaultProperties(defaultFallback = "defaultFallback")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    //@HystrixCommand(fallbackMethod = "queryUserByIdFallback")  //指定熔断方法
    public String queryUserById(@RequestParam("id") Long id) {
        return this.restTemplate.getForObject("http://service-provider/user/" + id, String.class);
    }

    public String queryUserByIdFallback(Long id){
        return "服务器正忙，请稍后再试";
    }

    public String defaultFallback(){
        return "服务器正忙，请稍后再试-quanju";
    }

}
