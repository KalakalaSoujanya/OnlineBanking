<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<br><br><br><br><br>
<form:form method="post" action="AddEmployees" modelAttribute="employee">
<table width="30%" align="center" border="0">
<tr bgcolor="grey"><td colspan="2"><b>Add Employees</b></td></tr>
<tr><td colspan="3">&nbsp;</td></tr>
<tr><td><b><form:label path="firstName">FirstName</form:label></b></td>
<td><form:input path="firstName" /></td></td>
<td><form:errors path="firstName" /></td></td></tr>
<tr><td><b><form:label path="lastName">LastName</form:label></b></td>
<td><form:input path="lastName" /></td></td>
<td><form:errors path="lastName" /></td></td></tr>
<tr><td><b><form:label path="emailId">EmailId</form:label></b></td>
<td><form:input path="emailId" /></td></td>
<td><form:errors path="emailId" /></td></td></tr>
<tr><td><b><form:label path="password">Password</form:label></b></td>
<td><form:password path="password" /></td></td>
<td><form:errors path="password" /></td></td></tr>
<tr><td colspan="3">&nbsp;</td></tr>
<tr><td colspan="3" align="center"><input type="submit" value="Submit"/></td></tr>
</table>
</form:form>
</body>
</html>