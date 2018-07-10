package com.demo.Model;
/*Hibernate - Persistent Class
 * A simple POJO
 */
public class Items {
	private int id;
	private String name;
	private double price;
	private String vendor;

	public Items() {

	}

	public Items(String name, double price, String vendor) {
		super();
		this.name = name;
		this.price = price;
		this.vendor = vendor;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", vendor=" + vendor + "]";
	}
	
}
