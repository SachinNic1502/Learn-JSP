package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet_program implements Servlet {

	ServletConfig con;
//	life cycle Method
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method Called");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init Method Called");
		con=config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Method Called");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("Welcome to servlet ");
		out.println("\t Today : "+new Date().toString());
		
		System.out.println(getServletInfo());
		System.out.println(getServletConfig());
		
	}

// Non life cycle Method
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is My First Servlet Program";
	}
	

}
