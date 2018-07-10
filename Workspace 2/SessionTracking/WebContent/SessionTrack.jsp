<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body>
<form  method="post" action="cart.jsp">
<%

String prod[]=request.getParameterValues("product");
HttpSession session1=request.getSession(true);
ArrayList<String> list=(ArrayList<String>)session1.getAttribute("mycart");
if(list==null)
	list=new ArrayList<String>();

for(int i=0;i<prod.length;i++)
list.add(prod[i]);
session1.setAttribute("mycart", list);
%>
<table>
<h2>List of Products in the cart</h2>
<%
					for (String e : list) {
				%>
			
			<tr>
			<td><input type="checkbox" name="rempro" value=<%=e %>><%=e %></td>
			<td> <INPUT TYPE="BUTTON" VALUE="Button 1" ONCLICK="myFunction(e)"></a></td>
			</tr>
				<%
					}
%>
</table>

<a href="cart.jsp">Back to Products</a>
<br>
<a href="signout.jsp">Sign Out</a>
<script>
function myFunction(var e) {
    list.remove(e);
}
</script>
</body>
</center>
</form>
</html>