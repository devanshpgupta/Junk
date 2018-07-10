package src.com.demo;

public class Hexa extends Observer {
	
	public Hexa(Number number) {
		this.number = number;
		this.number.add(this);
	}
	
	public void update() {
		System.out.println("HEXA: " + Integer.toHexString(this.number.getValue()));
	}
	
}
