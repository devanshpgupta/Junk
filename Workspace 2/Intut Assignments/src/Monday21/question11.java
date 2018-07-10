//Shift 2 elements to right
package Monday21;
import java.util.Scanner;

public class question11 {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the number:");
String str=sc.nextLine();

int count=0;
System.out.println("Please enter the count:");
count=sc.nextInt();
char ch[]=new char[10];
for(int i=0;i<str.length();i++)
{
	if(count==str.length())
	{
		count=0;
	}
	ch[count]=str.charAt(i);
	count++;
}
String str1=new String(ch);
System.out.println(str1);
	}

}