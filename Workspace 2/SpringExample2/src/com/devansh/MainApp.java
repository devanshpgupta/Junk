//Setting Scope for bean file as singleton i.e. creating only one instance of the object
package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
HelloWorld h1= (HelloWorld) context.getBean("helloworld");
h1.setMessage("I am object A");
h1.getMessage();

HelloWorld h2=(HelloWorld) context.getBean("helloworld");
//h2.setMessage("I am object B");
h2.getMessage();
	}

}
