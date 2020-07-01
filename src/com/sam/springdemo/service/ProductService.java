package com.sam.springdemo.service;

import java.util.List;


import com.sam.springdemo.entity.Product;

public interface ProductService {
	public List<Product> getProduct();

	public void saveProduct(Product theProduct);

	public Product getProduct(int theId);

	public void deleteProduct(int theId);

	public List<Product> getProduct(String k);
}
