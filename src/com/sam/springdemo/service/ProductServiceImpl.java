package com.sam.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sam.springdemo.dao.ProductDAO;
import com.sam.springdemo.entity.Product;


@Service
public class ProductServiceImpl implements ProductService {
	//need to inject customer dao
	@Autowired
	private ProductDAO productDAO;
	@Override
	@Transactional
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return productDAO.getProducts();
	}
	@Override
	@Transactional
	public void saveProduct(Product theProduct) {
		// TODO Auto-generated method stub
		productDAO.saveProduct(theProduct);
	}
	@Override
	@Transactional
	public Product getProduct(int theId) {
		// TODO Auto-generated method stub
		return productDAO.getProducts(theId);
	}
	@Override
	@Transactional
	public void deleteProduct(int theId) {
		// TODO Auto-generated method stub
		System.out.println("inside service");
		productDAO.deleteProduct(theId);
	}
	@Override
	@Transactional
	public List<Product> getProduct(String k) {
		// TODO Auto-generated method stub
		return productDAO.getProduct(k);
	}

}
