<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.lang.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try{
	//load drivers
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	
}

catch(Exception e)
{
	out.print("Driver not found   .....");
	e.printStackTrace();
}
String url = "jdbc:mysql://localhost:3306/demodb";
String username = "root";
String pass = "1234";

String sql = "select * from employee where idEmployee = 1";

Connection con = DriverManager.getConnection(url,username,pass);

Statement st = con.createStatement();

ResultSet set =  st.executeQuery(sql);

set.next();


out.print("driver loaded");



%>
<br>
<br>
Employee name = <%=set.getString(2) %>
<br>

Employee age = <%=set.getString(3) %>


</body>
</html>