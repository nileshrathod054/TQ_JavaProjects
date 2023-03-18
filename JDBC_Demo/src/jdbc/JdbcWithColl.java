package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JdbcWithColl {
	Connection con;

	JdbcWithColl() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	void show_details() throws SQLException {
		HashMap<Integer, String> hs = new HashMap<>();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from center");
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			hs.put(id, name);
		}
		// System.out.println(hs);
		Set<Entry<Integer, String>> set = hs.entrySet();

		for (Map.Entry<Integer, String> map : set) {
			if (map.getKey() == 103) {
				System.out.println(map.getValue());
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		JdbcWithColl j = new JdbcWithColl();
		j.show_details();
	}

}
