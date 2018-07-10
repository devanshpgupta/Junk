package com.demo.model;

public class employee {
private String name;
private String password;
private int id;
public employee()
{
	
}
public employee(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
