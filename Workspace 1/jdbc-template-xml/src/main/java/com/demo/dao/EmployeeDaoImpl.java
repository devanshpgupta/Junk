package com.demo.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String query="insert into emp1000(id,name,salary,dept) values (?,?,?,?)";
		jdbcTemplate=new JdbcTemplate(dataSource);
		Object inputs[]=new Object[] {
		emp.getEmnpid(),
		emp.getName(),
		emp.getSalary(),
		emp.getDept()
		};
		jdbcTemplate.update(query,inputs);
		System.out.println("");
		
	}

}
