package src.com.demo;

import java.util.ArrayList;
import java.util.List;

public class Number {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int value;
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
	
	public int getValue() {
		return value;
	}
	
	public void add(Observer o) {
		observers.add(o);
	}
	
	private void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}

}
