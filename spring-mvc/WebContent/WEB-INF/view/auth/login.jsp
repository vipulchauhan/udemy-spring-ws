<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
		<form action="signin" method="get">
			<div class="form-group">
				<label for="email">Email:</label>
				<input type="email" class="form-control" name="email" id="email" placeholder="Enter your email id" required />
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required />
			</div>
			<button type="submit" class="btn btn-primary">login</button>
		</form>
	</div>
</body>
</html>