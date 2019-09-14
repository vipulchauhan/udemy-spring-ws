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
		<!-- <h2 class="text-center"></h2> -->
		<hr />
		<form:form action="signup" method="get" modelAttribute="newUser">
			<fieldset>
				<legend>User Registration Form:</legend>
				<div class="form-group">
					<label for="username">User Name:</label>
					<form:input path="username" type="text" class="form-control" name="username" id="username" placeholder="Enter user name"
						required="required" minlength="6" maxlength="15" />
				</div>

				<div class="form-group">
					<label for="email">Email:</label>
					<form:input path="email" type="email" class="form-control" name="email" id="email" placeholder="Enter your email id"
						required="required" />
				</div>

				<div class="form-group">
					<label for="pwd">Password:</label>
					<form:input path="password" type="password" class="form-control" id="password" name="password" placeholder="Enter your password"
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
					<label for="mobile">Mobile:</label>
					<form:input path="mobile" type="number" class="form-control" name="mobile" id="mobile" placeholder="Enter your mobile no"
						required="required" min="1000000000" max="9999999999" />
				</div>

				<div class="form-group">
					<label for="role">Role:</label>
					<form:select path="role" class="form-control" id="role" name="role">
						<form:options items="${rolesOptions}"></form:options>
						<%-- 	<form:option value="student" label="Student"></form:option>
					<form:option value="teacher" label="Teacher"></form:option>
					<form:option value="admin" label="Admin"></form:option> --%>
					</form:select>
				</div>

				<div class="form-group">
					<label for="gender">Gender:</label>
					<form:radiobuttons path="gender" items="${genders}" />
					<%-- <form:radiobutton path="gender" value="male" />  Male						
					<form:radiobutton path="gender" value="female" /> Female						 
					<form:radiobutton path="gender" value="other" /> Other --%>
				</div>

				<div class="form-group">
					<label for="notificationPref">Notification Preferences:</label>
					<form:checkboxes path="notificationPref" items="${notificationPrefs}" />
					<%-- <form:radiobutton path="gender" value="male" />  Male						
					<form:radiobutton path="gender" value="female" /> Female						 
					<form:radiobutton path="gender" value="other" /> Other --%>
				</div>
				<button type="submit" class="btn btn-primary">Sign Up</button>
			</fieldset>
		</form:form>
	</div>
</body>
</html>