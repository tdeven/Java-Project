package com.wide.ProjectChicken.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wide.ProjectChicken.model.Employee;
import com.wide.ProjectChicken.repository.EmployeeRepository;
import com.wide.ProjectChicken.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

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
	public Employee getByEmp(Long id) {
		
		return empRepo.getById(id);
	}

	@Override
	public List<Employee> getAllEmps() {
		
		return empRepo.findAll();
	}

}
