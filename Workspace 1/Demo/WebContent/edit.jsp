<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.demo.model.Employee" />
<jsp:setProperty property="*" name="emp" />
<jsp:useBean id="dao" class="com.demo.dao.EmployeeDAO"></jsp:useBean>
<%
	int idToEdit = Integer.parseInt(request.getParameter("empid"));
	emp.setId(idToEdit);
	int x = dao.editEmployee(emp);
	System.out.println(x);
	response.sendRedirect("index.jsp");
%>
</body>
</html>