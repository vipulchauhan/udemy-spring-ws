<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>User Dashboard</title>
<jsp:include page="header.jsp" />
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Welcome to ${newUser.role} Dashboard</h1>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<p>Welcome ${newUser.firstname} ${newUser.lastname}</p>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>
</html>