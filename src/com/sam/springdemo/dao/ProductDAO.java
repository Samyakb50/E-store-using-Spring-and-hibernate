package com.sam.springdemo.dao;

import java.util.List;

import com.sam.springdemo.entity.Product;



public interface ProductDAO {

	public List<Product> getProducts();

	public void saveProduct(Product theProduct);

	public Product getProducts(int theId);

	public void deleteProduct(int theId);

	public List<Product> getProduct(String k);
	
}
