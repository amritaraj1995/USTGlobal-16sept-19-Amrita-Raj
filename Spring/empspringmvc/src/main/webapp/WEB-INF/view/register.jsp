<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Register</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><select name="gender">
							<option>---Select----</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="Register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./login">Click Here to login</a>
</body>
</html>