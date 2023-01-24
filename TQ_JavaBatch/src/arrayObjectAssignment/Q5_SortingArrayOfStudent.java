package arrayObjectAssignment;

import java.util.Arrays;

public class Q5_SortingArrayOfStudent {

	public static void main(String[] args) {
		String[] studentNames = { "Amit", "Robin", "John", "Mark", "Steve", "Chris" };

		// Ascending order
		Arrays.sort(studentNames);

		System.out.println("Sorted Array in Ascending Order: ");
		for (String studentName : studentNames) {
			System.out.println(studentName);
		}
	}

}
