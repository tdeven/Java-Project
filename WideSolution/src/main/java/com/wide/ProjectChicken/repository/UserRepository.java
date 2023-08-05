package com.wide.ProjectChicken.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wide.ProjectChicken.model.User;

public interface UserRepository extends JpaRepository <User, Integer> {

	User findByUsernameAndPassword(String un, String psw);
	
}
