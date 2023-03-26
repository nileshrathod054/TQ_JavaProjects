package collectionTest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListFun {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Jan");
		ll.add("Feb");
		ll.add("Mar");
		ll.add("Apr");
		ll.add("May");

		Collections.sort(ll);

		ListIterator itr = ll.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		ll.add(2, "August");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
