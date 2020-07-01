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
import com.sam.springdemo.entity.Product;
import com.sam.springdemo.service.*;

@Controller
@RequestMapping("/product")
public class ProductController {

	//not call dao directly
	//need to inject customer service
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		System.out.println("list clled");
		// get customers from the dao
		List<Product> theProduct = productService.getProduct();
				
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "all-product";
		
	}
	@GetMapping("/adminlist")
	public String listCustomers3(Model theModel) {
		System.out.println("list clled");
		// get customers from the dao
		List<Product> theProduct = productService.getProduct();
				
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "list-products";
		
	}
	
	@GetMapping("/list/Mens")
	public String listCustomers2(Model theModel) {
		System.out.println("list clled");
		// get customers from the dao
		String k="Mens";
		List<Product> theProduct = productService.getProduct(k);
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "all-product";
	}
	@GetMapping("/list/Womens")
	public String listCustomers4(Model theModel) {
		System.out.println("list clled");
		// get customers from the dao
		String k="Womens";
		List<Product> theProduct = productService.getProduct(k);
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "all-product";
	}
	@GetMapping("/list/Kids")
	public String listCustomers5(Model theModel) {
		System.out.println("list clled");
		// get customers from the dao
		String k="Kids";
		List<Product> theProduct = productService.getProduct(k);
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "all-product";
	}
	@GetMapping("/home")
	public String showHome()
	{
		return "home";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model themodel)
	{
		//crate model attribute to bind form data
		Product theProduct=new Product();
		themodel.addAttribute("product",theProduct);
		return "product-form2";
	}
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product theProduct)
	{
		//save the customer using our service
		productService.saveProduct(theProduct);
		return "redirect:/product/adminlist";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId") int theId, Model theModel)
	{
		System.out.println(theId);
		Product theProduct = productService.getProduct(theId);
		//get the customer from our service
		theModel.addAttribute("product",theProduct);
		//set customer as a model attribute to pre populate the form
		return "product-form2";
		//send over to our form
	}
//	@GetMapping("/showFormForUpdate")
//	public String showFormForUpdate(@RequestParam("productId") int theId, @RequestParam("q") int i, Model theModel)
//	{
//		System.out.println(theId+" "+i);
//		Product theProduct = productService.getProduct(theId);
//		//get the customer from our service
//		theModel.addAttribute("product",theProduct);
//		//set customer as a model attribute to pre populate the form
//		return "product-form2";
//		//send over to our form
//	}
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int theId)
	{
		
		System.out.println("inside controller"+theId);
		productService.deleteProduct(theId);
		return "redirect:/product/list";
	}
	@GetMapping("/aa")
	public String adminHome()
	{
		return "adminHome";
	}
	
}


