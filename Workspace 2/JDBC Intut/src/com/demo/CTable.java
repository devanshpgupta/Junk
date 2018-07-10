/**
 * 
 */
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author kumar
 *
 */
public class CTable {
	
	Connection con;
	Statement st;
	
	CTable() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","kumar","password");
			/*
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE", "system", "password");
			*/
			if(con != null) {
				System.out.println("Connected!");
				st = con.createStatement();
				st.execute("create table books (id int primary key auto_increment, title varchar(20), price double)");
				System.out.println("Table is created!");
				int x = st.executeUpdate("insert into books (title, price) values ('JAVA', 12.34)");
				x += st.executeUpdate("insert into books (title, price) values ('REST', 34.21)");
				x += st.executeUpdate("insert into books (title, price) values ('SOAP', 22.21)");
				System.out.println(x + " rows inserted!");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CTable();
	}

}
