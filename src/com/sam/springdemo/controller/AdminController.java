package com.sam.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.springdemo.entity.Admin;
import com.sam.springdemo.entity.Product;
import com.sam.springdemo.service.CustomerService;
import com.sam.springdemo.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/adminLogin")
	public String loginCustomer2(Model themodel)
	{
		//crate model attribute to bind form data
		Admin theCustomer=new Admin();
		themodel.addAttribute("customer",theCustomer);
		return "adminLogin";
	}
	
	@PostMapping("/checkCustomer2")
	public String checkCustomer2(@ModelAttribute("customer") Admin theCustomer)
	{
		//save the customer using our service
		int cid=customerService.checkCustomer2(theCustomer);
		if(cid!=0)
		{	
			return "redirect:/admin/dashboard";
		}
		return null;
	}
	
	@GetMapping("/list")
	public String listCustomers3(Model theModel) {
		// get customers from the dao
		List<Product> theProduct = productService.getProduct();		
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "list-products";
	}
	
	@GetMapping("/dashboard")
	public String adminHome()
	{
		return "adminHome";
	}
}
