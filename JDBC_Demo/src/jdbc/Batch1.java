package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch1 {
	Connection con;
	Statement st;

	Batch1() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
		st = con.createStatement();

	}

	void add() throws SQLException {
		st.addBatch("insert into center values(106,'Apollo clinic',22)");
		st.addBatch("insert into center values(107,'Health clinic',21)");
		st.addBatch("update center set city_id=22 where center_id=101");
		st.addBatch("delete from center where center_id=106");

		int[] a = st.executeBatch();

		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "row affected");
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Batch1 b = new Batch1();
		b.add();

	}

}
