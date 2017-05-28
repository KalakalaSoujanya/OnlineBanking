<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" bgcolor="#8080ff" border="0" cellpadding="0" cellspacing="0">
<tr><td align="right" valign="top" height="20px">
<c:if test="${username==null}">
<a href="loginPage"><font color="blue"><b>Login</b></font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
<font color="red"><b>&nbsp;</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<c:if test="${username!=null}">
Welcome&nbsp;<b>${username}</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
<a href="logout"><font color="blue"><b>Logout</b></font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
</td></tr>
<tr><td align="center" height="20px"><h1>OnlineBanking</h1></td></tr>
</table>

<table width="100%" bgcolor="grey" height="20px" border="0">
<tr><td width="15%">&nbsp;</td>
<td width="85%" align="left">
<c:if test="${userType == 'admin'}">
<a href="listEmployees"><b>Employees</b></a>&nbsp;&nbsp;
</c:if>
<c:if test="${userType == 'customer'}">

<a href=""><b>Statements</b></a>&nbsp;&nbsp;
<a href=""><b>Pay Bills</b></a>&nbsp;&nbsp;
<a href=""><b>Funds Transfer</b></a>&nbsp;&nbsp;
</c:if>
<c:if test="${userType == 'Employee'}">
<a href="listCustomers"><b>Customers</b></a>&nbsp;&nbsp;
<a href=""><b>Transactions</b></a>&nbsp;&nbsp;
</c:if>
</td>
</tr>
</table>
</body>
</html>