package threads;

class Number1 implements Runnable {
	Thread t;

	Number1() throws InterruptedException {
		t = new Thread(this, "Number");

		t.start();
		System.out.println(t.isAlive());
		t.join();
		System.out.println(t.isAlive());

	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			String name = Thread.currentThread().getName();
			System.out.println(name + "---->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Character1 implements Runnable {
	Thread t;

	Character1() throws InterruptedException {
		t = new Thread(this, "Character1");
		t.start();
		t.join();
	}

	@Override
	public void run() {
		for (int i = 65; i <= 70; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			System.out.println(name + "---->" + (char) i);
		}

	}

}

public class JoinMethod1 {

	public static void main(String[] args) throws InterruptedException {
		Number1 n = new Number1();
		Character1 c = new Character1();

	}

}
