//Spring-Bean Defination Inheritance.

package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
HelloWorld h1=(HelloWorld) context.getBean("helloworld");
h1.getMessage1();
h1.getMessage2();

HelloIndia i1=(HelloIndia) context.getBean("helloindia");
i1.getMessage1();
i1.getMessage2();
i1.getMessage3();

	}

}
