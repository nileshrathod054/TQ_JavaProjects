package assignmentOOPs_6thJan;

abstract class Machine {
	void rotate() {
		System.out.println("Rotate method of abstract class Machine.");
	}

	abstract void crush();
}

abstract class Mixer extends Machine {
	void crush() {
		System.out.println("Implemented crush method of  abstract class Mixer.");
	}

	void blend() {
		System.out.println("concrete blend method of  abstract class Mixer");
	}

	public static void main(String[] args) {
		// Mixer mix=new Mixer(); //We can not create the object of an abstract class.
	}
}

public class Juicer extends Machine {

	@Override
	void crush() {

		System.out.println("Implemented crush method of abstract class Machine.");
	}

	void filter() {
		System.out.println("Filter method of Juicer class.");
	}

	public static void main(String[] args) {
		Machine m = new Juicer();
		m.rotate();
		m.crush();
		// m.filter();
		/*
		 * If we want to to call filter method of Juicer class we need to create an
		 * abstract method in the abstract class
		 */

	}
}
