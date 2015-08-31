package com.zll.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.zll.dao.ConnectionFactory;

public class SqlInAndDelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.getCon();
		PreparedStatement ps = con.prepareStatement("insert into cust values(?,?,?,?)");
		
		for(int i=10000;i<10050;i++){
			ps.setInt(1, i);
			ps.setString(2,"ÁÖÖ¾Áá");
			ps.setInt(3, i);
			ps.setString(4, "Ì¨Íå");
			ps.execute();
			
			
		}
	}

}
