package assignmentOfThread;

class Task1 extends Thread {
	private int count = 0;

	public void run() {
		count++;
		System.out.println("Priority of Thread is: " + Thread.currentThread().getPriority());
		System.out.println("Counter is: " + count);
		for (int i = 1; i <= 0; i++) {
			System.out.println("i=" + i);
		}
	}
}

public class Q1ExtendThread {
	public static void main(String[] args) {
		Task1 o = new Task1();
		System.out.println("Thread State : " + o.getState());
		Task1 o1 = new Task1();
		o.start();
		o1.start();
	}
}
