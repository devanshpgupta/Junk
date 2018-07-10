package com.demo.Model;

public class products {
private String prod_name;
private double prod_price;
private int prod_id;

public products()
{
}
public products(String prod_name, double prod_price, int prod_id) {
	super();
	this.prod_name = prod_name;
	this.prod_price = prod_price;
	this.prod_id = prod_id;
}
public String getProd_name() {
	return prod_name;
}
public void setProd_name(String prod_name) {
	this.prod_name = prod_name;
}
public double getProd_price() {
	return prod_price;
}
public void setProd_price(double prod_price) {
	this.prod_price = prod_price;
}
public int getProd_id() {
	return prod_id;
}
public void setProd_id(int prod_id) {
	this.prod_id = prod_id;
}
}
