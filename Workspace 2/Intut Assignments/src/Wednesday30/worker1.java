package Wednesday30;
//Apache common jars for queue.
import java.util.*;

import org.apache.commons.collections4.queue.CircularFifoQueue;
public class worker1 extends Thread{
	static Queue<order> queue=new CircularFifoQueue<order>(5);
	
}
