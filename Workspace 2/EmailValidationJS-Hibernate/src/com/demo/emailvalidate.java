package com.demo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.demo.model.Employee;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
public class emailvalidate{
	SessionFactory factory;
	public emailvalidate()
	{
		try{
			Configuration config = new AnnotationConfiguration().configure();
			factory = config.buildSessionFactory();
			System.out.println("configured");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void fetchAll()
	{
		try {
		Session session = factory.openSession();
		Query query = session.createQuery("from Employee");
System.out.println("****************");
		
		} catch(Exception e) {
		e.printStackTrace();
	}
	
	/*	
		eval e1=new eval("a@abc.com");
		eval e2=new eval("b@abc.com");
		eval e3=new eval("c@abc.com");
		eval e4=new eval("d@abc.com");
		eval e5=new eval("e@abc.com");
		eval e6=new eval("f@abc.com");
		eval e7=new eval("g@abc.com");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		session.persist(e4);
		session.persist(e5);
		session.persist(e6);
		session.persist(e7);
		*/
	//	transaction.commit();
		System.out.println("Table created and commited");
	}
	
	
}
