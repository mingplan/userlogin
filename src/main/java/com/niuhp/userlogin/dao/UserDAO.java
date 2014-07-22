package com.niuhp.userlogin.dao;

import java.util.List;

import com.niuhp.userlogin.domain.User;

public interface UserDAO {
	
	void saveUser(User user);
	
	List<User> listUser();

	void deleteUser(int id);
	
}
