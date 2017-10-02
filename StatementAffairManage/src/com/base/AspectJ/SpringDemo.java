package com.base.AspectJ;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo {
	@Test
	public void demo1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/base/AspectJ/applicationContext.xml");
		context.start();
		AccountService accountService = (AccountService) context.getBean("accountService");
		accountService.transfer("bbb", "aaa", 200);
	}

}
