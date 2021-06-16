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
		int k=(int)p;
		 cartService.getProduct(theId,i,k);
		List<Product> theProduct = productService.getProduct();
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "user-home2";
	}
	
	@GetMapping("/list")
	public String listCustomers2(Model theModel) {
		// get customers from the dao
		List<Cart> theProduct = cartService.getProduct();	
		// add the customers to the model
		theModel.addAttribute("cart", theProduct);
		return "Cart-list";
	}
	
	@GetMapping("/checkout")
	public String checkout(Model theModel)
	{
		cartService.check();
		List<Cart> theProduct = cartService.getProduct();
		// add the customers to the model
		theModel.addAttribute("cart", theProduct);
		return "Cart-list";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int theId)
	{
		cartService.deleteProduct(theId);
		return "redirect:/cart/list";
	}
}
