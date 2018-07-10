package Thursday24.com.demo.cart;
import java.util.Scanner;

import Thursday24.com.demo.product.*;
public class cart extends product {
	public int[] num=new int[2];
	public int count1=2;
	Scanner sc=new Scanner(System.in);
	public void cart1()
{
		int i=0;
		for(i=0;i<2;i++)
		{
			System.out.println("Please enter the 2 PRODUCT NUMBERS that you want to add to cart:");
			num[i]=sc.nextInt();
		}
}
	
}
