package com.sam.springdemo.service;

import java.util.List;

import com.sam.springdemo.entity.Admin;
import com.sam.springdemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public int checkCustomer(Customer theCustomer);

	public void signout();

	public int checkCustomer2(Admin theCustomer);
}
