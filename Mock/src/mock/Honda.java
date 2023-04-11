package mock;

abstract class Bike {
	abstract void run();
}

public class Honda extends Bike {

	@Override
	void run() {
		System.out.println("Running");

	}

	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();
	}
}
