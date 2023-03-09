
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Preparedstate {

	Connection con;
	Scanner sc = new Scanner(System.in);
	ArrayList<Date> al = new ArrayList<>();

	void insert() throws ClassNotFoundException, SQLException {

		Connection con = DBConnection.getConnection();
		String sql = "insert into employee values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter employee salary");
		int sal = sc.nextInt();
		System.out.println("Enter employee department_id");
		int d_id = sc.nextInt();
		System.out.println("Enter employee city");
		String city = sc.next();

		System.out.println("Enter employee hire_date");
		String date = sc.next();

		// @SuppressWarnings("deprecation")
		// Date d=new Date(2022,11,14);

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, sal);
		ps.setInt(4, d_id);
		ps.setString(5, city);
		ps.setString(6, date);

	}

	void update() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
		String sql = "update employee set  emp_salary=? where emp_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("Enter employee salary");
		int sal = sc.nextInt();
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		ps.setInt(1, sal);
		ps.setInt(2, id);
		int a = ps.executeUpdate();
		System.out.println(a + " row afftected");

	}

	void delete() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
		String sql = "delete from employee where emp_id=?";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("Enter employee id");
		int id = sc.nextInt();
		ps.setInt(1, id);
		boolean b = ps.execute();
		if (b != true) {
			int a = ps.getUpdateCount();
		}
		/*
		 * int a= ps.executeUpdate(); System.out.println(a+" row afftected");
		 */
	}

	void show_data() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employees");

		while (rs.next()) {
			// System.out.println(rs.getDate(6));
			Date d = rs.getDate(6);

			al.add(d);

		}
		Iterator<Date> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Preparedstate p = new Preparedstate();
		// p.insert();
		// p.update();
		// p.delete();
		p.show_data();

	}

}
