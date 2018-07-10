package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.Model.Items;

public class Test {

	public Test() {

		try {
			Configuration config = new Configuration()
					.configure("hibernate.cfg.xml");
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			Items i1 = new Items("USB", 12.34, "Amazon");
			Items i2 = new Items("Speakers", 500.00, "Sonos");
			Items i3 = new Items("Laptop", 550.50, "HP");
			Items i4 = new Items("MacBookPro", 1500, "Apple");
			Items i5 = new Items("HeadPhones", 200, "Sol Reublic");

			session.persist(i1);
			session.persist(i2);
			session.persist(i3);
			session.persist(i4);
			session.persist(i5);
			transaction.commit();
			System.out.println("Items Created");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test();
	}

}
