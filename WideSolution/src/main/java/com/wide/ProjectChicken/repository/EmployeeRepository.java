package com.wide.ProjectChicken.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wide.ProjectChicken.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
