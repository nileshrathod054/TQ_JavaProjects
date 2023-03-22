package janwritten;

import java.util.PriorityQueue;

public class Q15Queue {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();

		queue.add("Java");

		queue.add("Spring");

		queue.add("Angular");

		queue.add("Hibernate");

		queue.add("JavaScript");

		queue.add("Android");

		queue.peek();

		queue.poll();

		queue.poll();

		queue.peek();

		System.out.println("\n" + queue);

	}
}
