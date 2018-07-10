package Monday21;
import java.util.Scanner;

public class question1{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the String:");
		String str=sc.nextLine();
		char ch[]=new char[25];
		for(int i=0;i<str.length();i++)
		{
			for(int k=0;k<i || k==0 ;i++)
			{
				if(ch[k]==str.charAt(i))
				break;
			}
				for(int j=i+1;j<str.length();j++)
				{
				if(str.charAt(i)==str.charAt(j))
					{
					ch[i]=str.charAt(i);
					System.out.println("Char:" +str.charAt(i));
					break;
					}
			}
		}
	
	}
}