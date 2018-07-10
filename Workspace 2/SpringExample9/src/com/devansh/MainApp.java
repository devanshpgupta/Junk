//Spring - Injecting Collection

package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
jc.getList();
jc.getSet();
jc.getMap();
jc.getProp();
	}

}
