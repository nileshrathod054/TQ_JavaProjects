package threads;

public class Music1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s + "is playing");
			try {
				Thread.sleep(1000, 99999);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Runnable m;
		m = new Music1();
		Thread t1 = new Thread(m, "Jazz music");
		t1.start();
		m = new Music1();
		Thread t2 = new Thread(m, "classical music");
		t2.start();
	}

}
