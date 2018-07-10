package com.demo.DAO;
import java.sql.*;
import java.util.ArrayList;
import com.demo.Model.*;
public class ProductsDAO {
Connection con=null;

	public ProductsDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE","system","Ushapawan1234");
			if(con!=null)
			{
				System.out.println("Connected");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
}
	public ArrayList<products> showProducts()
	{
		ArrayList<products> list=new ArrayList<products>();
	
		try
		{
		PreparedStatement ps=con.prepareStatement("select * from products");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			products pr=new products();
			pr.setProd_name(rs.getString(1));
			pr.setProd_price(rs.getLong(2));
			pr.setProd_id(rs.getInt(3));
			list.add(pr);
		}
		return list;
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		return list;
}
}