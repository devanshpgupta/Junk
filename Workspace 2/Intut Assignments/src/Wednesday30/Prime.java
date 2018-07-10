package Wednesday30;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Prime {
	static int num=0;
	public static Boolean calculate(ConcurrentLinkedQueue<Integer> q1) {
			num=q1.poll();
			int temp=num/2;
			for(int i=2;i<temp;i++)
			{
				if(num%i==0)
				{
					return true;
				}
				else
					if(i==temp-1) {
					return false;
						}
			}
			return null;	
	}


}
