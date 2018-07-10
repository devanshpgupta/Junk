package com.devansh;

public class Student {
private String name;
private int age;

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	System.out.println("Let me guess Again:" +name);
	return name;
}
public void setAge(int age)
{
	this.age=age;
}
public int getAge()
{
	System.out.println("Also your Age is "+age);
	return age;
}	


}