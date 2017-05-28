<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.onlinebanking.entity.Customer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp"%>
<br><br><br><br><br><br>

<form>
<table align="center">
<tr><th>CustomerId:</th><td><c:out value="${customer.id}"/></td><td>&nbsp;&nbsp;</td><th>FirstName:</th><td><c:out value="${customer.firstName}"/></td><td>&nbsp;&nbsp;</td><th>LastName:</th><td><c:out value="${customer.lastName}"/><td>&nbsp;&nbsp;</td><th>Telephone Number:</th><td><c:out value="${customer.telephoneNumber}"/></td></tr>
</table>
</form>
<table width="50%" align="center">
<tr><td><a style="color:blue" href="addAccountsPage?id=${param.id}">Add Accounts</a></td></tr>
<tr>
<td colspan="5" align="right">
<form method="post" action="searchAccount">
<input type="text" name="search" size="10" value="${param.search}"/>&nbsp;<input type="submit" value="Search"/>
</form>
</td></tr>
<tr><td colspan="6">&nbsp;</td></tr>
<tr bgcolor="grey"><th>Account Number</th><th>Account Type</th><th>Balance</th><th>&nbsp;</th></tr>
<c:forEach var="a" items="${accounts }">
<tr bgcolor="#ccccff"><td align="center"><c:out value="${a.accountNumber}"/></td><td><c:out value="${a.accountType}"/><td><c:out value="${a.balance}"/></td><td><a style="color:blue" href="editAccountsPage?accountNumber=${a.accountNumber}&id=${param.id}">Edit</a>&nbsp;&nbsp;<a style="color:blue" href="deleteAccount?accountNumber=${a.accountNumber }&id=${param.id}">Delete</a>&nbsp;&nbsp;</td></tr>
</c:forEach>
</table>
</body>
</html>