//Taking input as  a string followed by an integer.

package demo1;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Bool;
public class demo1 {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Please Enter The string:");
String input=s.nextLine();
//System.out.println("String:" +input);
String ln=input.substring(input.length()-1);
int num=0;
num=Integer.parseInt(ln);
//System.out.println("Number is " +num);
int i=0;
int num1=1;
String rev="";
String temp="";
int j=0;
boolean rec=false;
for(i=0;i<input.length()-2;i++)
{
		if(num1==num)
	{
		temp=temp+input.charAt(i);
	}
	else
	{
		rev=rev+input.charAt(i);
	}
	if(input.charAt(i+1)==' '&& rec==false)
	{
		for(j=temp.length()-1;j>=0;j--)
		{
		rev=rev+temp.charAt(j);
		num1++;
		rec=true;
		}
		}

	if(input.charAt(i)==' ')
		num1++;

}
System.out.println("Reverse:"+rev);
}
}


