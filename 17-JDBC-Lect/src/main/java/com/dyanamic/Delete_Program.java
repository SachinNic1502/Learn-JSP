package com.dyanamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete_Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo", "root", "root");

			Scanner gets=new Scanner(System.in);
			System.out.println("Insert Id");
			int id=gets.nextInt();
			
			
			PreparedStatement pst=con.prepareStatement("delete from student  where id=?");
			
		
			pst.setInt(1, id);
			
			pst.executeUpdate();
			System.out.println("Data Delete Succesfully");
			
			
			
			//		System.out.println("Connected : "+con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}
