package threads;

class Operation

{
	int n;
	volatile boolean flag = false;

	synchronized int get() throws InterruptedException {
		if (flag == false) {
			wait();
		}
		System.out.println("got" + n);
		flag = false;
		notify();
		return n;

	}

	synchronized void put(int n) throws InterruptedException {
		if (flag == true) {
			wait();
		}
		this.n = n;
		flag = true;
		System.out.println("put:" + n);
		notify();

	}
}

class Producer implements Runnable {
	Operation o;
	Thread t;

	Producer(Operation o) {
		this.o = o;
		t = new Thread(this, "producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 1;
		while (i <= 5) {
			try {
				o.put(i);
				i++;
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {
	Operation o;
	Thread t;

	Consumer(Operation o) {
		this.o = o;
		t = new Thread(this, "consumer");
		t.start();
	}

	@Override
	public void run() {
		int i = 1;
		while (i <= 5) {
			try {
				o.get();
				i++;

				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
	}
}

public class ConsumerProducer {

	public static void main(String[] args) {
		Operation o = new Operation();
		Producer p = new Producer(o);
		Consumer c = new Consumer(o);
	}

}
