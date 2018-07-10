package src.com.demo;

public class Binary extends Observer {
	
	public Binary(Number number) {
		this.number = number;
		this.number.add(this);
	}
	
	public void update() {
		System.out.println("BINARY: " + Integer.toBinaryString(this.number.getValue()));
	}
	
}
