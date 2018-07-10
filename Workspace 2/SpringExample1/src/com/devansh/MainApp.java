package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new FileSystemXmlApplicationContext("C:/Users/devan/workspace/SpringExample1/src/bean.xml");
		HelloWorld h1=(HelloWorld) context.getBean("helloworld");
		h1.getMessage();

	}

}
