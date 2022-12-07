package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
	private static Connection conn=null;
 public static Connection getConnect() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/student_db","root","root");
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 
	 return conn;
}
}
