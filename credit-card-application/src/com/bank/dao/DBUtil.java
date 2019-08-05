package com.bank.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private static final String derbyCS = "jdbc:derby://localhost:1527/testdb;create=true";

	private static Connection getDBConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			return DriverManager.getConnection(derbyCS);
		} catch (ClassNotFoundException e) {
			System.err.println("Exception : " + e.getMessage());
			return null;
		} catch (SQLException e) {
			System.err.println("Exception Connecting to Derby Database " + e.getMessage());
			return null;
		}
	}

	public static ResultSet executeDBQuery(String selectQuery) {
		try {
			Connection connection = getDBConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery);
			System.out.println("Executed : " + selectQuery);
			return resultSet;

		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e.toString());
		}
		return null;
	}
	
	public static int executeDBUpdate(String updateQuery) {
		try {
			Connection connection = getDBConnection();
			Statement statement = connection.createStatement();
			int noOfRowsAffected = statement.executeUpdate(updateQuery);
			System.out.println("Executed : " + updateQuery);
			return noOfRowsAffected;

		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e.toString());
		}
		return 0;
	}
}
