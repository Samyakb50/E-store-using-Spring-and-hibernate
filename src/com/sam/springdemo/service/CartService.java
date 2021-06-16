package com.sam.springdemo.service;

import java.util.List;
import com.sam.springdemo.entity.Cart;

public interface CartService {
	public void getProduct(int theId,int i,int p);

	public List<Cart> getProduct();

	public void check();

	public void deleteProduct(int theId);
}
