package com.zll.dao;

import java.sql.ResultSet;

public interface IDoSql {
	ResultSet doQuery(String sql,int pagecond);
	
}
