package com.log;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	String email=req.getParameter("email");
	String pass=req.getParameter("pass");
	
	Cookie ck=new Cookie("email", email);
	Cookie ck2=new Cookie("pass", pass);
	
	resp.addCookie(ck);
	resp.addCookie(ck2);
	
	resp.sendRedirect("Profile");
}
}
