<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Home Page</title>
	<jsp:include page="header.jsp" />
</head>
<body>
	<div class="container">
		<h1 class="text-center">My Home Page</h1>
		<hr/>
		<ul>
			<li><a href="auth/register">User Registration Page</a></li>
			<li><a href="auth/login">User Login Page</a></li>
		</ul>
	</div>
</body>
</html>