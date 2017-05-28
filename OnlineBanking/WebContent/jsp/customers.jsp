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
<br><br><br><br><br><br>
<table width="50%" align="center">
<tr><td><a href="addCustomerPage"><b>Add</b></a></td>
<td colspan="5" align="right">
<form method="post" action="searchCustomers">
<input type="text" name="search" size="10" value="${param.search}"/>&nbsp;<input type="submit" value="Search"/>
</form>
</td></tr>
<tr><td colspan="6">&nbsp;</td></tr>
<tr bgcolor="grey"><th>Customer Id</th><th>firstName</th><th>lastName</th><th>Contact No.</th><th>Email</th><th>Password</th><th>DateofBirth</th><th>Permanent Address</th><th>Temporary Address</th><th>&nbsp;</th></tr>
<c:forEach var="c" items="${customers}">
<tr bgcolor="#ccccff"><td align="center"><c:out value="${c.id}"/></td><td><c:out value="${c.firstName}"/></td><td><c:out value="${c.lastName}"/></td><td><c:out value="${c.telephoneNumber}"/></td><td><c:out value="${c.emailId}"/></td><td><c:out value="${c.password}"/></td><td><c:out value="${c.dateofBirth}"/></td><td><c:out value="${c.permanentAddress}"/></td><td><c:out value="${c.temporaryAddress}"/></td><td><a style="color:blue" href="editCustomer?id=${c.id}">Edit</a>&nbsp;&nbsp;<a style="color:blue" href="deleteCustomer?id=${c.id}">Delete</a>&nbsp;&nbsp;<a style="color:blue" href="listAccounts?id=${c.id}">Accounts</a></td></tr>
</c:forEach>
</table>
</body>
</html>