package Thursday24.com.demo.product;

import java.util.Scanner;

public class product {
	public int count=5;
	Scanner s=new Scanner(System.in);
	public String[] products=new String[5];
	public void entproducts()
	{
		int i=0;
		for(i=0;i<count;i++)
		{
			System.out.println("Please enter Product Nos."+(i+1)+":");
			products[i]=s.nextLine();
		}
	}
	}
