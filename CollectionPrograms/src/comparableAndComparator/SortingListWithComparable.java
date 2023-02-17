package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListWithComparable {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(56);
		list.add(23);
		list.add(21);
		list.add(234);

		System.out.println(list);
		Collections.sort(list);
		System.out.println("List sorted in ascending order");
		System.out.println(list);

		// To sort ArrayList in reverse order way1
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List sorted in descending order is : ");
		System.out.println(list);

		// To sort ArrayList in reverse order way2
		Collections.sort(list);
		System.out.println("List sorted in descending order");
		Collections.reverse(list);
		System.out.println(list);
	}
}
