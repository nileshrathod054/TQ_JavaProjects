package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.DBConnection;
import com.pojo.Person;

public class PersonImpl implements PersonRecord {
	Connection con;
	Person p = new Person();

	public PersonImpl() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	@Override
	public boolean insert(Person p) throws SQLException {
		PreparedStatement pst = con.prepareStatement("insert into person values(?,?,?,?,?,?)");
		pst.setInt(1, p.getP_id());
		pst.setString(2, p.getP_name());
		pst.setString(3,  p.getP_dob());
		pst.setString(4, p.getP_adhar());
		pst.setString(5, p.getP_phno());
		pst.setString(6, p.getP_address());

		int x = pst.executeUpdate();
		if (x == 1)
			return true;
		else
			return false;
	}

	@Override
	public void display() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from person");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDate(3) + " " + rs.getString(4) + " "
					+ rs.getString(5) + " " + rs.getString(6));
		}
	}

}
