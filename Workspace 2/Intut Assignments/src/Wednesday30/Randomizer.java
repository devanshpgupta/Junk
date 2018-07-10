package Wednesday30;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
public class Randomizer implements Runnable{
	//Using ConcurrentLinkedQueue, since it is an appropriate choice when many threads
	//will share access to a common collection.
	public static ConcurrentLinkedQueue<Integer> q1=new ConcurrentLinkedQueue<Integer>(); 
	static Thread t;
	static int num=1;
	static Random r=new Random();
	Boolean val;
	Randomizer()
	{
		t=new Thread(this);
		System.out.println(t);
		t.start();
	}
	public void run()
	{
		try {
		//	num=r.nextInt(100)+1;
			System.out.println("Number is "+num);
			q1.add(num);
			val=Prime.calculate(q1);
			if(val==true)
				System.out.println("Number:"+num+" is not Prime");
			else
				if(val==false)
				System.out.println("Number:"+num+" is Prime");
		}
		catch(Exception e)
		{
			System.out.println("+++++");
		}
	}
	public static void main(String args[])
	{
		int i=0;
		for(i=0;i<10;i++)
		{
		new Randomizer();
		}
		
	}
	
}
