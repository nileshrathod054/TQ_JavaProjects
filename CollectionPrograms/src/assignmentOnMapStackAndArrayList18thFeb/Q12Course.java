package assignmentOnMapStackAndArrayList18thFeb;

import java.util.HashMap;
import java.util.Scanner;

public class Q12Course {

	public static void main(String[] args) {
		
		HashMap<String, String[]> studentdetails = new HashMap<String, String[]>();

		
		studentdetails.put("Java", new String[] { "John", "David", "Simon" });
		studentdetails.put("C#", new String[] { "Mike", "Adam", "Will" });
		studentdetails.put("Python", new String[] { "Eric", "Jack", "Rob" });
		studentdetails.put("Ruby", new String[] { "Robert", "Fiona", "Jenny" });
		studentdetails.put("C++", new String[] { "John", "David", "Nick" });

	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Course Name : ");
		String course = sc.nextLine();

				if (studentdetails.containsKey(course)) {
			String[] students = studentdetails.get(course);
			System.out.println("Students enrolled in " + course + " course :");
			for (int i = 0; i < students.length; i++) {
				System.out.println(students[i]);
			}

			System.out.println("Total students : " + students.length);
		} else {
			System.out.println("No students enrolled for " + course + " course.");
		}
		sc.close();
	}
}
