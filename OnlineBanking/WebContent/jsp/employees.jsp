<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp"%>
<br><br><br><br><br>
<table width="50%" align="center">
<tr><td><a href="AddEmployeePage"><b>Add</b></a></td>
<td colspan="5" align="right">
<form  method="post" action="searchEmployees" >
<input type="text" name="search" size="10" value=""/>&nbsp;<input type="submit" value="Search"/>
</form>
</td></tr><c:set var="bankId">${bankId}</c:set>
<tr><td colspan="5">&nbsp;</td></tr>
<tr bgcolor="grey"><th>Bank Id</th><th>firstName</th><th>lastName</th><th>Email</th><th>Password</th><th>&nbsp;</th><th>&nbsp;</th></tr>
<c:forEach var="e" items="${employees}">
<tr bgcolor="#ccccff"><td align="center"><c:out value='${e.bankId}'/></td><td><c:out value="${e.firstName}"/></td><td><c:out value="${e.lastName}"/></td><td><c:out value="${e.emailId}"/></td><td><c:out value="${e.password}"/></td><td><a href="EditEmployees?bankId=${e.bankId}">Edit</a></td><td><a href="deleteEmployees?bankId=${e.bankId}">Delete</a></td></tr>
</c:forEach>
</table>
</body>
</html>