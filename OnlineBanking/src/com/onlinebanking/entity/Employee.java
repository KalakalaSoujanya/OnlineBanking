package com.onlinebanking.entity;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator ="BANKID_SEQUENCE")
	@SequenceGenerator(name="BANKID_SEQUENCE",sequenceName="BANKID_SEQUENCE",allocationSize=1,initialValue=1)
	@Column(name="bankId")
	int bankId;
	String firstName;
	String lastName;
	
	String emailId;
	String password;
	
	
	public Employee() {
		super();
		
	}
	
	public Employee(int bankId, String firstName, String lastName, String emailId, String password) {
		super();
		this.bankId = bankId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}

	
	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
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

	@Override
	public String toString() {
		return "Employee [bankId=" + bankId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", password=" + password + "]";
	}

	
	
	

}
