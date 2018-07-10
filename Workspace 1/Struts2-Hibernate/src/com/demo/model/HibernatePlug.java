package com.demo.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatePlug {
	private static SessionFactory factory;
	static
		{
		try
			{
			Configuration config=new Configuration().configure("hibernate.cfg.xml");
			factory=config.buildSessionFactory();
			}
		catch(Exception e)
	{
		e.printStackTrace();
	}
		}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}