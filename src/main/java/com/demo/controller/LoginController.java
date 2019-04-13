package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.User;
import com.demo.service.IUserService;

@Controller
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private IUserService userService;
	

	@GetMapping("/login")
	public String loginForm() {
		logger.info("进入登录界面");
		return "login";
	}
	
	@PostMapping("/login")
	public String loginAction(User user,HttpSession session,Model model) {
		User loginUser = userService.login(user.getUsername(), user.getPassword());
		if( null != loginUser) {
			session.setAttribute("currentUser", loginUser);
			logger.info("登录成功");
			return "redirect:/index";
		}else {
			model.addAttribute("msg", "用户名或密码不正确");
			logger.info("登录失败");
		}
		return "/login";
	}

}
