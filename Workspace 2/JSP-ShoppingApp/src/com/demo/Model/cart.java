package com.demo.Model;

public class cart {
private String prod_name;
private long prod_price;
private int prod_id;

public cart()
{
}

public cart(String prod_name, long prod_price, int prod_id) {
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
public long getProd_price() {
	return prod_price;
}
public void setProd_price(long prod_price) {
	this.prod_price = prod_price;
}
public int getProd_id() {
	return prod_id;
}
public void setProd_id(int prod_id) {
	this.prod_id = prod_id;
}

}
