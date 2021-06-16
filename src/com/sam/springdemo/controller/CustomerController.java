package com.sam.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sam.springdemo.entity.Admin;
import com.sam.springdemo.entity.Customer;
import com.sam.springdemo.service.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private HelperService helperService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/listCustomers")
	public String listCustomers(Model theModel) {
		// get customers from the dao
		List<Customer> theCustomers = customerService.getCustomer();
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/signup")
	public String showFormForAdd(Model themodel)
	{
		//create model attribute to bind form data
		Customer theCustomer=new Customer();
		themodel.addAttribute("customer",theCustomer);
		return "signup";
	}
	
	@GetMapping("/userLogin")
	public String loginCustomer(Model themodel)
	{
		//create model attribute to bind form data
		Customer theCustomer=new Customer();
		themodel.addAttribute("customer",theCustomer);
		return "login";
	}
	
	@PostMapping("/checkCustomer")
	public String checkCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		//save the customer using our service
		int cid=customerService.checkCustomer(theCustomer);
		int oid=orderService.getCount();
		oid=oid+1;
		if(cid!=0)
		{
			helperService.insert(oid, cid);
			return "redirect:/customer/show/";
		}
		return null;
	}
	
	@GetMapping("/show")
	public String show()
	{
		return "user-dashboard";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		//save the customer using our service
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/login";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel)
	{
		Customer theCustomer = customerService.getCustomer(theId);
		//get the customer from our service
		theModel.addAttribute("customer",theCustomer);
		//set customer as a model attribute to pre populate the form
		return "customer-form";
		//send over to our form
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId)
	{
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/signout")
	public String signout()
	{
		customerService.signout();
		return "redirect:/home";
	}
}


