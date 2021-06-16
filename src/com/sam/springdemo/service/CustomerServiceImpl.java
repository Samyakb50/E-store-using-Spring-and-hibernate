package com.sam.springdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sam.springdemo.dao.CustomerDAO;
import com.sam.springdemo.entity.Admin;
import com.sam.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	//need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		return customerDAO.getCustomers();
	}
	
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}
	
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomers(theId);
	}
	
	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
	}
	
	@Override
	@Transactional
	public int checkCustomer(Customer theCustomer) {
		int k= customerDAO.checkCustomer(theCustomer);
		return k;
	}
	
	@Override
	@Transactional
	public void signout() {
		customerDAO.signout();
	}
	
	@Override
	@Transactional
	public int checkCustomer2(Admin theCustomer) {
		int k= customerDAO.checkCustomer2(theCustomer);
		 return k;
	}

}
