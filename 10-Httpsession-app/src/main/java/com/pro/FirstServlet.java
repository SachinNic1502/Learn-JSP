package com.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("nm");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("Name : "+name);
		
		HttpSession ses=req.getSession();
		ses.setAttribute("UserName",name);
		
		out.print("<a href='servlet2'>Servlet 2</a>");
	}
}
