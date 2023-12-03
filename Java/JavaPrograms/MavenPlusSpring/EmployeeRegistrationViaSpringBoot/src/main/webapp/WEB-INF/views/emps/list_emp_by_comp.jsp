<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Employee by Company Name</title>
</head>
<body>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Emp List</caption>
		<tr>
		<th>Emp ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>City</th>
		<th>Company Name</th>
		
		</tr>
		<c:forEach var="emp" items="${requestScope.show_emp}">
			<tr>
				<td>${emp.empId}</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
				<td>${emp.city}</td>
				<td>${emp.companyName}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>