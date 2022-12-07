package com.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update_program {

	// TODO Auto-generated method stub
	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
			
			PreparedStatement pst= conn.prepareStatement("update student set name=? , city=? where id=?");
			pst.setString(1,"Vishnu");
			pst.setString(2,"Jamner");
			pst.setInt(3,106);
			
			pst.executeUpdate();
			System.out.println("Data Update Succesfully");
			conn.close();
//			System.out.println("Connected : "+conn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
