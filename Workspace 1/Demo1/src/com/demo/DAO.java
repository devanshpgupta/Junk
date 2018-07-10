package com.demo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAO {
	SessionFactory factory;
	public DAO() {
		try{
			Configuration config = new Configuration().configure("hibernate.cfg.xml");
			factory = config.buildSessionFactory();
			System.out.println("configured");
		} catch(Exception e) {
			System.out.println("Not here");
			e.printStackTrace();
		}
	}
	public void call()
	{
		try {
			Session session = factory.openSession();
			Query query = session.createQuery("from model");
	System.out.println("****************");
			
			} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
