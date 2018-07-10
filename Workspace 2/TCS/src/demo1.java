import java.util.Scanner;

public class demo1
{
	static String emailAddress=new String();
	boolean validateEmailAddress(String emailAddress)
	{
		String username=new String();
		int loc;
		loc=emailAddress.lastIndexOf("@");
		System.out.println("Size of user name: "+loc);
		if(loc>10 || loc<5)
		return false;
		else
			
			return true;
		
	}
	boolean isUmassdAccount(String emailAddress)
	{
		String domain=new String();
		String dom=new String();
		dom="umassd.edu";
		domain=emailAddress.substring(emailAddress.lastIndexOf("@") + 1);
	//	System.out.println("Value in domain is " +domain);
		int compareValue = dom.compareToIgnoreCase(domain);
		if (compareValue == 0)
			;
		else
			{
			System.out.println("It is not a umassd Account");
			return false;
			}
		return true;
		
	}
	static boolean isGmailAccount(String emailAddress)
	{
		String domain=new String();
		String dom=new String();
		dom="gmail.com";
		domain=emailAddress.substring(emailAddress.lastIndexOf("@") + 1);
	//	System.out.println("Value in domain is " +domain);
		int compareValue = dom.compareToIgnoreCase(domain);
		if (compareValue == 0)
			System.out.println("It is a Gmail Account");
		else
			{
			System.out.println("It is not a Gmail Account");
			return false;
			}
		return true;
		
		
	}
	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		boolean b;
		b=false;
		demo1 a1=new demo1();
		System.out.println("Please enter email Address:");
		a1.emailAddress=s.next();
		System.out.println("Email Address is "+a1.emailAddress );
		b=a1.validateEmailAddress(a1.emailAddress);
		if(b==true)
		{
			b=a1.isUmassdAccount(emailAddress);
		if(b==true)
			System.out.println("It is a umassd Account");
		else
		if(b==false)
		{
			b=isGmailAccount(emailAddress);
		}
		}
		if(b==false)
		{
			System.out.println("Incorrect User Name or Domain");
		}
		
		
	}
}