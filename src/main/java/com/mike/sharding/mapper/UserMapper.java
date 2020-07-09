package com.mike.sharding.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mike.sharding.entity.User;

@Mapper
public interface UserMapper {
	
	Long insert(User user);
	
	List<User> query();
}
