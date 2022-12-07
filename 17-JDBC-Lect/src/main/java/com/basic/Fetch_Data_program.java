package com.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetch_Data_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","root");
			
			PreparedStatement pst= conn.prepareStatement("select * from student");
			
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println("Id : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3) );
			}
			
//			System.out.println("Data Delete Succesfully");
			conn.close();
//			System.out.println("Connected : "+conn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
