package com.zll.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	final static String DRIVER = "com.mysql.jdbc.Driver";
	final static String URL="jdbc:mysql://localhost:3306/remedy";
	final static String USER="root";
	final static String PASS="possword";
	
	static Connection con =null;
	public static Connection getCon() throws Exception{
		Class.forName(DRIVER);
		con=DriverManager.getConnection(URL,USER,PASS);
		return con;
	}
}
