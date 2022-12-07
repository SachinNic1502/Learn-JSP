package com.log;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/logout")
public class logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		Cookie[] ck=req.getCookies();
		
		ck[0].setMaxAge(0);
		ck[1].setMaxAge(0);
		
		resp.addCookie(ck[0]);
		resp.addCookie(ck[1]);
		
		resp.sendRedirect("index.html");
	}
}
