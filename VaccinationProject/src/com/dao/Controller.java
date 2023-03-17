package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.DBConnection;

public class Controller {
	Scanner sc = new Scanner(System.in);

	Connection con;

	public Controller() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void show1() throws SQLException {
		System.out.println("\n---------List Of The States--------");
		Statement st1 = con.createStatement();
		ResultSet rs = st1.executeQuery("select * from state");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));

		}
		System.out.println("Enter your state name");
		String st_name = sc.next();

		PreparedStatement ps = con.prepareStatement(
				"select c_name from city where st_id= (select st_id from state where st_name like ?);\r\n" + "");
		ps.setString(1, st_name);
		ResultSet rs1 = ps.executeQuery();
		while (rs1.next()) {
			System.out.println(rs1.getString(1));
		}

	}

	public void show2() throws SQLException {
		System.out.println("\n-----------List Of The City----------");
		Statement st = con.createStatement();
		ResultSet rs2 = st.executeQuery("select * from center");
		while (rs2.next()) {
			System.out.println(rs2.getInt(1) + " " + rs2.getString(2));
		}
		System.out.println("Enter your center name");
		String cn_name = sc.next();
		PreparedStatement ps = con.prepareStatement(
				"select cn_name from city c inner join center c1 on c.city_id=c1.city_id where c_name=?;");
		ps.setString(1, cn_name);
		ResultSet rs3 = ps.executeQuery();
		while (rs3.next()) {
			System.out.println(rs3.getString(1));
		}

	}

	
}
