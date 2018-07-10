package com.demo.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

public class App {

	public static void main(String a[])
	{
		try {
		String configFile="applicationContext.xml";
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(configFile);
		EmployeeDao dao=(EmployeeDao) context.getBean("employeeDAO");
		Employee emp=new Employee();
		emp.setEmnpid(1);
		emp.setName("James Bond");
		emp.setSalary(2000);
		emp.setDept("Detective");
		dao.insertEmployee(emp);
		System.out.println("Inserted");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
