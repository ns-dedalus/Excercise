package com.defalus.javatraining.dal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnection {

	static Connection conn; 
	
	public static Connection getConnection() throws SQLException {
		if (conn==null)
		{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "rcdev");
		}
		return conn;
	}
	
}
