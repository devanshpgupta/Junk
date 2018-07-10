//Setting Scope for bean file as prototype i.e. it creates new instance of the object every time.
package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
HelloWorld h1=(HelloWorld) context.getBean("helloworld");
h1.setMessage("This is object A");
h1.getMessage();

HelloWorld h2=(HelloWorld) context.getBean("helloworld");
h2.getMessage();
	}

}
