package janwritten;

public class Q17TestThread extends Thread {

	public static void main(String args[]) {

		Thread t = new Q17TestThread();
		System.out.println("Before starting thread");
		t.start();

		System.out.println("After starting thread");

	}

}
