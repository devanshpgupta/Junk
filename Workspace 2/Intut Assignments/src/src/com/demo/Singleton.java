package src.com.demo;

import java.util.Date;

// 1. private constructor
// 2. static instance

// EAGER
// LAZY
// Synchronized
// Double Checked
// ENUM
// Bill Pugh


public class Singleton {
	
	static Singleton singleton;
	
	private Singleton() {
		System.out.println(new Date().getTime());
	}
	
	public static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
		
	}

}


