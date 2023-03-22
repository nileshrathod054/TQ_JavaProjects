package assignmentOfThread;

public class Q5ThreadPriority implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread()); // This method is static.
	}

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		Q5ThreadPriority a = new Q5ThreadPriority();
		Thread t1 = new Thread(a, "First Thread");
		Thread t2 = new Thread(a, "Second Thread");
		Thread t3 = new Thread(a, "Third Thread");

		try {
			t.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t1.setPriority(4); // Setting the priority of first thread.

		t2.setPriority(15); // Setting the priority of second thread.

		t3.setPriority(8); // Setting the priority of third thread.

		t1.start();
		t2.start();

		t3.start();
	}
}