package com.dyanamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Fetch_Data_program {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo", "root", "root");

			Scanner gets=new Scanner(System.in);
			System.out.println("Insert Id");
			int id=gets.nextInt();
			
			PreparedStatement pst=con.prepareStatement("select * from student where id=?");
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println("Id : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
