package com.base.note;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo {
	@Test
	public void demo1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/base/note/applicationContext.xml");
		context.start();
		AccountService accountService = (AccountService) context.getBean("accountService");
		accountService.transfer("bbb", "aaa", 200);
	}

}
