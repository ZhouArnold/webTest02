package com.zll.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.zll.biz.QueryList;
import com.zll.dao.ConnectionFactory;

public class QueryTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		QueryList q = new QueryList();
		String sql= "select * from cust limit ?";
		Connection con = ConnectionFactory.getCon();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 4);
		ResultSet ls=ps.executeQuery();
		System.out.println(ls.toString());
	}

}
