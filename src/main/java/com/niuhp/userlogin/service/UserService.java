package com.niuhp.userlogin.service;

import java.util.List;

import com.niuhp.userlogin.domain.User;

public interface UserService {

	void addUser(User user);

	List<User> getUserList();

	void deleteUser(int id);

	User userLogin(String username, String password);

	void modifyPassword(int id, String newPassword);
}
