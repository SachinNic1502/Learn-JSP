package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("user_email");
		String pass=req.getParameter("user_pass");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		RequestDispatcher rd;
		
		if(!"demo@gmail.com".equals(email) && !"demo".equals(pass)) {
			//Home page Called
			out.println("<h4>Invalid Email & Passsword </h4>");
			rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			
		}else {
			//Error Called
			rd=req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
		}
	}

}
