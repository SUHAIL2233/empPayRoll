package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConn 
{
	private static Connection conn;
	
	private DAOConn() throws SQLException 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("http://localhost:3306/emppayroll","root","root");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	
	}
	public static Connection getConnection()
	{
		return conn;
	}
}
