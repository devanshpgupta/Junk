package src.com.demo;

public class Octal extends Observer {
	
	public Octal(Number number) {
		this.number = number;
		this.number.add(this);
	}
	
	public void update() {
		System.out.println("OCTAL: " + Integer.toOctalString(this.number.getValue()));
	}
	
}
