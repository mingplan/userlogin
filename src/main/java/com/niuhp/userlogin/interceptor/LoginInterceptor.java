package com.niuhp.userlogin.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		Object user = ServletActionContext.getRequest().getSession().getAttribute("user");
		if (user == null) {
			return "";
		}
		return actionInvocation.invoke();
	}

}
