package com.demo;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.Model.Items;

public class DMLstatement {

	public DMLstatement() {

		try {
			Configuration config = new Configuration()
					.configure("hibernate.cfg.xml");
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			Query query=session.createQuery("from Items");
			List<Items> list=query.list();
			for(Items l:list)
			{
				System.out.println(l);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new DMLstatement();
	}

}
