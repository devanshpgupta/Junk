//Custom Events in Spring

package com.devansh;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ConfigurableApplicationContext context = 
	            new ClassPathXmlApplicationContext("bean.xml");
	   	  
	         CustomEventPublisher cvp = 
	            (CustomEventPublisher) context.getBean("customEventPublisher");
	         
	         cvp.publish();  
	         cvp.publish();
	      
	}

}
