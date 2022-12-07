package com.basic;

import java.sql.*;
public class program1 {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
			
			PreparedStatement pst= conn.prepareStatement("insert into student values(?,?,?)");
			pst.setInt(1, 109);
			pst.setString(2, "Nitesh");
			pst.setString(3,"Pune");
			pst.executeUpdate();
			System.out.println("Data Insert Succesfully");
			conn.close();
//			System.out.println("Connected : "+conn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
