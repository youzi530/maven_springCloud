package com.example.springcloudserviceprovider.mapper;

import com.example.springcloudserviceprovider.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
