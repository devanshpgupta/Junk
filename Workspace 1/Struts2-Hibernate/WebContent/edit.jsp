<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*"%>
<html>
<head>
<script type="text/javascript">
function display()
{
	document.fom.action="demo.action";
	document.fom.submit();	
	}
</script>

</head>
<form action="updaterecord" method="post" name="fom">
	<table>
	<tr><input type="button" value="Display Records" onclick="display()"/></tr>
		<tr>
			<td><s:textfield label="ID" value="%{#application.a}" name="e.id" /> 
					<s:textfield label="FName" value="%{#application.b}" name="e.fname" /> 
					<s:textfield label="LName" value="%{#application.c}" name="e.lname" /> 
					<s:textfield label="Password" value="%{#application.d}" name="e.password" /> 
					<s:textfield label="Salary" value="%{#application.e}" name="e.salary" /> 
					<s:textfield label="TelNo" value="%{#application.f}" name="e.telno" /> 
					<s:textfield label="Role" value="%{#application.g}" name="e,role" />
			</td>
		</tr>
	<tr><s:submit value="Update Record"></s:submit></tr>
	</table>
</form>
</html>