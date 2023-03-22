package jdbc_11marchAssignment;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.DBConnection;

public class TablesMain {
	Connection con;

	TablesMain() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String ans;
		do {
			System.out.println("-----List Of Tables-------");
			System.out.println("1.Regions");
			System.out.println("2.Countries");
			System.out.println("3.Locations");
			System.out.println("4.Departments");
			System.out.println("5.Employees");
			System.out.println("6.Jobs");
			System.out.println("7.Special Menu");

			System.out.println("Enter your choice to select the table");
			Scanner sc = new Scanner(System.in);

			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				Tables tb1 = new Tables();

				tb1.show_Regions();

				Operations op = new Operations();
				op.show();
				
				break;
			}
			case 2: {
				Tables tb2 = new Tables();

				tb2.show_Countries();
				break;
			}
			case 3: {
				Tables tb3 = new Tables();

				tb3.show_Locations();
				break;
			}
			case 4: {
				Tables tb4 = new Tables();

				tb4.show_Departments();
				break;
			}
			case 5: {
				Tables tb5 = new Tables();

				tb5.show_Employees();
				break;
			}
			case 6: {
				Tables tb6 = new Tables();

				tb6.show_Jobs();
				break;
			}
			case 7: {
				SpecialMenu sp = new SpecialMenu();
				sp.special();
			}
			}
			System.out.println("Do you want to  continue yes/no");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("yes"));
	}
}
