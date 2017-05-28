DROP TABLE BILL;
DROP TABLE TRANSACTION;
DROP TABLE ACCOUNT;
DROP TABLE CUSTOMER;
DROP TABLE BANKEMPLOYEE;



CREATE TABLE EMPLOYEE(bankId int PRIMARY KEY, firstName varchar2(20),lastName varchar2(20),emailId varchar2(20), password varchar2(10));
CREATE TABLE CUSTOMER(customerId int PRIMARY KEY,firstName varchar2(20),lastName varchar2(20),telephoneNumber int,emailId varchar2(20),password varchar(10),dateofBirth Date,permanentAddress varchar(200),temporaryAddress varchar(200));
CREATE TABLE ACCOUNT(accountNumber int PRIMARY KEY, accountType varchar2(10),customerId int,FOREIGN KEY(customerId)REFERENCES customer(customerId),balance float);
CREATE TABLE TRANSACTION(transactionId int PRIMARY KEY,accountNumber int,Type varchar2(10),amount float,source varchar2(50),transactionDate DATE);
CREATE TABLE BILL(billId int PRIMARY KEY,BillerId int,customerId int,FOREIGN KEY(customerId)REFERENCES customer(customerId),dueDate DATE,amount float);