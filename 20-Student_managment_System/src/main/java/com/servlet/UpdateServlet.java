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
import com.entity.Student;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String add=req.getParameter("address");
		String qualification=req.getParameter("qualification");
		String email=req.getParameter("email");
		int id=Integer.parseInt(req.getParameter("id"));
		
		Student st=new Student(id,name,dob,add,qualification,email);
		System.out.println(st);
		
		StudentDAV dav=new StudentDAV(Dbconnect.getConnect());
		
		HttpSession session=req.getSession();
		
		boolean f=dav.UpdateStud(st);
		
		if (f) {
			session.setAttribute("SuccessMsg", "Student details Update Sucessfully");
			resp.sendRedirect("index.jsp");
//			System.out.println("Student details Add Sucessfully");
		}else {
			session.setAttribute("ErroMsg", "Something went wrong!!!!");
			resp.sendRedirect("index.jsp");
//			System.out.println("Something went wrong!!!!");
		}
		
	}
	
	
}
