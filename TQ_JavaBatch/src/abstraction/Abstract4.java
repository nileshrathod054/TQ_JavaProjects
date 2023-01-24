package abstraction;

interface Printable {
	void print();
}

interface Showable {
	void print();
}

class Emp implements Printable, Showable {

	@Override
	public void print() {
		System.out.println("Showing Employee Details");

	}

}

public class Abstract4 {
	public static void main(String[] args) {
		Showable s = new Emp();
		s.print();
		Printable p = new Emp();
		p.print();
	}
}
