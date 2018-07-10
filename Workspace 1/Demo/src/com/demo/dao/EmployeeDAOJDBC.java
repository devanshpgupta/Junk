package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.demo.model.Employee;

public class EmployeeDAOJDBC {
	
	Connection con;

	public EmployeeDAOJDBC() {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","kumar","password");
			if(con != null) {
				System.out.println("Connected!");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Employee> fetchAll() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		try{
			
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFname(rs.getString(2));
				emp.setLname(rs.getString(3));
				emp.setAge(rs.getInt(4));
				emp.setSalary(rs.getDouble(5));
				emp.setZipcode(rs.getString(6));
				list.add(emp);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insertEmployee(Employee emp) {
		int x = 0;
		try{
			PreparedStatement ps = con.prepareStatement("insert into employee (fname, lname, age, salary, zipcode) values(?,?,?,?,?)");
			ps.setString(1, emp.getFname());
			ps.setString(2, emp.getLname());
			ps.setInt(3, emp.getAge());
			ps.setDouble(4, emp.getSalary());
			ps.setString(5, emp.getZipcode());
			x = ps.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return x;
	}
	
	public Employee getDetails(int empId) {
		Employee emp = new Employee();
		try{
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setFname(rs.getString(2));
				emp.setLname(rs.getString(3));
				emp.setAge(rs.getInt(4));
				emp.setSalary(rs.getDouble(5));
				emp.setZipcode(rs.getString(6));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public int editEmployee(Employee emp) {
		try{
			PreparedStatement ps = con.prepareStatement("update employee set fname=?, lname=?, salary=? where id=?");
			ps.setString(1,  emp.getFname());
			ps.setString(2, emp.getLname());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getId());
			return ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	

}
