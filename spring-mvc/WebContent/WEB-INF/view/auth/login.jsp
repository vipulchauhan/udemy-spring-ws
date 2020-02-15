<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<jsp:include page="./../header.jsp" />
</head>
<body>
	<div class="container">
		<h2 class="text-center">User Login Form</h2>
		<hr />
		<form:form action="signin" method="get" modelAttribute="loggedUser">
			<div class="form-group">
				<label for="username">User Name:</label>
				<form:input path="username" type="text" class="form-control" name="username" id="username" placeholder="Enter user name"
					required="required" />
			</div>
			<div class="form-group">
				<label for="password">Password:</label>
				<input path="password" type="password" class="form-control" id="password" name="password" placeholder="Enter your password"
					required="required" />
			</div>
			<button type="submit" class="btn btn-primary">login</button>
		</form:form>
	</div>
</body>
</html>