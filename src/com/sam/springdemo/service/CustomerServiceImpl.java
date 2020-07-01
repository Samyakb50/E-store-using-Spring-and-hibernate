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
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
	}
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers(theId);
	}
	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(theId);
	}
	@Override
	@Transactional
	public int checkCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		int k= customerDAO.checkCustomer(theCustomer);
		 return k;
	}
	@Override
	@Transactional
	public void signout() {
		// TODO Auto-generated method stub
		customerDAO.signout();
	}
	@Override
	@Transactional
	public int checkCustomer2(Admin theCustomer) {
		// TODO Auto-generated method stub
		int k= customerDAO.checkCustomer2(theCustomer);
		 return k;
	}

}
