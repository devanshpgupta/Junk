package com.demo.model;

public class employee {
private int id;
private String fname;
private String lname;
private String password;
private double salary;
private double telno;
private String role;
public employee()
{
	
}
public employee(String fname, String lname, String password, double salary, double telno, String role) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.password = password;
	this.salary = salary;
	this.telno = telno;
	this.role = role;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getTelno() {
	return telno;
}
public void setTelno(double telno) {
	this.telno = telno;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}


}
