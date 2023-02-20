package stackAndQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingDeque {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(3);

		q.add(10);
		q.offer(20);
		q.add(30);
		q.offer(40);

		System.out.println(q);

	}
}
