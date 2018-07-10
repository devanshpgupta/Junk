/*Create a Text based UI JDBC program which will create a Pagination
 *  when data is pulled from DB.Set a Pagination size like 10 per 
 *  page OR 5 OR any number of records.Ex: If there are 100 records 
 *  being pulled,it should give me an option to go to any page 
 *  between 1 to 10. If I choose 6, 51st to 60th records must be 
 *  displayed as a result for me.
*/
package com.demo;
import java.sql.*;
import java.util.Scanner;
public class question2 {
	Connection con=null;
	Statement st;
	Scanner sc;
	int num;
	question2()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE","system","passsword");
			if(con!=null)
			{
				st = con.createStatement();
				System.out.println("Connected");
				System.out.println("Pagination size set to 4 records/Page");
				System.out.println("Total 26 Records Present i.e. you can retrive upto 6 pages");
				System.out.print("Please enter the page Number(1-6):");
				sc=new Scanner(System.in);
				try {
				num=Integer.valueOf(sc.nextLine());
				if(num>6||num<1)
				{
					throw new WrongInput();
				}
				}catch(WrongInput wr)
				{
					wr.printMsg();
				}
				for(int i=1;i<5;i++)
				{
					int temp=(num-1)*4+i;
					ResultSet rs=st.executeQuery("select * from page where id="+temp);
					while(rs.next()) {
						System.out.print("ID: " + rs.getInt(1));
						System.out.println("\tRec_Name: " + rs.getString(2));}
				}
			}else
				System.out.println("Fucked");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	


	public static void main(String args[])
	{
		new question2();
		}
}
