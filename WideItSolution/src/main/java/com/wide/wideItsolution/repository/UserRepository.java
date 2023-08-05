package com.wide.wideItsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wide.wideItsolution.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsernameAndPassword(String un,String psw);
	
	
}
