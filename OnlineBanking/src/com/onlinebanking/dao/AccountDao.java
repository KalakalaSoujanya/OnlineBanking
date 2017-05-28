package com.onlinebanking.dao;

import java.util.List;

import com.onlinebanking.entity.Account;
import com.onlinebanking.entity.Customer;

public interface AccountDao
{
	public List<Account> findAllAccounts(int id);
	public void addingAccounts(Account account);
	
	public Account getAccount(int accountNumber);
	public void updatingAccount(Account account);
	public void deleteAccount(int accountNumber);
	public List<Account> searchingAccount(int search);

}
