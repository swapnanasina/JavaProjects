<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h3 style="color:Tomato;"><a><b>*Fields Should not be Empty</b></a></h3>
	<form action="Facebook_register" method="post">
		<table style="with: 50%">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="first_name" /></td><th><h6 style="color:Tomato;">*Required</h6></th>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="last_name" /></td><th><h6 style="color:Tomato;">*Required</h6></th>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td><th><h6 style="color:Tomato;">*Required</h6></th>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td><th><h6 style="color:Tomato;">*Required</h6></th>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="country" /></td><th><h6 style="color:Tomato;">*Required</h6></th>
			</tr>
			<tr>
				<td>Contact No</td>
				<td><input type="text" name="contact" /></td><th><h6 style="color:Tomato;">*Required</h6></th>
			</tr>
		</table>
		<input type="submit" value="Submit" />
		</form>

</body>
</html>