package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.Model.employee;

public class LoginDAO {
	Connection con=null;
	public LoginDAO()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE","system","Ushapawan1234");
			if(con!=null)
			{
				System.out.println("CONNECTED");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	public int checkEmployee(String username,String password)
	{
		
	int num=0;
	try{
		PreparedStatement ps=con.prepareStatement("select * from employee where fname=? and password=?");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			return 1;
		}
		else
			return 0;
	   
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return 0;
	}
}
