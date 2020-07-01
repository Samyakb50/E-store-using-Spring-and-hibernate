package com.sam.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sam.springdemo.entity.Product;



@Repository
public class ProductDAOImpl implements ProductDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public List<Product> getProducts() {
//		System.out.println("Get customers called\n\n\n\n");
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
//		if(currentSession.equals("null"))
		// create a query
		Query<Product> theQuery = currentSession.createQuery("from Product order by productName", Product.class);
		
		// execute query and get result list
		List<Product> products = (List<Product>)theQuery.getResultList();
//		for(Customer c:customers)
//			System.out.println(c);
		// return the results		
		return products;
	}

	@Override
	public void saveProduct(Product theProduct) {
		//get hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		//save/update
		currentSession.saveOrUpdate(theProduct);
	}

	@Override
	public Product getProducts(int theId) {
		//get the current ibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		//now retrieve/read from database using primary key
		Product theProduct = currentSession.get(Product.class, theId);
		return theProduct;
	}

	@Override
	public void deleteProduct(int theId) {
		// TODO Auto-generated method stub
		System.out.println("inside dao"+theId);
		Session currentSession=sessionFactory.getCurrentSession();
		Product theProduct=currentSession.get(Product.class, theId);
		currentSession.delete(theProduct);
//		currentSession.delete(theId);
//		Query theQuery=currentSession.createQuery("delete from Product where productId=:theProductId");
//		theQuery.setParameter("theProductId", theId);
//		theQuery.executeUpdate();
	}

	@Override
	public List<Product> getProduct(String k) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
//		if(currentSession.equals("null"))
		// create a query
		Query<Product> theQuery = currentSession.createQuery("from Product p where p.productCategory=:th", Product.class);
		theQuery.setParameter("th", k);
		// execute query and get result list
		List<Product> products = (List<Product>)theQuery.getResultList();
//		for(Customer c:customers)
//			System.out.println(c);
		// return the results		
		return products;
	}

}