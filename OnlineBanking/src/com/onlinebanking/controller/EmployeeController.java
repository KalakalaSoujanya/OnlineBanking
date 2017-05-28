package com.onlinebanking.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlinebanking.entity.Employee;
import com.onlinebanking.service.EmployeeService;

@Controller
public class EmployeeController
{			
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/listEmployees",method=RequestMethod.GET)
	public ModelAndView listEmployees(){
		ModelAndView model= new ModelAndView("employees");
		List<Employee> employees = employeeService.listEmployees();
		model.addObject("employees",employees);
		return model;
		}
	
	@RequestMapping(value="/AddEmployeePage",method=RequestMethod.GET)
	public ModelAndView addEmployeePage(Employee employee){
		ModelAndView model= new ModelAndView("addEmployees");
		model.addObject("employee",employee);
		return model;
	}
	
	@RequestMapping(value="/AddEmployees",method=RequestMethod.POST)
	public ModelAndView addEmployees(@ModelAttribute("employee") Employee employee)
	{
	ModelAndView model= new ModelAndView("employees");
	employeeService.addEmployees(employee);
	List<Employee> employees = employeeService.listEmployees();
	model.addObject("employees", employees);
	 return model;
		}
	
	@RequestMapping(value="/EditEmployees",method=RequestMethod.GET)
	public ModelAndView editEmployees(@RequestParam String bankId){
	ModelAndView model= new ModelAndView("editemployees");
	Employee employee=employeeService.editEmployees(Integer.parseInt(bankId));
	model.addObject("employee",employee);
	 return model;
		}
	@RequestMapping(value="/updateEmployees",method=RequestMethod.POST)
	public ModelAndView updateEmployees(@ModelAttribute("employee") Employee employee )
	{	
		ModelAndView model=new ModelAndView("employees");
		employeeService.updateEmployees(employee);
		List<Employee> employees= employeeService.listEmployees();
		model.addObject("employees",employees);
		return model;

	}
	@RequestMapping(value="/deleteEmployees",method=RequestMethod.GET)
	public ModelAndView deleteEmployees(@RequestParam String bankId){
		ModelAndView model=new ModelAndView("employees");
		employeeService.deleteEmployees(Integer.parseInt(bankId));
		List<Employee> employees=employeeService.listEmployees();
		model.addObject("employees",employees);
		return model;
		
	}
	@RequestMapping(value="/searchEmployees",method=RequestMethod.POST)
	public ModelAndView searchEmployees(@RequestParam String search){
		
		ModelAndView model= new ModelAndView("employees");
		List<Employee> employees=employeeService.searchEmployees(search);
		model.addObject("employees",employees);
		
		return model;
		
	}
}

