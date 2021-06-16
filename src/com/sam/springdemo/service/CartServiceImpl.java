package com.sam.springdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sam.springdemo.dao.CartDAO;
import com.sam.springdemo.entity.Cart;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDAO;
	
	@Override
	@Transactional
	public void getProduct(int theId, int i,int p) {
		cartDAO.getProduct(theId,i,p);
	}
	
	@Override
	@Transactional
	public List<Cart> getProduct() {
		return cartDAO.getCart();
	}
	
	@Override
	@Transactional
	public void check() {
		cartDAO.check();
	}
	
	@Override
	@Transactional
	public void deleteProduct(int theId) {
		cartDAO.deleteProduct(theId);
	}

}
