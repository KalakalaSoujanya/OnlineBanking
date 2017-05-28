package com.onlinebanking.service;

import java.util.List;

import com.onlinebanking.entity.Account;
import com.onlinebanking.entity.Customer;




public interface AccountService {
	public List<Account> listAccounts(int id);
	public void addAccounts(Account account);
	public Account getAccountById(int accountNumber);
	public void updateAccount(Account account);
	public void deleteAccount(int accountNumber);
	public List<Account> searchAccount(int search);
}
