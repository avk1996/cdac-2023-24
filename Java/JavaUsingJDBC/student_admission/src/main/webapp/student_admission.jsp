<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Admission</title>
</head>
<body>
<form action="admission">
	<table>
		<tr>
			<td>First Name: </td>
			<td><input type="text" placeholder="Enter first name" name="firstName"></td>
		</tr>
		<tr>
			<td>Last Name: </td>
			<td><input type="text" placeholder="Enter last name" name="lastName"></td>
		</tr>
		<tr>
			<td>Test Score: </td>
			<td><input type="number" placeholder="Enter score" name="testScore"></td>
		</tr>
		<tr>
			<td>Course: </td>
			<td>
				<select name="course">
					<option>DAC</option>  <%--name="dac" --%>
					<option>DBDA</option> <%--name="dbda" --%>
					<option>AI</option> <%--name="ai" --%>
				</select>
			</td>
		</tr>`
		<tr>
			<td><input type="submit" value="Submit"/></td>
		</tr>
	</table>
</form>
</body>
</html>