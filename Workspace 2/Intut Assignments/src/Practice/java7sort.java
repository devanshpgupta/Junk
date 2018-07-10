package Practice;
import java.util.*;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class java7sort {
public static void main(String args[])
{
	List<String> l1=new ArrayList<String>();
	l1.add("Devansh");
	l1.add("Bcd");
	l1.add("Xyz");
	l1.add("Fgh");
	
	System.out.println(l1);
	System.out.print("Sorting:");
	Collections.sort(l1,new Comparator<String>()
			{
				public int compare(String o1, String o2) {
					
					return o1.compareTo(o2);
				}
		
			});
	System.out.println(l1);
	
}
}
