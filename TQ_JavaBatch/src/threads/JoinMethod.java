package threads;
// join -> when u aplly join method to a thread that

//thread will wait for another thread to complete its
// entire execution an den it will start

class Documents implements Runnable {
	Thread t;

	Documents() throws InterruptedException {
		t = new Thread(this, "Documnet");
		t.start();
		t.join();
	}

	@Override
	public void run() {
		System.out.println("verifying Documents");

	}

}

class Check implements Runnable {
	Thread t;
	int aadharno;
	String name;
	String address;

	Check(int aadharno, String name, String address) throws InterruptedException {
		this.aadharno = aadharno;
		this.name = name;
		this.address = address;
		t = new Thread(this, "check");
		t.start();

		t.join();
	}

	@Override
	public void run() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aadharno is.." + aadharno);
		System.out.println("name is.." + name);
		System.out.println("address is.." + address);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("documents verified");

	}
}

class Renew implements Runnable {
	Thread t;

	Renew() throws InterruptedException {
		t = new Thread(this, "renew");
		t.start();
		t.join();
	}

	@Override
	public void run() {
		System.out.println("waiting for renewing license");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Lincence renewed");

	}

}

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread executing");
		Documents d = new Documents();
		Check c = new Check(42342343, "pooja", "mumbai");

		Renew r = new Renew();

	}

}
