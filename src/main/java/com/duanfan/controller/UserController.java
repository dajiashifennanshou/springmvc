package com.duanfan.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duanfan.entity.User;
import com.duanfan.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);  
	@Autowired
	private UserServiceImpl uServiceImpl;
	
	@RequestMapping("/getInfo")
	public String toUserInfo(Model model){
		User user = uServiceImpl.getUserByid(1);
		logger.error(user.getName());
		logger.info(user.getName());
		logger.fatal(user.getAge());
		model.addAttribute("user",user);
		return "user/user";
	}
}
