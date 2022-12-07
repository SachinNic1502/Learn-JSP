package com.main;

import java.sql.Connection;

import com.conn.JavaConnect;
import com.dav.Empdav;
import com.entity.Emp;

public class insertDatamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp emp=new Emp();
		emp.setId(3);
		emp.setName("Nitesh");
		emp.setAdd("Jamner");
		emp.setSal(13000);
		
		Empdav edav=new Empdav(JavaConnect.dbConnect());
		boolean f=edav.dataInsert(emp);
		if(f) {
			System.out.println("Data insert succesfuly");
		}else {
			System.out.println("error");
		}
	}

}
