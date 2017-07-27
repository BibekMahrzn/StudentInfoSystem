<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/customcss/customstyle.css">
</head>
<body>
	<form action="LoginController" method="post">
		<div style="color: red;">${logInFailMsg}</div>
		<div style="color: green">${logoutMsg}</div>
		<table class="form-design ">
			<tr>
				<td><label>Username:</label>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td><input type="submit" name="Login"></td>
				<td><input type="reset" name="Reset">
			</tr>
		</table>
	</form>
</body>
</html>