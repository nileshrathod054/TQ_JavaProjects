package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypes1 {
	Connection con;
	PreparedStatement ps;

	ResultSetTypes1() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();

	}

	void backward() throws SQLException {

		ps = con.prepareStatement("select * from employee", ResultSet.CONCUR_UPDATABLE,
				ResultSet.TYPE_SCROLL_INSENSITIVE);
		ResultSet rs = ps.executeQuery();
		System.out.println("----backward");
		rs.afterLast();

		while (rs.previous()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getFloat(4) + " "
					+ rs.getDate(5));
		}

	}

	void getRow() throws SQLException {
		System.out.println("----- 3rd row");
		ps = con.prepareStatement("select * from employee", ResultSet.CONCUR_UPDATABLE,
				ResultSet.TYPE_SCROLL_INSENSITIVE);
		ResultSet rs = ps.executeQuery();
		rs.absolute(3);
		System.out.println(
				rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getFloat(4) + " " + rs.getDate(5));
	}

	void LastRow() throws SQLException {
		System.out.println("----- Last row");
		ps = con.prepareStatement("select * from employee", ResultSet.CONCUR_UPDATABLE,
				ResultSet.TYPE_SCROLL_INSENSITIVE);
		ResultSet rs = ps.executeQuery();
		rs.last();
		System.out.println(
				rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getFloat(4) + " " + rs.getDate(5));
	}

	void secondLastRow() throws SQLException {
		System.out.println("-----second Last row");
		ps = con.prepareStatement("select * from employee", ResultSet.CONCUR_UPDATABLE,
				ResultSet.TYPE_SCROLL_INSENSITIVE);
		ResultSet rs = ps.executeQuery();
		rs.absolute(-2);
		System.out.println(
				rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getFloat(4) + " " + rs.getDate(5));
	}

	void update(int id) throws SQLException

	{
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from employee");

		rs.beforeFirst();

		while (rs.next()) {
			int e_id = rs.getInt(1);
			if (e_id == id) {
				rs.updateInt(6, 80);
				rs.updateRow();

			}
		}
	}

	void delete(int id) throws SQLException {
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from employee");

		rs.beforeFirst();

		while (rs.next()) {
			int e_id = rs.getInt(1);
			if (e_id == id) {
				rs.deleteRow();
				System.out.println("row deleted");
			}
		}

	}

	void insert() throws SQLException {

		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from employee");
		long l = System.currentTimeMillis();
		Date d = new Date(l);
		rs.moveToInsertRow();
		rs.updateInt(1, 109);
		rs.updateString(2, "sonali");
		rs.updateInt(3, 15000);
		rs.updateFloat(4, 2.3f);
		rs.updateDate(5, d);
		rs.updateInt(6, 67);
		rs.insertRow();
		System.out.println("row inserted");

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ResultSetTypes1 r = new ResultSetTypes1();
		r.backward();
		r.getRow();
		r.LastRow();
		r.secondLastRow();
		// r.update(103);
		r.delete(107);
		r.insert();
	}

}
