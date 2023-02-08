package linkedlistEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ConvertingLinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);

		Iterator<Integer> it = li.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// Converting LinkedList into ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>(li);
		System.out.println(al);
	}
}
