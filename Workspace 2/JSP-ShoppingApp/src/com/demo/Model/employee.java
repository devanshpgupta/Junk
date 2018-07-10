package com.demo.Model;

public class employee {

	private String lname;
	private String fname;
	private String password;
	private String role="customer";
	private double salary;
	private double telno;
	public employee()
	{
		
	}
	
	public employee(String lname, String fname, String password, String role, double salary, double telno) {
		super();
		this.lname = lname;
		this.fname = fname;
		this.password = password;
		this.role = role;
		this.salary = salary;
		this.telno = telno;
	}
	public String getRole() {
		return role;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	
}
