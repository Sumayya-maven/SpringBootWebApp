<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
</head>
<body>
<h1 align="center"><b>List of Employees</b></h1>
<p>
	<button onclick= "window.location.href='saveForm'"; return false;>Add student</button>
</p>
<hr>
<div align="center">
<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Email</th>
		<th>Employee Address</th>
		<th>Employee Mobile No.</th>
		<th>Action</th>	
	</tr>
	<c:forEach items="${Employee}" var="emp">
		<c:url var="updateLink" value="updateRecord">
			<c:param name="id" value="${emp.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="deleteRecord">
			<c:param name="id" value="${emp.id}"></c:param>
		</c:url>
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.email}</td>
			<td>${emp.address}</td>
			<td>${emp.telephone}</td>
			<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>