package com.dyanamic;
import java.sql.*;
import java.util.Scanner;
public class Dyanamic_Program1 {
public static void main(String[] args) {
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
		
		PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, city);
		pst.executeUpdate();
		System.out.println("Data Insert Succesfully");
		
		
		
		//		System.out.println("Connected : "+con);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
