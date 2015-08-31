package com.zll.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.zll.dao.ConnectionFactory;
import com.zll.dao.IDoSql;

public class IDoSqlImpl implements IDoSql {
	Connection con=null;
	public ResultSet doQuery(String sql,int pagecond) {
		ResultSet rs=null;
		// TODO Auto-generated method stub
		try {
			con=ConnectionFactory.getCon();
			PreparedStatement ps=null;
			ps=con.prepareStatement(sql);
			ps.setInt(1, pagecond);
			rs=ps.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
}
