<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>User Profile</title>
<jsp:include page="./../header.jsp" />
</head>
<body>
	<div class="container">
		<div class="container">
			<div class="row">
				<div class="col-sm-2"></div>
				<div class="col-sm-8">
					<h2 class="text-center">User Profile</h2>
					<hr />
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>Title</th>
								<th>Value</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>User Name:</td>
								<td>${newUser.username}</td>
							</tr>
							<tr>
								<td>Email:</td>
								<td>${newUser.email}</td>
							</tr>
							<tr>
								<td>First Name:</td>
								<td>${newUser.firstname}</td>
							</tr>
							<tr>
								<td>Last Name:</td>
								<td>${newUser.lastname}</td>
							</tr>
							<tr>
								<td>Mobile:</td>
								<td>${newUser.mobile}</td>
							</tr>
							<tr>
								<td>Role:</td>
								<td>${newUser.role}</td>
							</tr>
							<tr>
								<td>Gender:</td>
								<td>${newUser.gender}</td>
							</tr>
							<tr>
								<td>Notification Preferences::</td>
								<td>${newUser.notificationPref}</td>
							</tr>

						</tbody>
					</table>

				</div>
				<div class="col-sm-2">
					<a href="/dashboard">Dashboard</a>
				</div>
			</div>
		</div>


	</div>
</body>
</html>