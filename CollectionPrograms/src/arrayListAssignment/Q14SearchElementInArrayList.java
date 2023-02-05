package arrayListAssignment;

import java.util.ArrayList;

public class Q14SearchElementInArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");

		if (al.contains("Red")) {
			System.out.println("Found an element");
		} else {
			System.out.println("There is no such element in the list");
		}
	}
}
