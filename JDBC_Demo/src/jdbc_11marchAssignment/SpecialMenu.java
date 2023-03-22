package jdbc_11marchAssignment;

import java.sql.SQLException;
import java.util.Scanner;

public class SpecialMenu {

	public void special() throws ClassNotFoundException, SQLException {
		System.out.println("Special Menu Operations");
		System.out.println("1.Show employees with highest salary");
		System.out.println("2.Show employees with lowest salary");
		System.out.println("3.List of employees who's  name start with  'A'");
		System.out.println("4.Show employees who are hired in 1987");
		System.out.println("5.List department which has highest no of employees");
		System.out.println("6.Show minimum salary for each department");
		System.out.println("7.Show maximum salary for each department");

		Operations op1 = new Operations();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			op1.highSal();
			break;
		}
		case 2: {
			op1.minSal();
			break;
		}
		case 3: {
			op1.nameA();
			break;
		}
		case 4: {
			op1.hireDate();
			break;
		}
		case 5: {
			op1.department();
			break;
		}
		case 6: {
			op1.minSalDep();
			break;
		}
		case 7: {
			op1.maxSalDep();
			break;
		}
		}
	}
}