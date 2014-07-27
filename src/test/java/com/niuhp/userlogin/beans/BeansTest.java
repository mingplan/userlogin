package com.niuhp.userlogin.beans;

import java.util.Random;

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
		ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml","classpath:bean-dao.xml",
				"classpath:bean-service.xml","classpath:bean-action.xml");
	}
	@Test
	public void testBeans(){
		Random r=new Random();
		UserService us=ctx.getBean("userService",UserService.class);
		User u=new User();
		u.setUsername("user"+r.nextInt(100));
		u.setPassword(u.getUsername());
		us.addUser(u);
		u.setNickname("user");
		System.out.println("------------"+u.getId());
	}
}
