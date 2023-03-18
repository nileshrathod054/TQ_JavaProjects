package threads;

class ImpThread implements Runnable {

	@Override
	public void run() {
		String s = Thread.currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println(s + "--->" + i);

			Thread.yield();
		}

	}

}

class NormThread implements Runnable {

	@Override
	public void run() {
		String s = Thread.currentThread().getName();
		for (int i = 1; i <= 5; i++) {
			System.out.println(s + "--->" + i);
			Thread.yield();

		}

	}

}

public class Yield {

	public static void main(String[] args) {
		Runnable r;
		r = new ImpThread();
		Thread t1 = new Thread(r, "ImpThread");
		t1.setPriority(9);
		t1.start();
		r = new NormThread();
		Thread t2 = new Thread(r, "NormThread");
		t2.setPriority(2);
		t2.start();
	}

}
