package com.niuhp.userlogin.service.impl;

import java.util.List;

import com.niuhp.userlogin.dao.UserDAO;
import com.niuhp.userlogin.domain.User;
import com.niuhp.userlogin.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		userDao.save(user);

	}

	@Override
	public List<User> getUserList() {

		return userDao.findAll();
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteById(id);

	}

}
