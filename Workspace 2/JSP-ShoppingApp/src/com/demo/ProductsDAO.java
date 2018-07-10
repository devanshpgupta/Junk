package com.demo;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.demo.Model.*;
import com.demo.Model.employee;

public class ProductsDAO {
	Connection con=null;
	public ProductsDAO()
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
	
	public ArrayList<products> fetchAll()
	{
		
		ArrayList<products> list=new ArrayList<products>();
		try {
		PreparedStatement ps=con.prepareStatement("select * from products");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			products prod=new products();
			prod.setProd_name(rs.getString(1));
			prod.setProd_price(rs.getDouble(2));
			prod.setProd_id(rs.getInt(3));
		
			list.add(prod);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
	
	
	public int insertEmployee(employee emp)
	{

	int num=0;

	try{
		
	    PreparedStatement pst = con.prepareStatement("select emp_id.nextval from dual");
	    ResultSet rs=pst.executeQuery();
	    if(rs.next())
	    {num=rs.getInt(1);}
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		ps.setInt(1,num);
		ps.setString(2,emp.getFname());
		ps.setString(3,emp.getLname());
		ps.setDouble(4,emp.getSalary());
		ps.setDouble(5,emp.getTelno());
		int x=ps.executeUpdate();
		return x;
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return 0;
	}
}
