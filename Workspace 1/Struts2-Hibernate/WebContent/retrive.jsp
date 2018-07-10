<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page import="java.util.*,com.demo.model.employee"%>
<%
	employee e;
%>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function editr(val) {
		document.fom.action ="demo1.action?id="+val;
		document.fom.submit();
	}
</script>
</head>
<form method="post" name="fom">
	<table class="table table-stripped table-hover table-bordered">
	<tr class="info">
			<td><b>ID</b></td>
			<td><b>fname</b></td>
			<td><b>lname</b></td>
			<td><b>password</b></td>
			<td><b>salary</b></td>
			<td><b>telno</b></td>
			<td><b>role</b></td>
			<td><b>Update each Record</b></td>
			</tr>
		<%
			List l = (List) request.getAttribute("rec");
			if (l != null) {
				Iterator it = l.iterator();
				while (it.hasNext()) {
					e = (com.demo.model.employee) it.next();
		%>
		<tr class="warning">
			<td class="bord"><%=e.getId()%></td>
			<td class="bord"><%=e.getFname()%></td>
			<td class="bord"><%=e.getLname()%></td>
			<td class="bord"><%=e.getPassword()%></td>
			<td class="bord"><%=e.getSalary()%></td>
			<td class="bord"><%=e.getTelno()%></td>
			<td class="bord"><%=e.getRole()%></td>
			<td class="bord"><a href="javascript:editr('<%=e.getId()%>')">Edit</a></td>
		</tr>
		<br>

		<%
			}
			}
		%>
	</table>
</form>
