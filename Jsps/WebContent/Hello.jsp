<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head><title>Hello World</title></head>
   
   <body>
      Hello World!....<br/>
      <%
         out.println("Your IP address is " + request.getRemoteAddr());
      %>
   </body>
</html>