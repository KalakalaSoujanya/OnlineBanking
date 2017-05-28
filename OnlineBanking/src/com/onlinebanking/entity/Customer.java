package com.onlinebanking.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQUENCE")
	@SequenceGenerator(name = "CUSTOMER_SEQUENCE", sequenceName = "CUSTOMER_SEQUENCE", allocationSize = 1, initialValue = 1)
	@Column(name="customerId")
	int id;
	String firstName;
	String lastName;
	String telephoneNumber; 
	String emailId;
	String password;
	
	Date dateofBirth;
	String permanentAddress;
	String temporaryAddress;
	@Transient
	List<Account>accounts;
	
	
	
	
	public Customer() {
		super();
		
	}




	public Customer(int id, String firstName, String lastName, String telephoneNumber, String emailId, String password,
			Date dateofBirth, String permanentAddress, String temporaryAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.dateofBirth = dateofBirth;
		this.permanentAddress = permanentAddress;
		this.temporaryAddress = temporaryAddress;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getTelephoneNumber() {
		return telephoneNumber;
	}




	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}




	public String getEmailId() {
		return emailId;
	}




	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}



	
	public Date getDateofBirth() {
		return dateofBirth;
	}




	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}




	public String getPermanentAddress() {
		return permanentAddress;
	}




	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}




	public String getTemporaryAddress() {
		return temporaryAddress;
	}

    public void setTemporaryAddress(String temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}




	public List<Account> getAccounts() {
		return accounts;
	}




	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}




	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", telephoneNumber="
				+ telephoneNumber + ", emailId=" + emailId + ", password=" + password + ", dateofBirth=" + dateofBirth
				+ ", permanentAddress=" + permanentAddress + ", temporaryAddress=" + temporaryAddress + "]";
	}
	
}
