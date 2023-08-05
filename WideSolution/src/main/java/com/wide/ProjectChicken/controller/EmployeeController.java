package com.wide.ProjectChicken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/employee")
	public String getEmployeeForm() {
	
		return "EmployeeForm";
	}
	
}
