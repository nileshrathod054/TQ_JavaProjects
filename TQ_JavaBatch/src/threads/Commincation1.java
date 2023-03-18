package threads;

class Author implements Runnable {
	Writing w;
	Thread t;

	Author(Writing w) {
		this.w = w;
		t = new Thread(this, "writing");
	}

	@Override
	public void run() {
		w.write();

	}

}

class User1 implements Runnable {
	Writing w;
	Thread t;

	User1(Writing w) {
		this.w = w;
		t = new Thread(this, "reading");
	}

	@Override
	public void run() {
		w.read();
	}

}

class Writing {
	synchronized void write() {
		String s = Thread.currentThread().getName();
		System.out.println(s + " Author is writin book");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Book is available");
		// notifyAll();

	}

	synchronized void read() {
		try {
			wait();
			String s = Thread.currentThread().getName();
			System.out.println(s + " can read book");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class User2 implements Runnable {

	@Override
	public synchronized void run() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class Commincation1 {

	public static void main(String[] args) {
		Writing w = new Writing();

		User1 u = new User1(w);
		Thread t = new Thread(u, "pooja");
		t.start();
		User1 u2 = new User1(w);
		Thread t3 = new Thread(u2, "ram");
		t3.start();
		Author a = new Author(w);
		Thread t2 = new Thread(a, "Mr sharma");
		t2.start();

	}

}
