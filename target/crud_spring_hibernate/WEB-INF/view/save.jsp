<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD Employee</h1>
<hr>

<f:form action="saveEmp" method="get" modelAttribute="employee">
<div align="center">
	<table border="1">
		<tr>
			<td>Employee Id:</td>
			<td><f:hidden  path="id"/></td>
		</tr>
		<tr>
			<td>Employee Name:</td>
			<td><f:input path="name"/></td>
		</tr>
		<tr>
			<td>Employee Address:</td> 
			<td><f:input path="address"/></td>
		</tr>
		<tr>
			<td>Employee Email id:</td>
			<td><f:input path="email"/></td>
		</tr>
		<tr>
			<td>Employee Mobile No.:</td>
			<td><f:input path="telephone"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add Employee"></td>
			<td><input type="submit" value="update Employee"></td>
		</tr>
	</table>
</div>
</f:form>
<hr>
<a href="listEmployee">List of all Employee</a>
</body>
</html>