package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatement2 {
	Connection con;

	PreparedStatement2() throws ClassNotFoundException, SQLException {
		con = DbConnection1.getConnection();
	}

	void insert() throws SQLException {
		PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id");
		int id = sc.nextInt();
		System.out.println("Enter customer name");
		String name = sc.next();
		System.out.println("Enter customer city");
		String c_name = sc.next();
		System.out.println("Enter salesman id");
		int s_id = sc.nextInt();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, c_name);
		ps.setInt(4, s_id);

		int x = ps.executeUpdate();
		System.out.println(x + " row inserted");

	}

	void showCustomerDetails() throws SQLException {
		Statement st = con.createStatement();
		String s = "\r\n" + "select c_name,c.city,s_name,total_cust\r\n" + "from customer c inner join salesman s\r\n"
				+ "where c.salesman_id=s.salesman_id;";
		ResultSet rs = st.executeQuery(s);

		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));

		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatement2 ps = new PreparedStatement2();
		// ps.insert();
		ps.showCustomerDetails();

	}

}
