package com.demo.ecomm;

public class ProductsBean {
private String name;
private double price;
public ProductsBean()
{
	
}
public ProductsBean(String name,double price)
{
	this.name=name;
	this.price=price;
}
public String displayInfo() {
	return "["+name+"--->"+price+"]";
}
public void changePrice()
{
	price*=Math.random()*100;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
