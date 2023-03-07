package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.DBConnection;
import com.pojo.Shop;

public class ShopImpl implements ShopController {
	Connection con;
	Shop s = new Shop();
	Scanner sc = new Scanner(System.in);

	public ShopImpl() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	@Override
	public boolean insert(Shop s) throws SQLException {
		PreparedStatement ps = con.prepareStatement("insert into shop values(?,?,?,?,?,?,?)");
		ps.setInt(1, s.getShop_id());
		ps.setString(2, s.getShop_category());
		ps.setString(3, s.getShop_name());
		ps.setString(4, s.getCustomer_name());
		ps.setString(5, s.getShop_status());
		ps.setString(6, s.getShop_owner());
		ps.setString(7, s.getLease_status());

		int x = ps.executeUpdate();

		if (x == 1)
			return true;
		else
			return false;

	}

	@Override
	public boolean update(Shop s) throws SQLException {
		PreparedStatement ps = con.prepareStatement(
				"update shop set shop_category=?,shop_name=?,customer_name=?,shop_status=?,shop_owner=?,lease_status where shop_id=?");
		ps.setInt(1, s.getShop_id());
		ps.setString(2, s.getShop_category());
		ps.setString(3, s.getShop_name());
		ps.setString(4, s.getCustomer_name());
		ps.setString(5, s.getShop_status());
		ps.setString(6, s.getShop_owner());
		ps.setString(7, s.getLease_status());
		int x = ps.executeUpdate();

		if (x == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean delete() throws SQLException {
		System.out.println("Enter shop id");
		int id = sc.nextInt();
		PreparedStatement ps = con.prepareStatement("delete from shop where shop_id=?");
		ps.setInt(1, id);
		int x = ps.executeUpdate();

		if (x == 1)
			return true;
		else
			return false;
	}

	@Override
	public void view() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from shop");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
		}

	}
}
