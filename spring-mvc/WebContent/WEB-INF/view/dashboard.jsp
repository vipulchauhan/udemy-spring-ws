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
		<h1>Welcome to User Dashboard</h1>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<p>Welcome ${loggedUser.username}</p>
			</div>
			<div>
				<hr />
				<form:form action="course/add" method="get" modelAttribute="course">
					<fieldset>
						<legend>User Course Registration Form:</legend>
						<div class="form-group">
							<label for="courseCode">Course code:</label>
							<form:input path="courseCode" type="number" class="form-control" name="courseCode" id="courseCode" placeholder="Enter course code" />
							<form:errors class="alert alert-danger" path="courseCode"></form:errors>
						</div>
						<div class="form-group">
							<label for="courseName">Course Name:</label>
							<form:input path="courseName" type="number" class="form-control" name="courseName" id="courseName" placeholder="Enter course name" />
							<form:errors class="alert alert-danger" path="courseName"></form:errors>
						</div>
						<div class="form-group">
							<label for="semester">Semester:</label>
							<form:input path="semester" type="number" class="form-control" name="semester" id="semester" placeholder="Enter semester" />
							<form:errors class="alert alert-danger" path="semester"></form:errors>
						</div>
						<button type="submit" class="btn btn-primary">Sign Up</button>
					</fieldset>
				</form:form>

			</div>
			<div class="col-sm-2">
				<p>
					<a href="profile">User Profile</a>
				</p>
				<p>
					<a href="../">Log out</a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>