package workerorder;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Worker implements Runnable {
	
	static PriorityQueue<Order> queue = new PriorityQueue<Order>(5);
	Thread t;
	static int count=0;
	String name;
	static int orderCount = 5;
	
	/**
	 * @param name
	 * Threads to process orders (Poll and change state)
	 */
	public Worker(String name) {
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}
	
	/**
	 * @param name
	 * @param isDaemon
	 * To initialize Daemon thread which can 
	 * add new order asynchronously
	 */
	public Worker(String name, boolean isDaemon) {
		this.name = name;
		t = new Thread(new AddNewOrder(), name);
		t.setDaemon(isDaemon);
		t.start();
	}
	
	/*
	 An inner class representing daemon thread which can access
	 the queue and counter variables of outer class 
	 */
	class AddNewOrder implements Runnable {
		public void run() {
			addOrder(name);
		}
		
		public void addOrder(String name) {
			/* The new order is added to Queue until count 
			 becomes 10.
			 */
			while(orderCount < 10) {
				if(queue.size() < 5) {
					orderCount++;
					Order order = new Order(orderCount, "NEW");
					queue.add(order);
					System.out.println("NEW ORDER: [" + name + "]: " + order);
				}
			}
		}
		
	}
	
	// Each thread's body which will process the order
	public void run() {
		processOrder(name);
		System.out.println("Exiting..." + name);
	}
	
	/* The processing logic invoked by each thread which will 
	  continue as long as there are orders in Queue 
	*/
	public void processOrder(String name) {
		while(!queue.isEmpty()) {
			count++;
			Order order = queue.poll();
			order.setState("FULFILLED");
			System.out.println("[THREAD " + name + "] Polled: " + order + "==> " + count);
		}
	}
	
	
	public static void main(String a[]) {
		
		/*
		 Add 5 orders to the Queue
		 */
		for(int i=1;i<=5;i++) {
			queue.add(new Order(i, "NEW"));
			System.out.println(queue);
		}
		
		/*
		 Create a daemon thread to asynchronously adding
		 orders to queue when the queue size reduces from 5. 
		 */
		Worker w0 = new Worker("Zero", true);
		Worker w1 = new Worker("One");
		Worker w2 = new Worker("Two");
		Worker w3 = new Worker("Three");
		
	}

}
