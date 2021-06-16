package com.sam.springdemo.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sam.springdemo.entity.Cart;
import com.sam.springdemo.entity.Helper;
import com.sam.springdemo.entity.Order1;

@Repository
public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void getProduct(int theId, int i,int p) {
		System.out.println("id"+theId);
		Session currentSession = sessionFactory.getCurrentSession();
		int cid=0,oid=0,q=0,l=0,flag=0;
		Query query=currentSession.createQuery("from Cart");
//		query.setParameter("id", theId);
//		query.setParameter("oo", i);
		
		List<Cart> ll=query.list();
		for(Cart p2:ll)
		{
			if(p2.getProductId()==theId)
			{
				flag=1;
				System.out.println("productId"+p2.getProductId()+"qty"+p2.getQuantity());
				q=p2.getQuantity();
			}
		}
		l=i+q;
		System.out.println(l);
		
		Query q2=currentSession.createQuery("from Helper");
		List<Helper> l2=q2.list();
		for(Helper k:l2)
		{
			cid=k.getCid();
			oid=k.getOid();
		}
		if(flag==1)
		{
		Cart cc=currentSession.get(Cart.class, theId);
		cc.setQuantity(l);
		currentSession.save(cc);
		}
		else
		{
			Cart c2=new Cart(theId,p,l,cid,oid);
			currentSession.saveOrUpdate(c2);
		}
//		currentSession.createQuery("delete from Cart where productId="+theId).executeUpdate();
//		Cart cc=new Cart(theId,p,l,cid,oid);
//		currentSession.saveOrUpdate(cc);
	}
	
	@Override
	public List<Cart> getCart() {
		Session currentSession = sessionFactory.getCurrentSession();
		int cid=0,oid=0;
		Query q=currentSession.createQuery("from Helper");
		List<Helper> l=q.list();
		for(Helper k:l)
		{
			cid=k.getCid();
			oid=k.getOid();
		}
		System.out.println(cid);
		Query query=currentSession.createQuery("from Cart c where c.customerId=:id and c.orderId=:oo");
		query.setParameter("id", cid);
		query.setParameter("oo", oid);
		List<Cart> ll=query.list();
		System.out.println(ll.size());
		return ll;
	}

	@Override
	public void check() {
		Session currentSession = sessionFactory.getCurrentSession();
		int cid=0,oid=0,total=0;
		Query q=currentSession.createQuery("from Helper");
		List<Helper> l=q.list();
		for(Helper k:l)
		{
			cid=k.getCid();
			oid=k.getOid();
		}
		System.out.println(cid);
		Query query=currentSession.createQuery("from Cart c where c.customerId=:id and c.orderId=:oo");
		query.setParameter("id", cid);
		query.setParameter("oo", oid);
		List<Cart> ll=query.list();
		for(Cart p:ll)
		{
			total+=p.getProductPrice()*p.getQuantity();
		}
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		Order1 o=new Order1(oid,timeStamp,"Pending",total);
		currentSession.save(o);
		currentSession.createQuery("delete from Cart").executeUpdate();
	}

	@Override
	public void deleteProduct(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Cart theProduct=currentSession.get(Cart.class, theId);
		currentSession.delete(theProduct);
	}

}
