package com.onlinebanking.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import com.onlinebanking.dao.AccountDao;
import com.onlinebanking.entity.Account;
import com.onlinebanking.entity.Customer;


@Repository
public class AccountDaoImpl  extends DaoImpl implements AccountDao
{
	
	
	@Override
	public List<Account> findAllAccounts(int id){
		Session session=sessionFactory.openSession();
		Query qry=session.createQuery("from Account a where a.customerId="+id);
		List<Account> accounts=(List<Account>)qry.getResultList();
		session.close();
		return accounts;
	} 
	@Override
	public void addingAccounts(Account account)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(account);
		t.commit();
		session.close();
	}
	
	public Account getAccount(int accountNumber){
		Session session=sessionFactory.openSession();
		Query qry = session.createQuery("from Account a where a.accountNumber="+accountNumber);
		Account account= (Account)qry.getResultList().get(0);
		
		session.close();
		return account;
	}
	public 	void updatingAccount(Account account){
		Session session=sessionFactory.openSession();
		Transaction t= session.beginTransaction();
		session.update(account);
		t.commit();
		session.close();
		
	}
	public void deleteAccount(int accountNumber){
		
		Session session=sessionFactory.openSession();
		Transaction t= session.beginTransaction();
		Query qry=session.createQuery("delete from Account a where a.accountNumber="+accountNumber);
		qry.executeUpdate();
		t.commit();
		session.close();
	}
	public List<Account> searchingAccount(int search){
		Session session=sessionFactory.openSession();
		Query qry= session.createQuery("from Account a where a.accountNumber like '%"+search+"%'");
		List<Account> accounts=(List<Account>)qry.getResultList();
		return accounts;
	}
}
