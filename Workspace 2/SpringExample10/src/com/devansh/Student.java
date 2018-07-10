package com.devansh;

import org.springframework.beans.factory.annotation.Required;

public class Student {
private String name;
private int age;
@Required
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return(name);
}
@Required
public void setAge(int age)
{
	this.age=age;
}
public int getAge()
{
	return(age);	
}
}
