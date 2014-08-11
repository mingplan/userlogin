package com.niuhp.userlogin.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.niuhp.userlogin.security.EncryptorMgr;
import com.niuhp.userlogin.service.UserService;
import com.niuhp.userlogin.util.ActionResult;
import com.niuhp.userlogin.action.BasicAction;
import com.niuhp.userlogin.domain.User;

public class UserAction extends BasicAction implements ActionResult {

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

	public String login() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Object user = session.getAttribute("user");
		if (user != null) {
			return USER_HOME;
		}

		password = EncryptorMgr.encrypt(password);
		user = userService.userLogin(username, password);
		if (user == null) {
			return prepareLogin();
		}
		session.setAttribute("user", user);
		return USER_HOME;
	}

	public String register() {
		User user = constructUser();
		userService.addUser(user);
		return PREPARE_LOGIN;
	}

	public String prepareLogin() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Object user = session.getAttribute("user");
		if (user != null) {
			return USER_HOME;
		}
		return PREPARE_LOGIN;
	}

	public String prepareRegister() {
		return PREPARE_REGISTER;
	}

	public String logout() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("user");
		return PREPARE_LOGIN;
	}

	private User constructUser() {
		User user = new User();
		user.setId(id);
		user.setNickname(nickname);
		user.setUsername(username);
		password = EncryptorMgr.encrypt(password);
		user.setPassword(password);
		return user;
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
