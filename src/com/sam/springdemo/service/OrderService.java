package com.sam.springdemo.service;

import java.util.List;
import com.sam.springdemo.entity.Order1;

public interface OrderService {
	public int getCount();

	public List<Order1> getOrders();

	public void changeStatus(int oid);
}
