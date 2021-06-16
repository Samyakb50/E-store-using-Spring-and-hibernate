package com.sam.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sam.springdemo.entity.Order1;
import com.sam.springdemo.service.OrderService;

@Controller
@RequestMapping("order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/count")
	public int OrderCount()
	{
		int count=orderService.getCount();
		return count;
	}
	
	@GetMapping("/orderList")
	public String listOrders(Model theModel) {
		// get customers from the dao
		List<Order1> theProduct = orderService.getOrders();	
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "Order";
		
	}
	
	@GetMapping("/changeStatus")
	public String statusChange(@RequestParam("oid") int oid, @RequestParam("status") String status,Model theModel) {
		if(status.equalsIgnoreCase("Pending"))
		{
			orderService.changeStatus(oid);
		}
		List<Order1> theProduct = orderService.getOrders();
		// add the customers to the model
		theModel.addAttribute("products", theProduct);
		return "Order";
	}
}