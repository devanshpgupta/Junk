import java.io.*;
import java.util.Scanner;

public class HelloWorld {
	
public static void main( String args[]) throws IOException
{
//	Scanner Input=new Scanner(new File("\\Input.txt"));
	Scanner Input=new Scanner(new File("C:\\Users\\PAUSVIDE\\workspace\\Summer Break\\src\\Input.txt"));
	System.out.println();
	while(Input.hasNext())
	{
		System.out.println(Input.next());
	}
	Input.hasNext();
	System.out.println("**********************************");
	FileWriter f1;
	f1=new FileWriter(new File("C:\\Users\\PAUSVIDE\\workspace\\Summer Break\\src\\Input.txt"));
	f1.write("I \n");
	f1.write("am Devansh \n");
	f1.close();
/*	
	while(Input.hasNext())
	{
		System.out.println(Input.next());
		if(Input.next()=="Killing")
		{
		System.out.println("The value in Input.hasNext()=" +Input.next());
		System.out.println("Devansh");	
		}
		System.out.println("*****");
		*/
	
	}
	
	
	
	
	
	
	
}
	
