package com.wide.ProjectChicken.service;

import com.wide.ProjectChicken.model.User;

public interface UserService {

	void userSignup(User user);
	
	User userLogin(String un, String psw);
}
