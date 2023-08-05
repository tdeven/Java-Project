package com.bway.springprojectCoreDemo2Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginFormController {

	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
}
