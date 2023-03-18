package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatement1 {
	Connection con;

	CallableStatement1() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	void callProcedure() throws SQLException {
		CallableStatement cs = con.prepareCall("{call p1()}");
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + rs.getInt(3) + " " + rs.getString(4) + " "
					+ rs.getString(5) + " " + rs.getInt(6) + " " + rs.getDate(7));
		}

		boolean b = cs.getMoreResults();
		System.out.println(b);
		if (b == true) {
			ResultSet rs1 = cs.getResultSet();
			while (rs1.next()) {
				System.out.println(rs1.getInt(1) + " " + rs1.getInt(2));
			}

		}
	}

	/*
	 * void callProcedure(int id) throws SQLException { CallableStatement cs=
	 * con.prepareCall("{call p2(?)}"); cs.setInt(1, id); ResultSet
	 * rs=cs.executeQuery();
	 * 
	 * 
	 * while(rs.next()) {
	 * System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getInt(3)+" "+rs.
	 * getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getDate(7)); } }
	 */

	void callProcedure(int id) throws SQLException {
		CallableStatement cs = con.prepareCall("{call p3(?,?)}");
		cs.setInt(1, id);
		cs.registerOutParameter(2, Types.INTEGER);
		boolean b = cs.execute();
		if (b == false) {
			int sum = cs.getInt(2);
			System.out.println("sum of salary is.." + sum);
		}

	}

	void concat() throws SQLException {
		CallableStatement cs = con.prepareCall("{?=call experience(?,?)}");
		cs.registerOutParameter(1, Types.INTEGER);

		Date d = new Date(2023, 03, 10);
		cs.setDate(2, d);

		Date d1 = new Date(2019, 03, 21);
		cs.setDate(3, d1);

		boolean b = cs.execute();
		if (b == false) {
			int sum = cs.getInt(1);
			System.out.println("experience is.." + sum);
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatement1 c = new CallableStatement1();
		// c.callProcedure();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the department ypu want");
		// int id=sc.nextInt();

		// c.callProcedure(id);
		c.concat();

	}

}
