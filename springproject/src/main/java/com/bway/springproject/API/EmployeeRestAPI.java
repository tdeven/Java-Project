package com.bway.springproject.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bway.springproject.model.Employee;
import com.bway.springproject.service.EmployeeService;

@RestController
public class EmployeeRestAPI<Employee> {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/emp/api/list")
	public List<Employee> getEmps() {
		
		return null ; //service.getAllEmps();
	}
	
	@PostMapping("/emp/api/add")
	public String save(@RequestBody Employee employee) {
		
		//service.addEmp(employee);
		
		return "add success";
	}
	
	@PostMapping("/emp/api/delete/id")
	public String deleteEmp(@PathVariable Long id) {
		
		service.deleteEmp(id);
		
		return "success";
	}
	
	@PutMapping("/emp/api/update/id")
	public String update(@RequestBody Employee employee) {
		
		//service.updateEmp(employee);
		
		return "update success";
	}
	
	
}
