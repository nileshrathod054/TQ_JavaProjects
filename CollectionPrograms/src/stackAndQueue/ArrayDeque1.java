package stackAndQueue;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<Integer> a = new ArrayDeque<>();

		a.add(10);
		a.add(20);
		a.add(30);

		a.addFirst(100);
		a.add(100);

		System.out.println(a);

		a.removeFirstOccurrence(100);

		System.out.println(a);
		a.remove();

		System.out.println(a);

	}

}
