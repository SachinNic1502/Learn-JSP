package com.dav;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDAV {
	private Connection con;

	public StudentDAV(Connection con) {
		super();
		this.con = con;
	}	
	public boolean AddStud(Student st) {
		boolean f=false;
		try {
			String sql="insert into student(name,dob,address,qualification,emal) values (?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1 , st.getFname());
			pst.setString(2 , st.getDob());
			pst.setString(3 , st.getAdd());
			pst.setString(4 , st.getQualification());
			pst.setString(5 , st.getEmail());
			
			int i=pst.executeUpdate();
			if (i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return f;
	}
	public List<Student> getAllStudent(){
		List<Student> list=new ArrayList<Student>();
		Student s=null;
		try {
			String sql="select * from student";
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				s=new Student();
				s.setId(rs.getInt(1));
				s.setFname(rs.getString(2));
				s.setDob(rs.getString(3));
				s.setAdd(rs.getString(4));
				s.setQualification(rs.getString(5));
				s.setEmail(rs.getString(6));
				list.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	public Student getStudentbyId(int id) {
		List<Student> list=new ArrayList<Student>();
		Student s=null;
		try {
			String sql="select * from student where id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				s=new Student();
				s.setId(rs.getInt(1));
				s.setFname(rs.getString(2));
				s.setDob(rs.getString(3));
				s.setAdd(rs.getString(4));
				s.setQualification(rs.getString(5));
				s.setEmail(rs.getString(6));
				list.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return s;
	}
	
	public boolean UpdateStud(Student st) {
		boolean f=false;
		try {
			String sql="update student set name=?, dob=?, address=?, qualification=?, emal=? where id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1 , st.getFname());
			pst.setString(2 , st.getDob());
			pst.setString(3 , st.getAdd());
			pst.setString(4 , st.getQualification());
			pst.setString(5 , st.getEmail());
			pst.setInt(6,st.getId());
			int i=pst.executeUpdate();
			if (i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return f;
	}
	public boolean deleteStudent(int id) {
		boolean f=false;
		try {
			String sql="delete from student where id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			
			int i =pst.executeUpdate();
			if (i==1) {
				f=true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

}
