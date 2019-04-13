package com.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.demo.entity.User;

public interface IUserDao {
	
	public User login(@Param("username")String username,@Param("password") String password);
	
}
