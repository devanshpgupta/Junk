package Practice;
import java.util.*;
public class node {
int num;
node lf;
node rg;
Boolean left;
Boolean right;
Scanner s=new Scanner(System.in);
	void Create(String str)
{
	System.out.print("Please enter the "+str+" Node:");
	num=Integer.valueOf(s.nextLine());
	System.out.print("Does "+num+" have Left Node(TRUE/FALSE):");
	left=Boolean.valueOf(s.nextLine());
	if(left==true)
	{	lf=new node();
		lf.Create("left");
	}
	System.out.print("Does "+num+" have Right Node(TRUE/FALSE):");
	right=Boolean.valueOf(s.nextLine());
	if(right==true)
	{
		rg=new node();
		rg.Create("Right");
	}

	
}
	void Display()
	{
		System.out.print(num);
		System.out.println();
		if(left==true)
		{	System.out.print("Left of "+num+":");
			lf.Display();
		}
		if(right==true)
			{
			System.out.print("Right of "+num+":");
			rg.Display();
			}
		
	}
}
