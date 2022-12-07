<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.print("<h3>Out Implicite Object</h3>");
%>
<%
out.print("<h3>Request and Response Implicite Object</h3>");
%>
<form action="next.jsp">
	<input type="text" name="name"> <br><br>
	<button type="submit">Click to Submit</button>
</form>

<%
out.print("<h3>Config Implicite Object</h3>");
%>
<form action="welcome">
	<input type="text" name="name"> <br><br>
	<button type="submit">Click to Submit</button>
</form>

<%
out.print("<h3>Application Implicite Object</h3>");
%>
<form action="welcome">
	<input type="text" name="name"> <br><br>
	<button type="submit">Click to Submit</button>
</form>
</body>
</html>