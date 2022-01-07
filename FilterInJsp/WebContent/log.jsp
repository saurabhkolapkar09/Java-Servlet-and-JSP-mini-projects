<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "javax.servlet.RequestDispatcher" %>
    <%@page import = "java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body class = "cnt">
	<%
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		out.print(username +"  ");
		out.println(password);
		try{
			if(password  == "admin123")
			{
				
// 				RequestDispatcher rd = request.getRequestDispatcher("index.html");
// 				rd.include(request, response);
				
				out.print("Logged in successfully");
			}
			else{
			
				RequestDispatcher rd = request.getRequestDispatcher("again.jsp");
				rd.include(request, response);
				out.print("Please check username and password");
			}
		}
		catch(Exception e)
		{
			out.print(e);
			e.printStackTrace();
		}
	%>
	
</body>
</html>