//helloworld|HeLlOwOrLd
package Monday21;
import java.util.Scanner;

public class question6 {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the String:");
String str=sc.nextLine();
char ch[]=str.toCharArray();
int i=0;
for(i=0;i<str.length();i++)
	if(i%2==0)
		ch[i]=Character.toUpperCase(str.charAt(i));
	
String str1=new String(ch);
System.out.println(str+"|"+str1);

}
}