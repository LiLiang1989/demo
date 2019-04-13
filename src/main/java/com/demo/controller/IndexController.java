package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.entity.User;
import com.demo.service.IUserService;

@Controller
public class IndexController {
	
	private static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private IUserService userService;
	
	@GetMapping({"/","/index"})
	public String index(Model model) {
		logger.info("进入首页");
		User user = userService.findUserById(12);
		model.addAttribute("user", user);
		model.addAttribute("username", "username");
		return "index";
	}

}
