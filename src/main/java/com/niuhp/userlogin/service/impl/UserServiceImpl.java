package com.niuhp.userlogin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niuhp.userlogin.dao.UserDAO;
import com.niuhp.userlogin.domain.User;
import com.niuhp.userlogin.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	public void addUser(User user) {
		userDAO.saveUser(user);
	}

	public List<User> getUserList() {
		return userDAO.listUser();
	}
	
	public void deleteUser(int id) {
		userDAO.deleteUser(id);
	}

}
