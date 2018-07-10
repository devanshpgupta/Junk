//Initialization call Back and Destruction callback additional function in helloworld

package com.devansh;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
HelloWorld h1=(HelloWorld) context.getBean("helloworld");
h1.getMessage();
context.registerShutdownHook();
	}

}
