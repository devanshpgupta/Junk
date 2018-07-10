//Find out the count of Max consecutive 0's
package Monday21;
import java.util.Scanner;

public class question3 {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter 1 and 0's String:");
String str=sc.nextLine();
int count=1;
int temp=1;
int i=0,j=0;
for(i=0;i<str.length();i++)
{
	if(str.charAt(i)=='0')	
		for(j=i+1;j<str.length();j++)
		{
		if(str.charAt(j)=='0')
			{
				count++;
			}
			else
				break;
		}
	if(count>temp)
		{temp=count;
		count=0;
		}
}
System.out.println("Count is "+(temp));
}
}
