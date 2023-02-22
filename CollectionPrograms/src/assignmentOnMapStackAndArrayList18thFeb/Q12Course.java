package assignmentOnMapStackAndArrayList18thFeb;

import java.util.Scanner;

public class Q12Course {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the course name: ");
		String cname = sc.nextLine();
		int count = 0;
		String sname = "";

		String[][] st = { { "John", "Java" }, { "Bobby", "Python" }, { "Jill", "Java" }, { "Kumar", "PHP" },
				{ "Amit", "Java" } };

		for (int i = 0; i < st.length; i++) {
			if (st[i][1].equalsIgnoreCase(cname)) {
				count++;
				sname += st[i][0] + " ";
			}
		}

		System.out.println("Total number of students enrolled in " + cname + " course are: " + count);
		System.out.println("Names of the students are: " + sname);
	}
}
