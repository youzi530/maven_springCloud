package com.example.provider5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.example.provider5.mapper")
@EnableDiscoveryClient
public class Provider5Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider5Application.class, args);
    }

}
