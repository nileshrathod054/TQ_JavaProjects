package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con;
	public static final String url = "jdbc:mysql://localhost:3306/vaccination";
	public static final String user = "root";
	public static final String password = "root";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Established");

		return con;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DBConnection.getConnection();
	}
}
