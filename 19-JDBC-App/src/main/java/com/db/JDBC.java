package com.db;

import java.sql.*;

public class JDBC {
 public static void main(String arg[]) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc","root","root");
		
		PreparedStatement ps=con.prepareStatement("insert into jdbc_tb values(2,'Nitesh','Admin','Jamner') ");
		int i=ps.executeUpdate();
		if(i==1)
		{	
			System.out.println("Data insert  ");
		}
		con.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
 }
}
