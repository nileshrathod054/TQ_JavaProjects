package threads;

public class Reserve implements Runnable {
	int available = 1;
	int wanted;

	Reserve(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		System.out.println("Available berth..." + available);

		synchronized (this) {
			String s = Thread.currentThread().getName();
			if (available >= wanted) {
				System.out.println("Birth reserving for ..." + s);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Birth  reserve for ..." + s);
				available = available - wanted;
			} else {
				System.out.println("sorry no berth available");
			}
		}

	}

	public static void main(String[] args) {
		Reserve r = new Reserve(1);
		Thread t1 = new Thread(r, "first person");
		t1.start();

		Thread t2 = new Thread(r, "second person");
		t2.start();

	}

}
