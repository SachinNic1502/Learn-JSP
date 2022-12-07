package com.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete_program {

	
		public static void main(String[] args)throws SQLException {
			// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
				
				PreparedStatement pst= conn.prepareStatement("delete from student where id=?");
				
				pst.setInt(1,107);
				
				pst.executeUpdate();
				System.out.println("Data Delete Succesfully");
				conn.close();
//				System.out.println("Connected : "+conn);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	

}
