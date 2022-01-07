

<!--  https://www.codejava.net/java-ee/jstl/jstl-sql-tag-query   -->



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</HEAD>
<BODY>
<H1>THIS IS JSTL EXAMPLE</H1>

<!--set out remove if tags in JSTL  -->
<%-- <c:set var = "i" value = "345" scope = "application"></c:set>
	
<h2><c:out value= "${i}"></c:out></h2>

<c:if test="${i>200}">

	<c:out value = "${i}"> </c:out>

</c:if>

<c:remove var="i"/>

<c:out value="${i}">Null value</c:out>

 --%>
 
 
 
 
 <!--forEach in JSTL  -->
<%-- <c:forEach var = "j" begin = "1" end = "10">
<h3>value of j is<c:out value = "${j}"></c:out></h3>

</c:forEach> --%>



<!-- switch statement using Choose when otherwise -->

<c:set var = "p" value = "23"></c:set>
 
<c:choose>
	<c:when test = "${p<12}">
	<h1>hiii</h1>
	</c:when>
	<c:when test = "${p==23 }">
	<h2>PP is 23</h2>
	</c:when>
	<c:otherwise>Nothing is possible</c:otherwise>
	
</c:choose>
</body>
</html>