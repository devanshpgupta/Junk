<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
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
<table class="table table-striped table-hover">

<tr class="info">
	<th>ID</th>
	<th>F Name</th>
	<th>L Name</th>
	<th>Age</th>
	<th>Salary</th>
	<th>Zip</th>
</tr>

<%
	List<Employee> list = dao.fetchAll();

	for(Employee e : list) {
%>
		<tr class="warning">
			<td><%= e.getId() %></td>
			<td><%= e.getFname() %></td>
			<td><%= e.getLname() %></td>
			<td><%= e.getAge() %></td>
			<td><%= e.getSalary() %></td>
			<td><%= e.getZipcode() %></td>
			<td><a href="editform.jsp?id=<%= e.getId() %>"><img src="images/edit.png"/></a><a href="#">&nbsp;<img src="images/delete.png"/></a></td>
		</tr>
<%
	}
%>
</table>

<a href="register.html" class="btn btn-primary">New</a>

</body>
</html>