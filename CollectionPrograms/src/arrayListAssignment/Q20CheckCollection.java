package arrayListAssignment;

import java.util.ArrayList;
import java.util.Collection;

public class Q20CheckCollection {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>();
		System.out.println("Before adding elements in collection");
		if (collection.isEmpty()) {
			System.out.println("Collection is empty");
		} else {
			System.out.println("Elements of the collection are : " + collection);
		}
		System.out.println("After adding elements in collection");
		for (int i = 0; i <= 10; i++) {
			collection.add(i);
		}
		if (collection.isEmpty()) {
			System.out.println("Collection is empty");
		} else {
			System.out.println("Elements of the collection are : " + collection);
		}
	}
}
