<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.demo.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:useBean id="dao" class="com.demo.dao.EmployeeDAO"></jsp:useBean>
<%
	int empId = Integer.parseInt(request.getParameter("id"));
	System.out.println(empId);
	Employee employee = dao.getDetails(empId);
	
%>

<form method="post" action="edit.jsp">

	<input type="hidden" name="empid" value="<%= employee.getId() %>" />

	<table class="table table-striped">
	
		<tr class="success">
			<td>First Name</td>
			<td>
				<input type="text" name="fname" value="<%= employee.getFname() %>"/>
			</td>
		</tr>
		
		<tr class="info">
			<td>Last Name</td>
			<td>
				<input type="text" name="lname" value="<%= employee.getLname() %>"/>
			</td>
		</tr>
		
		<tr class="danger">
			<td>Age</td>
			<td>
				<input type="text" name="age" value="<%= employee.getAge() %>"/>
			</td>
		</tr>
		
		<tr class="warning">
			<td>Salary</td>
			<td>
				<input type="text" name="salary" value="<%= employee.getSalary() %>"/>
			</td>
		</tr>
		
		<tr class="warning">
			<td>Zip</td>
			<td>
				<input type="text" name="zipcode" value="<%= employee.getZipcode() %>"/>
			</td>
		</tr>
		
		<tr class="info">
			<td colspan="2">
				<input type="submit" value="Save" class="btn btn-success"/>
				<a href="index.jsp" class="btn btn-success">Cancel</a>
			</td>
		</tr>
	
	</table>

</form>


</body>
</html>