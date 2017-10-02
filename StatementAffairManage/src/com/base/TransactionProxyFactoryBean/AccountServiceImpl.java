package com.base.TransactionProxyFactoryBean;


public class AccountServiceImpl implements AccountService {
	//注入转账的DAO的类
	private AccountDao accountDao;

	

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void transfer(String out, String in, double money) {
		accountDao.outMoney(out, money);
		int i = 1/0;
		accountDao.inMoney(in, money);
	}

	

}
