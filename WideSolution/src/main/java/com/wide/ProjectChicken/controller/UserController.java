package com.wide.ProjectChicken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wide.ProjectChicken.model.User;
import com.wide.ProjectChicken.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user) {
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		User usr =service.userLogin(user.getUsername(), user.getPassword());
		
		if(usr != null) {
			return "Home";
		}
		
		return "LoginForm";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user) {
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		
		service.userSignup(user);
		
		return "SignupForm";
	}
	
	
}
