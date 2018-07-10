/**
 * 
 */
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * @author kumar
 *
 */
public class SelectData {
	
	Connection con;
	Statement st;
	
	SelectData(String title, double price) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","kumar","password");
			st = con.createStatement();
			//int x = st.executeUpdate("update books set price = 20.00 where id > 3");
			//int x = st.executeUpdate("update books set price=" + price + " where title='" + title + "'");
			PreparedStatement ps = con.prepareStatement("update books set price=? where title=?");
			ps.setDouble(1, price);
			ps.setString(2, title);
			int x = ps.executeUpdate();
			System.out.println(x + " updated!");
			
			ResultSet rs = st.executeQuery("select * from books order by price");
			/*while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("TITLE: " + rs.getString(2));
				System.out.println("PRICE: " + rs.getString(3));
				System.out.println("======================");
			}*/
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			for(int i=1;i<=count;i++) {
				System.out.print(rsmd.getColumnName(i) + "\t\t\t\t");
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=count;i++) {
					System.out.print(rs.getString(i) + "\t\t\t\t");
				}
				System.out.println();
			}
			System.out.println("=======================");
			// Column Data Types
			
			for(int i=1;i<=count;i++) {
				System.out.println(rsmd.getColumnName(i) + ":" + rsmd.getColumnType(i));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] a) {
		// TODO Auto-generated method stub
		new SelectData(a[0], Double.parseDouble(a[1]));
	}

}
