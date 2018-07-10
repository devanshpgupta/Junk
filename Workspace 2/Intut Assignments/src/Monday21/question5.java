//Find out the count of 0's & 1's
package Monday21;
import java.util.Scanner;

public class question5 {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter 1 and 0's String:");
String str=sc.nextLine();
//System.out.println(str.length());
int count1=0;
int count0=0;
int i=0;
for(i=0;i<str.length();i++)
{
	if(str.charAt(i)=='1')
		count1++;
	else
		if(str.charAt(i)=='0')
			count0++;
}
System.out.println("Count of 1 is "+(count1));

System.out.println("Count of 0 is "+(count0));
}
}
