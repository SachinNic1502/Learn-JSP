<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	String name=config.getInitParameter("name");
	out.print(name);
%>  --%>
<%
	String name1=application.getInitParameter("name");
	out.print(name1);
%>
</body>
</html>