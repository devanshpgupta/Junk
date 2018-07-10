package com.demo;
import java.sql.*;
public class ctable {
Connection con=null;
Statement st;
ctable()
{
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE","system","Ushapawan1234");
	if(con!=null)
	{
		System.out.println("Connected");
		st = con.createStatement();
		//st.execute("truncate table ques1");
		//st.execute("Insert into ques1 values('E001','Tom','Hardy',25,20000)");
		//st.execute("select fname from ques1");
	}else
		System.out.println("Fucked");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ctable();
	}

}
