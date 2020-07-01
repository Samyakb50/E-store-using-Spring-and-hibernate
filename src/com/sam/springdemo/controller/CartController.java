package com.sam.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sam.springdemo.entity.Cart;
import com.sam.springdemo.entity.Product;
import com.sam.springdemo.service.CartService;
import com.sam.springdemo.service.ProductService;
@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	@Autowired
	private ProductService productService;
	
	@GetMapping("/add")
	public String showFormForUpdate(@RequestParam("productId") int theId,@RequestParam("productPrice") double p, @RequestParam("q") int i, Model theModel)
	{
		System.out.println("inside cart controller"+theId+" "+i+"kkk"+p);
//		p=Integer.parseInt(p);
		int k=(int)p;
		 cartService.getProduct(theId,i,k);
		List<Product> theProduct = productService.getProduct();
		
		// add the customers to the model
	theModel.addAttribute("products", theProduct);
		
	return "all-product";
	}
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		System.out.println("list clled");
		// get customers from the dao
		List<Cart> theProduct = cartService.getProduct();
				
		// add the customers to the model
		theModel.addAttribute("cart", theProduct);
		return "Cart";
		
	}	
	@GetMapping("/checkout")
	public String checkout(Model theModel)
	{
		cartService.check();
		List<Cart> theProduct = cartService.getProduct();
		// add the customers to the model
		theModel.addAttribute("cart", theProduct);
		return "Cart";
	}
	@GetMapping("/show")
	public String show()
	{
		return "user-home";
	}
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int theId)
	{
		
		System.out.println("inside controller"+theId);
		cartService.deleteProduct(theId);
		return "redirect:/cart/list";
	}
}
