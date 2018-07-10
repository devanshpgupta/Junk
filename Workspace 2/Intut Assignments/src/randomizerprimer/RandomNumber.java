package randomizerprimer;
public class RandomNumber implements Comparable {
	
	private int number;
	private boolean isPrime;
	
	public RandomNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
