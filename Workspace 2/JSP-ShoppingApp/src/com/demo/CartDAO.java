package com.demo;
import java.util.*;

import com.demo.Model.*;
import java.sql.*;
public class CartDAO {
	Connection con=null;
	public long total=0;
	public CartDAO()
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
	public ArrayList<cart> fetchAll()
	{
		ArrayList<cart> list=new ArrayList<cart>();
		try {
		PreparedStatement ps=con.prepareStatement("select * from cart");
		ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					cart c1=new cart();
					c1.setProd_name(rs.getString(1));
					c1.setProd_price(rs.getLong(2));
					c1.setProd_id(rs.getInt(3));
					total=total+c1.getProd_price();
					list.add(c1);
				}
		}catch(Exception e)
		{e.printStackTrace();}
		return list;
	}
	public long sum()
	{
		return total;
	}
	public ArrayList<cart> addProduct(int prod_id)
	{
		ArrayList<cart> list=new ArrayList<cart>();
		cart c1=new cart();
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from products where prod_id=?");
			ps.setInt(1, prod_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{				
				c1.setProd_name(rs.getString(1));
				c1.setProd_price(rs.getLong(2));
				c1.setProd_id(prod_id);
				list.add(c1);
			}
	
			ps=con.prepareStatement("insert into cart values(?,?,?)");
			ps.setString(1,c1.getProd_name());
			ps.setLong(2,c1.getProd_price());
			ps.setInt(3,c1.getProd_id());
			ps.executeQuery();
			
			System.out.println(c1.getProd_name());
			System.out.println(c1.getProd_price());
			System.out.println(c1.getProd_id());

			System.out.println("------------------");
			return list;
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		}
	public void removeProducts(int prod_id)
	{
		try
		{
			PreparedStatement ps=con.prepareStatement("delete from cart where prod_id=?");
			ps.setInt(1, prod_id);
			ps.executeQuery();
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return;
		}
}
