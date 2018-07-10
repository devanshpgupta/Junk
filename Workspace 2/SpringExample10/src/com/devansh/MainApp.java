//Spring @Required Annotation

package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
Student s1=(Student)context.getBean("student");
System.out.println("Name:" +s1.getName());
System.out.println("Age:"+s1.getAge());
	}

}
