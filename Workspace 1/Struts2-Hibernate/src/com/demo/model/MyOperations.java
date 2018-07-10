package com.demo.model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.*;

public class MyOperations {
	SessionFactory factory=HibernatePlug.getSessionFactory();
	Session session=factory.openSession();
	List<employee> list=null;
	public List<employee> retriveRecords()
	{
		list=(List<employee>) session.createQuery("from employee").list();
		System.out.println("Size of List:"+list.size());
		return list;
	}
	public List<employee> retriveRecords(String val)
	{	
		list=(List<employee>)session.createQuery("from employee e where e.id="+val).list();
		System.out.println("Size of List:"+list.size());
		return list;
	}
	public void updaterecord(employee e)
	{
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("update employee e set e.fname=?,e.lname=?,e.password=?,e.salary=?,e.telno=?"
				+ ",e.rol=? where e.id=?"+e.getId());
		q.setParameter(0,e.getFname());
		q.setParameter(1,e.getLname());
		q.setParameter(2,e.getPassword());
		q.setParameter(3,e.getSalary());
		q.setParameter(4,e.getTelno());
		q.setParameter(5,e.getRole());
		System.out.println("Record updated");
		tx.commit();
	}
}
