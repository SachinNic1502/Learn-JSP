<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL core Tag</h1>
<hr>
<h3><c:out value="Sachin Rathod"></c:out></h3>
<hr>
<c:import url="nav.jsp" var="data"></c:import>
<hr>
<c:out value="${data }"></c:out>
<hr>
<c:set var="res" value="${10*3}" scope="session" ></c:set>
<c:out value="10 * 3 = ${res}"></c:out>
<hr>
<c:remove var="res"/>
<c:out value=" ${res}"></c:out> 


<c:catch var="exception">
<% int a=2/0;%>
</c:catch>
<c:if test="${exception != null}">
<p>${exception}</p>
<p>${exception.message}</p>
</c:if>
<c:set value="19" var="age"></c:set>
<c:if test="${age>18}">
<h1>are U able to vote</h1>
</c:if>
<c:set value="${100000 }" var="sal"></c:set>
<c:choose>


<c:when test="${sal>20000}">
<h1>U are manager</h1>
</c:when>
<c:when test="${sal<20000}">
<h1>U are worker</h1>
</c:when>

<c:otherwise>
<h1>Invlide sal</h1>
</c:otherwise>

</c:choose>

<c:forEach var="num" begin="1" end="10">
<c:out value="${num*2}"></c:out>
</c:forEach>
<hr>
<c:forTokens items="Sachin +Jawaharlal +Rathod" delims="+" var="name">
	<c:out value="${name}"/> <p>
</c:forTokens>

<hr>

<c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>

<hr>

<c:url value="/index.jsp" var="completeURL">  
 	<c:param name="em" value="demo@gmail.com"/>  
 	<c:param name="nm" value="Sachin"/>
</c:url>  

${completeURL}  


</body>
</html>