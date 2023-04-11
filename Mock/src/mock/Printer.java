package mock;

interface Showable {
	void print();
}

interface Printable {
	void print();
}

public class Printer implements Printable, Showable {

	@Override
	public void print() {
		System.out.println("Calling method");
	}

	public static void main(String[] args) {
		Showable p = new Printer();
		p.print();
		Printable p1 = new Printer();
		p1.print();
	}
}
