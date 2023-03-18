package jdbc;

import java.sql.*;

public class PreParedStatement {

	PreParedStatement() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreParedStatement p = new PreParedStatement();

	}

}
