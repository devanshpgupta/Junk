<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dao" class="com.demo.LoginDAO"></jsp:useBean>

<%
String username1=request.getParameter("username");
System.out.println(username1);
String password=request.getParameter("password");
System.out.println(password);
int i=dao.checkEmployee(username1, password);
if(i==1)
{
	System.out.println("******************");
response.sendRedirect("prod_index.jsp?username");
}else
	response.sendRedirect("error.html");
%>
</body>
</html>