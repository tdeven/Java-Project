package com.bway.springcoreDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springcoreDemo.model.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginForm() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String doLogin(@ModelAttribute User user, Model model) {
		
		if(user.getUsername().equals("hari") && user.getPassword().equals("123")) {
			
			model.addAttribute("uname", user.getUsername());
			
			return "Home";
		}
		
		model.addAttribute("message"," user not found!");
		
		return "LoginForm";
	}
}
