package Saturday26;

import java.util.*;

public class TextUILinkedList {
	LinkedList<String> elements=new LinkedList<String>();
	ArrayList<Integer> cart=new ArrayList<Integer>();
	static Scanner S=new Scanner(System.in);
	TextUILinkedList()
	{
	}
	void Create() {
		System.out.println("Please enter the Products(Enter 0 WHEN DONE):");
		for(int i=0;;i++)
		{
			String srs=S.nextLine();
			if(srs.equals("0"))
				return;
			else
				elements.add(srs);
		}
	}
	void Display(LinkedList<String> elements)
	{
	System.out.println("Product List is as follows:");
	Iterator itr=elements.iterator();
	int i=0;
	while(itr.hasNext()) {
		System.out.println(i+":"+itr.next());i=i+1;
	}
	}
	void Delete()
	{
	System.out.println("Please enter the product you want to delete:");
	int temp=S.nextInt();
	elements.remove(temp);
	Display(elements);
	}
	void Edit(int num)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the product name:");
		String str=sc.nextLine();
		elements.set(num,str);
		Display(elements);
	}
	void addtoCart()
	{
		
		System.out.println("Please enter the Product number to add To cart:");
		
		for(int i=0;;i++)
		{
			Integer num=S.nextInt();
			if(num>elements.size()-1)
			return;
			else
				{
				cart.add(num);
				}
			}
	}
	void DispCart()
	{
		System.out.println("Product in cart:");
		for(int i=0;i<cart.size();i++)
		{
			int num=cart.get(i);
			for(int j=0;;j++)
				if(j==num)
				{
			System.out.println(i+":"+elements.get(j));
			break;
				}
		}
	}
	void DelCart()
	{
		System.out.println("Please enter the Product Number to remove from cart:");
		int temp=S.nextInt();
		cart.remove(temp);
		System.out.println("Elements in cart:"+cart);
		
		DispCart();
	}
public static void main(String args[])
{
	TextUILinkedList ui1=new TextUILinkedList();
	ui1.Create();
	ui1.Display(ui1.elements);
	System.out.println("Please enter the product number to edit:");
	int num=S.nextInt();
	ui1.Edit(num);
	ui1.Delete();
	ui1.addtoCart();
	ui1.DispCart();
	ui1.DelCart();
}
}
