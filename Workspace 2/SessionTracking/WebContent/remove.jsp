<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"> %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String cart[]=request.getParameterValues("rempro");
HttpSession session1=request.getSession(true);
ArrayList<String> list=(ArrayList<String>)session1.getAttribute("remcart");
if(list==null)
	list=new ArrayList<String>();
for(int i=0;i<cart.length;i++)
{
	list.add(cart[i]);
}

%>

<a href=""></a>
</body>
</html>