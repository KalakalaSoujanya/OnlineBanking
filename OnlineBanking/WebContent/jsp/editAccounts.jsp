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
<form:form method="post" action="updateAccounts?id=${param.id}" modelAttribute="account">
<table width="30%" align="center" border="0">

<tr bgcolor="grey"><td colspan="2"><b>Edit Account</b></td></tr>
<tr><td colspan="3">&nbsp;</td></tr>
<tr><td><b><form:label path="accountNumber">AccountNumber</form:label></b></td>
<td><form:input path="accountNumber"/></td>
<td><form:errors path="accountNumber"/></td>
<tr><td><b><form:label path="accountType">AccountType</form:label></b></td>
<td><form:input path="accountType"/></td>
<td><form:errors path="accountType"/></td>
<tr><td><b><form:label path="customerId">CustomerId</form:label></b></td>
<td><form:input path="customerId"/></td>
<td><form:errors path="customerId"/></td>
<tr><td><b><form:label path="balance">Balance</form:label></b></td>
<td><form:input path="balance"/></td>
<td><form:errors path="balance"/></td>
<tr><td colspan="3">&nbsp;</td></tr>
<tr><td colspan="3" align="center"><input type="submit" value="Submit"/></td></tr>
</table>
</form:form>
</body>
</html>