package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement1 {
	Connection con;

	Statement1() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	void insert() throws SQLException {
		Statement st = con.createStatement();

		int a = st.executeUpdate("insert into item values(3012,'Rubber',5,903)");
		System.out.println(a + " Row inserted");
	}

	void update() throws SQLException {
		Statement st = con.createStatement();

		int a = st.executeUpdate("update item set itemcost=50 where itemid=3012");
		System.out.println(a + "Row updated");
	}

	void delete() throws SQLException {
		Statement st = con.createStatement();

		int a = st.executeUpdate("delete from item  where itemid=3012");
		System.out.println(a + "Row deleted");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement1 s = new Statement1();
		// s.insert();
		// s.update();
		s.delete();
	}

}
