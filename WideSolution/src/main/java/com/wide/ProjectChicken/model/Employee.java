package com.wide.ProjectChicken.model;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Employee {

	private Long id;
	private String fname;
	private String lname;
	private String gender;
	private String phone;
	@DateTimeFormat(pattern= "yyyy-mm-dd")
	private LocalDate dob;
	private String company;
	private String post;
	private int salary;
	private String department;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	@DateTimeFormat(pattern= "yyyy-mm-dd")
	private LocalDate joinDate;
	
	@ElementCollection
	@CollectionTable
	private Set<String> project;
	
	
	private LocalDate createDate = LocalDate.now();
}
