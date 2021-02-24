package com.fengfeng.dbtest.mapper;

import com.fengfeng.dbtest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
}
