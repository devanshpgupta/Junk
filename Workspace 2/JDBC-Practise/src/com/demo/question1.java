/*
 * Create a JDBC program to automatically increment Primary Key ID during record insertion.
 * The primary key field is of type string like E001, E002, etc.,
 * The Record insertion to DB table must be from Java program
 * DB Table MUST NOT use auto_increment OR sequence to auto increment ID
 * (Oracle 12C)
 */
package com.demo;
import java.sql.*;
public class question1 {
Connection con=null;
Statement st;
question1()
{
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE","system","password");
	if(con!=null)
	{
//Establishing Connection
		System.out.println("Connection Established");
		st=con.createStatement();
		st.executeUpdate("drop table question1");
//Creating Table question1
		st.execute("create table question1 (id varchar2(20),"
				+ "fname varchar2(20),lname varchar2(20),age "
				+ "integer,salary number(10,2),constraint con1 primary key(id))");
		System.out.println("question1 table created");
//Creating Function id_inc (it returns the next id of type varchar)
		st.execute("create or replace function id_inc\r\n" + 
				"(temp_qid in varchar2)\r\n" + 
				"return varchar2\r\n" + 
				"is\r\n" + 
				"temp_id varchar2(100) := temp_qid;\r\n" + 
				"vari varchar2(100) := regexp_substr(temp_id, '\\D+');\r\n" + 
				"numb varchar2(100) := regexp_substr(temp_id, '\\d+');\r\n" + 
				"digits number := length(numb);\r\n" + 
				"i integer;\r\n" + 
				"i_id varchar2(100);\r\n" + 
				"begin\r\n" + 
				"i:=1;\r\n" + 
				"i_id:=vari||to_char((to_number(numb) + i),'fm'||rpad('0',digits,'0'));\r\n" + 
				"return i_id;\r\n" + 
				"end;");
//Creating First Record
		System.out.println("Function Created");
		String temp_id="E001";
		PreparedStatement p1=con.prepareStatement("insert into question1 values(?,?,?,?,?)");
		p1.setString(1,temp_id);
		p1.setString(2, "Tom");
		p1.setString(3, "Hardy");
		p1.setInt(4, 28);
		p1.setDouble(5, 20000);
		int x = p1.executeUpdate();
		System.out.println("Record "+temp_id+" inserted");
		String str;
		str=temp_id;
//Creating records from 2-10
	    for(int i=1;i<=10;i++)
	    {
//Calling Function
	    	CallableStatement callStmt = null;
			callStmt = con.prepareCall("{? = call id_inc(?)}");
		    callStmt.setString(2, str);
		    callStmt.registerOutParameter(1, java.sql.Types.VARCHAR);
		    callStmt.execute();
		    str=callStmt.getString(1);
		    System.out.println("Record "+str+" inserted");	
	   
//Inserting into Table		    
		PreparedStatement p2=con.prepareStatement("insert into question1 values(?,?,?,?,?)");
		p2.setString(1,str);
		p2.setString(2, "Tom");
		p2.setString(3, "Hardy");
		p2.setInt(4, 28);
		p2.setDouble(5, 20000);
		x = p2.executeUpdate();
	   
	    }
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String args[])
{
	new question1();
	
}
}
