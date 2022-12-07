<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dav.StudentDAV"%>
<%@page import="com.conn.Dbconnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Managment System</title>
<%@include file="all_css.jsp" %>
</head>
<body style="background-image: url(https://images.unsplash.com/photo-1523050854058-8df90110c9f1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80)">
<%@include file="navbar.jsp" %>
<!--Check Connection  -->
<%-- <%
	Connection con=Dbconnect.getConnect();
	out.print(con);
%> --%>


<div class="container p-4">
	<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-body">
				<p class="text-center fs-2 fw-bold">All Student Details</p>
				<c:if test="${not empty SuccessMsg }">
						<p class="fs-4 text-center text-success">${SuccessMsg }</p>
						<c:remove var="SuccessMsg"/>
					</c:if>
					<c:if test="${not empty ErroMsg }">
						<p class="fs-4 text-center text-danger">${ErroMsg }</p>
						<c:remove var="ErroMsg"/>
					</c:if>
					<table class="table">
						  <thead>
						    <tr>
						    <th scope="col">ID</th>
						      <th scope="col">Full Name</th>
						      <th scope="col">Date of Birth</th>
						      <th scope="col">Address</th>
						      <th scope="col">Qualification</th>
						      <th scope="col">Email</th>
						      <th scope="col">Action</th>
						    </tr>
						  </thead>
						  <tbody>
						  
						  <%
						  	StudentDAV dav=new StudentDAV(Dbconnect.getConnect());
						  	List<Student> list=dav.getAllStudent();
						  	for(Student s:list){  		
						  	%>
						    <tr>
						      <th scope="row"><%= s.getId() %></th>
						      <td><%=s.getFname() %></td>
						      <td><%=s.getDob() %></td>
						      <td><%=s.getAdd() %></td>
						      <td><%=s.getQualification() %></td>
						      <td><%=s.getEmail() %> </td>
						      <td>
						      <a href="Edit_Student.jsp?id=<%=s.getId() %>" class="btn btn-sm btn-primary ms-1">Edit</a>
						      <a href="delete?id=<%=s.getId() %>" class="btn btn-sm btn-danger ms-1">Delete</a>
						      </td>
						    </tr>
						    
						   <%} %>
						  </tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>




</body>
</html>