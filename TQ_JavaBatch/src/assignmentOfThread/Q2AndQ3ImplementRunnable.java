package assignmentOfThread;

class Task2 implements Runnable {
	private int count = 0;

	@Override
	public void run() {
		count++;
		System.out.println(Thread.currentThread().getName() + " Doing Task");
		System.out.println("Counter is " + count);
		doTask();
	}

	public void doTask() {
		int x = 10;
		System.out.println("x=" + x);
		x++;
	}

}

public class Q2AndQ3ImplementRunnable {
	public static void main(String[] args) {
		Runnable runnabletask = new Task2();
		Thread t2 = new Thread(runnabletask);
		Thread t3 = new Thread(runnabletask);
		t2.start();
		t3.start();
	}
}
