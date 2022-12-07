<%@page import="com.entity.Student"%>
<%@page import="com.conn.Dbconnect"%>
<%@page import="com.dav.StudentDAV"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
<%@include file="all_css.jsp" %>
</head>
<body class="bg-light">
<%@include file="navbar.jsp" %>

<div class="container p-4">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<div class="card">
				<div class="card-body">
					<p class="fs-3 text-center"> Edit Student</p>
					<%
						int id=Integer.parseInt(request.getParameter("id"));
						StudentDAV dao=new StudentDAV(Dbconnect.getConnect());
						Student s= dao.getStudentbyId(id);
					%>
					
					<form action="update" method="post">
					<div class="mb-3">
    						<label class="form-label">Full Name</label>
    						<input type="text" class="form-control" name="name" value="<%=s.getFname() %>" >
    					</div>
    					<div class="mb-3">
    						<label class="form-label">Date Of Birth</label>
    						<input type="date" class="form-control" name="dob" value="<%=s.getDob()%>">
    					</div>
    					<div class="mb-3">
    						<label class="form-label">Address</label>
    						<input type="text" class="form-control" name="address" value="<%=s.getAdd()%>">
    					</div>
    					<div class="mb-3">
    						<label class="form-label">Qualification</label>
    						<input type="text" class="form-control" name="qualification" value="<%=s.getQualification()%>">
    					</div>
						<div class="mb-3">
    						<label class="form-label">Email </label>
    						<input type="email" class="form-control" name="email" value="<%=s.getEmail()%>">
    					</div>
  						
						  <input type="hidden" name="id" value="<%=s.getId() %>">
						  <button type="submit" class="btn btn-primary col-md-12">Update</button>
						</form>
  
				
				</div>
			
			</div>
			
		</div>
	</div>

</div>

</body>
</html>