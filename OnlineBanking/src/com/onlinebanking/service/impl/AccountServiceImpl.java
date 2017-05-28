package com.onlinebanking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebanking.dao.AccountDao;


import com.onlinebanking.entity.Account;
import com.onlinebanking.entity.Customer;
import com.onlinebanking.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService
{
	@Autowired
		private AccountDao accountDao;
	
		@Override
		public List<Account> listAccounts(int id){
			return accountDao.findAllAccounts(id);
		}
		@Override
		public void addAccounts(Account account){
			 accountDao.addingAccounts(account);
		}
		@Override
		public Account getAccountById(int accountNumber){
		return	accountDao.getAccount(accountNumber);
			
		}
		@Override
		public void updateAccount(Account account){
			accountDao.updatingAccount(account);
			
		}
		@Override
		public void deleteAccount(int accountNumber){
			accountDao.deleteAccount(accountNumber);
		}
		public List<Account> searchAccount(int search){
		return	accountDao.searchingAccount(search);
		}
}

