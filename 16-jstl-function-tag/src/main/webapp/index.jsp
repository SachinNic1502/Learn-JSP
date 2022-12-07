<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fuction Tag Example</h1>
<hr>
<c:set value="Sachin Rathod" var="name"></c:set>
<c:if test="${fn:contains(name,'Sachin')}">
	<h4>Found</h4>
</c:if>
<c:if test="${fn:containsIgnoreCase(name,'Rathod')}">
	<h4>Found</h4>
</c:if>

<hr>
<c:if test="${fn:endsWith(name,'Rathod') }">
<h3> You Are Software Devloper</h3>
</c:if>
<hr>
<c:if test="${fn:endsWith(name,'Rathod1') }">
<h3> You Are Software Devloper</h3>
</c:if>
<hr>
<c:if test="${fn:startsWith(name,'Sachin')}">
<h3> I Am Software Devloper ${name}</h3>
</c:if>
<hr>
<c:set value="Sachin Rathod                     hello" var="name1"></c:set>
<h1>String Index of ${fn:indexOf(name1,'hello') }</h1>
<hr>
<h1>String lenth without Trim ${fn:length(name1) } </h1>
<c:set var="str1" value="${fn:trim(name) }"></c:set>
<h1>String lenth with Trim ${fn:length(str1) } </h1>
<hr>
<h1>${fn:toLowerCase('Sachin') }</h1>
<h1>${fn:toUpperCase('Sachin') }</h1>
<hr>

<c:set value="Hello Sachin - Rathod" var="nm"></c:set>
<c:set value="${fn:split(nm,' ') }" var="str1"></c:set>
<c:set value="${fn:join(str1,'_') }" var="str2"></c:set>
<h1> <c:out value="${str2 }"></c:out>
</h1>

<hr>
${fn:substring(nm,5,13)}
<hr>
${fn:substringBefore(nm,'-') }
<hr>
${fn:substringAfter(nm,'-') }
<hr>
${fn:replace(nm,"-","") }

</body>
</html>