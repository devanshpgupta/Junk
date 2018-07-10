package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.ecomm.ProductsBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductsBean bean=(ProductsBean) context.getBean("prod");
		System.out.println(bean.displayInfo());
		bean.changePrice();
		System.out.println(bean.displayInfo());
	}

}
