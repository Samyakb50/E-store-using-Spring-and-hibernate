package com.sam.springdemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sam.springdemo.entity.Helper;

@Repository
public class HelperDAOImpl implements HelperDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insert(int oid, int cid) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Helper h=new Helper(oid,cid);
		currentSession.save(h);
	}

}
