package com.dav;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Emp;

public class Empdav {
private Connection conn;
	public Empdav(Connection conn) {
		super();
		this.conn=conn;
	}
	public boolean dataInsert(Emp emp)
	{
		boolean f=false;
			try {
				PreparedStatement pst=conn.prepareStatement("insert into empinfo values(?,?,?,?)");
				pst.setInt(1, emp.getId());
				pst.setString(2, emp.getName());
				pst.setString(3,emp.getAdd());
				pst.setInt(4, emp.getSal());
				
				int i=pst.executeUpdate();
				if(i==1) {
					f=true;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return f;
	}
	public boolean dataupdate(Emp emp) {
		boolean f=false;
		try {
			PreparedStatement pst=conn.prepareStatement("update empinfo set name=?, address=?, salary=? where id=?");
			pst.setString(1, emp.getName());
			pst.setString(2, emp.getAdd());
			pst.setInt(3, emp.getSal());
			pst.setInt(4, emp.getId());
			
			int i=pst.executeUpdate();
			if(i==1) {
				f=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return f;
	}

}
