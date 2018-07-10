/**
 * 
 */
package src.com.demo;

import java.util.Random;

/**
 * @author kumar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number number = new Number();
		new Binary(number);
		new Hexa(number);
		new Octal(number);
		int num = new Random().nextInt(15);
		System.out.println("The number is: " + num);
		number.setValue(num);
	}

}
