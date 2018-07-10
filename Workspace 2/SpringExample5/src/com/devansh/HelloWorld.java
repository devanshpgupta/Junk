package com.devansh;

public class HelloWorld {
public String message1,message2;
public void setMessage1(String message)
{
	this.message1=message;
}
public void setMessage2(String message)
{
	this.message2=message;
}
public void getMessage1()
{
	System.out.println("World Message "+message1);
}

public void getMessage2()
{
	System.out.println("World Message "+message2);
}

}
