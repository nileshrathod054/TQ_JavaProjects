package assignmentOnMapStackAndArrayList18thFeb;

import java.util.HashMap;
import java.util.Scanner;

public class Q12Course {

	public static void main(String[] args) {
		
		HashMap<String, String[]>sd = new HashMap<String, String[]>();

		
		sd.put("Java", new String[] { "John", "David", "Simon" });
		sd.put("C#", new String[] { "Mike", "Adam", "Will" });
		sd.put("Python", new String[] { "Eric", "Jack", "Rob" });
		sd.put("Ruby", new String[] { "Robert", "Fiona", "Jenny" });
		sd.put("C++", new String[] { "John", "David", "Nick" });

	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Course Name : ");
		String c = sc.nextLine();

				if (sd.containsKey(c)) {
			String[] s = sd.get(c);
			System.out.println("Students enrolled in " + c + " course :");
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}

			System.out.println("Total students : " + s.length);
		} else {
			System.out.println("No students enrolled for " + c + " course.");
		}
		sc.close();
	}
}
