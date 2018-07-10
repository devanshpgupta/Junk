package Monday21;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the String:");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(j==i);
				else
				if(str.charAt(i)==str.charAt(j))
					break;
				else
					if(j==str.length()-1)
				System.out.println(ch[i]);
			}
		}
	}
	
		
}
