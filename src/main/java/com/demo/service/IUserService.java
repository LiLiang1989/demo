package com.demo.service;

import com.demo.entity.User;


public interface IUserService {

	User findUserById(Integer id);
	
	User login(String username,String password);
}
