<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/mylib.tld" prefix="t"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Tag</title>
</head>
<body>
<h1>Greeting Message</h1> <hr>
<t:greet msg="Sachin"/>
<t:greet1 side="5" />
</body>
</html>