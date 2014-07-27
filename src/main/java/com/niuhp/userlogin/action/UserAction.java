package com.niuhp.userlogin.action;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import com.niuhp.userlogin.domain.User;
import com.niuhp.userlogin.service.UserService;
import com.niuhp.userlogin.action.BasicAction;

public class UserAction extends BasicAction {

	private static final long serialVersionUID = -8044906775297267551L;

	private UserService userService;

	private User user;

	private List<User> userList;

	private int id;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		LogManager.getLogger(getClass()).info("---userService-----");
		this.userService = userService;
	}

	public UserAction() {
		LogManager.getLogger(getClass()).info("---UserAction-----");
		System.out.println("-------------1----------------");
	}

	public String addUser() {
		System.out.println("-------------2----------------");
		userService.addUser(user);
		return "addUser";
	}

	public String fetchUserList() {
		System.out.println("-------------3----------------");
		LogManager.getLogger(getClass()).info("---fetchUserList-----");
		userList = userService.getUserList();
		return "fetchUserList";
	}

	public String deleteUser() {
		userService.deleteUser(id);
		return "deleteUser";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
