package com.bway.springproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springproject.model.Employee;
import com.bway.springproject.repository.EmployeeRepository;
import com.bway.springproject.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void addEmp(Employee emp) {
		empRepo.save(emp);
		
	}

	@Override
	public void deleteEmp(Long id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public void updateEmp(Employee emp) {
		empRepo.save(emp);
		
	}

	@Override
	public Employee getById(Long id) {
		
		return empRepo.getById(id);
	}

	@Override
	public List<Employee> getAllEmps() {
		
		return empRepo.findAll();
	}

}
