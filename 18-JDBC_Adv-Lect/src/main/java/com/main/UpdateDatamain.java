package com.main;

import com.conn.JavaConnect;
import com.dav.Empdav;
import com.entity.Emp;

public class UpdateDatamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		emp.setId(3);
		emp.setName("Vishnu");
		emp.setAdd("Jamner");
		emp.setSal(11000);
		
		Empdav edav=new Empdav(JavaConnect.dbConnect());
		boolean f=edav.dataupdate(emp);
		if(f) {
			System.out.println("Data Update succesfuly");
		}else {
			System.out.println("error");
		}

	}

}
