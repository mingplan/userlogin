package com.niuhp.userlogin.action;

import com.niuhp.userlogin.service.UserService;
import com.niuhp.userlogin.action.BasicAction;

public class UserAction extends BasicAction {

	private static final long serialVersionUID = -8044906775297267551L;

	private UserService userService;

	private int id;
	private String username;
	private String password;
	private String nickname;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String userLogin() {
		return SUCCESS;
	}

	public String userRegister() {
		return SUCCESS;
	}

	public String prepareLogin() {
		return SUCCESS;
	}

	public String prepareRegister() {
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
