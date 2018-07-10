/*Devansh Gupta*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation{
	static boolean validateEmailAddress(String emailAddress)
	{
		
		boolean b=false;
		b=assignment1.isUmassdAccount(emailAddress);
		if(b==false)
		{
			b=assignment1.isGmailAccount(emailAddress);
		}
		return false;
		
	}
	String getLocalPart(String emailAddress)
	{
		 
	        String[] words = emailAddress.split("[@._]");  
	        String username=new String();
	        username=words[0];
	        String temp=words[1];
	//        String numRegex   = ".*[0-9].*";
	 //       String alphaRegex = ".*[A-Z].*";
	        String fl=username.substring(0,1);
	        boolean xxxxx;
	        System.out.println("Username=" +username); 
	        if(username.length()>10 || username.length()<5 )
	        {
	        	System.out.println("Incorrect Email Address");
	        	return "incorrect";}
	        else
	        if(username.substring(0,1).matches("[a-z]") && (username.matches("^[a-zA-Z]+[a-zA-z][0-9]*$")))// || username.matches(alphaRegex)) )
	        {
	      //	System.out.println("*******************************************");
	      //  	 System.out.println("Username=" +username); 
	        	System.out.println("Length of User name is "+username.length());
	        	System.out.println("And UserName starts with a character and character is " +fl);
	        	System.out.println("UserName Accepted");
	      //  	System.out.println("*******************************************");
	        	assignment1.validateEmailAddress(emailAddress);;
	        }
	        		else
	        		{	xxxxx=username.matches("[a-zA-Z0-9]");
	        			System.out.println("Vlaue in xxxxxxx " +xxxxx);
	        			return "incorrect";
	        		}
	        	return "correct";
	}
	static boolean isUmassdAccount(String emailAddress)
	{
		Pattern pattern = Pattern.compile(".*umassd.edu",Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(emailAddress);  
        if( matcher.matches()==true)
        System.out.println("Its a Umassd Account ");  
        else
		return false;
        return true;
		
	}
		static boolean isGmailAccount(String emailAddress)
		{
			Pattern pattern = Pattern.compile(".*gmail.com",Pattern.CASE_INSENSITIVE);  
	        Matcher matcher = pattern.matcher(emailAddress);  
	        if( matcher.matches()==true)
	        System.out.println("Its a Gmail Account ");  
	        else
			System.out.println("Incorrect Domain Name");
	        return false;
			
		}
    public static void main(String[] args) {  
    	
    	assignment1 demo=new assignment1();
    	Scanner s=new Scanner(System.in);
    	//System.out.println("Please enter email Address:");
		//String emailAddress=s.next();
		String temp=new String();
		temp=demo.getLocalPart("dgupta1@umassd.edu");
				if(temp.equals("incorrect"))
				{
			System.out.println("Incorrect Email Address");
				}
		System.out.println("*****************************");
		temp=demo.getLocalPart("dgupta1@gmail.com");
		System.out.println("*****************************");
		temp=demo.getLocalPart("1dev@umassd.edu");
		System.out.println("*****************************");
		temp=demo.getLocalPart("dgupta1@yahoo.com");
		System.out.println("*****************************");
		temp=demo.getLocalPart("dgupta1#$@yahoo.com");
		System.out.println("*****************************");
    }
        }

