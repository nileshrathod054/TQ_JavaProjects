package threads;

class Thread1 extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		if (t.isDaemon()) {
			Employee e = new Employee(1, "pooja");
			e.display();
		} else
			System.out.println("user Thread");

	}
}

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("provide service to employee clas");
		System.out.println("id..." + id);
		System.out.println("name is..." + name);
	}
}

public class DaemonThread1 {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		// t.setDaemon(true);
		t.start();

	}

}
