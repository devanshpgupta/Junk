//Spring @Qualifier Annotation
package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[])
	{
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
Profile pro=(Profile) context.getBean("profile");
pro.printName();
pro.printAge();
	}
}
