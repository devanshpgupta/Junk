//Spring @Autowired Annotation

package com.devansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
TextEditor t1=(TextEditor)context.getBean("textEditor");
	t1.texteditor();
	
	}

}
	
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.texteditor();
   }
}
*/