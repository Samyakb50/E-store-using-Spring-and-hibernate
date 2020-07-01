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
	
	//not call dao directly
	//need to inject customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		System.out.println("list clled");
		// get customers from the dao
		List<Customer> theCustomers = customerService.getCustomer();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
//		return null;
	}
	@GetMapping("/signup")
	public String showFormForAdd(Model themodel)
	{
		//crate model attribute to bind form data
		Customer theCustomer=new Customer();
		themodel.addAttribute("customer",theCustomer);
		return "signup";
	}
	@GetMapping("/login")
	public String loginCustomer(Model themodel)
	{
		//crate model attribute to bind form data
		Customer theCustomer=new Customer();
		themodel.addAttribute("customer",theCustomer);
		return "login";
	}
	@GetMapping("/login2")
	public String loginCustomer2(Model themodel)
	{
		//crate model attribute to bind form data
		Admin theCustomer=new Admin();
		themodel.addAttribute("customer",theCustomer);
		return "login2";
	}
	@PostMapping("/checkCustomer")
	public String checkCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		//save the customer using our service
		int cid=customerService.checkCustomer(theCustomer);
//		System.out.println(isValid);
		int oid=orderService.getCount();
		oid=oid+1;
			System.out.println("Customer Id"+cid+"OrderId"+oid);
			if(cid!=0)
			{
				helperService.insert(oid, cid);
				return "redirect:/cart/show/";
			}
			return null;
	}
	@PostMapping("/checkCustomer2")
	public String checkCustomer2(@ModelAttribute("customer") Admin theCustomer)
	{
		//save the customer using our service
		int cid=customerService.checkCustomer2(theCustomer);
//		System.out.println(isValid);
		System.out.println(cid);
			if(cid!=0)
			{
				
				return "redirect:/product/aa";
			}
			return null;
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
		return "redirect:/product/home";
	}
}


