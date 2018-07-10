package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.Model.employee;

public class EmployeeDAO {
	Connection con=null;
	public EmployeeDAO()
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
	public int insertEmployee(employee emp)
	{

	int num=0;

	try{
		
	    PreparedStatement pst = con.prepareStatement("select emp_id.nextval from dual");
	    ResultSet rs=pst.executeQuery();
	    if(rs.next())
	    {num=rs.getInt(1);}
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
		ps.setInt(1,num);
		ps.setString(2,emp.getFname());
		ps.setString(3,emp.getLname());
		ps.setString(4, emp.getPassword());
		ps.setDouble(5,emp.getSalary());
		ps.setDouble(6,emp.getTelno());
		ps.setString(7, emp.getRole());
		int x=ps.executeUpdate();
		
		return x;
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return 0;
	}
}
