package stackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class TimerCounter {

	public static void main(String[] args) throws InterruptedException {
		Deque<Integer> al = new LinkedList<Integer>();

		for (int i = 10; i >= 1; i--) {
			al.add(i);

			while (!al.isEmpty()) {
				System.out.println(al.remove());
				Thread.sleep(2000);// main is sleeping
			}

		}

	}

}
