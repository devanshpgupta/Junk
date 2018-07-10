<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.demo.Model.cart" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dao" class="com.demo.CartDAO"></jsp:useBean>
<%


int product_id=Integer.parseInt(request.getParameter("prod_id"));
String prop=request.getParameter("prop");
System.out.println(prop);
ArrayList<cart> list=new ArrayList<cart>();
if(prop.equals("add")){
list=dao.addProduct(product_id);
}
else
if(prop.equals("remove"))
{
dao.removeProducts(product_id);
}
if(list!=null){response.sendRedirect("cart_index.jsp?username");}
else{response.sendRedirect("prod_index.jsp");}
%>
</body>
</html>