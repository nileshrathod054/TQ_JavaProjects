package comparableAndComparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(90);
		al.add(70);
		al.add(50);
		al.add(20);
		al.add(40);
		al.add(10);
		al.add(30);
		System.out.println("Before sorting the ArrayList : \n" + al);

		Collections.sort(al);
		System.out.println("After sorting the ArrayList : \n" + al);
	}
}
