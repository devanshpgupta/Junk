<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="com.demo.Model.cart" %>
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
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
<body>
<jsp:useBean id="dao" class="com.demo.CartDAO"></jsp:useBean>
<a href="Signout.jsp" class="btn btn-primary" style="float:right">Sign out</a>
	
<table class="table table-stripped table-hover table-bordered" valign="middle">
<tr>
<h3>Products in Cart</h3>
</tr>
<tr class="info"><th>Product_Name</th>
	<th>Product_Price</th>
	<th>Product_ID</th>
	<th>Remove from Cart</th>
</tr>
<%
String username=request.getParameter("username");
ArrayList<cart> list=dao.fetchAll();
long total=dao.sum();
if(username!=null)
{

for(cart e:list){
%>
<tr class="warning">
<td><%=e.getProd_name() %></td>
<td><%=e.getProd_price() %></td>
<td><%=e.getProd_id() %></td>
<th><a href="cart.jsp?prod_id=<%= e.getProd_id() %>&prop=<%="remove"%>"><img src="images/Remove.png"/></a></th>
</td>
</tr>
<%
}
}
else
	response.sendRedirect("Signout.jsp");
%>
<table>
<tr>
<td><h5><u><i>Total Amount:<%=total %></i></u></h5></td>
</tr>
<tr></table><a href="prod_index.jsp?username" class="btn btn-primary">Back To Products</a>
</tr>
<tr><a href="#" class="btn btn-primary">Checkout</a>
</tr>

</table>
</table>
</body>
</html>