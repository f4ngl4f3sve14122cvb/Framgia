package com.framgia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.framgia.model.User;
import com.framgia.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/user")
	public String finAllUser(Model model){
		List<User> list = userService.findAllUser();
		model.addAttribute("listUser", list);
		return "user";
	}

}
