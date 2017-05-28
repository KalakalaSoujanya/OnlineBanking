package com.onlinebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlinebanking.entity.Account;
import com.onlinebanking.entity.Customer;
import com.onlinebanking.entity.Employee;
import com.onlinebanking.service.AccountService;
import com.onlinebanking.service.CustomerService;
@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/listAccounts",method=RequestMethod.GET)
	public ModelAndView listAccounts(@RequestParam String id)
	{
			
			ModelAndView model= new ModelAndView("accounts");
			Customer customer=customerService.getCustomer(Integer.parseInt(id));
			List<Account> accounts = accountService.listAccounts(Integer.parseInt(id));
			model.addObject("customer",customer);
		    model.addObject("accounts",accounts);
			return model;
			}
	@RequestMapping(value="/addAccountsPage",method=RequestMethod.GET)
	
	public ModelAndView addAccountPage(@RequestParam String id,Account account)
		{
			ModelAndView model= new ModelAndView("addAccounts");
			model.addObject("account",account);
			return model;
		}
	@RequestMapping(value="/addAccounts",method=RequestMethod.POST)
	public ModelAndView addAccounts(@RequestParam String id,@ModelAttribute("account") Account account )
	{
		ModelAndView model= new ModelAndView("accounts");
		accountService.addAccounts(account);
		List<Account> accounts = accountService.listAccounts(Integer.parseInt(id));
		model.addObject("accounts", accounts);
		 return model;
			}
	@RequestMapping(value="/editAccountsPage",method=RequestMethod.GET)
	public ModelAndView editAccounts(@RequestParam String accountNumber)
	{
		ModelAndView model= new ModelAndView("editAccounts");	
		Account account= accountService.getAccountById(Integer.parseInt(accountNumber));
		model.addObject("account",account);
		return model;
	}
	@RequestMapping(value="/updateAccounts",method=RequestMethod.POST)
	public ModelAndView updateAccount(@RequestParam String id,@ModelAttribute("account") Account account)
	{
		ModelAndView model = new ModelAndView("accounts");
		Customer customer=customerService.getCustomer(Integer.parseInt(id));
		accountService.updateAccount(account);
		List<Account> accounts = accountService.listAccounts(Integer.parseInt(id));
		model.addObject("customer",customer);
		model.addObject("accounts", accounts);
		return model;
	}
	@RequestMapping(value="/deleteAccount",method=RequestMethod.GET)
	public ModelAndView deleteAccount(@RequestParam String accountNumber,@RequestParam String id)
	{
		ModelAndView model=new ModelAndView("accounts");
		Customer customer=customerService.getCustomer(Integer.parseInt(id));
		accountService.deleteAccount(Integer.parseInt(accountNumber));
		List<Account> accounts = accountService.listAccounts(Integer.parseInt(id));
		model.addObject("customer",customer);
		model.addObject("accounts", accounts);
		return model;
	}
	@RequestMapping(value="/searchAccount",method=RequestMethod.POST)
	public ModelAndView searchAccount(@RequestParam String search){
		ModelAndView model=new ModelAndView("accounts");
		List<Account> accounts=accountService.searchAccount(Integer.parseInt(search));
		model.addObject("accounts",accounts);
		return model;
	}
}
