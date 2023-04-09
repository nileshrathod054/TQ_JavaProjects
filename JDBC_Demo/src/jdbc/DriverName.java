package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DriverName {
	public static void main(String[] args) throws SQLException {
//		Connection con = DriverManager
//				.getConnection("jdbc:mysql://localhost:3306/payroll?autoReconnect=true&useSSL=false", "root", "root");
//		System.out.println("Connection established");

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url = "jdbc:mysql://localhost:3306/db1";
		Connection con = DriverManager.getConnection(url, "root", "root");
		System.out.println("Connection Established");
		DatabaseMetaData metadata = con.getMetaData();
		String driver_name = metadata.getDriverName();
		System.out.println("Name of the JDBC driver used= " + driver_name);
	}
}
