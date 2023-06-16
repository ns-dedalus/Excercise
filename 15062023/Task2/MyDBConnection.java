package com.dal.props;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDBConnection {
private  String link;
private  String username;
private  String password;
private static Connection con = null;
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public MyDBConnection(String link, String username, String password) {
	super();
	this.link = link;
	this.username = username;
	this.password = password;
}
public MyDBConnection() {
	super();
	// TODO Auto-generated constructor stub
}
public Connection getMyConnection() {
	try {
		if(con == null)
		con = DriverManager.getConnection(link,username,password);
		//	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
		
		
	//System.out.println(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
@Override
public String toString() {
	return "MyDBConnection [link=" + link + ", username=" + username + ", password=" + password + "]";
}
}
