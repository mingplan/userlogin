package com.niuhp.userlogin.beans;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niuhp.userlogin.domain.User;
import com.niuhp.userlogin.service.UserService;

public class BeansTest {

	private static ApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	@Test
	public void testBeans(){
		UserService us=ctx.getBean("userService",UserService.class);
		User u=new User();
		us.addUser(u);
	}
}
