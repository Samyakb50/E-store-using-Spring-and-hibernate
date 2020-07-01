package com.sam.springdemo.dao;

import java.util.List;

import com.sam.springdemo.entity.Order1;
import com.sam.springdemo.entity.Product;

public interface OrderDAO {
	public int getCount();

	public List<Order1> getOrders();

	public void changeStatus(int oid);
}
