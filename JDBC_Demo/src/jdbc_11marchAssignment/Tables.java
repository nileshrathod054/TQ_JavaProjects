package jdbc_11marchAssignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import jdbc.DBConnection;

public class Tables {
	Scanner sc = new Scanner(System.in);
	Connection con;

	Tables() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void show_Regions() throws SQLException {
		System.out.println("\n----------List Of The Regions--------");
		Statement str = con.createStatement();
		ResultSet rsr = str.executeQuery("select * from regions");
		while (rsr.next()) {
			System.out.println(rsr.getInt(1) + rsr.getString(2));

		}
	}

	public void show_Countries() throws SQLException {
		System.out.println("\n----------List Of The Countries--------");
		Statement st2 = con.createStatement();
		ResultSet rs2 = st2.executeQuery("select * from countries");
		while (rs2.next()) {
			System.out.println(rs2.getString(1) + " " + rs2.getString(2));
		}
	}

	public void show_Locations() throws SQLException {
		System.out.println("\n----------List Of The Locations--------");
		Statement st3 = con.createStatement();
		ResultSet rs3 = st3.executeQuery("select * from locations;");
		while (rs3.next()) {
			System.out.println(rs3.getInt(1) + " " + rs3.getString(2) + " " + rs3.getString(3) + " " + rs3.getString(4)
					+ " " + rs3.getString(5));
		}
	}

	public void show_Departments() throws SQLException {
		System.out.println("\n----------List Of The Departments--------");
		Statement st4 = con.createStatement();
		ResultSet rs4 = st4.executeQuery("select * from departments;");
		while (rs4.next()) {
			System.out.println(rs4.getInt(1) + " " + rs4.getString(2));
		}
	}

	public void show_Employees() throws SQLException {
		System.out.println("\n----------List Of The Employees--------");
		Statement st5 = con.createStatement();
		ResultSet rs5 = st5.executeQuery("select * from employees;");
		while (rs5.next()) {
			System.out.println(rs5.getInt(1) + " " + rs5.getString(2) + " " + rs5.getString(3) + " " + rs5.getString(4)
					+ " " + rs5.getString(5) + " " + rs5.getDate(6) + " " + rs5.getString(7) + " " + rs5.getInt(8) + " "
					+ rs5.getInt(9) + " " + rs5.getInt(10));
		}
	}

	public void show_Jobs() throws SQLException {
		System.out.println("\n----------List Of The Jobs--------");
		Statement st6 = con.createStatement();
		ResultSet rs6 = st6.executeQuery("select * from jobs;");
		while (rs6.next()) {
			System.out.println(rs6.getString(1) + " " + rs6.getString(2) + " " + rs6.getInt(3) + " " + rs6.getInt(4));
		}
	}
}
