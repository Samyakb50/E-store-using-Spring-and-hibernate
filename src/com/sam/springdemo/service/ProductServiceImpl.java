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
		return productDAO.getProducts();
	}
	
	@Override
	@Transactional
	public void saveProduct(Product theProduct) {
		productDAO.saveProduct(theProduct);
	}
	
	@Override
	@Transactional
	public Product getProduct(int theId) {
		return productDAO.getProducts(theId);
	}
	
	@Override
	@Transactional
	public void deleteProduct(int theId) {
		productDAO.deleteProduct(theId);
	}
	
	@Override
	@Transactional
	public List<Product> getProduct(String k) {
		return productDAO.getProduct(k);
	}

}
