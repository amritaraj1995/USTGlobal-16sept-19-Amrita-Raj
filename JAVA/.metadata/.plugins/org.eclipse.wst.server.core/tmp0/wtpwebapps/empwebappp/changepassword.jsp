 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<a href="./home">Home</a><a style="float:right" href="./logout">Logout</a>
	
	<fieldset align="center">
		<legend>Change Password</legend>
		<form action="./changepassword" method="post">
			<table align = "center">
				<tr>
					<td>New Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Change Password</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="Change Password"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>