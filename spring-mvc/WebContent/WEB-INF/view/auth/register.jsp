<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<jsp:include page="./../header.jsp" />
</head>
<body>
	<div class="container">
		<h2  class="text-center">User Registration Form</h2>
		<hr/>
		<form action="signup" method="get">
			<div class="form-group">
				<label for="fullname">Full Name:</label>
				<input type="text" class="form-control" name="fullname" id="fullname" placeholder="Enter your full name" required />
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<input type="email" class="form-control" name="email" id="email" placeholder="Enter your email id" required />
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required />
			</div>
			<button type="submit" class="btn btn-primary">Sign Up</button>
		</form>
	</div>
</body>
</html>