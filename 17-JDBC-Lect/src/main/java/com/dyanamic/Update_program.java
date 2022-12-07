package com.dyanamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo", "root", "root");

			Scanner gets=new Scanner(System.in);
			System.out.println("Insert Id");
			int id=gets.nextInt();
			System.out.println("Insert Name");
			String name=gets.next();
			System.out.println("Insert City");
			String city=gets.next();
			
			PreparedStatement pst=con.prepareStatement("update student set name=?,city=? where id=?");
			
			pst.setString(1, name);
			pst.setString(2, city);
			pst.setInt(3, id);
			
			pst.executeUpdate();
			System.out.println("Data Update Succesfully");
			
			
			
			//		System.out.println("Connected : "+con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
