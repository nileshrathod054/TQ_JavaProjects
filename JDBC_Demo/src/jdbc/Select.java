package jdbc;

//1) import package
import java.sql.*;
import java.util.ArrayList;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 2) Register driver(it dynamicallly load the driver
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");

		// ?autoReconnect=true&useSSL=false
		// 3) create a connection
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/payroll?autoReconnect=true&useSSL=false", "root", "root");
		System.out.println("Connection established");
		// 5 execute query
		Statement st = con.createStatement();
		// 6) fetch data from resultset
		ResultSet rs = st.executeQuery("select * from item");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3)+" "+rs.getInt(4));
		}
		
	}

}
