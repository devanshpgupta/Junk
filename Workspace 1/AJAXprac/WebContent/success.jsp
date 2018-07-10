<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<h2>
Sucess!!!!
</h2>
<%
String name=request.getParameter("name");
String password=request.getParameter("password");
System.out.println(name+":"+password+ "in success.jsp");
%>
<a href="hiber.jsp?name=<%=name %>&password=<%=password %>">click to redirect</a>
</body>
</html>