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
		<h2 class="text-center">User Registration Form</h2>
		<hr />
		<form:form action="signup" method="get" modelAttribute="newUser">
			<div class="form-group">
				<label for="username">User Name:</label>
				<form:input path="username" type="text" class="form-control" name="username" id="username" placeholder="Enter user name"
					required="required" minlength="6" maxlength="15" />
			</div>

			<div class="form-group">
				<label for="firstname">First Name:</label>
				<form:input path="firstname" type="text" class="form-control" name="firstname" id="firstname" placeholder="Enter your first name"
					required="required" />
			</div>
			<div class="form-group">
				<label for="lastname">Last Name:</label>
				<form:input path="lastname" type="text" class="form-control" name="lastname" id="lastname" placeholder="Enter your last name"
					required="required" />
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<form:input path="email" type="email" class="form-control" name="email" id="email" placeholder="Enter your email id" required="required" />
			</div>
			<div class="form-group">
				<label for="mobile">Mobile:</label>
				<form:input path="mobile" type="number" class="form-control" name="mobile" id="mobile" placeholder="Enter your mobile no"
					required="required" min="1000000000" max="9999999999" />
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label>
				<form:input path="password" type="password" class="form-control" id="password" name="password" placeholder="Enter your password"
					required="required" minlength="6" maxlength="15" />
			</div>
			<button type="submit" class="btn btn-primary">Sign Up</button>
		</form:form>
	</div>
</body>
</html>