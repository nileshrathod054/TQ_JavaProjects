package arrayListAssignment;

import java.util.*;

public class Q12ArrayListisEmptyOrNot {
	public static void main(String[] args) {
		// Create an empty ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		if (al.isEmpty()) {
			System.out.println("ArrayList is empty");
		} else {
			System.out.println("ArrayList is not empty");
		}
		// Print all elements available in ArrayList
		System.out.println("Elements present in the arraylist = " + al);
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		if (al.isEmpty()) {
			System.out.println("ArrayList is empty");
		} else {
			System.out.println("ArrayList is not empty");
		}
		System.out.println("Elements present in the arraylist = " + al);
	}
}
