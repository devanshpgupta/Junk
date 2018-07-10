<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.demo.Model.products" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:useBean id="prod" class="com.demo.ProductsDAO"/>
	<a href="Signout.jsp" class="btn btn-primary" style="float:right">Sign out</a>
	<center>
	<h3><u>List of Products</u></h3>
	</center>
<table class="table table-stripped table-hover table-bordered" valign="middle">

<tr class="info">
	<th>Product_Name</th>
	<th>Product_Price</th>
	<th>Product_id</th>
	<th> Add/Remove</th>
</tr>
<%
String username=request.getParameter("username");
if(username!=null)
{
ArrayList<products> pr=prod.fetchAll();
for(products e:pr){
%>
<tr class="warning">
	<td><%=e.getProd_name() %></td>
	<td><%=e.getProd_price() %></td>
	<td><%=e.getProd_id() %></td>
	<td><a href="cart.jsp?prod_id=<%= e.getProd_id() %>&prop=<%="add"%>&username=<%="in"%>" onclick="myFunction()"><img src="images/Add.png"/></a>
	</td>
</tr>
<%
}
}
else
{
	response.sendRedirect("Signout.jsp");
}
%>
</table>
<center>
<a href="cart_index.jsp?username" class="btn btn-primary btn-lg">CART</a>
</center>
<script>
function myFunction() {
    alert("Added! Redirecting to cart.");
}
</script>
</body>
</html>