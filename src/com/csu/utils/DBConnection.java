package com.csu.utils;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	
	public static Connection getConnection() throws Exception{
		
		try {
			String driver = "com.mysql.jdbc.Driver";
			
			String url="jdbc:mysql://localhost:3306/HOME";
			String userName ="root";
			String password="Pass10word";
			
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url,userName,password);
		
			return connection;
		}catch(Exception e){
			System.err.println(e);
			
		}
		return null;
		
	}

}
