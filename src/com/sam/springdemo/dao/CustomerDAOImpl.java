package com.sam.springdemo.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sam.springdemo.entity.Admin;
import com.sam.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
//		System.out.println("Get customers called\n\n\n\n");
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
//		if(currentSession.equals("null"))
		// create a query
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = (List<Customer>)theQuery.getResultList();
//		for(Customer c:customers)
//			System.out.println(c);
		// return the results		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		//get hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		//save/update
		currentSession.save(theCustomer);
	}

	@Override
	public Customer getCustomers(int theId) {
		//get the current ibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		//now retrieve/read from database using primary key
		Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
//		currentSession.delete(theId);
		Query theQuery=currentSession.createQuery("delete from Customer where id=:theCustomerId");
		theQuery.setParameter("theCustomerId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public int checkCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
//		boolean isValid=false;
		int id=0;
		System.out.println("dao check customer");
		Session currentSession=sessionFactory.getCurrentSession();
		System.out.println(theCustomer.getUsername()+"kjg"+theCustomer.getPassword());
		String sqlQuery = "from Customer u where u.username=:user and u.password=:pass";
		Query query=currentSession.createQuery(sqlQuery);
		query.setParameter("user", theCustomer.getUsername());
		query.setParameter("pass", theCustomer.getPassword());
		List<Customer> ll=query.list();
		if((ll!=null) && (ll.size()>0))
		{
			System.out.println("aya hoon");
//			isValid=true;
//			Query q=currentSession.createQuery("select a.customerId from Customer a where a.username=:user");
//			q.setParameter("user", theCustomer.getUsername());
//			List l=q.list();
//			Iterator it = l.iterator();

////			while(it.hasNext())
////			{
//				 id = (int)ll.get(0);
//				 System.out.println(id+"in dao");
////			}
//			System.out.println(ll.get(0));
//			id=ll.getCustomerId();
			for(Customer k:ll)
			{
				id=k.getCustomerId();
			}
		}
		
//        try {
//        	System.out.println(theCustomer.getUsername()+"kjg"+theCustomer.getPassword());
//            List userObj = (List) hibernateTemplate.find(sqlQuery, theCustomer.getUsername(), theCustomer.getPassword());
//            if(userObj != null && userObj.size() > 0) {
////                log.info("Id= " + userObj.get(0).getId() + ", Name= " + userObj.get(0).getName() + ", Password= " + userObj.get(0).getPassword());
//                System.out.println("aya hoon");
//            	isValid = true;
//            }
//        } catch(Exception e) {
//        	e.printStackTrace();
//            isValid = false;
////            log.error("An error occurred while fetching the user details from the database", e);    
//        }
//        System.out.println(id+"inside dao");
        return id;
		
	}

	@Override
	public void signout() {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.createQuery("delete from Helper").executeUpdate();
	}

	@Override
	public int checkCustomer2(Admin theCustomer) {
		// TODO Auto-generated method stub
		int id=0;
		System.out.println("dao check customer");
		Session currentSession=sessionFactory.getCurrentSession();
		System.out.println(theCustomer.getUsername()+"kjg"+theCustomer.getPassword());
		String sqlQuery = "from Admin u1 where u1.username=:user and u1.password=:pass";
		Query query=currentSession.createQuery(sqlQuery);
		query.setParameter("user", theCustomer.getUsername());
		query.setParameter("pass", theCustomer.getPassword());
		List<Admin> ll=query.list();
		if((ll!=null) && (ll.size()>0))
		{
			System.out.println("aya hoon");
//			isValid=true;
//			Query q=currentSession.createQuery("select a.customerId from Customer a where a.username=:user");
//			q.setParameter("user", theCustomer.getUsername());
//			List l=q.list();
//			Iterator it = l.iterator();

////			while(it.hasNext())
////			{
//				 id = (int)ll.get(0);
//				 System.out.println(id+"in dao");
////			}
//			System.out.println(ll.get(0));
//			id=ll.getCustomerId();
			for(Admin k:ll)
			{
				id=k.getCustomerId();
			}
		}
		
//        try {
//        	System.out.println(theCustomer.getUsername()+"kjg"+theCustomer.getPassword());
//            List userObj = (List) hibernateTemplate.find(sqlQuery, theCustomer.getUsername(), theCustomer.getPassword());
//            if(userObj != null && userObj.size() > 0) {
////                log.info("Id= " + userObj.get(0).getId() + ", Name= " + userObj.get(0).getName() + ", Password= " + userObj.get(0).getPassword());
//                System.out.println("aya hoon");
//            	isValid = true;
//            }
//        } catch(Exception e) {
//        	e.printStackTrace();
//            isValid = false;
////            log.error("An error occurred while fetching the user details from the database", e);    
//        }
//        System.out.println(id+"inside dao");
        return id;
	}

}