package jdbc_11marchAssignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operations {
	Connection con;

	public Operations() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void show() throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nOperations");
		System.out.println("1 Add New Region");
		System.out.println("2 Delete Region");
		System.out.println("3 Update Region");
		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter Id");
			int r_id = sc.nextInt();
			System.out.println("Enter Region Name");
			String r_name = sc.next();
			String ins = "INSERT INTO regions VALUES (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(ins);
			pstmt.setInt(1, r_id);
			pstmt.setString(2, r_name);
			int x = pstmt.executeUpdate();
			if (x == 1) {
				System.out.println("Record Insert Succesfully");
			}
			break;

		}
		case 2: {
			System.out.println("Enter Region ID");
			int r_id = sc.nextInt();

			PreparedStatement ps = con.prepareStatement("delete from regions where region_id=?");
			ps.setInt(1, r_id);
			int x = ps.executeUpdate();

			if (x == 1) {
				System.out.println("Record Deleted  Succesfully");
			}
			break;
		}
		case 3: {
			System.out.println("Enter Region Name");
			String r_name = sc.next();
			System.out.println("Enter Id");
			int r_id = sc.nextInt();
			PreparedStatement ps = con.prepareStatement("update regions set region_name=? where region_id=?");
			ps.setString(1, r_name);
			ps.setInt(2, r_id);

			int x = ps.executeUpdate();

			if (x == 1) {
				System.out.println("Record Updated  Succesfully");
			}
			break;
		}
		}
	}

	public void highSal() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(
				"select employee_id,first_name,last_name from employees where salary=(select max(salary) from employees)");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		System.out.println("------------------------------------------");
	}

	public void minSal() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(
				"select employee_id,first_name,last_name from employees where salary=(select min(salary) from employees)");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		System.out.println("------------------------------------------");
	}

	public void nameA() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st
				.executeQuery("select employee_id,first_name,last_name from employees where first_name like 'A%' ");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		System.out.println("------------------------------------------");
	}

	public void hireDate() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st
				.executeQuery("select employee_id,first_name,last_name from employees where year(hire_date)=1987");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		System.out.println("------------------------------------------");
	}

	public void department() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(
				"SELECT department_id, COUNT(*) as employee_count FROM employees GROUP BY department_id ORDER BY employee_count DESC LIMIT 1");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getInt(2));
		}
		System.out.println("------------------------------------------");
	}

	public void minSalDep() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT department_id, MIN(salary) as min_salary\r\n" + "FROM employees\r\n"
				+ "GROUP BY department_id;");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getLong(2));
		}
		System.out.println("------------------------------------------");
	}

	public void maxSalDep() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT department_id, Max(salary) as max_salary\r\n" + "FROM employees\r\n"
				+ "GROUP BY department_id;");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getLong(2));
		}
		System.out.println("------------------------------------------");
	}

//	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//
//		Assignment11March_jdbc j = new Assignment11March_jdbc();
//		j.show();
//		j.highSal();
//		j.minSal();
//		j.nameA();
//		j.hireDate();
//		j.department();
//		j.minSalDep();
//		j.maxSalDep();
//	}

}
