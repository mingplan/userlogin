package com.niuhp.userlogin.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.niuhp.userlogin.util.ActionResult;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor implements ActionResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Object admin = session.getAttribute("admin");
		if (admin != null) {
			return actionInvocation.invoke();
		}
		Object user = session.getAttribute("user");
		if (user == null) {
			return PREPARE_LOGIN;
		}
		return actionInvocation.invoke();
	}

}
