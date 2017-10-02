package com.base.TransactionProxyFactoryBean;


public class AccountServiceImpl implements AccountService {
	//ע��ת�˵�DAO����
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
