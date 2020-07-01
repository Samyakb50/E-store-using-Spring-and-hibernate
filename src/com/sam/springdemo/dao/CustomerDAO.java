package com.sam.springdemo.dao;

import java.util.List;

import com.sam.springdemo.entity.Admin;
import com.sam.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomer(int theId);

	public int checkCustomer(Customer theCustomer);

	public void signout();

	public int checkCustomer2(Admin theCustomer);
	
}
