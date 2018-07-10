package com.devansh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
@Autowired
@Qualifier("student1")
private Student s;
public Profile()
{
	System.out.println("Inside Profile Constructor");
}
public void printName()
{
	System.out.println("Name:"+s.getName());
}
public void printAge()
{
	System.out.println("Age:"+s.getAge()	);
}

}
