package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayListSortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(20);
		num.add(1,10);
		num.add(2, 5);
		System.out.println("The numbers are ");
		Iterator it=num.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Collections.sort(num);
		System.out.println("After Sorting:");
		for(Integer num1:num)
		{
			System.out.println(num);
		}
	}

}
