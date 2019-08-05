package com.hsbc.banking.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DerbyHelper {
	
	private static Connection conn;
	
	public static Connection getConnection() 
	{
		ResourceBundle rb =ResourceBundle.getBundle("com/hsbc/"
				+ "banking/resources/db");
		String url=rb.getString("url");
		String userName=rb.getString("username");
		String password=rb.getString("password");
		String driver=rb.getString("driver");
		try
		{
		Class.forName(driver);	
		conn=DriverManager.getConnection(url,userName,password);
		}
		catch(SQLException exception)
		{
			System.out.print(exception.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;		
	}
	

}
