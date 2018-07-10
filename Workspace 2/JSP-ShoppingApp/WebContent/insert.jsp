<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<jsp:useBean id="emp" class="com.demo.Model.employee"/>
<jsp:setProperty property="*" name="emp"/>
<jsp:useBean id="dao" class="com.demo.EmployeeDAO"></jsp:useBean>
<%

if(request.getParameter("fname").equals("")
	||request.getParameter("lname").equals("")
	||request.getParameter("password").equals("")
	||request.getParameter("salary").equals("")
	||request.getParameter("telno").equals("")){
	System.out.println("Not Inserted");
	response.sendRedirect("insert.html");}
else{
	int x=dao.insertEmployee(emp);
if(x==0)
{
	response.sendRedirect("insert.html");
}
else
	response.sendRedirect("prod_index.jsp");	}


%>

</body>
</html>