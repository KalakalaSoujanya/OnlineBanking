package com.onlinebanking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebanking.dao.EmployeeDao;
import com.onlinebanking.dao.CustomerDao;
import com.onlinebanking.service.EmployeeService;
import com.onlinebanking.service.CustomerService;
import com.onlinebanking.entity.Employee;
import com.onlinebanking.entity.Customer;


@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public boolean isValidUser(String username, String password)
	{
		Employee agent = employeeDao.findAgentByUsername(username);
		
		if(password.equals(agent.getPassword())){
			return true;
		} else {
			return false;
		}
	}
@Override
public List<Employee> listEmployees(){
return employeeDao.findAllEmployee();
}

@Override
public void addEmployees(Employee employee){
	 employeeDao.addingEmployees(employee);
}
	
	public Employee editEmployees(int bankId){
	return	employeeDao.editingEmployees(bankId);
	}
	@Override
	public void updateEmployees(Employee employee){
		employeeDao.updatingEmployees(employee);
		
		
	}
	@Override
	public void deleteEmployees(int bankId){
	 employeeDao.deletingEmployees(bankId);
	}
	public List<Employee> searchEmployees(String search){
		
		return employeeDao.searchingEmployees(search);	}
}
