package Wednesday30;

import java.util.Queue;
import java.util.Random;

public class order {
static String state;
static int num;
order(int num)
{
	this.num=num;
	state="NEW";
	System.out.println("Order "+num+":"+state);
}
public static void fullfill(String src, Queue<order> queue) {
	// TODO Auto-generated method stub
	state=src;
	System.out.println("Order" +num+":"+state);
	queue.poll();
}
}
