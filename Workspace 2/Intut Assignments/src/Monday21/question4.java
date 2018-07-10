//Find out pairs of 10
package Monday21;
import java.util.Scanner;

public class question4 {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter 1 and 0's String:");
String str=sc.nextLine();
//System.out.println(str.length());
int count=0;
int i=0,j=0;
for(i=0;i<str.length();i++)
{
	if(str.charAt(i)=='1')
		if(i<str.length()-2) //To control the last character & -2 as per length 
		if(str.charAt(i+1)=='0')
				count++;
}
System.out.println("Count is "+(count));
}
}
