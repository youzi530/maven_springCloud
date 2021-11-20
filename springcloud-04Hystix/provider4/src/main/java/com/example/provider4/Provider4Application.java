package com.example.provider4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.example.provider4.mapper")
@EnableDiscoveryClient
public class Provider4Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider4Application.class, args);
    }

}
