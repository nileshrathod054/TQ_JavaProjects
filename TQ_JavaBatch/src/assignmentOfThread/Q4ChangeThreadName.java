package assignmentOfThread;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class Q4ChangeThreadName {
	public static void main(String[] args) {
		MyThread thread = new MyThread();

		thread.setName("My Thread"); // Changing the name of the thread before starting the thread

		thread.start();

		thread.setName("My Thread"); // changing the name of the thread when thread is active

		try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.setName("My Thread"); // Changing the name of the thread when thread is sleeping
	}
}
