//Event Handling in Spring

package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
context.start();

HelloWorld h1=(HelloWorld)context.getBean("helloWorld");
h1.getMessage();

context.stop();

}

}
