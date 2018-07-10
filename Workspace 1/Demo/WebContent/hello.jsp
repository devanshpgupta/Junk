<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script>
	alert("Hello!");
</script>

<style>
	h2 {
		color: blue;
	}
	
	h3 {
		color: green;
	}
	
</style>

</head>
<body>
<h2>
<%
	String name = "John";
	out.println(name);
%>
</h2>
<h3>Inside JSP! <%= name.toUpperCase() %></h3>
</body>
</html>