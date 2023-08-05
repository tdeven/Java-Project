package com.wide.ProjectChicken.service;

import java.util.List;

import com.wide.ProjectChicken.model.Employee;

public interface EmployeeService {

	void addEmp(Employee emp);
	
	void deleteEmp(Long id);
	
	void updateEmp(Employee emp);
	
	Employee getByEmp(Long id);
	
	List<Employee>  getAllEmps();
}
