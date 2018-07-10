//Count of lower case and upper case HeLlOwOrLd
package Monday21;
import java.util.Scanner;

public class question7 {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the String:");
String str=sc.nextLine();
char ch[]=str.toCharArray();
int i=0;
int countu=0;
int countl=0;
for(i=0;i<str.length();i++)
{
	if(ch[i]==Character.toUpperCase(str.charAt(i)))
	{
		countu++;
	}
	else
		countl++;
}	
System.out.println("Upper Cases:"+countu);
System.out.println("Lower Cases:"+countl);
}
}