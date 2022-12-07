package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.Dbconnect;
import com.dav.StudentDAV;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		int id=Integer.parseInt(req.getParameter("id"));
		
		StudentDAV dao=new StudentDAV(Dbconnect.getConnect());
		boolean f=dao.deleteStudent(id);
		
		HttpSession session=req.getSession();
		if (f) {
			session.setAttribute("SuccessMsg", "Student details Delete Sucessfully");
			resp.sendRedirect("index.jsp");
//			System.out.println("Student details Add Sucessfully");
		}else {
			session.setAttribute("ErroMsg", "Something went wrong!!!!");
			resp.sendRedirect("index.jsp");
//			System.out.println("Something went wrong!!!!");
		}
	}
}
