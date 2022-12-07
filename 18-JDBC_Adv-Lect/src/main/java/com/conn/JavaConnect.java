package com.conn;
import java.sql.*;
public class JavaConnect {

	private static Connection conn;
	public static Connection dbConnect() {
		try {
			if(conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/emp","root","root");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
