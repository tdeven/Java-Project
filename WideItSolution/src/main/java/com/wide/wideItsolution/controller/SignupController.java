package com.wide.wideItsolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wide.ProjectChicken.model.User;
import com.bway.ProjectChicken.repository.UserRepository;

@Controller
public class SignupController<> {

	@Autowired
	private UserRepository  userRepo;
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "Signup";
	}
	
	@PostMapping("/signup")
	public String saveUser(@ModelAttribute User user, 
			               @RequestParam String gender, 
			               @RequestParam String hobbies,
			               @RequestParam String states,
			               @RequestParam String dob,
			               @RequestParam String mobile,
			               @RequestParam String email,
			               @RequestParam String photo) {
		
		userRepo.save(user);
		
		System.out.println("Gender =" +gender);
		System.out.println("Hobbies=" +hobbies);
		System.out.println("States=" +states);
		System.out.println("DOB="+dob);
		System.out.println("Mobile="+mobile);
		System.out.println("Email="+email);
		System.out.println("Photo="+photo);
		
		return "LoginForm";
	}
}
