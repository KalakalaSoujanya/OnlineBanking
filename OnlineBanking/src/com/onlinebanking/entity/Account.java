package com.onlinebanking.entity;

import javax.persistence.*;

@Entity
@Table(name="Account")
public class Account {
	@Id
	int accountNumber;
	String accountType;
	int customerId;
	float balance;
	
	public Account() {
		super();
	
	}
	public Account(int accountNumber, String accountType, int customerId, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.customerId = customerId;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	 @ManyToOne
	    @JoinColumn(name = "customerId")
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	

}
