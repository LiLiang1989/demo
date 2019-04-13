package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IUserDao;
import com.demo.entity.User;
import com.demo.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	@Override
	public User findUserById(Integer id) {
		User user = new User();
		user.setId(id);
		user.setUsername("李亮");
		user.setPassword("123456");
		return user;
	}
	@Override
	public User login(String username, String password) {
		User user  = userDao.login(username, password);
		return user;
	}

}
