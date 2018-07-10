package Wednesday30;
//Apache common jars for queue.
import java.util.*;

import org.apache.commons.collections4.queue.CircularFifoQueue;
public class worker implements Runnable{
	Thread t;
	int i=1;
	String name;
	public worker(order order) {
		name=String.valueOf(order.num);
		t=new Thread(this,name);
		System.out.println(t);
		t.start();
	}
	public void run() {
		System.out.println("Waiting for order "+name+" to be Fullfilled");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
		System.out.println("Order" +name+": Fullfilled");
	}
	public static void main(String args[])
{
	Queue<order> queue=new CircularFifoQueue<order>(5);
	for(int j=0;j<2;j++)
	for(int i=0;i<5;i++)
	{
		queue.add(new order((int)(Math.random()*10+1)));//Generating Random Order Number.
		new worker(((CircularFifoQueue<order>) queue).get(i));//Passing the order object.
		System.out.println("QUEUE size is "+queue.size());
		System.out.println();
		}	
}
}
