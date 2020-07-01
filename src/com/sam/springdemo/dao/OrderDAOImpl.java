package com.sam.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sam.springdemo.entity.Order1;
import com.sam.springdemo.entity.Product;

@Repository
public class OrderDAOImpl implements OrderDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		int max=0;
		Session currentSession = sessionFactory.getCurrentSession();
		Query query=currentSession.createQuery("from Order1",Order1.class);
		List<Order1> l=query.list();
		for(Order1 k:l)
		{
			int id=k.getOrderId();
			if(max<id)
			{
				max=id;
			}
		}
		System.out.println(max);
		return max;
	}

	@Override
	public List<Order1> getOrders() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query query=currentSession.createQuery("from Order1",Order1.class);
		List<Order1> l=query.list();
		return l;
	}

	@Override
	public void changeStatus(int oid) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Order1 o=currentSession.get(Order1.class, oid);
		o.setStatus("Delivered");
		currentSession.save(o);
	}
	
}
