package com.demo.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.demo.model.LoginForm;

public class LoginService {
	
	SessionFactory factory;
	
	public LoginService() {
		
		try{
			
			Configuration config = new AnnotationConfiguration()
    		.configure();
    		factory = config.buildSessionFactory();
            
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean isUserExists(String uName, String pWord) {
		
		try{
			Session session = factory.openSession();
			Query query = session.createQuery("from LoginForm where username=:uname and password=:pword");
			query.setParameter("uname", uName);
			query.setParameter("pword", pWord);
			List<LoginForm> list = query.list();
			if(list != null && list.size() > 0)
				return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
