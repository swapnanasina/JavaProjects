<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facebook Success Page</title>
</head>
<body>
<% String username = request.getParameter("username"); %>
           <a><b>Welcome   <% out.println(username); %></b></a>
           <h5>YOU HAVE SIGNEDUP FOR FACEBOOK</h5>
           <h6>LOGIN TO ACCESS YOUR ACCOUNT</h6>
           <form action="Facebook_login" method="post">
		<table style="with: 50%">
 
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Login" /></form>
		
</body>
</body>
</html>