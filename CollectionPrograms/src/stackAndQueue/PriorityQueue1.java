package stackAndQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(3);

		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.offer(40);
		pq.add(5);
		pq.add(50);

		System.out.println(pq);

		pq.remove();

		pq.remove(50);

		pq.poll();

		System.out.println(pq);

	}

}
