package com.sam.springdemo.dao;

import java.util.List;

import com.sam.springdemo.entity.Cart;

public interface CartDAO {
	public void getProduct(int theId,int i,int p);

	public List<Cart> getCart();

	public void check();

	public void deleteProduct(int theId);
}
