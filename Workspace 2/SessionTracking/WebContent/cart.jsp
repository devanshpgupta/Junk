<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.demo.Model.products"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SessionTrack.jsp">
	<jsp:useBean id="dao" class="com.demo.DAO.ProductsDAO"></jsp:useBean>
	<%
		ArrayList<products> list = new ArrayList<products>();
		list = dao.showProducts();
		out.println("List of Products");
	%>
	<center>
		<table>
			<tr>
				<td>Prod_name</td>
				<td>Prod_price</td>
				<td>Prod_id</td>
			<tr>
				<%
					for (products e : list) {
				%>
			
			<tr>
			<td><input type="checkbox" name="product" value=<%= e.getProd_name() %>><%=e.getProd_name() %></td>
			<td><%=e.getProd_price()%></td>
			<td><%=e.getProd_id() %></td>
			<tr>
				<%
					}
				%>
			
		<tr>
		<input type="submit" value="Add to cart"/>
		</tr>
		</table>
		</center>
		</form>
</body>
</html>