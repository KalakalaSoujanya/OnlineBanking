
package com.onlinebanking.service;

import java.util.List;

import com.onlinebanking.entity.Employee;

public interface EmployeeService
{
	public boolean isValidUser(String username, String password);
	public List<Employee> listEmployees();
	public void addEmployees(Employee employee); 
	public Employee editEmployees(int bankId);
	public void updateEmployees(Employee employee);
	public void deleteEmployees(int bankId);
	public List<Employee> searchEmployees(String search);
}
