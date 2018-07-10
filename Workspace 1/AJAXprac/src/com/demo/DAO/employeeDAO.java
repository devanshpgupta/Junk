package com.demo.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class employeeDAO {
	private String name;
	private String password;
	
public employeeDAO()
{}
public void temp() {
	try
	{
		System.out.println("Inside Here");
		System.out.println(name+":"+password);
		Configuration config=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Query query=session.createQuery("from employee where name=:namex");
	query.setParameter("namex", name);
	List results=query.list();
	System.out.println("Query Executed and rows affected are "+results.size());
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
