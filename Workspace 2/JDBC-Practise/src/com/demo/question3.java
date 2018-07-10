/*Write a Java program to connect to DB and identify the schemas
 * of all the tables present in that DB.
 * The DB could be MySQL / Oracle OR any RDBMS DB.
 */

package com.demo;
import java.sql.*;
public class question3 {
	Connection con=null;
	Statement st;
	question3() 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE","system","Ushapawan1234");
		st=con.createStatement();
		if(con!=null)
		{
			System.out.println("Connected");
			DatabaseMetaData dmd=con.getMetaData();
			
			ResultSet rs=dmd.getTables(null,"%", null,null);
			
			while (rs.next()) {
				System.out.println();
			  System.out.print(rs.getString(1)+"\t\t");
			  System.out.print(rs.getString(2)+"\t\t");
			  System.out.print(rs.getString(3)+"\t\t\t\t");
			  System.out.print(rs.getString(4));
			}
		
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		new question3();
	}
}
