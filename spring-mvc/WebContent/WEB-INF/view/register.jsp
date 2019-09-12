<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>	

	<div class="container">
		<h2>User Registration Form</h2>		
		<form action="signup" method="get">
			<div class="form-group">
				<label for="fullname">Full Name:</label>
				<input type="text" class="form-control"  name="fullname" id="fullname" placeholder="Enter your full name"  required />
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<input type="text" class="form-control"  name="email" id="email" placeholder="Enter your email id" required />
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> 
				<input type="password" class="form-control" id="pwd" name="pwd" placeholder="Enter your password"  required />
			</div> 
			<button type="submit" class="btn btn-primary">Submit</button>			
		</form>		
	</div>
</body>
</html>