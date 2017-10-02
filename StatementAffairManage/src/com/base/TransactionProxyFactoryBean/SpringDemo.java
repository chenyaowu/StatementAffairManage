package com.base.TransactionProxyFactoryBean;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo {
	@Test
	public void demo1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/base/TransactionProxyFactoryBean/applicationContext.xml");
		context.start();
		AccountService accountService = (AccountService) context.getBean("accountServiceProxy");
		accountService.transfer("bbb", "aaa", 200);
	}

}
