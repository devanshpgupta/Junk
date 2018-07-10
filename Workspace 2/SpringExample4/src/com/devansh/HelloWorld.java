package com.devansh;

public class HelloWorld {
	public String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	public void getMessage()
	{
		System.out.println("The Message is "+message);
	}
	public void init()
	{
		System.out.println("Bean is going through init");
	}
	public void destroy()
	{
		System.out.println("Bean is going through destroy");
	}
}
