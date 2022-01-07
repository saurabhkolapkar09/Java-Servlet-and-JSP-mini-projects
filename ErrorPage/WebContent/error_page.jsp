<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isErrorPage = "true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is the error page</title>
<style>
.img{
height :200px;
width:200px;
}
</style>
</head>
<body>
	<h1>ERROR...!!!</h1>
	<img  class = "img" alt="" src="img/sww.jpg">
	<p><%=exception %></p>
</body>
</html>