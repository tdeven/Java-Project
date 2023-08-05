package com.wide.ProjectChicken.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wide.ProjectChicken.model.User;
import com.wide.ProjectChicken.repository.UserRepository;
import com.wide.ProjectChicken.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void userSignup(User user) {
		
		userRepo.save(user);
		
	}

	@Override
	public User userLogin(String un, String psw) {
		
		
		return userRepo.findByUsernameAndPassword(un ,psw);
	}

}
