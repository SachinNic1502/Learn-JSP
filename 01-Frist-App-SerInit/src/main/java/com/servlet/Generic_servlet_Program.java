package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//import javax.servlet.GenericServlet;
//@SuppressWarnings("serial")
public class Generic_servlet_Program extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Generic Servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
//		out.println("Welcome to servlet ");
		out.println("\t Today : "+new Date().toString());
	}

}
