package randomizerprimer;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author vincent
 *
 */
public class Randomizer implements Runnable {
	
	static PriorityQueue<RandomNumber> queue = new PriorityQueue<RandomNumber>(25);
	static PriorityQueue<RandomNumber> primerQueue = new PriorityQueue<RandomNumber>(25);
	
	Thread t;
	String name;
	
	Randomizer(String name) {
		this.name = name;
		t = new Thread(this, name);
		//t.setDaemon(true);
		//t.setPriority(9);
		t.start();
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			int num = (int) (Math.random() * 100);
			queue.add(new RandomNumber(num));
			System.out.println(name + " ADDED " + num);
		}
		try{
			Thread.sleep(5);
		} catch(Exception e) {
			
		}
		while(!primerQueue.isEmpty()) {
			RandomNumber number = primerQueue.poll();
			System.out.println(name + " => " + number.getNumber() + " => " + number.isPrime());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double d = Math.random();
		System.out.println(d);
		int num = (int) (d * 100);
		System.out.println(num);
		*/
		
		
		new Randomizer("ONE");
		new Randomizer("TWO");
		try{
			Thread.sleep(1);
		} catch(Exception e) {
			
		}
		new Primer("PR1");
		new Primer("PR2");
		new Primer("PR3");

	}
	
}
