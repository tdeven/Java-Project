package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.User;
import com.bway.springproject.repository.UserRepository;
import com.bway.springproject.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model) {
	
	user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));	
	User usr = service.userLogin(user.getUsername(), user.getPassword());
		
	    if(usr != null) {
	    	
	    	model.addAttribute("uname", usr.getFname());
	    	return "Home";
	    }
	
	    model.addAttribute("message","user not exist");
		return "LoginForm";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		
			
		return "SignupForm";
	}

	@PostMapping("/signup")
	public String saveUser(@ModelAttribute User user) {
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		
		service.userSignup(user);
		
		return "LoginForm";
	}
	
	
	
}
