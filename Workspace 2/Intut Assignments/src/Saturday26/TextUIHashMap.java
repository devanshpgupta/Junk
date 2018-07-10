package Saturday26;

import java.util.*;

public class TextUIHashMap {
	HashMap<Integer,String> elements=new HashMap<Integer,String>();
	Scanner sc=new Scanner(System.in);
	void Create()
	{
		System.out.println("Please enter Product Names(Enter 0 WHEN DONE):");
		for(int i=0;;i++)
		{
			String src=sc.nextLine();
			if(src.equals("0"))
			return;
			else
				elements.put(i,src);
		}
		
	}
	void Display()
	{
		Iterator it=elements.entrySet().iterator();
		System.out.println("Products Entered are as Follows:");
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry) it.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
	}
	void Remove()
	{
		int temp=0;
		System.out.println("Please enter Product Number to Remove:");
		temp=sc.nextInt();
		elements.remove(temp);
		Display();
	}
	void Edit()
	{
		System.out.println("Please enter the Product to ADD:");
		String src=sc.nextLine();
		int siz=elements.size();
		elements.put(siz, src);
		Display();
	}
	public static void main(String args[])
{
	TextUIHashMap ui=new TextUIHashMap();
	ui.Create();
	ui.Display();
	ui.Remove();
	ui.Edit();//Adding product names to Map
	
	
}
}
