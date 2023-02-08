package linkedlistEx;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		li.addFirst(100);
		li.addLast(300);
		li.add(10);
		li.add(2, 15);
		// li.removeAll(li);
		// li.clear();
		System.out.println(li);
		li.removeFirstOccurrence(10);
		System.out.println(li);
		System.out.println("----------");
		System.out.println(li.element());
		System.out.println(li.indexOf(40));
		// System.out.println(li);
	}
}
