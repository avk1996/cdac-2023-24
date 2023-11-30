<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admission Message</title>
</head>
<body>
	<jsp:useBean id="student" class="beans.StudentBean" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="student"/>
	<h4>Status: ${sessionScope.student.addStudent()}</h4>
</body>
</html>