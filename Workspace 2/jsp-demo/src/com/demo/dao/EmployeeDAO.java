package com.demo.dao;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeDAO {
	
	SessionFactory factory;

	public EmployeeDAO() {
		
		try{
			Configuration config = new AnnotationConfiguration().configure();
			factory = config.buildSessionFactory();
			System.out.println("configured");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Employee> fetchAll() {
		try{
			
			Session session = factory.openSession();
			Query query = session.createQuery("from Employee");
			return query.list(); 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int insertEmployee(Employee emp) {
		
		try{
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			session.save(emp);
			t.commit();
			session.close();
			return 1;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public Employee getDetails(int empId) {
		
		try{
			Session session = factory.openSession();
			Employee emp = (Employee) session.get(Employee.class, empId);
			session.close();
			return emp;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int editEmployee(Employee emp) {
		try{
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(emp);
			transaction.commit();
			session.close();
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	

}
