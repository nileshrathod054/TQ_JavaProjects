package comparableAndComparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Jay");
		al.add("Aman");
		al.add("Chetan");
		al.add("Nilesh");
		al.add("Baban");

		System.out.println("Before Sorting the ArrayList :");
		for (String name : al) {
			System.out.println(name);
		}
		Collections.sort(al);

		System.out.println("After Sorting the ArrayList :");
		for (String name : al) {
			System.out.println(name);
		}
	}
}
