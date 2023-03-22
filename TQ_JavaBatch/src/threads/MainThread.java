package threads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		Thread t = Thread.currentThread();
		String s = t.getName();
		t.setPriority(9);
		int pr = t.getPriority();
		long l = t.getId();

		System.out.println(s + " " + pr + " " + l);
		t.sleep(2000);
		System.out.println("Ending thread");

	}

}
