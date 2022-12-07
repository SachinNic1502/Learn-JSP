<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Introduction JSP</title>
</head>
<body>
<h1>Hello JSP</h1>
<h1>Declaration Tag :</h1>
 int a=10;
 String name="Sachin";

<%! int a=10;
	String name="Sachin";
%>

<h1>Expression Tag</h1>
A is :<%=a %> <br>
Name is :<%=name %>

<h1> Scriplet Tag</h1>
<%
	int sum=10+20;
	out.println("Sum is : "+sum);
	
	int sub=10-20;
	out.println("Sub is : "+sub);

%>

</body>
</html>