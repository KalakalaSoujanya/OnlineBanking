package com.onlinebanking.dao;

import java.util.List;

import com.onlinebanking.entity.Employee;

public interface EmployeeDao
{
	public Employee findAgentByUsername(String username);
	public List<Employee> findAllEmployee();
	public void addingEmployees(Employee employee);
	public Employee editingEmployees(int bankId);
	public void updatingEmployees(Employee employee);
	public void deletingEmployees(int bankId);
	public List<Employee> searchingEmployees(String search);
	
}
