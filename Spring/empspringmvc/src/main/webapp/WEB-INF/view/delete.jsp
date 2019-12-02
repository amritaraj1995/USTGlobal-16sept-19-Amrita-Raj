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
		<legend>Delete Profile</legend>
		<form action="./delete" method="post">
			<table align="center">
				<tr>
					<td>ID</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="delete" style="float: right;"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>