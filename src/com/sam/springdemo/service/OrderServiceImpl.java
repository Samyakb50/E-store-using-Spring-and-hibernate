package com.sam.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sam.springdemo.dao.OrderDAO;
import com.sam.springdemo.entity.Order1;
import com.sam.springdemo.entity.Product;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;
	@Override
	@Transactional
	public int getCount() {
		// TODO Auto-generated method stub
		return orderDAO.getCount();
	}
	@Override
	@Transactional
	public List<Order1> getOrders() {
		// TODO Auto-generated method stub
		return orderDAO.getOrders();
	}
	@Override
	@Transactional
	public void changeStatus(int oid) {
		// TODO Auto-generated method stub
		orderDAO.changeStatus(oid);
	}

}
