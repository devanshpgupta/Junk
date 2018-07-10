package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "Login", urlPatterns = { "/Login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	
	public void init()
	{
		try
		{
			System.out.println("hello");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:XE","system","Ushapawan1234");
		if(con!=null)
		System.out.println("Connected");	
		else
			System.out.println("Fucked**********");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("username");
		String pword=request.getParameter("password");
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from users where username=? and password=?");
			ps.setString(1, uname);
			ps.setString(2, pword);
			ResultSet rs = ps.executeQuery();
			if(!rs.next()) {
				response.sendRedirect("error.html");
			}
			else {
				String role=rs.getString(4);
				if(role.equals("Admin"))
				{
					response.sendRedirect("admin.html");
				}
				else
					if(role.equals("Customer"))
					{
						out.println("<body text='Blue'><h3>");
						out.println("Wecome to User Page!!!");
						out.println("</h3></body>");
					}
					else
					{
						response.sendRedirect("error.html");
					}
			}
		
	/*	if(uname.equals("Admin"))
		{
		/*out.println("<body text='Green'><h2>");
		out.println("Wecome to Admin Page!!!");
		out.println("</h2></body>");
		*/
		//response.sendRedirect("admin.html");
	/*
		else
			if(uname.equals("user"))
			{
			out.println("<body text='Blue'><h3>");
			out.println("Wecome to User Page!!!");
			out.println("</h3></body>");
			}

			else
				{
				response.sendRedirect("error.html");
				/*out.println("<body text='Red'><h5>");
				out.println("Invalid Credentials!!");
				out.println("</h5>");
				out.println("<a href=index.html>Back</a>");
				out.println("</body>");
				*/
			//}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

}
