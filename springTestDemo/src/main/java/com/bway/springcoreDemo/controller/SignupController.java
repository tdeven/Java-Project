package com.bway.springcoreDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springcoreDemo.model.User;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String getSignup(@ModelAttribute User user , @RequestParam String Hobbies ,
			                                            @RequestParam String Gender ,
			                                            @RequestParam String DOB ,
			                                            @RequestParam String State,
			                                            @RequestParam String Email) {
		System.out.println("======Hobbies=== " +Hobbies);

          System.out.println("======Gender= "+Gender);
          System.out.println("====== DOB="+DOB);
          System.out.println("====== State="+State);
		   System.out.println("=======Email="+Email);
		
		return "LoginForm";
	}
}
