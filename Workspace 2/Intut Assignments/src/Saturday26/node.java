package Saturday26;

import java.util.Scanner;

public class node {
	static Boolean left=false;
	static Boolean right=false;
	static int num=0;
	int mnum;
	static Boolean ml;
	Boolean mr;
	static int i=0;
	//node parent;
	static Scanner sc=new Scanner(System.in);
	node(int num,Boolean left,Boolean right)
	{
		this.left=left;
		this.right=right;
		this.num=num;
		//this.parent=parent;
	}
		static void Branch(String temp)
	{
		System.out.println("Please enter the "+temp+" node:");
		
		int num=Integer.valueOf(sc.nextLine());
		System.out.println("Does "+num+" have left Node(True/False):");
		
		Boolean lef=Boolean.valueOf(sc.nextLine());
		if(lef==true) {
			String temp1="Left";
			node.Branch(temp1);
		}
		System.out.println("Does "+num+" have right Node(True/False):");
		Boolean rig=Boolean.valueOf(sc.nextLine());//s.hasNextLine();
		if(rig==true) {
			String temp1="Right";
			node.Branch(temp1);
		}
		BinaryTreeHashMap.nd.add(new node(num,lef,rig));
	}
	
	static void Display(int temp)
	{
		System.out.println("Binary Tree");
		//System.out.println(BinaryTreeHashMap.nd.);
	/*	for(node nd:BinaryTreeHashMap.nd)
		{
			System.out.println(nd);
		}
	*/
		System.out.println(BinaryTreeHashMap.nd.get(BinaryTreeHashMap.nd.size()-temp));
		if(ml==true)
			{
			System.out.println("ml:"+ml);
			Display(i);
			i++;
			}
		
		
		
	}
	//System.out.println(new StringBuilder().append("BinaryTreeHashMap.nd: ").append(BinaryTreeHashMap.nd).toString());
	public String toString() {
	    System.out.println(":::::::::::::::::::::::::::::::::::::"); 
	    mnum=num;
	    ml=left;
	    mr=right;
	    return "[ Num=" +num+ ", Left=" +left+ ", Right=" +right+ "]";
		
	    }
}
