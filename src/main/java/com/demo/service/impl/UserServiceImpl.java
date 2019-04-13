package com.demo.service.impl;

import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Override
	public User findUserById(Integer id) {
		User user = new User();
		user.setId(id);
		user.setUsername("李亮");
		user.setPassword("123456");
		return user;
	}

}
